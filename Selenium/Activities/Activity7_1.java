import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training-support.net/selenium/dynamic-attributes");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement Username=driver.findElement(By.xpath("//input[contains(@class,'username')]"));
Username.sendKeys("admin");
WebElement password=driver.findElement(By.xpath("//input[contains(@class,'password')]"));
password.sendKeys("password");
driver.findElement(By.xpath("//button[@type='submit']")).click();
String loginmessage=driver.findElement(By.id("action-confirmation")).getText();
System.out.println(loginmessage);
driver.close();
	}

}
