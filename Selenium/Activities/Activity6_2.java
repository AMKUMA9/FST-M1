import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://training-support.net/selenium/ajax");
System.out.println("Title of the page- :"+driver.getTitle());
driver.findElement(By.xpath("//button[contains(@class,'violet')]")).click();
WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(20));
Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
String textmess=driver.findElement(By.id("ajax-content")).getText();
System.out.println(textmess);
Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
String secondtextmess=driver.findElement(By.id("ajax-content")).getText();
System.out.println(secondtextmess);
driver.close();
	}

}
