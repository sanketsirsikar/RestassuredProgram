package com.bridgelabz.restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetCallBDDTest {

        @Test
        public void getPetDetails(){
            String body = RestAssured.
                    given().
                    when().
                    get("https://petstore.swagger.io/v2/pet/103").asPrettyString();

            System.out.println("Body: " + body);

        }

    }


