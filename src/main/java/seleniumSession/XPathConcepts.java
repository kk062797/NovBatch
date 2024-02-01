package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathConcepts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/ranji-trophy-2023-24-1383414/bihar-vs-mumbai-elite-group-b-1383709/full-scorecard");

		/*
		 * parent to child:
		 *'/' if your child node is just the immediate of the parent node then single '/' is used
		 * (//div[@class ='input-group']/input)[position() = 1]
		 *  (//form[@id = 'hs-login']//div)[position() = 1]
		 *  using child::tagName
		 *  //form[@id = 'hs-login']//child::div
		 *  
		 *  child to parent: Back Traversing
		 *  1st way
		 *  //div[@class = 'signup-link']/../..
		 *  2nd way
		 *  //div[@class ='input-group']//parent::form//parent::div
		 *  
		 *  //input[@name='username']//ancestor::form -> Backtracking from child to grandparent
		 *  
		 *  
		 *  //preceding-sibling::td
		 *  ex -> //td[text()= 'Selenium']//preceding-sibling::td/input[@type = 'checkbox']
		 *  //following-sibling::td
		 *  ex -> //td[text()= 'Selenium']//following-sibling::td
		 *  Give xpath of the checkbox corresponding Selenium(companyName)and I should be able to 
		 *  identify their checkboxes using their company name
		 *  
		 *  //td[text()= 'Selenium']//preceding-sibling::td/input[@type = 'checkbox']
		 * 
		 *  ((//span[text() = 'Akash Raj'])[2]/../../../..//following-sibling::td)[position() = 1]
		 * 
		 */
		String playerName = "Sachin Kumar";
		By locator = By.xpath("((//span[text() = '"+playerName+"'])[2]/../../../..//following-sibling::td)[position() = 1]");
		WebElement e = driver.findElement(locator);
		String s = e.getText();
		System.out.println(s);
	}

}
