import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {
	public static void main(String[] args) {

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://training-support.net/selenium/tables");
System.out.println("Title of the page- :"+driver.getTitle());
List<WebElement> Nocols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));

List<WebElement> Norows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
System.out.println(Nocols.size());
System.out.println(Norows.size());
WebElement cellValue2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
System.out.println("Second row, second column value: " + cellValue2_2.getText());
WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")); 
System.out.println("Second row,Second column value" +cellValue);
driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
WebElement cellValueAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")); 
System.out.println("Second row,Second column value after sorting" +cellValueAfter.getText());
WebElement Footer= driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
System.out.println("Footer values:"+ Footer.getText());
	}
}