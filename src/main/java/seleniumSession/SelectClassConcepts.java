package seleniumSession;

import org.openqa.selenium.By;
//	Select class methods in selenium will only work with select tag web elements
//	Select class declaration will require web element as argument or parameter
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectClassConcepts {

	public static void main(String[] args) {

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.orangehrm.com/en/30-day-free-trial/"); WebElement
		 * country = driver.findElement(By.id("Form_getForm_Country"));
		 * 
		 * Select select = new Select(country); // select.selectByIndex(11); //
		 * select.selectByValue("Canada"); select.selectByVisibleText("Armenia ");
		 */
		By country = By.id("Form_getForm_Country");
		String browserinfo = "Chrome";
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserinfo);
		df.launchUrl("https://www.orangehrm.com/en/30-day-free-trial/");

		ElementsUtility et = new ElementsUtility(driver);
		/*
		 * et.selectDropDownByIndex(country, 5);
		 * et.selectDropDownByText(country,"Canada "); et.selectDropDownByValue(country,
		 * "Bolivia");
		 */
		et.selectDropDown(country, "Bolivia", "visibleText");

		// df.quitBrowser();
	}

}
