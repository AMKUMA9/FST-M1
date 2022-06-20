import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page is:"+ driver.getTitle());
	WebElement Cube= driver.findElement(By.id("wrapD3Cube"));	
	
	//Left Click
	Actions actions=new Actions(driver);
	actions.click();
	WebElement CubeVal=driver.findElement(By.cssSelector(".active"));
	System.out.println("value of the side:"+ CubeVal.getText());
	
	//DoubleClick
	actions.doubleClick(Cube).perform();
	CubeVal=driver.findElement(By.cssSelector(".active"));
	System.out.println("value after doubleclick:"+ CubeVal.getText());
	//Right Click
	actions.contextClick(Cube).perform();
	CubeVal = driver.findElement(By.className("active"));
    System.out.println("Right Click: " + CubeVal.getText());
    
    driver.close();
	

	}

}