package RestApiDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {

	@Test
	public void getWeatherInfo() {
		RestAssured
		
		
		.given()
		.param("q", "chennai")
		.param("appid", "0edac9fa4a014543566ab3dba0bb3fd3")
		.param("units", "metric")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.statusCode(200)
		.log().all();
		}
	
}
