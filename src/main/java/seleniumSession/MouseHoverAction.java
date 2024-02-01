package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {

		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://www.amazon.in/");
		 * 
		 * By accountList = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"); By
		 * exploreShowroom = By.xpath("//*[text()='Explore Showroom']");
		 * 
		 * WebElement e1 = driver.findElement(accountList); WebElement e2 =
		 * driver.findElement(exploreShowroom);
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.moveToElement(e1).perform(); actions.click(e2).perform();
		 */

		String browserinfo = "Chrome";

		By accountList = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
		By exploreShowroom = By.xpath("//*[text()='Explore Showroom']");

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver(browserinfo);
		df.launchUrl("https://www.amazon.in/");

		ElementsUtility et = new ElementsUtility(driver);
		et.mouseHover(accountList);
		et.mouseClick(exploreShowroom);

		df.quitBrowser();

	}

}
