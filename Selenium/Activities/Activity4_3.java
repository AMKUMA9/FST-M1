import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
System.out.println("Title of the page- :"+driver.getTitle());
WebElement thirdheader =driver.findElement(By.xpath("//h3[@id='third-header']"));
WebElement fifthheader =driver.findElement(By.xpath("//h5[@class='ui green header']"));
fifthheader.getCssValue("color");
System.out.println("Fifth header css color property:"+ fifthheader);
String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
System.out.println("Violet classes"+ violetButtonClasses);
String greyButton =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
System.out.println("The grey button text " + greyButton);
Thread.sleep(3000);
driver.close();
	}

}
