package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionBasicMethods {

	public static void main(String[] args) {

		String browserinfo = "Chrome";
		By username = By.id("Form_getForm_subdomain");
		By trialbtn = By.id("Form_getForm_action_submitForm");

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserinfo);
		df.launchUrl("https://www.orangehrm.com/en/30-day-free-trial/");

		ElementsUtility eu = new ElementsUtility(driver);
		eu.performSendKeysToElement(username, "Kanishk");
		eu.performClickToElement(trialbtn);

		/*
		 * WebElement un = eu.getWebElement(username); WebElement btn =
		 * eu.getWebElement(trialbtn); Actions actions = new Actions(driver);
		 * actions.sendKeys(un, "Kanishk").perform(); actions.click(btn).perform();
		 */

	}

}
