package com.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Petstore_post {
  @Test
  public void f() {
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("id", 212);
	  
//	  ArrayList<HashMap<String,Object>> categorylist=new ArrayList<HashMap<String,Object>>();
	  HashMap<String,Object> categorymap=new HashMap<String,Object>();
	  categorymap.put("id", 212);
	  categorymap.put("name", "random");
	  
//	  categorylist.add(categorymap);
	  map.put("category", categorymap);
	  
	  map.put("name", "randomdoggie");
	  
	  ArrayList<String> photoUrlslist=new ArrayList<String>();
	  photoUrlslist.add("string");
	  
	  map.put("photoUrls", photoUrlslist);
	  
	  ArrayList<HashMap<String,Object>> tagslist=new ArrayList<HashMap<String,Object>>();
	  HashMap<String,Object>tagsmap=new HashMap<String,Object>();
	  tagsmap.put("id",212);
	  tagsmap.put("name", "randomdoggie");
	  tagslist.add(tagsmap);
	  
	  map.put("tags", tagslist);
	  
	  map.put("status","available");
	  
	  JSONObject payload=new JSONObject(map);
	  
	  System.out.println(payload.toJSONString());
	  
	  baseURI="https://petstore.swagger.io/v2";
	  Response response= given().contentType(ContentType.JSON).body(payload).post("/pet");
	  System.out.println(response.statusCode());
		
	  
	  
	  
	 
	  
	  
	  
  }
}
