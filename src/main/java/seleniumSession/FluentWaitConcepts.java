package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitConcepts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();

		By name = By.cssSelector("#Form_getForm_Name");
		By email = By.cssSelector("#Form_getForm_Email");

		// total time the code is going to wait for we to appear on DOM
		// Default pooling time can be adjusted using pollingEvery() in fluent wait
		// ignoring is mainly for to handle the exception
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(2))
		 * .ignoring(NoSuchElementException.class)
		 * .ignoring(StaleElementReferenceException.class);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(name)).sendKeys(
		 * "Kakku");
		 */
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.waitWithFluentWait(email, 10, 2).sendKeys("Kakku");
	}

}
