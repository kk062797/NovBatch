package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		// Browser Info
		String browserInfo = "Chrome";

		// By locators
		By username = By.name("username");
		By password = By.name("password");
		By btn = By.className("orangehrm-login-button");

		// Driver Initialization
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserInfo);
		df.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		df.currentPageURL();

		// PageTitle Validation
		String title = df.pageTitle();
		if (title.contains("OrangeHRM")) {
			System.out.println("Validation of Page Title is Passed............");
		}
		// WebElement Interactions
		Thread.sleep(3000);
		ElementsUtility et = new ElementsUtility(driver);
		et.performSendKeys(username, "Admin");
		et.performSendKeys(password, "admin123");
		et.performClick(btn);
		Thread.sleep(5000);

		// Quit Browser
		df.quitBrowser();

	}

}
