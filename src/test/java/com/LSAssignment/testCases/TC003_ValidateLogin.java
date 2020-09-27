package com.LSAssignment.testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.LSAssignment.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC003_ValidateLogin extends BaseClass  {
	
	@Test
	public void validateLogin() throws InterruptedException {
		try {
		driver.get(baseURL);
		log.info("URL opened successfully!!");
		LoginPage lp= new LoginPage(driver);
		Actions action= new Actions(driver);
		action.moveToElement(lp.SigninHover).build().perform();
		log.info("Hover on the Sign-In Menu successful!!");
		lp.clickSigninLink();
		log.info("SignIn Link clicked successfully!!");
		lp.setEmailID(mailid);
		log.info("Email-Id fed successfully!!");
		lp.clickContinue();
		log.info("Clicked on continue button successfully!!");
		lp.setPassword(password);
		log.info("Password fed successfully!!");
		lp.clickRemebercheckbox();
		log.info("Remember Checkbox checked successfully!!");
		lp.clickLoginbtn();
		log.info("Login button clicked successfully!!");
		//Since it requires a 2-step verification, hence a long wait is put involving manual intervention
		Thread.sleep(60000);
		
		String title= driver.getTitle();
	    Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	    log.info("Login to Amazon successful!!");
		
		
	}catch(Throwable e) {
		Assert.assertFalse(false);
    	e.printStackTrace();
    	log.warn("Test case failed due to" + e + "Exception !!");
    	
    }

}

}
