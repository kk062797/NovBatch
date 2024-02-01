package seleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowHandleConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#newTabsWindowsBtn")).click();

		/*
		 * String currentwindow = driver.getWindowHandle();
		 * 
		 * for (String e : driver.getWindowHandles()) { if (e != currentwindow) {
		 * driver.switchTo().window(e); }
		 * 
		 * }
		 */

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);

		/*
		 * for (String e : listHandles) { driver.switchTo().window(e);
		 * System.out.println(driver.getTitle()); }
		 */

		
		  String targetedWindow = listHandles.get(2);
		  driver.switchTo().window(targetedWindow);
		  System.out.println(driver.getTitle());
		 

		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); for (String e :
		 * windowHandles) { String pageTitle = driver.switchTo().window(e).getTitle();
		 * if (pageTitle.contains("Path")) { break; } }
		 */

		// ElementsUtility et = new ElementsUtility(driver);
		// et.switchtoWindow("XPath");
		// et.switchtoWindow(2);

		// System.out.println(driver.getTitle());

		/*
		 * WebElement e1 =
		 * driver.findElement(By.cssSelector(".post-title.entry-title"));
		 * 
		 * WebElement e2 = driver.findElement(By.cssSelector("#newTabBtn"));
		 */

	}

}
