package api.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Practice {
	public static String placeId;
	public static String newAddress="new place";
	
	@Test
	public void method()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		// in given() we will be sending all the values that we need to send to obtain the results
		
		String response_addplace=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace())
		// in when() we will submit all the details ex resource ->http
		
		.when().post("/maps/api/place/add/json")
		
		// in then() we can use all the validation process
		
		.then().assertThat().statusCode(200).body("scope",equalTo( "APP")).extract().response().asString();
		
		// the below is the class for parsing JSON
		
		JsonPath js = ReusableMethods.rawToJson(response_addplace);
		placeId =js.getString("place_id");
		System.out.println("the place id is : " + placeId);
		
		
		
		String response_editPlace=given().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.editPlace())
		.when().put("/maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated")).extract().asString();
		
		JsonPath js_1 = ReusableMethods.rawToJson(response_editPlace);
		String editPlace=js_1.getString("msg"); 
		System.out.println(editPlace);
		
		
		String response_getPlace=given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeId).
		when().get("/maps/api/place/get/json").
		then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		
		JsonPath js_2 = ReusableMethods.rawToJson(response_getPlace);
		String address=js_2.getString("address");
		System.out.println("the updated address is : " + address);
		Assert.assertEquals(address, newAddress);
		
		 
		
	}

}
