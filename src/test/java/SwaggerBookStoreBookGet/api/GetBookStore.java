package SwaggerBookStoreBookGet.api;

import SwaggerBookStoreGet.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookStore {

    @Test
    public void getTest(){

        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(response.getStatusCode(),200);








    }
}
