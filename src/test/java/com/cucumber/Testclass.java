package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testclass {

	public static WebDriver driver;
	public Testclass(WebDriver Idriver){
		this.driver = Idriver;
		PageFactory.initElements(Idriver, this);
		
	}
	
	@FindBy(id = "nav-link-shopall")
	private WebElement category;
	
	@FindBy(xpath = "//span[text()='Mobiles, Computers']")
	private WebElement mobile;
	
	@FindBy(xpath = "//span[text()='Power Banks']")
	private WebElement powerbank;
	
	public WebElement getCategory() {
		return category;
	}

	public void setCategory(WebElement category) {
		this.category = category;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}

	public WebElement getPowerbank() {
		return powerbank;
	}

	public void setPowerbank(WebElement powerbank) {
		this.powerbank = powerbank;
	}

	public WebElement getPowerimag() {
		return powerimag;
	}

	public void setPowerimag(WebElement powerimag) {
		this.powerimag = powerimag;
	}

	public WebElement getPoweritem() {
		return Poweritem;
	}

	public void setPoweritem(WebElement poweritem) {
		Poweritem = poweritem;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public void setAddcart(WebElement addcart) {
		this.addcart = addcart;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	@FindBy(xpath = "(//img[@class='acs_tile__image'])[1]")
	private WebElement powerimag;

	@FindBy(xpath = "//h2[text()='Mi 20000mAH Li-Polymer Power Bank 2i (White)']")
	private WebElement Poweritem;
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addcart;
	
	@FindBy(id = "hlb-view-cart-announce")
	private WebElement cart;
	
	@FindBy(xpath = "//input[@name='proceedToCheckout']")
	private WebElement checkout;
}