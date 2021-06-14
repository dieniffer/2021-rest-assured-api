package contrato;

import base.BaseTest;
import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.lang.String;

public class GetPostsTest extends BaseTest {

    @Test
    public void contratoBuscarPostPorId(){
        String id = "1";

        given()
                .pathParam("id", id)
                .when().get("/{id}").
                then().
                body(matchesJsonSchema(
                        new File("src/test/resources/json_schemas/posts_schema.json")));
    }

}
