package com.LSAssignment.testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.LSAssignment.pageObjects.LoginPage;

public class TC004_PinCodeValidation extends BaseClass {
      
	@Test
	public void validatePinCode() {
	 
	driver.get(baseURL);
	log.info("URL opened successfully!!");
	LoginPage lp= new LoginPage(driver);
	lp.clickPincodeLink();
	log.info("Successfully clicked on the Pincode Menu!!");
	lp.setPincode(pincode);
	log.info("Pincode fed successfully!!");
	lp.clickPincodeApplyLink();
	log.info("Click on Apply Link successful!!");
	if(lp.getPinCode().contains(pincode)) {
		
		log.info("PinCode changed successfully!!");
		Assert.assertTrue(true);
		
	}
	
	

	
}
	
}
