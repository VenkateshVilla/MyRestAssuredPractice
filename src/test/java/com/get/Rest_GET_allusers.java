package com.get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_GET_allusers {
  @Test
  public void f() {
	  RestAssured.baseURI="http://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/api/users?page=2");
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
  }
}
