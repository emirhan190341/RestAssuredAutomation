package SwaggerPostPet.api;

import SwaggerPostPet.pojo.Category;
import SwaggerPostPet.pojo.RequestPojo;
import SwaggerPostPet.pojo.Tag;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class SwaggerPostPet {

    @Test
    public void PostTest() {
        Category category = new Category();

        category.setName("emirhan");
        category.setId(53);

        Tag tag1 = new Tag();
        tag1.setId(1);
        tag1.setName("omer");

        Tag tag2 = new Tag();
        tag2.setId(2);
        tag2.setName("berkay");


        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2/").build();

        RequestPojo requestPojo = new RequestPojo();

        ArrayList<String> animals = new ArrayList<>();
        animals.add("https://idsb.tmgrup.com.tr/ly/uploads/images/2021/09/08/thumbs/871x871/142774.png");


        requestPojo.setId(34);
//        requestPojo.setCategory(category);
//        requestPojo.setPhotoUrls(animals);
        requestPojo.setName("furkan");
        requestPojo.setStatus("available");
//        requestPojo.addTags(tag1).addTags(tag2);


        Response response =
                given()
                        .spec(req)
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .basePath("pet/34")
                        .body(requestPojo)
                        .when()
                        .post()
                        .then()
//                        .statusCode(200)
                        .extract().response();

        response.prettyPrint();
        System.out.println(response.statusCode());


    }

}
