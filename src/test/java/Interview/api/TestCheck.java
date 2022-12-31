package Interview.api;

import Interview.pojo.ResponsePojoText;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestCheck {

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
        Assert.assertNotNull(responsePojoText.getData().get(0).getTitle());
        Assert.assertNotNull(responsePojoText.getData().get(0).getAuthor());
        Assert.assertNotNull(responsePojoText.getData().get(0).getContent());
        Assert.assertNotNull(responsePojoText.getData().get(0).getGenre());

    }




}
