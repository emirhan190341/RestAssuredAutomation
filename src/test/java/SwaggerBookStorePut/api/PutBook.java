package SwaggerBookStorePut.api;

import SwaggerBookStorePut.pojo.RequestPojo;
import SwaggerBookStorePut.pojo.ResponsePojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Helper;

import static io.restassured.RestAssured.given;

public class PutBook {

    @Test
    public void putTest() {
        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setIsbn("9781491950296");
        requestPojo.setUserId("b97b0039-7bd8-419d-bc45-c80c9fad63a6");

        Response response =
                given()
                        .spec(Helper.reqSpecBuilder(ConfigReader.getProperty("base_url")))
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books/9781491904244")
                        .body(requestPojo)
                        .auth().oauth2(ConfigReader.getProperty("token"))
                        .when()
                        .put()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        Assert.assertEquals(response.getStatusCode(),200);
        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        System.out.println(responsePojo.getBooks());


    }


}
