package com.cucumber.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefintion_demo {

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
		System.out.println("user laucn app");
	}

	@When("^User enter username$")
	public void user_enter_username() throws Throwable {
		System.out.println("user enter username");
	}

	@When("^User enter password$")
	public void user_enter_password() throws Throwable {
		System.out.println("user enter password");
	}

	@Then("^User verifies crendentials$")
	public void user_verifies_crendentials() throws Throwable {
		System.out.println("user verify credentials");
	}
	
	@When("^User enter username '(.*)'$")
	public void user_enter_usernam(String arg) {
		System.out.println(arg);
	}
	
	@When("^User enter password '(.*)'$")
	public void user_enter_passwor(String a) throws Exception {
		System.out.println(a);
		Assert.fail();
	}
	
	@When("^User enter username and password$")
	public void user_enter_username_and_password(DataTable arg1) throws Throwable {
	   List<List<String>> data = arg1.raw();
	   System.out.println(data.get(0).get(0));
	   System.out.println(data.get(0).get(1));

	   System.out.println(data.get(1).get(0));
	   System.out.println(data.get(1).get(1));


		
	}

	@When("^User enter username and password using map$")
	public void user_enter_username_and_password_using_map(DataTable arg1) throws Throwable {
	    
		List<Map<String, String>> x = arg1.asMaps(String.class, String.class);
		System.out.println(x.get(0).get("Username"));
		System.out.println(x.get(0).get("Password"));
		System.out.println(x.get(1).get("Username"));
		System.out.println(x.get(1).get("Password"));

		
	}


}
