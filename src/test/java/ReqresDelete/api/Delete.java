package ReqresDelete.api;

import ReqresPutUpdate.pojo.CreateUserResponse;
import ReqrestPostCreate.pojo.RequestPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Delete {
    @Test
    public void DeleteTestCreate() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();
//        RequestPojo requestPojo = new RequestPojo();
//
//        requestPojo.setName("morpheus");
//        requestPojo.setJob("zion resident");

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("api/users/2")
                        .when()
                        .delete()
                        .then()
                        .log().all()
                        .extract().response();
    }
}

