package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleTest {
  @Test
  public void pageTitleTest1() {

      System.out.println("******************** Currently executing PageTitleTest ********************");
	  
	    WebDriver driver;
      System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver");
      
      ChromeOptions options = new ChromeOptions();    
      // Comment the line below when you don't want to run the tests in headless mode
      options.addArguments("headless");
    
      // Initialize the chromedriver
      driver = new ChromeDriver(options);

      // Maximize the chromedriver window
      driver.manage().window().maximize();
      
      // Navigate to Google 
      driver.navigate().to("https://www.selenium.dev/");
      
      // Verify the page title
      Assert.assertEquals(driver.getTitle(),"selenium", "Title of the page is NOT correct");
	  
  }
}
