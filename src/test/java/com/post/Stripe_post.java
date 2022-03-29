package com.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Stripe_post {
	@Test()
	  public void f1() {
	/*	baseURI="https://api.stripe.com";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		Response response= given().header("Authorization","Bearer sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4").
				formParam("email","random2.random@gmail.com").formParam("name","random2").formParam("phone","7012342391").formParam("description","add 2 random").post("/v1/customers");
		System.out.println("------------------------specific customer--------------------------");
		
		response.prettyPrint();
		String res=response.asString();
		
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);  */
	}
	
	@Test()
	  public void f2() {
		baseURI="https://api.stripe.com";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		
		String body= "{\"email\":\"random4.random@gmail.com\",\"name\":\"random4\",\"phone\":\"7012342394\",\"description\":\"add 4 random\"}";
		
		
		Response response= given().header("Authorization","Bearer sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4").
				formParam("email","random5.random@gmail.com").formParam("name","random5").formParam("phone","7012342395").formParam("description","add 5 random").post("/v1/customers");
		System.out.println("------------------------specific customer--------------------------");
		
		response.prettyPrint();
		String res=response.asString();
		
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);  
	}
@Test()
	  public void f2() {
		baseURI="https://api.stripe.com";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		
		String body= "{\"email\":\"random4.random@gmail.com\",\"name\":\"random4\",\"phone\":\"7012342394\",\"description\":\"add 4 random\"}";
		
		
		Response response= given().header("Authorization","Bearer sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4").
				formParam("email","random5.random@gmail.com").formParam("name","random5").formParam("phone","7012342395").formParam("description","add 5 random").post("/v1/customers");
		System.out.println("------------------------specific customer--------------------------");
		
		response.prettyPrint();
		String res=response.asString();
		
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);  
	}
}
