package TestNGTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver =new FirefoxDriver();
     @BeforeTest
	public void driverInstance(){
		
		driver.get("https://www.training-support.net");
     }
		@Test
		public void firstTest() {
		String Title= driver.getTitle();
		System.out.println("Title of the page :"+Title);
		Assert.assertEquals("Training Support", Title);
		}
		
		 @Test public void secondTest() { 
		  driver.findElement(By.id("about-link")).click();
		  String TitleNew=driver.getTitle();
		  Assert.assertEquals("About Training Support", TitleNew);
		  System.out.println("Title of New Page:"+TitleNew);
		  }
		 @AfterMethod
		 public void close() {
			 driver.close();
		 }
		 
	
}
