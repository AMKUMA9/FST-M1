package TestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2_1 {
	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void urlTest() {
		driver.get(" https://www.training-support.net/selenium/target-practice");
	}
    @Test
    public void firstTest() {
    	String Title = driver.getTitle();
    	System.out.println("Title of the page"+ Title);
    	Assert.assertEquals(Title, "Target Practice");
    }
    @Test
    public void secondTest() {
    	WebElement blackButton =driver.findElement(By.cssSelector("button.black"));
    	Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
    @Test(enabled = false)
    public void testCase3() {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");  
    }
      @AfterTest
      public void aftertest() {
    	  driver.close();
      }
      
    }

