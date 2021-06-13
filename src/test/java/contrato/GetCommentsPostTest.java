package contrato;

import base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.lang.String;

public class GetCommentsPostTest extends BaseTest {

    @Test
    public void buscarComentarioDoPostPorId(){
        String id = "1";

        given()
                .pathParam("id", id)
                .when().get("/{id}/comments").
                then().
                body(matchesJsonSchema(
                        new File("src/test/resources/json_schemas/comment_schema.json")));;
    }
}
