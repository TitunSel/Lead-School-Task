package com.LSAssignment.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.LSAssignment.pageObjects.LoginPage;

import junit.framework.Assert;


public class TC001_ValidateLinks extends BaseClass{
	
	@Test
	public void validateLinks() {
		driver.get(baseURL);
		
		log.info("URL opened successfully!!");
		
		LoginPage lp= new LoginPage(driver);
		Actions action= new Actions(driver);
		action.moveToElement(lp.SigninHover).build().perform();
		log.info("Hover on SignIn Menu successful!!");
		
		if((lp.SigninLink).getAttribute("href")!= null) {
			log.info("SignIn Link is not broken!!");
			
			try {
				HttpURLConnection connection= (HttpURLConnection) new URL((lp.SigninLink).getAttribute("href")).openConnection();
				connection.connect();
				int code= connection.getResponseCode();
				connection.disconnect();
			    Assert.assertEquals(200, code);
			    log.info("Link is up and running!!");
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
				log.warn("Connection to the SignIn Link failed due to" + e + "Exception !!");
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
				log.warn("Connection to the SignIn Link failed due to" + e + "Exception !!");
				Assert.assertFalse(false);
			}
		}
		
		
	
	}

}
