package Tests;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PutPatchDeleteExamples {
    @Test
    public void testPut() {
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
                .put("/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void testPatch() {
        JSONObject request = new JSONObject();
        request.put("name", "Raghav");
        request.put("job", "Teacher");
        System.out.println(request.toString());

        baseURI = "https://reqres.in";

        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toString())
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void testDelete() {

        baseURI = "https://reqres.in";

        given()
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204)
                .log().all();
    }
}
