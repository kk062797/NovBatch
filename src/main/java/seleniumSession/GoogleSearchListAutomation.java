package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchListAutomation {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		By search = By.cssSelector("#APjFqb");
		By searchList = By.xpath("//ul[@class= 'G43f7e']/li//div[@class = 'wM6W7d']/span");

		driver.findElement(search).sendKeys("Narendra Modi");
		Thread.sleep(3000);

		List<WebElement> suggestionlist = driver.findElements(searchList);
		// suggestionlist.get(3).click();
		/*
		 * for (WebElement e : suggestionlist) { String suggestionText = e.getText();
		 * System.out.println(suggestionText); if
		 * (suggestionText.equalsIgnoreCase("Narendra Modi Stadium")) { e.click();
		 * break; }
		 * 
		 * }
		 */
		for (int i = 0; i < suggestionlist.size(); i++) {
			String suggestionText = suggestionlist.get(i).getText();
			System.out.println(suggestionText);
			if(suggestionText.equalsIgnoreCase("Narendra Modi Stadium")) {
				suggestionlist.get(i).click();
				break;
			}
		}

	}

}
