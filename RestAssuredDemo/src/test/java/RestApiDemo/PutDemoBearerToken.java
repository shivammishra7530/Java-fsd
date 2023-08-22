package RestApiDemo;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PutDemoBearerToken {

HashMap<String, String> map = new HashMap<>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Superduperman");
		map.put("email", "superman55456785667732@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/4495047";
	}
	
	@Test
	public void updateResource() {
	   io.restassured.response.Response response = 	RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.body(map)
		.when()
		.put()
		.then()
		.extract().response();
		
	   JsonPath jsonPath = response.jsonPath();
	   	Assert.assertTrue(jsonPath.get("name").toString().equals("Superduperman"));
		
		
	}
	
	
}
