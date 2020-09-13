package api.practice;

import java.util.List;

import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class Conditional_logic {
	
	@Test
	public void method()
	{
		JsonPath js = ReusableMethods.rawToJson(Payload.nestedResponse());
		List<Object> listOfCourses = js.getList("courses");
		int size = listOfCourses.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			
			String listOfTitles = js.get("courses["+i+"].title");
			if(listOfTitles.equalsIgnoreCase("rpa")) {
				int copies = js.get("courses["+i+"].copies");
				System.out.println("the copies : " + copies);
			}
			
			
		}
		
	}

}
