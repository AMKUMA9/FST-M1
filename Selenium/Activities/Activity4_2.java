import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement FName =driver.findElement(By.xpath("//input[@id='firstName']"));
FName.sendKeys("Amit");
WebElement LName =driver.findElement(By.xpath("//input[@id='lastName']"));
LName.sendKeys("Kumar");
WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("Amit.Kumar146@ibm.com");
WebElement CNO =driver.findElement(By.xpath("//input[@id='number']"));
CNO.sendKeys("9934862759");
WebElement Mess=driver.findElement(By.xpath("//textarea"));
Mess.sendKeys("Done");
driver.findElement(By.xpath("//input[@type='submit']")).click();
System.out.println("Submitted");
Thread.sleep(5000); 
driver.close();
 
	}

}
