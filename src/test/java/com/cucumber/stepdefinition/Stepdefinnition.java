package com.cucumber.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.Baseclass;
import com.cucumber.Testclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinnition extends Baseclass {
static WebDriver driver;
static Testclass testclass = new Testclass(driver);;

@Given("^User launch the chrome browser$")
public void user_launch_the_chrome_browser() throws Throwable {
   String browserName = System.getProperty("Browser");
	driver = browsers(browserName);
	
}



@When("^User hit the amazon application$")
public void user_hit_the_amazon_application() throws Throwable {
	testclass = new Testclass(driver);
    geturl("https://www.amazon.in/");
    
}

@When("^User mouse over the show by category menu$")
public void user_mouse_over_the_show_by_category_menu() throws Throwable {
	testclass = new Testclass(driver);
	Mouseover(testclass.getCategory());
	
    
}

@When("^User mouse over the mobile,application menu$")
public void user_mouse_over_the_mobile_application_menu() throws Throwable {
	testclass = new Testclass(driver);
    Mouseover(testclass.getMobile());
    
}

@When("^User mouse over the subcategory powerbank$")
public void user_mouse_over_the_subcategory_powerbank() throws Throwable {
	testclass = new Testclass(driver);
    Mouseover(testclass.getPowerbank());
    
}

@When("^User click the subcategory powerbank$")
public void user_click_the_subcategory_powerbank() throws Throwable {
	testclass = new Testclass(driver);
    testclass.getPowerbank().click();
    
}

@When("^User click the powerbank image$")
public void user_click_the_powerbank_image() throws Throwable {
	testclass = new Testclass(driver);
    testclass.getPowerimag().click();
}

@When("^User click the powerbank item$")
public void user_click_the_powerbank_item() throws Throwable {
	testclass = new Testclass(driver);
    testclass.getPoweritem().click();
}

@When("^User click the Add to cart$")
public void user_click_the_Add_to_cart() throws Throwable {
	testclass = new Testclass(driver);
 
	  Set<String> windowHandles = driver.getWindowHandles();
	  List<String> x=new ArrayList<String>();
	  x.addAll(windowHandles);
	  for (String string : x) {
		if(string.equals(x.get(1)))
		{
			driver.switchTo().window(string);
		}
	}
testclass.getAddcart().click();
    
}

@When("^User click the cart$")
public void user_click_the_cart() throws Throwable {
	testclass = new Testclass(driver);
    testclass.getCart().click();
    
}

@Then("^User checkout the item$")
public void user_checkout_the_item() throws Throwable {
	testclass = new Testclass(driver);
    testclass.getCheckout().click();
    driver.close();
}







	
}
