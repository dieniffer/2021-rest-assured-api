package contrato;

import api.body.Post;
import base.BaseTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.io.File;
import java.lang.String;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class PostPostsTest extends BaseTest {

    @Test
    public void contratoCriacaoPostTest(){
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
                body(matchesJsonSchema(
                        new File("src/test/resources/json_schemas/post_posts_schema.json")));
    }

}
