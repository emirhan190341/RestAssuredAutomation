package PracticeProjects.Tests;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DataDrivenExamples extends  DataForTest{



    @Test(dataProvider = "DataForPost")
    public void test_post(String firstName, String lastName, int subjectId) {
        JSONObject request = new JSONObject();

        request.put("firstName", firstName);
        request.put("lastName", lastName);
        request.put("subjectId", subjectId);

        baseURI = "http://localhost:3000/";

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(request.toString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();
    }






    @Test(dataProvider = "DeleteData")
    public void test_delete(int userId) {
        baseURI = "http://localhost:3000/";
        given()
                .delete("/users/" + userId)
                .then()
                .statusCode(200);

    }
}
