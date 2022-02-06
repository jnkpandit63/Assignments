package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment_response_logging {
	RequestSpecification request;
	Response response;
	
//	@Given("API for testing")
//	public void api_for_testing() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("Given");
//		RestAssured.baseURI="https://reqres.in";	
//		request=given().header("content-type","application/json").
//				body("{\r\n"
//						+ "    \"name\": \"ABC\",\r\n"
//						+ "    \"job\": \"leader\"\r\n"
//						+ "}");
//		
//	}
//
//	@When("posted with correct information")
//	public void posted_with_correct_information() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("When");
//		String path="api/users";
//		response=request.post(path).then().log().all().extract().response();
//		
//	}
//
//	@Then("validate positive response code received")
//	public void validate_positive_response_code_received() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("Then");
//		System.out.println("response status code : "+response.getStatusCode()); 
//		System.out.println("response status line : "+response.getStatusLine());
//		Assert.assertEquals("HTTP/1.1 201 Created", response.getStatusLine());
//		Assert.assertEquals(201, response.getStatusCode());
//		Assert.assertEquals("application/json; charset=utf-8", response.getContentType());
//		System.out.println("response content type : "+response.getContentType());
//	}
//	
	@Given("Api for testing")
	public void api_for_testing1() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json");
		
	}

	@When("Retrieve correct information")
	public void retrieve_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path="api/users?page=2";
		response=request.get(path).then().log().all().extract().response();
	}

	@Then("validate positive response code")
	public void validate_positive_response_code() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		Assert.assertEquals(200, response.getStatusCode());
	}

	@Given("API for PUT testing")
	public void api_for_put_testing() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json");
//				body("{\r\n"
//						+ "    \"name\": \"Ajinkya\",\r\n"
//						+ "    \"job\": \"leader\"\r\n"
//						+ "}");
		
	}
	

	@When("Update correct information")
	public void update_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path="api/users/2";
		response=request.put(path).then().log().all().extract().response();
		
		
	}

	@Then("validate positive response code for put method")
	public void validate_positive_response_code_for_put_method() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		System.out.println("response status code : "+response.getStatusCode()); 
		System.out.println("response status line : "+response.getStatusLine());
//		Assert.assertEquals("HTTP/1.1 200 Created", response.getStatusLine());
		Assert.assertEquals(200, response.getStatusCode());
		
		
	}
	@Given("API for Patch testing")
	public void api_for_patch_testing() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}");
	}

	@When("Patch correct information")
	public void patch_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path="api/users/2";
		response=request.patch(path).then().log().all().extract().response();
	}

	@Then("validate positive response code for patch method")
	public void validate_positive_response_code_for_patch_method() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		Assert.assertEquals(200, response.getStatusCode());
		}
	
	
	
}
