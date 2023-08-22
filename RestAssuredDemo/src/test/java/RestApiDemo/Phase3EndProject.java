package RestApiDemo;
import java.util.HashMap;
import java.util.UUID;
import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Phase3EndProject extends TestBase{


int id;
io.restassured.response.Response response;
JsonPath jsonPath;
	
	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	
	@Test(priority=0)
	public void createPayLoad() {
		map.put("name", "morpheus");
		map.put("job", "leader");
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users";
		logger.info("Payload created");
	
	}
	
	

	
	@Test(priority = 1)
    public void createResource() {
        response = RestAssured.given()
                .contentType("application/json")
                .body(map)
                .header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
                .when()
                .post()
                .then()
                .log().all()
                .extract().response();
        jsonPath = response.jsonPath();
        id = jsonPath.getInt("id");
        System.out.println("Created resource ID: " + id);
    }
	
	@Test(priority=2)
	
	public void verifyResource() {
		System.out.println("Id ="+ id);
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.when()
		.get("https://reqres.in/api/users"+id)
		.then()
		.statusCode(200)
		.log().all();
		Assert.assertTrue(jsonPath.get("name").equals("morpheus"));
	}
	

	@Test(priority=3)
	public void updateResource() {
		map.put("name", "morpheus super");
		map.put("job", "Software Engineer");
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/"+id;
		
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority=4)
	public void deleteResource() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/"+id;
		
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.when()
		.delete()
		.then()
		.statusCode(204);
		
	}
}

