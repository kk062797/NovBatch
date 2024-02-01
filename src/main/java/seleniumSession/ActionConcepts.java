package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*	
 * If there are multiple that you are performing in a single line of command, then you have to use build().perform();
 * 
 * If you are performing single action in single line, then you should use perform() only.	
 */

public class ActionConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(src).moveToElement(target).release().build().perform();

		driver.switchTo().defaultContent();

		WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		System.out.println(text.getText());

		driver.close();

	}

}
