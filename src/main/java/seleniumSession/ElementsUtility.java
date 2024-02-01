package seleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsUtility {
	private WebDriver driver;

	public ElementsUtility(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}

	public int getWebElementsSize(By locator) {
		return getWebElements(locator).size();
	}

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public void performSendKeys(By locator, String value) {
		getWebElement(locator).sendKeys(value);
	}

	public void performClick(By locator) {
		getWebElement(locator).click();
	}

	public void selectDropDownByIndex(By locator, int index) {
		Select select = new Select(getWebElement(locator));
		select.selectByIndex(index);
	}

	public void selectDropDownByValue(By locator, String value) {
		Select select = new Select(getWebElement(locator));
		select.selectByValue(value);
	}

	public void selectDropDownByText(By locator, String text) {
		Select select = new Select(getWebElement(locator));
		select.selectByVisibleText(text);
	}

	public void selectDropDown(By locator, String value, String selectType) {
		Select select = new Select(getWebElement(locator));

		switch (selectType) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("Invalid selectType");
		}
	}

	public void mouseHover(By locator) {
		Actions actions = new Actions(driver);
		actions.moveToElement(getWebElement(locator)).perform();
	}

	public void mouseClick(By locator) {
		Actions actions = new Actions(driver);
		actions.click(getWebElement(locator)).perform();
	}

	public void mouseDoubleClick(By locator) {
		Actions actions = new Actions(driver);
		actions.doubleClick(getWebElement(locator)).perform();
	}

	public List<String> getRightClickMenu(By locator) {
		List<String> rightClickList = new ArrayList<String>();
		List<WebElement> menulist = getWebElements(locator);
		System.out.println("Size of the menu items: " + getWebElementsSize(locator));
		for (WebElement e : menulist) {
			String itemText = e.getText();
			rightClickList.add(itemText);
		}
		return rightClickList;
	}

	public void clickMenuItem(By locator, String value) {
		List<WebElement> menulist = getWebElements(locator);
		System.out.println("Size of the menu items: " + getWebElementsSize(locator));
		for (WebElement e : menulist) {
			String itemText = e.getText();
			if (itemText.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public void performSendKeysToElement(By locator, String value) {
		Actions actions = new Actions(driver);
		actions.sendKeys(getWebElement(locator), value).perform();
	}

	public void performClickToElement(By locator) {
		Actions actions = new Actions(driver);
		actions.click(getWebElement(locator)).perform();
	}

	public void handleAlert(String action, String value) {
		Alert alert = driver.switchTo().alert();
		switch (action) {
		case "accept":
			alert.accept();
			break;
		case "dismiss":
			alert.dismiss();
			break;
		case "sendKeys":
			alert.sendKeys(value);
			break;
		default:
			System.out.println("Invalid action");
		}
	}

	public String getAlertText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();

	}

	public void switchToFrame(String switchFrameType, String value) {
		switch (switchFrameType) {
		case "index":
			driver.switchTo().frame(Integer.parseInt(value));
			break;
		case "nameOrId":
			driver.switchTo().frame(value);
			break;
		default:
			System.out.println("Invalid switchFrameType");
		}
	}

	public void switchToFrame(By locator) {
		driver.switchTo().frame(getWebElement(locator));
	}

	public void selectOptionFromDD(By locator, String... value) {
		List<WebElement> ddOptionsList = getWebElements(locator);
		if (!value[0].equalsIgnoreCase("All")) {

			// System.out.println("Size of the menu items: " + getWebElementsSize(locator));
			for (int i = 0; i < ddOptionsList.size(); i++) {
				String text = ddOptionsList.get(i).getText();
				// System.out.println(text);
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						ddOptionsList.get(i).click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement e : ddOptionsList) {
					e.click();
				}
			} catch (Exception e) {
			}
		}
	}

	public String waitForTitle(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	public String waitForCurrenPageUrl(String URL, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.urlContains(URL));
		return driver.getCurrentUrl();
	}

	public String waitForCurrenPageUrlToBe(String URL, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.urlToBe(URL));
		return driver.getCurrentUrl();
	}

	/**
	 * 
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeout
	 * @return WebElement
	 */
	public WebElement waitForElementPresenceOnDOM(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param locator
	 * @param timeout
	 * @return WebElement
	 */
	public List<WebElement> waitForAllElementPresenceOnDOM(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	/**
	 * An expectation for checking that an element, known to be present on the DOM
	 * of a page, isvisible. Visibility means that the element is not only displayed
	 * but also has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return WebElement
	 */
	public WebElement waitForElementIsVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locator are visible. Visibility means that the elements are not
	 * only displayed but also have a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return WebElement
	 */
	public List<WebElement> waitForAllElementIsVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElements(getWebElements(locator)));
	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param locator
	 * @param timeout
	 */
	public void waitToClickWebElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void actionsWaitToClickWebElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

		Actions actions = new Actions(driver);
		actions.click().perform();
	}

	/**
	 * This method is used to wait with Fluent Wait conditions and fetch a
	 * WebElement
	 * 
	 * @param locator
	 * @param timeout
	 * @param poolingTime
	 * @return WebElement
	 */

	public WebElement waitWithFluentWait(By locator, int timeout, int poolingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(poolingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).ignoring(ElementNotInteractableException.class);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/*-----------Switch to window by title--------------------*/
	public void switchtoWindow(String expectedTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String h : windowHandles) {
			driver.switchTo().window(h);
			String actualTitle = driver.getTitle();
			if (actualTitle.contains(expectedTitle)) {
				break;
			}
		}
	}

	/*-----------Switch to window by index--------------------*/
	public void switchtoWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(windowHandles);
		String targetedWindow = listHandles.get(index);
		driver.switchTo().window(targetedWindow);
	}

}
