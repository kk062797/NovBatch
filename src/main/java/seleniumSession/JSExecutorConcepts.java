package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//WebElement emailadd = driver.findElement(By.cssSelector("#username"));

		JSUtilities js = new JSUtilities(driver);
		//js.flash(emailadd);
		//emailadd.sendKeys("Kakku");
		/*
		 * System.out.println(js.getTitleByJS());
		 * System.out.println(js.getPageInnerText());
		 * System.out.println(js.getBrowserInfo());
		 */
		/*
		 * By username = By.xpath("//input[@name='username']"); By password =
		 * By.xpath("//input[@name='password']"); By loginbtn =
		 * By.xpath("//button[@type='submit']"); Thread.sleep(3000);
		 * driver.findElement(username).sendKeys("Admin");
		 * driver.findElement(password).sendKeys("admin123"); WebElement login=
		 * driver.findElement(loginbtn); js.clickElementByJS(login);
		 */
		js.scrollPageDown();
	}

}
