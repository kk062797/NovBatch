package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDPractice1 {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		By locator = By.id("justAnInputBox1");
		By locator1 = By.id("justAnotherInputBox");
		By ddlist = By.xpath("//span[@class = 'comboTreeItemTitle']");

		driver.findElement(locator).click();
		// selectDD(ddlist, "choice 4");
		// selectDD(ddlist, "choice 6", "choice 3", "choice 2");
		selectDD(ddlist, "All");
		// selectDD(ddlist, "choice 2 1");

	}

	public static void selectDD(By locator, String... value) {
		List<WebElement> list = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("All")) {
			// System.out.println(list.size());
			for (WebElement e : list) {
				String text = e.getText();
				// System.out.println(text);
				for (String val : value) {
					if (text.equals(val)) {
						e.click();
						break;
					}
				}
			}
		} else {

			try {
				for (WebElement e : list) {
					String text = e.getText();
					if (!text.isEmpty()) {
						e.click();
					}
				}
			} catch (Exception e) {
			}
		}
	}
}
