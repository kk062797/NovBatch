package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private WebDriver driver;

	public WebDriver initDriver(String browser) {
		System.out.println("Browser Name: " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println(
					"Please pass the correct browser information. The provided browser name is incorrecr: " + browser);
		}

		return driver;
	}

	// To launch Url
	public void launchUrl(String url) {
		driver.get(url);
	}

	// To get page title
	public String pageTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		return title;
	}

	// To get page Url
	public String currentPageURL() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current Url: " + currenturl);
		return currenturl;
	}

	// To close browser
	public void closeBrowser() {
		driver.close();
	}

	// To quit browser
	public void quitBrowser() {
		driver.quit();
	}
}
