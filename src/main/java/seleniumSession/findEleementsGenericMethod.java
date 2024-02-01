package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*My ElementUtility is having some driver but it will through me some exception, in case if I am not initialize my driver, So we have use 
constructor strategy, i.e we have use parameterized constructor and we have pass "WebDrive driver" as arguments, and this argument I have to use
when I create the object of ElementUtility class, So my logic class 'driver' is going to pass on the ElementUtility 'driver' and inside my 
ElementUtility when I am going to create reference variable of ElementUtility and I am going to pass the driver the parameterized constructor 
is going to invoke automatically it is going to pass on whatever driver I have got from logic class the same driver is going to pass on the local 
declaration of driver which can only be use privately ElementUtility class, and then the same driver I am gonna use all the methods that 
are defined in ElementUtility class.*/

public class findEleementsGenericMethod {

	public static void main(String[] args) {
		/*
		 * driver = new ChromeDriver(); driver.get("https://www.amazon.in/");
		 */

		DriverFactory df = new DriverFactory();
		WebDriver driver = df.initDriver("Chrome");
		df.launchUrl("https://www.amazon.in/");
		df.pageTitle();
		df.currentPageURL();

		By links = By.tagName("a");
		ElementsUtility et = new ElementsUtility(driver);
		int linkCount = et.getWebElementsSize(links);
		// int linkcount = getWebElements(links).size();
		System.out.println(linkCount);
		df.quitBrowser();
	}

}
