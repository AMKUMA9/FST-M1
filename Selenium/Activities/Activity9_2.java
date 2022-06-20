import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training-support.net/selenium/selects");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement MSelcet= driver.findElement(By.id("multi-select"));
Select dropdown= new Select(driver.findElement(By.id("multi-select")));

if (dropdown.isMultiple()) {
	//Select 'JavaScript' option by visible text.
	dropdown.selectByVisibleText("Javascript");
	System.out.println(MSelcet.getText());
	dropdown.selectByValue("node");
	for(int i=4;i<=6;i++) {
		dropdown.deselectByIndex(i);
	}
	System.out.println(MSelcet.getText());
	dropdown.deselectByValue("node");
	dropdown.deselectByIndex(7);
	System.out.println(MSelcet.getText());

	//get all selected option
	List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
	//print all options
	for(WebElement selectedOption : selectedOptions) {
        System.out.println("Selected option: " + selectedOption.getText());
       }
	//Deselect all options
    dropdown.deselectAll();
    System.out.println(MSelcet.getText());
    driver.close();
}


	}

}
