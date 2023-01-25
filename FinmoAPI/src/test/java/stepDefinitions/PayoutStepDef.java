package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class PayoutStepDef extends Utils {
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	
	
	/*Steps defined for Create payout request*/
	
	@Given("Post create payout payload")
	public void post_create_payout_payload() throws IOException {
		
		res=given().spec(requestSpecification())
				.body(data.createPayoutPayLoad())
				.headers("Authorization", "Bearer "+ "QUtfRklOTU9fU0JYX0FFNkVGRDYyNTRCNDRFOTBBOEM5OUVGNkREQzRCNzlEOlNLX0ZJTk1PX1NCWF80QUU2M0Y1M19FOUUxXzQxNjlfQkQzMV8zOTY1NTcwMTQ4QjU=");

	    
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		
		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
//		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
			 response =res.when().post(resourceAPI.getResource());
			else if(method.equalsIgnoreCase("GET"))
				 response =res.when().get(resourceAPI.getResource());
						 else if(method.equalsIgnoreCase("PUT"))
							 response =res.when().get(resourceAPI.getResource());
	}
	
	@Then("the API call got created with status code {int}")
	public void the_api_call_got_created_with_status_code(Integer int1) {
		
		assertEquals(response.getStatusCode(),201);
	}

	
	/*Steps defined for Get payout request*/

	@Given("Getting payout details using payout id")
	public void getting_payout_details_using_payout_id() throws IOException {
		
		res=given().spec(requestSpecification())
				.headers("Authorization", "Bearer "+ "QUtfRklOTU9fU0JYX0FFNkVGRDYyNTRCNDRFOTBBOEM5OUVGNkREQzRCNzlEOlNLX0ZJTk1PX1NCWF80QUU2M0Y1M19FOUUxXzQxNjlfQkQzMV8zOTY1NTcwMTQ4QjU=");
	}
	
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
		
		assertEquals(response.getStatusCode(),200);
	}

}
