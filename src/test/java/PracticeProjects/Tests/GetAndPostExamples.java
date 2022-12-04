package PracticeProjects.Tests;

import io.restassured.http.ContentType;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAndPostExamples {

    //Test part
    @Test
    public void testGet() {
        baseURI = "https://reqres.in/api";
        given()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"))
                .body("data.first_name", hasItems("George", "Rachel"));
    }

    @Test
    public void testPost() {
        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request.toString());

        baseURI = "https://reqres.in/api";
        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();





    }





}


