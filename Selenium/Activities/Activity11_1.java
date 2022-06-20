import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_1 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page is:"+ driver.getTitle());
		driver.findElement(By.id("simple")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text"+ alert.getText());
		alert.dismiss();
		driver.close();
		
		
	}

}
