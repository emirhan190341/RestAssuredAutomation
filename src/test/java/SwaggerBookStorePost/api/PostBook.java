package SwaggerBookStorePost.api;

import SwaggerBookStorePost.pojo.CollectionOfIsbn;
import SwaggerBookStorePost.pojo.RequestPojo;
import SwaggerBookStorePost.pojo.ResponsePojo;
import groovyjarjarpicocli.CommandLine;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Helper;

import javax.swing.text.Utilities;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PostBook {



    @Test
    public void postTest(){


        RequestPojo requestPojo = new RequestPojo();
        CollectionOfIsbn collection = new CollectionOfIsbn();
        collection.setIsbn("9781449337711");

        ArrayList<CollectionOfIsbn> collectionOfIsbns = new ArrayList<>();
        collectionOfIsbns.add(collection);

        requestPojo.setUserId("b97b0039-7bd8-419d-bc45-c80c9fad63a6");
        requestPojo.setCollectionOfIsbns(collectionOfIsbns);







        Response response =
                given()
                        .spec(Helper.reqSpecBuilder(ConfigReader.getProperty("base_url")))
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books")
                        .auth().oauth2(ConfigReader.getProperty("token"))
                        .body(requestPojo)
                        .when()
                        .post()
                        .then()
                        .log()
                        .all()
                        .extract().response();


//        ResponsePojo responsePojo = response.as(ResponsePojo.class);
//        System.out.println(responsePojo.getIsbn());

        Assert.assertEquals(response.getStatusCode(),201);

    }
}
