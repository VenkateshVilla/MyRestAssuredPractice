package com.pogoutility;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateBooking {
	
	public static String baseURI="https://restful-booker.herokuapp.com/booking";
	
	@Test
	public void createBookingWithPogo() {
		BookingDates bookingdates=new BookingDates("2018-01-01","2019-01-01");
		Booking booking=new Booking("Steve","Jobs",222,true,bookingdates,"Brkfst");
		
		Response response= given().contentType(ContentType.JSON).body(booking).post(baseURI);
		System.out.println(response.statusCode());
		  
//		response.prettyPrint();
		
		Assert.assertEquals(response.statusCode(), 200,"status code not matching");
		
		SoftAssert softAssert=new SoftAssert();
		
		String actualFirstName=response.jsonPath().getString("booking.firstname");
		softAssert.assertEquals("Steve", actualFirstName);
		
		String actualLastName=response.jsonPath().getString("booking.lastname");
		softAssert.assertEquals("Jobs", actualLastName);
		
		int actualTotalPrice=response.jsonPath().getInt("booking.totalprice");
		softAssert.assertEquals(222, actualTotalPrice);
		
		boolean actualDepositPaid=response.jsonPath().getBoolean("booking.depositpaid");
		softAssert.assertEquals(true, actualDepositPaid);
		
		String actualCheckin=response.jsonPath().getString("booking.bookingdates.checkin");
		softAssert.assertEquals("2018-01-01",actualCheckin);
		
		String actualCheckout=response.jsonPath().getString("booking.bookingdates.checkout");
		softAssert.assertEquals("2019-01-01",actualCheckout);
		
		String actualAdditionalNeeds=response.jsonPath().getString("booking.additionalneeds");
		softAssert.assertEquals("Brkfst",actualAdditionalNeeds);
		
		System.out.println(actualFirstName+" "+actualLastName+" "+actualTotalPrice+" "+actualDepositPaid+" "+actualCheckin+" "+actualCheckout+" "+actualAdditionalNeeds);
	
		
	}

}
