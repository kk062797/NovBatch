package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownSelection {

	public static void main(String[] args) {

		String browserinfo = "Chrome";
		By select = By.id("justAnInputBox");
		By ddoptions = By.xpath("//span[@class='comboTreeItemTitle']");

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserinfo);
		df.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		ElementsUtility et = new ElementsUtility(driver);
		et.performClickToElement(select);
		// Single Select
		// et.selectOptionFromDD(ddoptions, "choice 6 2 1");
		// Multiple Select
		et.selectOptionFromDD(ddoptions, "choice 6 2", "choice 3");
		// ALL
		et.selectOptionFromDD(ddoptions, "ALL");

	}

}
