package SwaggerBookStorePostAuth.api;

import SwaggerBookStorePostAuth.pojo.RequestPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class PostAuth {

    @Test
    public void postTest(){
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        RequestPojo requestPojo = new RequestPojo();
        requestPojo.setUserName("ronaldo");
        requestPojo.setPassword("Ceter3l3!");

//        Response response =
//                given()
//                        .spec(req)
//                        .contentType(ContentType.JSON)
//                        .basePath("Account/v1/Authorized")
//                        .body(requestPojo)
//                        .auth().basic("elif","Ceter3l3!")
//                        .when()
//                        .post()
//                        .then()
//                        .log()
//                        .all()
//                        .extract().response();

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("Account/v1/Authorized")
                        .body(requestPojo)
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InJvbmFsZG8iLCJwYXNzd29yZCI6IkNldGVyM2wzISIsImlhdCI6MTY3MDMxOTc2MH0.ZjULumRaPlUjlSBOf81uToMVeeX6o94qln9V4Xjw3cU")
                        .when()
                        .post()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.asString(),"true");

    }



}
