package SwaggerBookStore.api;

import SwaggerBookStore.pojo.RequestPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostBookStore {

    @Test
    public void postTest(){
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setUserName("ronaldo");
        requestPojo.setPassword("Ceter3l3!");

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("Account/v1/User")
                        .body(requestPojo)
                        .when()
                        .post()
                        .then()
                        .log()
                        .all()
                        .extract().response();
    }

}
