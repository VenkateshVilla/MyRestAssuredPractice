package com.requests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseHeader {
  @Test
  public void f() {
	    RestAssured.baseURI="http://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/api/users/2");
		Headers headers=response.getHeaders();
		
		//validating headers count
		int headersCount=headers.asList().size();
		Assert.assertEquals(headersCount, 19);
		
		/* validating specific headers like below
		Content-Type=application/json; charset=utf-8
		Transfer-Encoding=chunked
		Connection=keep-alive
		X-Powered-By=Express  */
		
		String headerValue=response.getHeader("Content-Type");
		Assert.assertEquals("application/json; charset=utf-8",headerValue);
		
		
		
			
  }
}
