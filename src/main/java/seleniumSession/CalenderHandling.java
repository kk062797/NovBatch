package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		//driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiA-62tBhDSARIsAO7twba26ftDZt18IYyHw2BCU1sZmUvVKemOYAE8RA3CSPqhLuKBmNhrwSMaAgv1EALw_wcB");
		driver.manage().window().maximize();

		/*
		 * WebElement element = driver.findElement(By.cssSelector("#datepicker"));
		 * element.click(); String date = "17";
		 * driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		 */
		driver.findElement(By.cssSelector(".logSprite.icClose")).click();
		driver.findElement(By.xpath("(//div[@class ='sc-12foipm-16 wRKJm fswFld '])[position()=3]")).click();
		//driver.findElement(By.xpath("//div[contains(@aria-label,'Jan')]/p[text()='25']")).click();
		datePicker("Feb", "23");
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		

	}
		public static void datePicker(String month,String date) {
			WebElement element = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"')]/p[text()='"+date+"']"));
			element.click();
		}
}
