package funcional;

import base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import java.lang.String;

public class GetPostsTest extends BaseTest {

    @Test
    public void buscarPostPorId(){
        String id = "1";

        given()
                .pathParam("id", id)
                .when().get("/{id}").
                then().
                statusCode(200).
                body("id",is(1));
    }

}
