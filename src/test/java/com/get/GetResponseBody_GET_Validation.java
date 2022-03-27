package com.get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetResponseBody_GET_Validation {
  @Test
  public void f() {
	  RestAssured.baseURI="http://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/api/users/2");
		ResponseBody body=response.getBody();
//		System.out.println(body.asString());
		body.prettyPrint();
  }
}
