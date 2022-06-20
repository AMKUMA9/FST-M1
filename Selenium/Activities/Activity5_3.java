import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("  https://training-support.net/selenium/dynamic-controls");
System.out.println("Title of the page- :"+driver.getTitle());

  WebElement IsEnabled=driver.findElement(By.cssSelector("#dynamicText"));
  IsEnabled.isEnabled(); IsEnabled.click();
  System.out.println("Enabled text result" + IsEnabled);
  driver.findElement(By.id("toggleCheckbox")).click();
  System.out.println("Clicked"); System.out.println("Enabled text result" +IsEnabled); 
  driver.close();
 
	}

}
