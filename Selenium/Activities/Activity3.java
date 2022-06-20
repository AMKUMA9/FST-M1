import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement FName =driver.findElement(By.id("firstName"));
FName.sendKeys("Amit");
WebElement LName =driver.findElement(By.id("lastName"));
LName.sendKeys("Kumar");
WebElement email =driver.findElement(By.id("email"));
email.sendKeys("Amit.Kumar146@ibm.com");
WebElement CNO =driver.findElement(By.id("number"));
CNO.sendKeys("9934862759");
driver.findElement(By.cssSelector(".ui.green.button")).click();
System.out.println("Submitted");
Thread.sleep(5000); 
driver.close();
 
	}

}
