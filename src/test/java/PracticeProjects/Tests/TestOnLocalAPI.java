package PracticeProjects.Tests;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;

public class TestOnLocalAPI {

    //for getting data from localhost
    @Test
    public void get() {
        baseURI = "http://localhost:3000";
        given()
                .get("/users")
                .then()
                .statusCode(200)
                .log().all();
    }

    //for creating new user
    @Test
    public void post(){
        JSONObject request = new JSONObject();
        request.put("firstName","Thomas");
        request.put("lastName","Edison");
        request.put("subjectId",1);

        baseURI = "http://localhost:3000";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toString())
                .when()
                .post("/users")
                .then()
                .statusCode(201);

    }

    //for updating the user
    @Test
    public void put(){
        JSONObject request = new JSONObject();
        request.put("firstName","Albert");
        request.put("lastName","Einstein");
        request.put("subjectId",2);

        baseURI = "http://localhost:3000";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toString())
                .when()
                .put("/users/4")
                .then()
                .statusCode(200);
    }

    //for updating particular data
    @Test
    public void patch(){
        JSONObject request = new JSONObject();

        request.put("lastName","Doe");

        baseURI = "http://localhost:3000";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toString())
                .when()
                .patch("/users/4")
                .then()
                .statusCode(200);
    }

    //for deleting user
    @Test
    public void delete(){
        baseURI ="http://localhost:3000";
        when()
                .delete("/users/4")
                .then()
                .statusCode(200);
    }


}
