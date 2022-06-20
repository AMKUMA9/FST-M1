import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
	
				WebDriver driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://training-support.net/selenium/selects");
		System.out.println("Title of the page- :"+driver.getTitle());
		WebElement dropdown1=driver.findElement(By.id("single-select"));
		Select dropdown=new Select(driver.findElement(By.id("single-select")));
		dropdown.selectByVisibleText("Option 2");
		System.out.println(dropdown1.getText());
		dropdown.selectByIndex(3);
		System.out.println(dropdown1.getText());
		dropdown.selectByValue("4");
		System.out.println(dropdown1.getText());
		List<WebElement> options = dropdown.getOptions();
        //Print them
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
 driver.close();
	}

}
