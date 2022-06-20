package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity3 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
        
	@Test(priority=3)
    public void Login() {
        // Check the title of the page
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
	}
//	@Test(priority=4)
        public void Homepage() {
            // Check the title of the page
            String Homepage = driver.findElement(By.xpath("//div[class='head']/h1")).getAttribute("h1");
                
            //Print the title of the page
            System.out.println("HomePage text is: " + Homepage);
            //Assertion for page title
            Assert.assertEquals("Welcome Test", Homepage);
        }
	@Test(priority=4)
    public void Activity4() {
        // get the PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
            
        //click on Add
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        //Assertion for page title
        driver.findElement(By.id("firstName")).sendKeys("Amit05");
        driver.findElement(By.id("lastName")).sendKeys("Kumar05");
        driver.findElement(By.id("btnSave")).sendKeys("click");
     // Again click the PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //search employee
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Amit05 Kumar05");
        //Click on search
        driver.findElement(By.id("searchBtn")).sendKeys("click");
        String Verify= driver.findElement(By.xpath("/tbody/tr/td[3]/a")).getText();
        System.out.println("Verify");
	}
	
	//@AfterMethod
            public void browserclose() {
            	driver.close();
        
       
            
        
       
    }

}
