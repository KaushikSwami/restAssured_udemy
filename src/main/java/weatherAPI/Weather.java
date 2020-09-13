package weatherAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.ReusableMethods;


public class Weather {
	public String expected_name="Chennai";
	
	@Test
	public void method()
	{
		RestAssured.baseURI="http://api.openweathermap.org";
		
		Map<String,String>parameters=new HashMap<>();
		parameters.put("q", "Chennai");
		parameters.put("appid", "9357be8341ede19dcf37432e0c487838");
		
		String response=given().params(parameters).log().all().
				        when().get("/data/2.5/weather").
				        then().assertThat().statusCode(200).extract().response().asString();
		
		
		JsonPath js = ReusableMethods.rawToJson(response);
		String actual_name=js.getString("name");
		Assert.assertEquals(actual_name, expected_name);
		System.out.println("the city name is : " + actual_name);
		String id = js.getString("id");
		System.out.println("the is is : " + id);
		 
		
		
		
	}

}
