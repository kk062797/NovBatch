package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		ElementsUtility eu = new ElementsUtility(driver);
		By locator = By.xpath("//a[text()= 'Home']");
		By element = By.xpath("//frame[@name = 'navbar']");
		// WebElement frame = driver.findElement(element);

		// driver.switchTo().frame(2); // by frame Index
		// driver.switchTo().frame("navbar");// by frame name or id
		// driver.switchTo().frame(frame);// WebElement
		//eu.switchToFrame(element);
		eu.switchToFrame("nameOrId","navbar");
		String text = driver.findElement(locator).getText();
		System.out.println(text);
	}

}
