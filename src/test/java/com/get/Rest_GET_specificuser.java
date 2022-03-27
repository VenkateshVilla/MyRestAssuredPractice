package com.get;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_GET_specificuser {
  @Test
  public void f() {
	  RestAssured.baseURI="http://reqres.in";
	  RequestSpecification httpRequest=RestAssured.given();
	  Response response=httpRequest.request(Method.GET,"/api/users/3");
	  int statusCode=response.getStatusCode();
	  System.out.println(statusCode);
  }
  
  @Test()
  public void f6() {
	baseURI="https://api.stripe.com/v1/customers/";
	//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
	Response response= given().auth().basic("sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4", "").get("cus_LOlWlkBPhSzOEo");
	System.out.println("------------------------specific customer--------------------------");
	
	response.prettyPrint();
	
	int statusCode=response.getStatusCode();
	System.out.println(statusCode);  
}
}
