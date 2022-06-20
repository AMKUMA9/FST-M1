import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open browser
        driver.get("https://www.training-support.net/selenium/nested-iframes");

        //Print title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());
        //switch to first frame
        driver.switchTo().frame(0);
        //switch to first frame inside first frame
        driver.switchTo().frame(0);
        WebElement headerofFrame= driver.findElement(By.cssSelector("div.content"));
        WebElement button1= driver.findElement(By.id("actionButton"));
        System.out.println("Header of First Frame inside Frame is:"+ headerofFrame.getText());
        System.out.println(button1.getCssValue("background-color"));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
       // Switch to 2nd frame
        driver.switchTo().frame(1);

        WebElement headerofFrame2= driver.findElement(By.cssSelector("div.content"));
        WebElement button2= driver.findElement(By.id("actionButton"));
        System.out.println("Header of First Frame inside Frame is:"+ headerofFrame2.getText());
        System.out.println(button2.getCssValue("background-color"));
        driver.close();
        
        

	}

}
