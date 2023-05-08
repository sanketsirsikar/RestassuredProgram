package com.bridgelabz.restassured;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutCallTest {
    @Test
    public void modifyPetDetails(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id","102");
        json.put("name", "jacky");
        json.put("status", "sold");

        request.body(json.toJSONString());

        Response response = request.post("https://petstore.swagger.io/v2/pet");
        System.out.println("status code: "+ response.getStatusCode());
                System.out.println("Time: " + response.getTime());
        System.out.println("Json Body: "+ response.asPrettyString());

        Assert.assertEquals(response.statusCode(),200);

    }
}