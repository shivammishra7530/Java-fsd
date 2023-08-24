package sportyshoes;
import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class SportyShoesApi {
	int id;
	io.restassured.response.Response response;
	JsonPath jsonPath;
		
		HashMap<String, String> map = new HashMap<String, String>();
		@Test(priority=1)
		
		public void verifyResource() {
			
			RestAssured
			.given()
			.contentType("application/json")
			.when()
			.get("http://localhost:9010/get-shoes")
			.then()
			.statusCode(200)
			.log().all();
			}

@Test(priority=2)
		
		public void verifyResource2() {
			RestAssured
			.given()
			.contentType("application/json")
			.when()
			.get("http://localhost:9010/get-users")
			.then()
			.statusCode(200)
			.log().all();	
		}

@Test(priority = 3)
public void createResource() {
    response = RestAssured.given()
            .contentType("application/json")
            .body(map)
            .when()
            .post("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
            .then()
            .log().all()
            .extract().response();
    jsonPath = response.jsonPath();
   
}		
}
