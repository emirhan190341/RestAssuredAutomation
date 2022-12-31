package SwaggerBookStoreGet.api;

import SwaggerBookStoreGet.pojo.Book;
import SwaggerBookStoreGet.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookStore {

    @Test
    public void testGet(){
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("Account/v1/User/b97b0039-7bd8-419d-bc45-c80c9fad63a6")
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InJvbmFsZG8iLCJwYXNzd29yZCI6IkNldGVyM2wzISIsImlhdCI6MTY3MDMxOTc2MH0.ZjULumRaPlUjlSBOf81uToMVeeX6o94qln9V4Xjw3cU")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all()
                        .extract().response();
    }




}
