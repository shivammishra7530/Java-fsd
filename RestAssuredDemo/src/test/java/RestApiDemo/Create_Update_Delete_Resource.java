package RestApiDemo;
import java.util.HashMap;
import java.util.UUID;
import org.junit.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Create_Update_Delete_Resource extends TestBase{


int id;
io.restassured.response.Response response;
JsonPath jsonPath;
	
	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	
	@Test(priority=0)
	public void createPayLoad() {
		map.put("name", "Captain America");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload created");
	
	}
	
	@Test(priority=1)
	public void createResource() {
		response = RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.when()
		.post()
		.then()
		.log().all()
		.extract().response();
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
		
	}
	
	@Test(priority=2)
	
	public void verifyResource() {
		System.out.println("Id ="+ id);
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.when()
		.get("https://gorest.co.in/public/v2/users/"+id)
		.then()
		.statusCode(200)
		.log().all();
		Assert.assertTrue(jsonPath.get("name").equals("Captain America"));
	}
	
	@Test(priority=3)
	public void updateResource() {
		map.put("name", "Captain Super America");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/"+id;
		
		RestAssured
		.given()
		.contentType("application/json")
		.header("Authorization", "Bearer 954e63b9174052c466fbcdcc66fb3221892d2600f7a1695c2eea7db7de64bf06")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all()
		.assertThat()
		.body("name", is ("Captain Super America"));
	}
	
	@Test(priority=4)
	public void deleteResource() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/"+id;
		
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
