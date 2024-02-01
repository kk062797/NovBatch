package seleniumSession;

//close() -> when you close the browser only the current browser will be closed
//when you close you browser, session is retained but the session gets invalid
//quit() -> when you quit the browser, all your browser windows that are open, will be closed together
//when you quit your bowser, session ID gets null

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("CurrentUrl: " + driver.getCurrentUrl());
		System.out.println("PageTitle: " + driver.getTitle());
//driver.close();	//NoSuchSessionException: invalid session id
//Session ID is secured, but just because the browser is closed, so it will throw an exception
		driver.quit();// NoSuchSessionException: Session ID is null.
		driver.getTitle();

	}

}