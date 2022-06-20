import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training-support.net/selenium/dynamic-attributes");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement Username=driver.findElement(By.cssSelector("input[class$='-username']"));
Username.sendKeys("AMKUMA9");
WebElement password=driver.findElement(By.cssSelector("input[class$='-password']"));
password.sendKeys("Work4i@s");
WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));

confirmPassword.sendKeys("Work4i@s");
WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
email.sendKeys("Amit.Kumar146@ibm.com");

//driver.findElement(By.xpath("//button[contains(text(),'Sign Up']")).click();
driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
String signupmessage=driver.findElement(By.id("action-confirmation")).getText();
System.out.println(signupmessage);
driver.close();

	}

}
