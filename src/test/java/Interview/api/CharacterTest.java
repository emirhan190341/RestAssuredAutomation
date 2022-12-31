package Interview.api;

import Interview.pojo.ResponsePojoText;
import groovyjarjarpicocli.CommandLine;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Helper;

import static io.restassured.RestAssured.given;

public class CharacterTest {

    @Test
    public void getTest() {


        String baseURL = "https://fakerapi.it/api/v1/texts?_quantity=1&_characters=500";

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .when()
                        .get(baseURL)
                        .then()
                        .log()
                        .all()
                        .extract().response();

        ResponsePojoText responsePojoText = response.as(ResponsePojoText.class);
        Assert.assertEquals(responsePojoText.getData().get(0).getContent().length(),499);

    }

    @Test(description = "195 den buyuk olup 200den kucuk olan")
    public void getTest1(){
        String baseURL = "https://fakerapi.it/api/v1/texts?_quantity=1&_characters=500";

       Response response =  Helper.getTestWithTwoParam(baseURL,"quantity",1,"characters",200);
       ResponsePojoText responsePojoText = response.as(ResponsePojoText.class);
       Assert.assertTrue(195 <= responsePojoText.getData().get(0).getContent().length() & responsePojoText.getData().get(0).getContent().length() >= 200);



    }

























}
