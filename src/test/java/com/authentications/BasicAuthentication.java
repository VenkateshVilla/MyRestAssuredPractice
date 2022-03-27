package com.authentications;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BasicAuthentication {
	@Test()
	  public void f1() {
	/*	baseURI="https://api.stripe.com";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		Response response= given().auth().basic("sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4", "").get("/v1/customers");
		System.out.println("------------------------specific customer--------------------------");
		
		response.prettyPrint();
		
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);   */
	}
	
	@Test()
	  public void f2() {
		baseURI="https://api.stripe.com";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		Response response= given().header("Authorization","Bearer sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4").get("/v1/customers");
		System.out.println("------------------------specific customer--------------------------");
		
		response.prettyPrint();
		String res=response.asString();
		
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);  
	}
	
	
}
