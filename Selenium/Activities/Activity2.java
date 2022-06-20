import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement idbutton =driver.findElement(By.id("about-link"));
System.out.println("Text on the button:"+idbutton.getText());
WebElement Classbutton =driver.findElement(By.className("green"));
System.out.println("Text on the button:"+Classbutton.getText());
WebElement linkbutton =driver.findElement(By.linkText("About Us"));
System.out.println("Text on the button:"+linkbutton.getText());
WebElement Cssbutton =driver.findElement(By.cssSelector(".green"));
System.out.println("Text on the button:"+Cssbutton.getText());
Thread.sleep(5000);
		driver.close();
	}

}
