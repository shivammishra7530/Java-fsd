package RestApiDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDeemoBearerToken {

	@Test
	public void gverifyResource() {
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		
		
		.when()
		.get("https://gorest.co.in/public/v2/users/4495047")
		.then()
		.statusCode(200)
		.log().all();
		}
	
}
