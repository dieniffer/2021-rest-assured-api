package base;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseTest {
    @BeforeClass
    public void preCondicao(){
        baseURI = "https://jsonplaceholder.typicode.com";
        basePath = "/posts/";

        enableLoggingOfRequestAndResponseIfValidationFails();
    }


}
