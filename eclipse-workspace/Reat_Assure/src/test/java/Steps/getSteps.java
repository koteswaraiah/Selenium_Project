package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;


public class getSteps {
	private String endpoint;
	 private String token;
	 private String requestBody;

    private Response response;



	
	@Given("the API endpoint is {string}")
	public void the_api_endpoint_is(String url) {
		this.endpoint = url;

	    
	}
	

	@When("I send a GET request")
	public void i_send_a_get_request() {
		 response = given()
				 .header("Authorization", "Bearer " + auth.token)

				 .when().get(endpoint);

	  
	}

	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be1(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
		
		
		
		System.out.println("Details"+response.asString());
		

		    // 1. Status code
		    assertEquals(response.getStatusCode(), 200);

		    // 2. Field validations
		    assertEquals(response.jsonPath().getInt("userId"), 1);
		    assertEquals(response.jsonPath().getInt("id"), 1);

		    // 3. String validation
		    assertTrue(response.jsonPath().getString("title").contains("repellat"));

		    // 4. Header validation
		    assertEquals(response.getHeader("Content-Type"), "application/json; charset=utf-8");

		    // 5. Response time
		    assertTrue(response.getTime() < 2000);

		    // 6. Body length
		    assertTrue(response.getBody().asString().length() > 50);

		    // 7. Print response
		    response.prettyPrint();
		

	}
	
	//post
	
	 @Given("the POST API endpoint is {string}")
	    public void the_post_api_endpoint_is(String url) {
	        this.endpoint = url;
	    }

	    @Given("I have a request body for creating a post")
	    public void i_have_a_request_body_for_creating_a_post() {
	        requestBody = "{\n" +
	                "  \"title\": \"foo\",\n" +
	                "  \"body\": \"bar\",\n" +
	                "  \"userId\": 1\n" +
	                "}";
	    }
	    
	    @When("I send a POST request")
	    public void i_send_a_post_request() {
	        response = given()
	                .header("Content-Type", "application/json")
	                .header("Authorization", "Bearer " + auth.token) // optional
	                .body(requestBody)
	                .when()
	                .post(endpoint);

	        response.prettyPrint();
	    }

	    @Then("response status code should be {int}")
	    public void the_response_status_code_should_be(Integer statusCode) {
	    	
	    	
	        assertEquals(response.getStatusCode(), statusCode.intValue());
	    }
	    @Then("I validate the POST response")
	    public void i_validate_the_post_response() {

	        // ✅ Validate fields
	        assertEquals(response.jsonPath().getString("title"), "foo");
	        assertEquals(response.jsonPath().getString("body"), "bar");
	        assertEquals(response.jsonPath().getInt("userId"), 1);

	        // ✅ Validate ID is generated
	        assertTrue(response.jsonPath().getInt("id") > 0);

	        // ✅ Validate content type
	        assertTrue(response.getHeader("Content-Type").contains("application/json"));

	        // ✅ Validate response time
	        assertTrue(response.getTime() < 2000);
	    }

	    
	    // delete
	    
	    @Given("the DELETE API endpoint is {string}")
	    public void the_delete_api_endpoint_is(String url) {
	        this.endpoint = url;
	    }

	    @When("I send a DELETE request")
	    public void i_send_a_delete_request() {
	        response = given()
	                .header("Authorization", "Bearer " + auth.token) // optional
	                .when()
	                .delete(endpoint);

	        response.prettyPrint();
	    }
	    
	    @Then("status code should be {int}")
	    public void status_code_should_be(Integer s) {
	        assertEquals(response.getStatusCode(), s.intValue());
	    }

	    @Then("I validate the DELETE response")
	    public void i_validate_the_delete_response() {

	        // ✅ JSONPlaceholder returns empty body for DELETE
	        assertTrue(response.getBody().asString().isEmpty()
	                || response.getBody().asString().equals("{}"));

	        // ✅ Validate headers
	        assertTrue(response.getHeader("Content-Type").contains("application/json"));

	        // ✅ Validate response time
	        assertTrue(response.getTime() < 2000);
	    }


	    
	    //put
	    
	    @Given("the PUT API endpoint is {string}")
	    public void the_put_api_endpoint_is(String url) {
	        this.endpoint = url;
	    }

	    @Given("I have a request body for updating a post")
	    public void i_have_a_request_body_for_updating_a_post() {
	        requestBody = "{\n" +
	                "  \"id\": 1,\n" +
	                "  \"title\": \"updated title\",\n" +
	                "  \"body\": \"updated body content\",\n" +
	                "  \"userId\": 1\n" +
	                "}";
	    }

       
	    @When("I send a PUT request")
	    public void i_send_a_put_request() {
	        response = given()
	                .header("Content-Type", "application/json")
	                .header("Authorization", "Bearer " + auth.token) // optional
	                .body(requestBody)
	                .when()
	                .put(endpoint);

	        response.prettyPrint();
	    }
	    
	    @Then("code should be {int}")
	    public void code_should_be(Integer st) {
	        assertEquals(response.getStatusCode(), st.intValue());
	    }

	    @Then("I validate the PUT response")
	    public void i_validate_the_put_response() {

	        // ✅ Validate updated fields
	        assertEquals(response.jsonPath().getString("title"), "updated title");
	        assertEquals(response.jsonPath().getString("body"), "updated body content");
	        assertEquals(response.jsonPath().getInt("userId"), 1);
	        assertEquals(response.jsonPath().getInt("id"), 1);

	        // ✅ Validate content type
	        assertTrue(response.getHeader("Content-Type").contains("application/json"));

	        // ✅ Validate response time
	        assertTrue(response.getTime() < 2000);
	    }






}
