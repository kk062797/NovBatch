package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Any thing or Every thing you see on web page is a web element
//	To identify the web element, the address/locater of that web element has to be unique
//id locater is the most unique attribute any web element
//but 'id' is not available for every web element, So we have to use 'xPATH' or 'CSS Selectors' strategy
//identification of WE and then action on that WE
public class WebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		/*
		 * // 1st Way
		 * driver.findElement(By.id("Form_getForm_Name")).sendKeys("Kanishk");
		 * driver.findElement(By.id("Form_getForm_Email")).sendKeys("kanishk@abc.com");
		 * driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9876567854");
		 * 
		 * // 2nd Way WebElement firstname =
		 * driver.findElement(By.id("Form_getForm_Name")); WebElement email =
		 * driver.findElement(By.id("Form_getForm_Email"));
		 * firstname.sendKeys("Kanishk"); firstname.clear();
		 * firstname.sendKeys("Kakku"); email.sendKeys("kanishk@abc.com");
		 * email.clear(); email.sendKeys("kakku@abc.com");
		 */
//3rd Way -> By Locator Repository
		By fname = By.id("Form_getForm_Name");
		By mailID = By.id("Form_getForm_Email");

		// driver.findElement(fname).sendKeys("Kakku");
		// driver.findElement(mailID).sendKeys("kakku@abc.com");

		// WebElement Repository

		WebElement firstname = driver.findElement(fname);
		WebElement email = driver.findElement(mailID);

		firstname.sendKeys("Kakku");
		email.sendKeys("kakku@abc.com");

	}

}

