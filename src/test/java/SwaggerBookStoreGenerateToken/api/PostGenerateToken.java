package SwaggerBookStoreGenerateToken.api;

import SwaggerBookStoreGenerateToken.pojo.RequestPojo;
import SwaggerBookStoreGenerateToken.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostGenerateToken {

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
                        .body(requestPojo)
                        .basePath("Account/v1/GenerateToken")
                        .when()
                        .post()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getStatus(),"Success");

    }
}
