package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchimagelist {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.get("https://www.amazon.in/");

		List<WebElement> imglist = driver.findElements(By.tagName("img"));

		System.out.println("Total Images: " + imglist.size());
		System.out.println();
		/*
		 * for (WebElement e : imglist) { System.out.println(e.getAttribute("src"));
		 * 
		 * }
		 */

		for (int i = 0; i < imglist.size(); i++) {
			String src = imglist.get(i).getAttribute("src");
			String altText = imglist.get(i).getAttribute("alt");
			System.out.println(src);
			System.out.println(altText);
			System.out.println();

		}

	}

}
