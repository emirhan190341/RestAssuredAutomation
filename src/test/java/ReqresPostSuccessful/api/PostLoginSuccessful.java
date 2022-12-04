package ReqresPostSuccessful.api;

import ReqresPostSuccessful.pojo.RequestPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostLoginSuccessful {

    @Test
    public void postTest() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();

        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setEmail("eve.holt@reqres.in");
        requestPojo.setPassword("cityslicka");

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .accept("/")
                        .basePath("api/login")
                        .when()
                        .post()
                        .then()
                        .log()
                        .all().extract().response();
    }

}
