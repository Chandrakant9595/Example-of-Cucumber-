package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksExampleStepDefination {
	
	
	@Before
	public void setUp(){
		
		System.out.println("Set up method");
	}
	
	@After
	public void tearDown(){
		
		System.out.println("Tear down method");
	}
	
	@Given("^login page$")
	public void login_page(){
	   
		System.out.println("Given method");
	}

	@When("^verify login page URL$")
	public void verify_login_page_URL(){
	    
		System.out.println("When method");
	}

	@Then("^user enetr username and password$")
	public void user_enetr_username_and_password(){
	    
		System.out.println("Enter username and password method");
	}
	
	
	
	
	@Given("^move on deal page$")
	public void move_on_deal_page(){
	    
		System.out.println("User is on deal page");
	}

	@When("^verify the deal page$")
	public void verify_the_deal_page(){
	  
		System.out.println("Verify the deal page URL");
	}

	@Then("^create deal$")
	public void create_deal(){
	    
		System.out.println("Create deal");
	}

}
