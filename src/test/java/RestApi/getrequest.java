package RestApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class getrequest {

    @Test(priority=1)
    void getapi()
    {
        given()
                .when()
                .get("https://httpbin.org/get")
                . then()
                   .statusCode(200);
                   //.log.all();
    }
}
