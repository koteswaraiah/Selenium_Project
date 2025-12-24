package Steps;

import io.cucumber.java.Before;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;



public class auth {
	public static String token;

    @Before
    public void generateToken() {
        Response response = given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"admin\", \"password\":\"password123\"}")
                .when()
                .post("https://restful-booker.herokuapp.com/auth");

        token = response.jsonPath().getString("token");
        System.out.println("Generated Token: " + token);
    }


}
