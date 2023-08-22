package RestApiDemo;

import org.junit.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class verifyCurrencyName {

	@Test
	public void verifyCurrecncyName() {
	  io.restassured.response.Response response = 	RestAssured
		
		
		.when()
		.get("https://restcountries.com/v3.1/name/japan")
		.then()
		.extract().response();
		
	   JsonPath jsonPath = response.jsonPath();
	   	Assert.assertTrue(jsonPath.get("[0].currencies.JPY.name").toString().equals("Japanese yen"));
		
		
	}
	
}
