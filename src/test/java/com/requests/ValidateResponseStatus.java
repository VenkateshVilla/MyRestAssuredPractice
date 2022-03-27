package com.requests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseStatus {
  @Test
  public void f() {
	  RestAssured.baseURI="http://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/api/users/3");
		
		System.out.println(response.getStatusLine().toString());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		Assert.assertTrue(response.getStatusLine().contains("OK"), "failed");
  }
}
