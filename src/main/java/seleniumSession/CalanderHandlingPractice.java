package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandlingPractice {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[3]")).click();
		//driver.findElement(By.xpath("//td[contains(@data-date,'012024')]/div[text()='24']")).click();
		datePicker("022024", "26");
	}
	public static void datePicker(String month,String date) {
		WebElement element = driver.findElement(By.xpath("//td[contains(@data-date,'"+month+"')]/div[text()='"+date+"']"));
		element.click();
	}
}
