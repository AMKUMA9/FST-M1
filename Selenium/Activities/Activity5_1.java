import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("  https://training-support.net/selenium/dynamic-controls");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement Isdisplayed=driver.findElement(By.cssSelector(".willDisappear"));
Isdisplayed.isDisplayed();
System.out.println("Visible page result" + Isdisplayed);
driver.findElement(By.id("toggleCheckbox")).click();
System.out.println("Clicked");
System.out.println("Visible page result" + Isdisplayed);
	driver.close();
	}

}
