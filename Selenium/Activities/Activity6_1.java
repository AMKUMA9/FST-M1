import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("  https://training-support.net/selenium/dynamic-controls");
System.out.println("Title of the page- :"+driver.getTitle());

  WebElement checkbox= driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
  WebElement Removecheckboxbutton=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
  Removecheckboxbutton.click();
  WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(50));
  Wait.until(ExpectedConditions.visibilityOf(checkbox));
  Removecheckboxbutton.click();
  Wait.until(ExpectedConditions.visibilityOf(checkbox));
  checkbox.click();
  driver.close();
  
  //System.out.println("Clicked");
	}

}
