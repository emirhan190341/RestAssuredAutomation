package PracticeProjects.Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProject01 {
    @Test
    public void testGet() {
        baseURI = "https://petstore.swagger.io/v2";

        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .queryParam("status", "available")
                .get("/pet/findByStatus");

        System.out.println(response.statusCode());
        //response.prettyPrint();
        response.contentType();
        System.out.println(response.getHeaders());

    }

    @Test
    public void testGet2() {
        baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .queryParam("petId", 5)
                .get("/pet/5");

        int actualStatusCode = response.statusCode();
        Assert.assertEquals(200, actualStatusCode);

        String actualContentType = response.contentType();
        Assert.assertEquals("application/json", actualContentType);

        response.then().body("name",equalTo("doggie"));
        System.out.println(response.body().toString());

        JSONObject jsonObject =new JSONObject( response.body().asString());
        System.out.println(jsonObject.getJSONArray("tags"));
        System.out.println(jsonObject.getJSONArray("photoUrls"));



    }

    @Test
    public void storeTest(){
        baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .when()
                .header("Content-Type","application/json")
                .queryParam("orderId",1)
                .get("/store/order/1");

        String actualContentType = response.contentType();
        Assert.assertEquals("application/json",actualContentType);

        int actualStatusCode = response.statusCode();
        Assert.assertEquals(200,actualStatusCode);

        JSONObject jsonObject =new JSONObject( response.body().asString());
        response.prettyPrint();

        System.out.println(jsonObject.getInt("id"));
        jsonObject.getBoolean("complete");


    }


    @Test
    public void testDelete() {
        baseURI = "http://localhost:3000";

        given()
                .delete("/users/9")
                .then()
                .statusCode(200);
    }
}
