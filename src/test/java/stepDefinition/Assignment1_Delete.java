package stepDefinition;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment1_Delete {
	RequestSpecification request;
	Response response;
	
	@Given("API for Delete testing")
	public void api_for_delete_testing() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";
		request=given().header("content-type","application/json");
	}

	@When("Delete correct information")
	public void delete_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path="api/users/2";
		response=request.delete(path).then().log().all().extract().response();
	}

	@Then("validate positive response code for delete method")
	public void validate_positive_response_code_for_delete_method() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		//Assert.assertEquals(204, response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 204);
		
	}


}
