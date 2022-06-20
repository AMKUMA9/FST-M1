import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_10_3 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://training-support.net/selenium/drag-drop");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		System.out.println("Title of the page is:"+ driver.getTitle());
	WebElement ball= driver.findElement(By.id("draggable"));	
	
	//Drag
	Actions drop=new Actions(driver);

	WebElement drozone1=driver.findElement(By.id("droppable"));
	WebElement drozone2=driver.findElement(By.id("dropzone2"));
	drop.dragAndDrop(ball, drozone1).build().perform();
	wait.until(ExpectedConditions.attributeToBeNotEmpty(drozone1, "background-color"));
    System.out.println("ENTERED DROPZONE 1");
    //REpeat
   drop.dragAndDrop(ball, drozone2).build().perform();
    wait.until(ExpectedConditions.attributeToBeNotEmpty(drozone2, "background-color"));
    System.out.println("ENTERED DROPZONE 2");
    driver.close();
	}

}
