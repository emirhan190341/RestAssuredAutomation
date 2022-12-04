package SwaggerUserCreateWithArray.api;

import SwaggerUserCreateWithArray.pojo.RequestPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PostUserCreateWithArray {

    @Test
    public void postTest(){

        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2/").build();

        RequestPojo requestPojo = new RequestPojo();

        requestPojo.setId(1);
        requestPojo.setUsername("emirhan41");
        requestPojo.setFirstName("emirhan");
        requestPojo.setLastName("arici");
        requestPojo.setEmail("qewrqwer@gmail.com");
        requestPojo.setPassword("1231245");
        requestPojo.setPhone("0202030232");
        requestPojo.setUserStatus(200);

//        Object[] arr = new Object[1];
//        arr[0] = requestPojo;


        ArrayList<RequestPojo> arr = new ArrayList<>();
        arr.add(requestPojo);


        Response response =
                given()
                        .spec(req)
                        .contentType(ContentType.JSON)
                        .accept("*/*")
                        .basePath("user/createWithList")
                        .body(arr)
                        .when()
                        .post()
                        .then()
                        .log()
                        .all().extract().response();
        System.out.println(response.statusCode());

    }
}
