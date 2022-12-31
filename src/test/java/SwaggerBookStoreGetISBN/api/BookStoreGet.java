package SwaggerBookStoreGetISBN.api;


import SwaggerBookStoreGetISBN.pojo.ResponsePojo;
import groovyjarjarpicocli.CommandLine;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Helper;

import static io.restassured.RestAssured.given;

public class BookStoreGet {

    @Test
    public void getTest(){



        String getUrl = "https://bookstore.toolsqa.com/BookStore/v1/Book";
        Response response = Helper.getTestWithToken(getUrl,"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InJvbmFsZG8iLCJwYXNzd29yZCI6IkNldGVyM2wzISIsImlhdCI6MTY3MDMxOTc2MH0.ZjULumRaPlUjlSBOf81uToMVeeX6o94qln9V4Xjw3cU");


//        Response response =
//                given()
//                        .spec(Helper.reqSpecBuilder(ConfigReader.getProperty("base_url")))
//                        .contentType(ContentType.JSON)
//                        .param("ISBN","9781449325862")
//                        .basePath("BookStore/v1/Book")
//                        .auth().oauth2(ConfigReader.getProperty("token"))
//                        .when()
//                        .get()
//                        .then()
//                        .log()
//                        .all()
//                        .extract().response();
//        Assert.assertEquals(response.getStatusCode(),200);
//
//        ResponsePojo responsePojo = response.as(ResponsePojo.class);
//        Assert.assertNotNull(responsePojo.getTitle());
//        Assert.assertEquals(responsePojo.getTitle(),"Git Pocket Guide");

    }
}