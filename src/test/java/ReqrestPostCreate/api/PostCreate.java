package ReqrestPostCreate.api;

import ReqrestPostCreate.pojo.RequestPojo;
import ReqrestPostCreate.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostCreate {


    @Test
    public void PostTestCreate() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();
        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setName("morpheus");
        requestPojo.setJob("leader");

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .basePath("api/users")
                        .body(requestPojo)
                        .when()
                        .post()
                        .then()
                        .log()
                        .all().extract().response();

        Assert.assertEquals(response.getStatusCode(), 201);
        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getName(), requestPojo.getName());
        Assert.assertEquals(responsePojo.getJob(), requestPojo.getJob());
    }
}

