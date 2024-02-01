package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://app.hubspot.com/login");
		ElementsUtility eu = new ElementsUtility(driver);
		System.out.println(eu.waitForTitle("Login", 5));

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * 
		 * wait.until(ExpectedConditions.titleContains("HRM"));
		 * System.out.println(driver.getTitle());
		 * 
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//input[@name='username']")));
		 * 
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"
		 * ); driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
	}

}
