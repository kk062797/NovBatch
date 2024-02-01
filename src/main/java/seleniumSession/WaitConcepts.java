package seleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitConcepts {

	public static void main(String[] args) {
		/*
		 *  There are 2 types of wait in selenium:
		 *  1. Static Wait - Thread.sleep(ms)
		 *  
		 *  
		 *  2. Dynamic Wait
		 *(i)  Implicit Wait
		 *		Implicitly Wait
		 *(ii) Explicit Wait
		 *  	Fluent Wait 
		 *  	WebDriver Wait 
		 * 
		 * Static Wait is going to wait for a web element irrespective of its visibility on DOM
		 * Dynamic wait only waits till the element is visible
		 * 
		 * Implicitly wait -> Global Wait -> It is a wait which imply on al WebElements
		 * It will apply on only web element
		 * 
		 * When you imply your WE with implicitly wait then on finfElements or findElement is going to get affected
		 * Implicitly is by default applied on all WE
		 * Default value for imp wait is '0'
		 * If the element is not visible thent it is going to throw NoSuchWebElement Exception
		 * 
		 * Why not to use Implicitly wait in RealTime FrameWork
		 * 1. It is only applied on WEs.
		 * 2. It is considered as Global Wait and Every Time FE/FEs is going to be executed,
		 * 		The implicitly wait will also be executed and unnecessary execution of code
		 * 		will be applied for those WEs which does not require wait handling.
		 * 
		 * Default pooling time of Implicitly wait is 500ms
		 * 
		 * Thread.sleep(3000) -> 1 check for 3 sec
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
