package com.bridgelabz.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetCallTest {
    @Test

    public void getTest() {
       Response response= RestAssured.get("https://reqres.in/api/users?page=2");
            System.out.println("status code: "+ response.getStatusCode());
            System.out.println("Time: " + response.getTime());
            System.out.println("Json Body: "+ response.asPrettyString());
            //System.out.println("Json Body: "+ response.asString());


        }
    }


