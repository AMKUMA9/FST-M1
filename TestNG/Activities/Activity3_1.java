package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3_1 {
WebDriver driver= new FirefoxDriver();
   @BeforeTest
  public void beforetest() {
	  driver.get("https://www.training-support.net/selenium/login-form");
   }
	  @Test
	  public void login() {
		  WebElement username= driver.findElement(By.id("username"));
		  WebElement password= driver.findElement(By.id("password"));
		  username.sendKeys("admin");
		  password.sendKeys("password");
		  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  
	  String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals("Welcome Back, admin", loginMessage);
	  
  }

  @AfterClass
  public void afterClass() {
      //Close browser
      driver.close();
  }
  }


