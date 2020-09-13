package files;

import api.practice.Practice;

public class Payload extends Practice{
	
	public static String AddPlace()
	{
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"my house\",\r\n" + 
				"  \"phone_number\": \"(+91) 567 567 894526\",\r\n" + 
				"  \"address\": \"practice street\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"INDIA\"\r\n" + 
				"}\r\n" + 
				"";
	}
	
	
	  public static String editPlace() 
	  {
		  return "{\r\n" + 
		  		"\"place_id\":\""+placeId+"\",\r\n" + 
		  		"\"address\":\""+newAddress+"\",\r\n" + 
		  		"\"key\":\"qaclick123\"\r\n" + 
		  		"}\r\n" + 
		  		"";
	  }
	  
	  public static String nestedResponse()
	  {
		  return "{\r\n" + 
		  		"\r\n" + 
		  		"\"dashboard\": {\r\n" + 
		  		"\r\n" + 
		  		"\"purchaseAmount\": 910,\r\n" + 
		  		"\r\n" + 
		  		"\"website\": \"rahulshettyacademy.com\"\r\n" + 
		  		"\r\n" + 
		  		"},\r\n" + 
		  		"\r\n" + 
		  		"\"courses\": [\r\n" + 
		  		"\r\n" + 
		  		"{\r\n" + 
		  		"\r\n" + 
		  		"\"title\": \"Selenium Python\",\r\n" + 
		  		"\r\n" + 
		  		"\"price\": 50,\r\n" + 
		  		"\r\n" + 
		  		"\"copies\": 6\r\n" + 
		  		"\r\n" + 
		  		"},\r\n" + 
		  		"\r\n" + 
		  		"{\r\n" + 
		  		"\r\n" + 
		  		"\"title\": \"Cypress\",\r\n" + 
		  		"\r\n" + 
		  		"\"price\": 40,\r\n" + 
		  		"\r\n" + 
		  		"\"copies\": 4\r\n" + 
		  		"\r\n" + 
		  		"},\r\n" + 
		  		"\r\n" + 
		  		"{\r\n" + 
		  		"\r\n" + 
		  		"\"title\": \"RPA\",\r\n" + 
		  		"\r\n" + 
		  		"\"price\": 45,\r\n" + 
		  		"\r\n" + 
		  		"\"copies\": 10\r\n" + 
		  		"\r\n" + 
		  		"}\r\n" + 
		  		"\r\n" + 
		  		"]\r\n" + 
		  		"\r\n" + 
		  		"}";
	  }
	  
	  public static String addBook()
	  {
		  return "{\r\n" + 
		  		"\r\n" + 
		  		"\"name\":\"study books\",\r\n" + 
		  		"\"isbn\":\"book\",\r\n" + 
		  		"\"aisle\":\"12345\",\r\n" + 
		  		"\"author\":\"kaush\"\r\n" + 
		  		"}\r\n" + 
		  		"";
	  }
	 

}
