package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
WebDriver driver;
    
    @BeforeMethod
    public void Login() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
   
            // Login
            driver.findElement(By.id("txtUsername")).sendKeys("orange");
            driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
            driver.findElement(By.id("btnLogin")).click();
        }
    @Test
    public void Activity4() {
        // get the PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
            
        //click on Add
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        //Assertion for page title
        driver.findElement(By.id("firstName")).sendKeys("Amit05");
        driver.findElement(By.id("lastName")).sendKeys("Kumar05");
        WebElement empid=driver.findElement(By.id("employeeId"));
       String id= empid.getText();
        driver.findElement(By.id("btnSave")).sendKeys("click");
     // Again click the PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Employee List")).click();
        
        //search employee
        driver.findElement(By.id("empsearch_id")).sendKeys(id);
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


