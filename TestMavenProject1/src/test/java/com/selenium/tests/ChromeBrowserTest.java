package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeBrowserTest {
	
  @Test
  public void chromeBrowserTest() throws Exception {

      System.out.println("******************** Currently executing ChromeBrowserTest ********************");
      
      WebDriver driver;
      
      ChromeOptions options = new ChromeOptions();    
      // Comment the line below when you don't want to run the tests in headless mode
      options.addArguments("headless");
    
      // Initialize the chromedriver
      driver = new ChromeDriver(options);
      
      // Set the chromedriver path property
      System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver");

      // Maximize the chromedriver window
      driver.manage().window().maximize();
      
      // Navigate to give URL 
      driver.navigate().to("https://google.com/");
	  
  }

}
