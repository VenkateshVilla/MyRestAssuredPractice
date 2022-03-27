package com.get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_Test {
	
	@Test()
	  public void f() {
//		  RestAssured.baseURI="http://reqres.in";
//		  RequestSpecification httpRequest=RestAssured.given();
//		  Response response=httpRequest.request(Method.GET,"/api/users/3");
//		  int statusCode=response.getStatusCode();
//		  System.out.println(statusCode);
	  }
	
	@Test()
	  public void f2() {
		
		/*  import io.restassured.RestAssured;
			import io.restassured.http.Method;
			import io.restassured.response.Response;
			import io.restassured.specification.RequestSpecification;   */
		
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
	}
	
	@Test()
	  public void f3() {	
		baseURI="https://reqres.in/api/users?page=2";
           given().
             get(baseURI).
           then().
             statusCode(200).
             body("data.id[2]",equalTo(9));	
	}
	
	@Test()
	  public void f4() {
		baseURI="https://reqres.in/api";
        given().
          get("/users?page=2").
        then().
          statusCode(200).
          statusLine("HTTP/1.1 200 OK").
          body("data[4].first_name",equalTo("George")).
          body("data.first_name",hasItems("George","Rachel"));
	}
	
	@Test()
	  public void f5() {
		baseURI="https://api.stripe.com/v1/customers";
		//created password for this is Stripe@pi6730! and email is villa.venkatesh@gmail.com
		Response response= given().auth().basic("sk_test_51KhwjVSBBYhkKf2KqvUfL61i8djb5b4q19JQ7vUGhzX6IyBE5yDiRWwrMfcbFtXD2LU6avUHiy3zAzhKDRqSeMfl002ElJY8x4", "").get(baseURI);
		System.out.println("------------------------");
		
		response.prettyPrint();
		
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
