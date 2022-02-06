package stepDefinition;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment_DataProvider {
	RequestSpecification request;
	Response response;
	
	@DataProvider(name="User")
	public String [][] createUser(){
			return new String [][] {
				{"Ajinkya", "QA"},
				{"ABC", "Leader"},
				{"XYZ", "Teacher"},				
			};
					
	}

	@Test(dataProvider="User")
	@Given("API for testing POST method with data provider")
	public void api_for_testing_post_method_with_data_provider(String name, String profile) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Given");
		RestAssured.baseURI="https://reqres.in";	
		request=given().header("content-type","application/json").
				body("{\r\n"
						+ "    \"name\": \""+name+"\",\r\n"
						+ "    \"job\": \""+profile+"\"\r\n"
						+ "}");
		
	}
	@Test
	@When("posted with data provider")
	public void posted_with_data_provider() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("When");
		String path="api/users";
		response=request.post(path).then().log().all().extract().response();
	}
	@Test
	@Then("validate response code")
	public void validate_response_code() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Then");
		System.out.println("response status code : "+response.getStatusCode()); 
	}

	}
