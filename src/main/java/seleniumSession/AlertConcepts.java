package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcepts {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		By SignBtn = By.xpath("//input[@type = 'submit']");
		By username = By.id("login1");
		driver.findElement(SignBtn).click();
		// driver.findElement(username).sendKeys("Kakku");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		driver.findElement(username).sendKeys("Kakku");
	}

}
