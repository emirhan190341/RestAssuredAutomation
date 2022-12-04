package ReqresPostUnsuccessful.api;

import ReqresPostUnsuccessful.pojo.ResponseErrorPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRegisterUnsuccessful {


    @Test
    public void postTest() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();


        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .accept("/")
                        .basePath("api/register")
                        .when()
                        .post()
                        .then()
                        .log()
                        .all().extract().response();
                    Assert.assertEquals(response.getStatusCode(),400);
        ResponseErrorPojo responsePojo = response.as(ResponseErrorPojo.class);
        Assert.assertNotNull(responsePojo.getError());




    }


}
