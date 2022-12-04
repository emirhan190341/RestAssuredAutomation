package SwaggerGetUsername.api;

import SwaggerGetUsername.pojo.ResponsePojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SwaggerGetUsername {


    @Test
    public void getTest() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2/").build();

        ResponsePojo pojo =
                given()
                        .spec(req)
                        .accept("*/*")
                        .basePath("user/emirhan")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .log()
                        .all().extract().as(ResponsePojo.class);

        Assert.assertNotNull(pojo.getFirstName());
        Assert.assertEquals(pojo.getUsername(), "emirhan");






//        Response response =
//                given()
//                        .spec(req)
//                        .accept("*/*")
//                        .basePath("user/emirhan")
//                        .when()
//                        .get()
//                        .then()
//                        .log()
//                        .all().extract().response();
        //ResponsePojo responsePojo = response.as(ResponsePojo.class);
        //Assert.assertEquals(responsePojo.getUsername(),"emirhan");

    }

}
