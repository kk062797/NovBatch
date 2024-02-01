package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSConcepts{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By locator = By.cssSelector("input[id$='me'],#password,button[data-test-id = 'sso-login-button']");
		List<WebElement> element = driver.findElements(locator);
		if(element.size()==3) {
			System.out.println("Success...");
		}
		
		
		/*
		 * We use CSS selectors to identify the Web elements
		 * id -> #id
		 * example -> #username
		 * class -> .className
		 * example -> .form-control.private-form__control.login-email
		 * 
		 * using tagName 
		 * 			-> tag#id -> input#username
		 * 			-> tag.class -> input.form-control.private-form__control.login-email
		 * 
		 * We can also use both id and class name either using tagName in css selectors  and order doesn't matter
		 *  Using TagName
		 *  input#username.form-control.private-form__control.login-email
		 *  input.form-control.private-form__control.login-email#username
		 *  
		 *  Without using TagName
		 *  .form-control.private-form__control.login-email#username
		 *  #username.form-control.private-form__control.login-email
		 *  
		 *  In CSS selector '//' & '@' is not required
		 *   Any attribute except class & id
		 *   syntax -> tagName[attributeName = 'attributeValue']
		 *   
		 *  //input[@type = 'submit'] -> xPath
		 *  input[type='submit'] -> CSS Selector
		 *  
		 *  //input[@type='submit' and @value = 'Login'] ->xPath
		 *  input[type='submit'][value = 'Login'] -> CSS Selector
		 *  
		 *  Space b/w both the attributes are not allowed
		 *  
		 *  Traversing the DOM
		 *  
		 *  parent to child:
		 *  
		 *  //div[@class = 'input-group']/input -> xPath
		 *  .input-group input -> CSS Selector
		 *  .input-group input[type = 'text']
		 *  .input-group > input[type = 'text']
		 *  
		 *  child to parent: Not possible in CSS Selector
		 *  
		 *  Contains:
		 *  
		 *  //input[contains(@id,'user')] -> xPath
		 *  input[id*='user'] -> CSS Selector
		 *  
		 *  starts- with
		 *  
		 *  //input[starts-with(@id, 'user')] -> xPath
		 *  input[id^='u'] -> CSS Selector
		 *  
		 *  ends-with
		 *  input[id$='me'] -> CSS Selector
		 *  
		 *  comma operator only in CSS not in xPath -> to get multiple web elements that have to relation with each other
		 *  
		 *  input[id$='me'],#password,button[data-test-id = 'sso-login-button']
		 *  
		 *  Siblings movement in CSS Selector via " + " Operator
		 *  div.input-group input + input
		 *  
		 *  There can only be forward movement in the sibling hierarchy, we cannot move backward in css selectors
		 *  
		 *  Indexing in CSS selector
		 *  movement is row wise
		 *  
		 *  Syntax: ":nth-of-type(n) --> "All web elements"
		 *  		":nth-of-type(1) --> "All web elements from 1st row"
		 *  
		 *  div.navFooterLinkCol.navAccessibility ul li:nth-of-type(1)
		 *  
		 *  
		 *  Which among the xPath and CSS selector should be used while creatingthe framework
		 *  and which one should be considered as important or primary while deciding how to fetch WebElement?
		 *  
		 *  Ideal approach - a mix of both.
		 * 
		 */
	}

}
