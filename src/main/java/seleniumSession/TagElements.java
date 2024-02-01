package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.get("https://www.amazon.in/");

// Using Id
		// driver.findElement(By.id("Form_getForm_Name")).sendKeys("Kakku");

// Using name
		// driver.findElement(By.name("Name")).sendKeys("Kakku");

// Using Class name
		// driver.findElement(By.className("text")).sendKeys("Kakku");

// Using xPATH
		// driver.findElement(By.xpath("//*[@id=\"Form_getForm_Name\"]")).sendKeys("Kakku");

// Using CSS selectors
		// driver.findElement(By.cssSelector("#Form_getForm_Name")).sendKeys("Kakku");

// Using Link
		// driver.findElement(By.linkText("Careers")).click();

// Using partial link
		// driver.findElement(By.partialLinkText("eers")).click();

//	TagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		
		  for (WebElement e : links) {
		  
		  System.out.println(e.getAttribute("href")); }
		 
		for (int i = 0; i < links.size(); i++) {

			String linklist = links.get(i).getText();

			if (!links.isEmpty()) {
				System.out.println(i + "--> " + linklist);
				String href = links.get(i).getAttribute("href");
				System.out.println(href);
				System.out.println();
			} 

		}
	}

}
