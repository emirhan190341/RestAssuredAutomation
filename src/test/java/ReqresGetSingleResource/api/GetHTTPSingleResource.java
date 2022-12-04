package ReqresGetSingleResource.api;

import ReqresGetSingleResource.pojo.GetResponseSingleResource;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetHTTPSingleResource {


    @Test
    public void getTest1() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();

        Response response = given()
                .spec(req)
                .contentType(ContentType.JSON)
                .accept("/")
                .basePath("api/unknown/2")
                .queryParam("page", "2")
                .when()
                .get()
                .then()
                .log()
                .all().extract().response();


        Assert.assertEquals(response.getStatusCode(),200);

        GetResponseSingleResource responsePojo = response.as(GetResponseSingleResource.class);

        Assert.assertNotNull(responsePojo.getData().getId());
        Assert.assertNotNull(responsePojo.getSup().getUrl());
        Assert.assertNotNull(responsePojo.getSup().getText());

    }


}
