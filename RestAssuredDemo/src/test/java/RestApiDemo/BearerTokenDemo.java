package RestApiDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {

HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Superman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test
	public void updateResource() {
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.when()
		.post()
		.then()
		.statusCode(201)
		.log().all();
	}
	
	
}
