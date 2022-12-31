package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class Helper {

    public static RequestSpecification reqSpecBuilder(String baseUrl) {
        return new RequestSpecBuilder().setBaseUri(baseUrl).build();
    }


    public static Response postTestWithToken(String url, Object object, String token) {

        Response response =  given()
                .accept("application/json")
                .contentType(ContentType.JSON)
                .auth().oauth2(token)
                .body(object)
                .when()
                .post(url)
                .then()
                .log()
                .all()
                .extract().response();
        return response;
    }




    public static Response getTestWithToken(String url, String token) {

        Response response =  given()
                .accept("application/json")
                .contentType(ContentType.JSON)
                .auth().oauth2(token)
                .when()
                .get(url)
                .then()
                .log()
                .all()
                .extract().response();
        return response;
    }


    public static Response getTest(String url) {

        return   given()
                .accept("application/json")
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .log()
                .all()
                .extract().response();
    }

    public static Response getTestWithParam(String url,String paramName, int paramValue){

        return  given()
                .accept("application/json")
                .contentType(ContentType.JSON)
                .param(paramName,paramValue)
                .when()
                .get(url)
                .then()
                .log()
                .all()
                .extract().response();
    }

    public static Response getTestWithTwoParam(String url,String paramName, int paramValue,String secondParamName,int secondParamValue){

        return  given()
                .accept("application/json")
                .contentType(ContentType.JSON)
                .param(paramName,paramValue)
                .param(secondParamName,secondParamValue)
                .when()
                .get(url)
                .then()
                .log()
                .all()
                .extract().response();
    }






    public static Response putTestWithToken(String url, Object object, String token) {

        return given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .body(object)
                        .when()
                        .put(url)
                        .then()
                        .log()
                        .all()
                        .extract().response();
    }

    public static Response patchTestWithToken(String url, Object object, String token) {

        return given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .body(object)
                        .when()
                        .patch(url)
                        .then()
                        .log()
                        .all()
                        .extract().response();
    }

    public static Response deleteTestWithToken(String url, String token) {

        return given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .when()
                        .delete(url)
                        .then()
                        .log()
                        .all()
                        .extract().response();
    }

}












