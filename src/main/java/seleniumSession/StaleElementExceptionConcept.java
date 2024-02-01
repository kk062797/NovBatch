package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.cssSelector("#username"));
		element.sendKeys("Kakku");

		driver.navigate().refresh();
		element = driver.findElement(By.cssSelector("#username"));
		element.sendKeys("Kanishk");

	}

}
