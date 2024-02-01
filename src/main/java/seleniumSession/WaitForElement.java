package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://app.hubspot.com/login");
		By user = By.cssSelector("#username");
		By un = By.xpath("//input[@name='username']");
		By pass = By.xpath("//input[@name='password']");
		By btn = By.xpath("//button[@type = 'submit']");

		ElementsUtility eu = new ElementsUtility(driver);
		eu.waitForElementIsVisible(user, 5).sendKeys("Admin");
		//eu.waitForElementPresenceOnDOM(un, 5).sendKeys("Admin");
		//eu.waitForElementIsVisible(pass, 5).sendKeys("admin123");
		//eu.waitToClickWebElement(btn, 5);
	}

}
