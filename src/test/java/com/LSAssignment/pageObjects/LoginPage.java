package com.LSAssignment.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[@class=\"a-carousel-goto-nextpage\"]")
	@CacheLookup
	public WebElement Nextpointer;
	
	
	
	
	
	@FindBy(id="nav-link-accountList")
	@CacheLookup
	public WebElement SigninHover;
	
	@FindBy(xpath="(//a[@class=\"nav-action-button\"])[1]")
	@CacheLookup
	public WebElement SigninLink;
	
	@FindBy(name="email")
	@CacheLookup
	public WebElement mailId;
	
	@FindBy(id="ap_password")
	@CacheLookup
	public WebElement password;
	
	@FindBy(id="continue")
	@CacheLookup
	public WebElement continueButton;
	
	@FindBy(id="signInSubmit")
	@CacheLookup
	public WebElement LoginButton;
	
	@FindBy(id="auth-signin-button")
	@CacheLookup
	public WebElement SecondLoginButton;
	
	@FindBy(xpath="//input[@name=\"rememberMe\"]")
	@CacheLookup
	public WebElement RememberChkbox;
	
	@FindBy(xpath="//a[@class=\"nav-a nav-a-2 a-popover-trigger a-declarative\"]")
	@CacheLookup
	public WebElement Pincodelink;
	
	@FindBy(xpath="//input[@id=\"GLUXZipUpdateInput\"]")
	@CacheLookup
	public WebElement Pincodetextbox;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[4]")
	@CacheLookup
	public WebElement PinApplyButton;
	
	@FindBy(xpath="//span[@id=\"glow-ingress-line2\"]")
	@CacheLookup
	public WebElement PinCodeCheck;

	
	 
    public void clickSigninLink() {
		
    	SigninLink.click();
	}
    
   public void clickSecondSignin() {
		
	   SecondLoginButton.click();
	}
    
	public void setEmailID(String id) {
		
		mailId.sendKeys(id);
	}
	
public void setPassword(String id) {
		
	   password.sendKeys(id);
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	
	public void clickLoginbtn() {
		LoginButton.click();
	}
	
	public void clickRemebercheckbox() {
		RememberChkbox.click();
	}
	
	public void clickPincodeLink() {
		Pincodelink.click();
	}
	
	public void setPincode(String code) {
		Pincodetextbox.sendKeys(code);
	}
	
	public void clickPincodeApplyLink() {
		PinApplyButton.click();
	}
	
	public String getPinCode() {
	
		String text = PinCodeCheck.getText();
		return text;

		
		
	}

}
