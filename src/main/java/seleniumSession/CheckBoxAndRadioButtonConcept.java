package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButtonConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();

		WebElement radio1 = driver.findElement(By.xpath("//input[@value = 'IE']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@value = 'Mozilla']"));
		WebElement radio3 = driver.findElement(By.xpath("//input[@value = 'Opera']"));

		WebElement chk1 = driver.findElement(By.xpath("//input[@value = 'red']"));
		WebElement chk2 = driver.findElement(By.xpath("//input[@value = 'yellow']"));

		radio1.click();
		radio2.click();
		radio3.click();
		chk1.click();
		chk2.click();

		System.out.println("Red is selected : " + chk1.isSelected());
		System.out.println("Red is displyed : " + chk1.isDisplayed());
		System.out.println("Red is enabled : " + chk1.isEnabled());

	}

}
