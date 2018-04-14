package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExampleOfTHStepDefination {
	
	
	@Before()
	public void setup(){
		System.out.println("Set up");
	}
	
	@After()
	public void teardown(){
		System.out.println("close test");
	}
	
	@Before("@First")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	
 
	/*@Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	
 
	@Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }*/
 
	@After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	
 
	/*@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	
 
	@After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");   
    }*/	
	
	
	@Given("^test one$")
	public void test_one(){
	    
		System.out.println("a");
	}

	@When("^test two$")
	public void test_two(){
	    
		System.out.println("b");
	}

	@Then("^test three$")
	public void test_three(){
	   
		System.out.println("c");
	}
	
}
