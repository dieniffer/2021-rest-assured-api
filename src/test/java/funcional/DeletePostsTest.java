package funcional;

import api.body.Post;
import base.BaseTest;
import org.testng.annotations.Test;
import java.lang.System;
import java.util.List;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class DeletePostsTest extends BaseTest {

    @Test
    public void deletarPostComSucesso(){

        List<Post> postReal =
                when().
                        get().
                        then().
                        extract().
                        body().
                        jsonPath().
                        getList(".", Post.class);

        Post post = Post.builder().
                id(postReal.get(0).getId()).
                userId(postReal.get(0).getUserId()).
                title(postReal.get(0).getTitle()).
                body(postReal.get(0).getBody()).
                build();
        System.out.println(post);
        given().
                pathParam("id",post.getId()).
                when().
                delete("/{id}").
                then().
                statusCode(200);

    }


    @Test
    public void deletarPostNulo(){

        given().
                pathParam("id", "").
                when().
                delete("/{id}").
                then().
                statusCode(404);

    }

}
