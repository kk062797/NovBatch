package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		
		/*
		 * xPath: It is the address of the webElement situated on a WebPage 
		 * Two types of xPath 
		 * 1. Absolute xPath -> Begins from the root of the HTML document and
		 * specifies the complete path to the element. 
		 * 
		 * 2. Relative xPath -> Starts from a specific element and navigates through the 
		 * DOM hierarchy to locate the desired element. 
		 * 
		 * syntax : //tagName[@attributeName = 'attributeValue'] - 1 of 1, 1 of n
		 * tagName = input, a, font, div, span, select etc
		 * attributeName = id, name, class
		 * 
		 * example for 1 of 1: //input[@name = 'username'] 
		 * example 1 of n: //input[@id] 1 of n
		 * 
		 * //input[@name = 'subdomain'], //input[@type = 'text']
		 * 
		 * Multiple attribute strategy to Identify a WebElement using 'and' operator
		 * 
		 * 	//input[@type = 'text' and @name = 'subdomain']
		 *  //input[@type = 'text' and @name = 'subdomain' and @id = 'Form_getForm_subdomain']
		 *
		 *using 'text()'
		 *
		 * //tagName[text() = 'textValue']
		 * //a[text() = 'Close'] --> Hard Validation
		 * //*[text() = 'Close' and @href = 'javascript:void(0);']
		 * 
		 * By indexing -> getting unique xoath from the collection of webElements
		 *  (//input[@class='text'])[1]
		 *  using 'position()'
		 *  (//input[@class='text'])[position() =3]
		 *  
		 *  using contain()
		 *  syntax: //tagName[contains(text() or attributeName, textValue)] --> Soft Validation
		 *  ex : //p[contains(text(), 'financial commitment')] 
		 *  
		 *  Dynamic Attribute value
		 *  It is not necessary that your ID attribute will always be unique
		 *  example:
		 *  <id = xyz_123>
		 *  <id = xyz_345>
		 *  
		 *  //main[contains(@id, '-pageContent')]
		 *
		 */
		
		// By.className("form-control private-form__control login-email"); // Multiple classes cannot reside in By.className
		// SBy.xpath("//input[@class = 'form-control private-form__control login-email']");
		
		By locator = By.xpath("//p[contains(text(), 'financial commitment')]");
		WebElement element = driver.findElement(locator);
		String text = element.getText();
		System.out.println(text);
		
		/*
		 * using starts-with()
		 * //input[starts-with(@name, 'user')]
		 * 
		 */
	}

}
