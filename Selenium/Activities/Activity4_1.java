import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement button =driver.findElement(By.xpath("//a[@class='ui inverted huge green button']"));
button.click();
Thread.sleep(3000);
System.out.println("Title of the next page:"+ driver.getTitle());
Thread.sleep(3000);
driver.close();

	}

}
