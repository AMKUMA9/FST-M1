import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://training-support.net/selenium/tables");
System.out.println("Title of the page- :"+driver.getTitle());
List<WebElement> Nocols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));

List<WebElement> Norows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
	System.out.println(Nocols.size());
	System.out.println(Norows.size());
	 List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
     for(WebElement cellValue : thirdRow) {
         System.out.println("Cell Value: " + cellValue.getText());
  WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
  System.out.println("Second row, second column value: " + cellValue2_2.getText());
  driver.close();
	}
	}
}
