package nested_loop;



import java.util.List;

import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class Nestes_Json {
	public int total_amount;
	
	@Test
	public void method()
	{
		// mocking the json response
		
		JsonPath js = ReusableMethods.rawToJson(Payload.nestedResponse());
       
		//int size = js.getList("courses").size();
		
		// print num of courses in the response
		//System.out.println("the total courses is : " + size);
		
		// print total amount of all the coursesd
		total_amount = js.getInt("dashboard.purchaseAmount");
		System.out.println("the total amount is : " + total_amount);
		
		//int total_courses = all_courses.size();
		
		List<Object> all_courses = js.getList("courses");
		int size = all_courses.size();
		
		for(int i=0;i<size;i++)
		{
			String title=js.get("all_courses["+i+"].title");
			System.out.println(title);
		}
		
		/*for(int i=0;i<size;i++)
		{
			String title=js.get("courses["+i+"].title");
			System.out.println(title);
			System.out.println("the amount is : " + js.get("courses["+i+"].price").toString());
			
		}*/
	}

}
