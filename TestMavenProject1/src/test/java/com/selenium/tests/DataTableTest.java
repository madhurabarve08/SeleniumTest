package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTableTest {
	
	WebDriver driver;
	
	
  @Test
  public void dataTableTest1() throws Exception {

      System.out.println("******************** Currently executing DataTableTest ********************");
	      
      System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver");
      
      ChromeOptions options = new ChromeOptions();    
      // Comment the line below when you don't want to run the tests in headless mode
      options.addArguments("headless");
    
      // Initialize the chromedriver
      driver = new ChromeDriver(options);
      
      // Set Implicit wait
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Maximize the chromedriver window
      driver.manage().window().maximize();
      
      // Navigate to give URL 
      driver.navigate().to("http://the-internet.herokuapp.com/");
      
      // Click on the link 'Sortable Data Tables'
      driver.findElement(By.linkText("Data Tables")).click();
      Thread.sleep(2000);
      
      // Verify that the due amount for 'Frank' is '$51.00'
      Assert.assertEquals(getDueAmount("Frank"),"$51.00", "Incorrect due amount observed");
	  
  }
  
  public String getDueAmount(String firstName) {
	  String dueAmount = driver.findElement(By.xpath("(//td[contains(text(),'" + firstName + "')]//following::td[1])[1]")).getText();
	  return dueAmount;
  }
}
