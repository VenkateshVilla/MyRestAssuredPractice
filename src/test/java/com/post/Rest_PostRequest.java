package com.post;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Rest_PostRequest {
  @Test
  public void f() {
	  RestAssured.baseURI="https://bookstore.toolsqa.com/";
	  String payload="\n"
	  		+ "{\n"
	  		+ "  \"userName\": \"morpheus\",\n"
	  		+ "  \"password\": \"Le@der13\"\n"
	  		+ "}";
	  
	  RequestSpecification httpRequest=RestAssured.given();
	  httpRequest.header("Content-Type","application/json");
	  
	  Response response=httpRequest.body(payload).post("/Account/v1/User");
	  
	//  System.out.println(response.getStatusCode());
	  
	  Assert.assertEquals(201, response.getStatusCode());
  }
  
  @Test
  public void f1() {
	  baseURI="https://reqres.in/";
	  
	  Map<String, Object> map=new HashMap<String, Object>();
	  map.put("name", "Venkatesh");
	  map.put("job", "Student");
	  
	  JSONObject json=new JSONObject(map);
	  
//	  System.out.println("-----------------JSON-------------------");
//	  System.out.println(json.toJSONString());
//	  System.out.println("----------------JSON------------------");
//	  
//	  System.out.println("-----------------MAP-------------------");
//	  System.out.println(map);
//	  System.out.println("----------------MAP------------------");
	  
  }
  
  @Test
  public void f2() {
	  baseURI="https://reqres.in/";
	  JSONObject jsonPayload=new JSONObject();
	  
	  jsonPayload.put("name", "Venkatesh");
	  jsonPayload.put("job", "Student");
	  
	  given().
	  	 header("Content-Type","application/json").
	  	 contentType(ContentType.JSON).
	  	 accept(ContentType.JSON).
	     body(jsonPayload.toJSONString()).
	  when().
	     post("/api/users").
	  then().
	  	 statusCode(201).log().all(); 
  }
  
  @Test
  public void f3() {
	  baseURI="https://reqres.in/";
	  
	  String payload="{\n"
	  		+ "    \"name\": \"morpheus\",\n"
	  		+ "    \"job\": \"leader\"\n"
	  		+ "}";
	  
	  Response response=given().contentType(ContentType.JSON).body(payload).post("/api/users");
	  int statusCode=response.getStatusCode();			  
	  
	  response.prettyPrint();
  }
  
  
  
  
  
}
