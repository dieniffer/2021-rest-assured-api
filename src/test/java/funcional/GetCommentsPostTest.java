package funcional;

import base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import java.lang.String;

public class GetCommentsPostTest extends BaseTest {

    @Test
    public void buscarComentarioDoPostPorId(){
        String id = "1";

        given()
                .pathParam("id", id)
                .when().get("/{id}/comments").
                then().
                statusCode(200).
                body("[0].postId",is(1));
    }
}
