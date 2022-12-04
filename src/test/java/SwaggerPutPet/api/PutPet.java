package SwaggerPutPet.api;

import SwaggerPutPet.pojo.RequestPojo;
import SwaggerPutPet.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PutPet {

    @Test
    public void putTest() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2/").build();
        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setUsername("furkan");
        requestPojo.setId(10);
        requestPojo.setEmail("qwrasdgg@gmail.com");


        Response response =
                given()
                        .spec(req)
                        .accept("*/*")
                        .contentType(ContentType.JSON)
                        .basePath("user/emirhan")
                        .body(requestPojo)
                        .when()
                        .put()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        System.out.println(responsePojo.getCode());

        System.out.println("----------------------------------------------------------");


        Response response1 =
                given()
                        .spec(req)
                        .accept("*/*")
                        .basePath("user/furkan")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all().extract().response();

        //System.out.println(requestPojo.getUsername());
        Assert.assertEquals(requestPojo.getUsername(),"furkan");
        Assert.assertEquals(requestPojo.getId(),10);
        Assert.assertEquals(requestPojo.getEmail(),"qwrasdgg@gmail.com");


    }

}
