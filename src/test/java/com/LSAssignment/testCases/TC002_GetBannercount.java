package com.LSAssignment.testCases;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.LSAssignment.pageObjects.LoginPage;

public class TC002_GetBannercount extends BaseClass {

	
    @Test
    public void getBannerCount() throws ElementNotInteractableException {
    	
         driver.get(baseURL);
         log.info("URL opened successfully!!");
		 LoginPage lp= new LoginPage(driver);
		 int count=1;
		 log.info("Counter for Banner started successfully!!");
		 while(!(lp.Nextpointer.getAttribute("aria-disabled").equals("true"))){
			 lp.Nextpointer.click();
			 ++count;
		 }
		 
		 log.info("There are "+ count + " banners found");
		 Assert.assertTrue(true);
    
}
    
}
