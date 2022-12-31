package SwaggerBookStoreDeleteBooks.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Helper;

import static io.restassured.RestAssured.given;

public class DeleteBooks {
    @Test
    public void deleteTest(){

        Response response =
                given()
                        .spec(Helper.reqSpecBuilder(ConfigReader.getProperty("base_url")))
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books")
                        .queryParam("UserId","b97b0039-7bd8-419d-bc45-c80c9fad63a6")
                        .auth().oauth2(ConfigReader.getProperty("token"))
                        .when()
                        .delete()
                        .then()
                        .log()
                        .all()
                        .extract().response();

        Assert.assertEquals(response.getStatusCode(),204);
        Assert.assertEquals(response.getBody().asString(),"");




    }



}
