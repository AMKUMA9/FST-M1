package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
	 @Test(priority=1)
	    public void headercheck() {
	        // Check the title of the page
	        WebElement header = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	            
	        //Print the title of the page
	        System.out.println("url of the header is: " + header.getAttribute("src"));
	       
	    }

}
