package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest1 {
  @Test
  public void getSensexValueFromGoogleSearch() {
	  
	  WebDriver driver;
      System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver");
      
      ChromeOptions options = new ChromeOptions();    
      options.addArguments("headless");  
      driver = new ChromeDriver(options);
	  
	  // Maximize browser window
      driver.manage().window().maximize();
      
      // Navigate to Google 
      driver.navigate().to("https://www.google.com");
      
      // Provide value 'sensex today' in search field
      
      
      // Click on 'Search' button
	  
	  
	  // Get the sensex value from Search results page 
      
	  
	  // Print the value on console
	  
  }
}
