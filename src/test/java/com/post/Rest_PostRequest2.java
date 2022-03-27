package com.post;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_PostRequest2 {
  @Test
  public void f() {
	  RestAssured.baseURI="https://reqbin.com/echo/post/json";
	  String payload="{\n"
	  		+ "  \"Id\": 19477,\n"
	  		+ "  \"Customer\": \"John Smith\",\n"
	  		+ "  \"Quantity\": 1,\n"
	  		+ "  \"Price\": 10.00\n"
	  		+ "}";
	  
	  RequestSpecification httpRequest=RestAssured.given();
	  httpRequest.header("Content-Type","application/json");
	  
	  Response response=httpRequest.body(payload).post();
	  
	  System.out.println(response.getStatusCode());
	  
	  Assert.assertEquals(200, response.getStatusCode());
	 
	  response.prettyPrint();
	  
	  System.out.println(response.getStatusLine());
	  
  }
}
