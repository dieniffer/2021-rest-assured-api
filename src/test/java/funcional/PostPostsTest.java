package funcional;

import api.body.Post;
import base.BaseTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.lang.String;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

public class PostPostsTest extends BaseTest {

    @Test
    public void criarPostTest(){
        int id  = 101;
        String userId = "4";
        String title = "Título";
        String body = "Body teste teste teste";

        Post post =
                Post.builder().id(id).userId(userId).body(body).title(title).build();

        given().
                contentType(ContentType.JSON).
                body(post).
                when().
                post().
                then().
                statusCode(201).
                body("id",is(post.getId()),
                        "userId",is(post.getUserId()),
                        "body",is(post.getBody()),
                        "title",is(post.getTitle()));
    }

    @Test
    public void criarPostExcecaoTest(){
        int id  = 999;
        String userId = "4";
        String title = "Título";
        String body = "Body teste teste teste";

        Post post =
                Post.builder().id(id).userId(userId).body(body).title(title).build();

        given().
                contentType(ContentType.JSON).
                body(post).
                when().
                post().
                then().
                statusCode(201).
                body("id",not(post.getId()),
                        "userId",is(post.getUserId()),
                        "body",is(post.getBody()),
                        "title",is(post.getTitle()));
    }

}
