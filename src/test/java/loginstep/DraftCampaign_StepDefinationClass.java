package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DraftCampaign_StepDefinationClass 
{

	
	@Given("user is at Campaign Portal")
	public void user_is_at_campaign_portal() 
	{
	  
		 System.out.println("Given statement for Campaign Portal ");
		
	}

	@When("User click on draft campaign button")
	public void user_click_on_draft_campaign_button() 
	{
	   
		System.out.println("When statement for Draft Campaign button ");
	}

	@When("user submit the required information")
	public void user_submit_the_required_information() 
	{
	   
		System.out.println("When statement for submit the rquired information ");
	}

	@Then("Campaign drfts created successfully")
	public void campaign_drfts_created_successfully() 
	{
	    
		System.out.println("Then statement for Drafts campaign created successfully");
	}

	@When("user click on created campaign button")
	public void user_click_on_created_campaign_button()
	{

		System.out.println("When statement User click on Created Campaign button ");

		
	}

	@When("user submit thre required information for created campaign")
	public void user_submit_thre_required_information_for_created_campaign() 
	{
	    
		System.out.println("When statement for rquired information for creating campaign ");
	}

	@Then("user created campaign successfully")
	public void user_created_campaign_successfully()
    {
	   
		System.out.println("Then statement for Created Campaign successfully created");
	}

	@When("User click on Sent Campaign button")
	public void user_click_on_sent_campaign_button() 
	{
	   
		System.out.println("When statement for click on Sent Campaign button");
	}

	@When("User submit the customer requirement sent information")
	public void user_submit_the_customer_requirement_sent_information() 
	{
	   
		System.out.println("When statement submit the customer requirement sent information");
	}

	@Then("Sent Campaign successfully created")
	public void sent_campaign_successfully_created()
    {
	   
		System.out.println("Then statement for sent  Campaign successfully");
		
	}

	
	
}
