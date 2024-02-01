package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick = driver.findElement(By.xpath("(//*[text() = 'right click me'])[1]"));

		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).perform();

		/*
		 * List<WebElement> listitems = driver.findElements(By.
		 * xpath("//ul//li[contains(@class, 'context-menu-icon')]"));
		 * 
		 * for (WebElement e : listitems) { String items = e.getText();
		 * System.out.println(items);
		 * 
		 * if (items.equals("Paste")) { e.click(); break; } }
		 */
		By rightClickItems = By.xpath("//ul//li[contains(@class, 'context-menu-icon')]");
		// System.out.println(getrightClick(rightClickItems));
		ElementsUtility et = new ElementsUtility(driver);
		et.clickMenuItem(rightClickItems, "Quit");

	}

}
