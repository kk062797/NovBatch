package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertConceptPractice {

	public static void main(String[] args) throws Exception {

		String browserInfo = "chrome";

		By alert = By.xpath("//button[text() = 'Click for JS Alert']");
		By confirm = By.xpath("//button[text() = 'Click for JS Confirm']");
		By prompt = By.xpath("//button[text() = 'Click for JS Prompt']");

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserInfo);
		df.launchUrl("https://the-internet.herokuapp.com/javascript_alerts");

		ElementsUtility eu = new ElementsUtility(driver);
		eu.performClickToElement(alert);
		Thread.sleep(3000);
		String alertmessage = eu.getAlertText();
		System.out.println(alertmessage);
		eu.handleAlert("accept", null);
		eu.performClickToElement(confirm);
		Thread.sleep(3000);
		String alertmessage1 = eu.getAlertText();
		System.out.println(alertmessage1);
		eu.handleAlert("dismiss", null);
		eu.performClickToElement(prompt);
		Thread.sleep(3000);
		String alertmessage2 = eu.getAlertText();
		System.out.println(alertmessage2);
		eu.handleAlert("sendKeys", "Hi!!!!");
		eu.handleAlert("accept", null);

	}

}
