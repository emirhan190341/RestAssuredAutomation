package ReqresGetListUsers.api;

import ReqresGetListUsers.pojo.GetResponseListUsers;
import ReqresGetSingleResource.pojo.GetResponseSingleResource;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetListUsers {

    @Test
    public void getTest() {
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();

        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .queryParam("page", "2")
                        .basePath("api/users?page=2")
                        .accept("/")
                        .when()
                        .get()
                        .then()
                        .log()
                        .all().extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);

        GetResponseListUsers responsePojo = response.as(GetResponseListUsers.class);
        Assert.assertNotNull(responsePojo.getData());
        System.out.println("*****************************************************************************************");
        System.out.println(responsePojo.getSupport());


    }


}
