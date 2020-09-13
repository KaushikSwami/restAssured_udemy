package advanced_payload_strategies;

import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


public class DynamicPayload {
	public String id;
	
	@Test
	public void method()
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response_addBook = given().log().all().header("Content-Type","application/json").body(Payload.addBook()).
		when().post("/Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReusableMethods.rawToJson(response_addBook);
		id=js.get("ID");
		System.out.println("the id is : " + id);
		
	}

}
