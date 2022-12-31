package Interview.api;

import Interview.pojo.ResponsePojo;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Helper;

public class QuantityCheck {

    @Test
    public void getTest(){
        Response response = Helper.getTest("https://fakerapi.it/api/v1/addresses?_quantity=-10");
        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getTotal(),0);// check whether quantity of endpoint equals to response quantity or not
        Assert.assertEquals(responsePojo.getData().size(),0);
    }

    @Test
    public void getTest1(){
        Response response = Helper.getTest("https://fakerapi.it/api/v1/addresses?_quantity=1023");
        ResponsePojo responsePojo = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getTotal(),1000); // check whether quantity of endpoint equals to response quantity or not
        Assert.assertEquals(responsePojo.getData().size(),1000);

    }

    @Test()
    public  void getTest2(){
        Response response = Helper.getTestWithParam("https://fakerapi.it/api/v1/addresses","quantity",10);
        ResponsePojo responsePojo  = response.as(ResponsePojo.class);
        Assert.assertEquals(responsePojo.getTotal(),10);
        Assert.assertEquals(responsePojo.getData().size(),10);
    }








}
