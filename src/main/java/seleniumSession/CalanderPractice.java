package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderPractice {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/?utm_source=google&utm_medium=cpc&utm_campaign=search_campaign_6exclusivefare&cid=Search|P|6Exclusive&s_kwcid=AL!12293!3!687053985554!b!!g!!indigo&gad_source=1&gclid=Cj0KCQiA-62tBhDSARIsAO7twbZR-EPd_T5zZPJXAPKgPhzKHRXwy0ndrZRvTeVDt3k8k4goLpzxFh0aAnRJEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@class='react-datepicker__input-container'])[1]")).click();
		datePicker("Feb","27");
		
	}
	public static void datePicker(String month, String date) {
		WebElement element = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text() = '"+date+"']"));
		element.click();
	}
}
