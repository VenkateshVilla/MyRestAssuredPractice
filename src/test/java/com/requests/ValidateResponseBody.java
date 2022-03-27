package com.requests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseBody {
  @Test
  public void f() {
	  RestAssured.baseURI="http://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/api/users/2");
		ResponseBody body=response.getBody();
		
		String str_body=body.asString();
		Assert.assertTrue(str_body.contains("janet.weaver@reqres.in"));
		
		
		
  }
}

