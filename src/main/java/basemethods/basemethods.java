package basemethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.execution.scripts.MainExecutionScripts;
import com.pageobjects.BlogsPage;
import com.utility.Basevariables;
import com.utility.Locatorsplittedvalues;
import com.utility.TakingScreenshots;
import com.utility.log;

public class basemethods {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver selectbrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty(Basevariables.chromekey, Basevariables.chromedriverpath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				log.info("Opening the website in browser" + browser);
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty(Basevariables.firefoxkey, Basevariables.firefoxdriverpath);
				driver = new FirefoxDriver();
				log.info("Opening the website in browser " + browser);
			} else {
				System.out.println("Browser name is wrong");
				log.error("The browser name is wrong");
			}
		} catch (Exception e) {
			System.out.println("Not able to open the browser");
			e.printStackTrace();
		}

		return driver;
	}

	public static void openurl(String url) {

		try {
			driver.get(url);
			log.info("Website Opened");
		} catch (Exception e) {
			System.out.println("the code is failing and we are in the catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to open website");
		}
	}
	public static WebElement findElement(String locValue) throws Exception{
		
		WebElement element = driver.findElement(Locatorsplittedvalues.locatorVariables(locValue));
			return element;
		}
		
	
	public static void Mousehoverwithoutclick(String locvalue) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue));
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			log.info("Mouse hovering successful over the element " + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			e.printStackTrace();
			MainExecutionScripts.bValue = false;
			TakingScreenshots.screenshots((TakesScreenshot) driver, "mousehoverwithoutclick");
			log.error("Not able to do Mouse hovering over the element " + locvalue);
		}
	}

	public static void Mousehoverwithclick(String locvalue) throws Exception {
		try {

			WebElement element = driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			log.info("Mouse hovering and click action successful over the element " + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			e.printStackTrace();
			MainExecutionScripts.bValue = false;
			TakingScreenshots.screenshots((TakesScreenshot) driver, "mousehoverwithoutclick");
			log.error("Mouse hovering and click not successful over the element " + locvalue);

		}
	}

	public static void scrolling() throws Exception {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scroll(0,400)");
			log.info("Scrolling is successful");
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to do Scrolling");
			TakingScreenshots.screenshots((TakesScreenshot) driver, "scroll");
			e.printStackTrace();
		}

	}

	public static void handlingclicks(String locvalue) throws Exception {
		try {

			WebElement element = driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue));
			element.click();
			log.info("Successfully able to click the webelement " + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to click the webelement " + locvalue);
			TakingScreenshots.screenshots((TakesScreenshot) driver, "handlingclicks");
			e.printStackTrace();
		}
	}

	public static void handlingtextboxes(String locvalue, String testdata) throws Exception {
		try {

			wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(ExpectedConditions
					.visibilityOf(driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue))));
			element.sendKeys(testdata);
			log.info("data entered in textbox" + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to select value from the textbox " + locvalue);
			TakingScreenshots.screenshots((TakesScreenshot) driver, "handlingdrpdwns");
			e.printStackTrace();
		}
	}

	public static String fetchvalue(String locvalue) throws Exception {
		try {

			String element = wait
					.until(ExpectedConditions
							.visibilityOf(driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue))))
					.getText();
			System.out.println(element);
			log.info("Successfully fetched the value from webelement " + locvalue);
			return element;
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to fetch the value from webelement " + locvalue);
			TakingScreenshots.screenshots((TakesScreenshot) driver, "fetchedvalue");
			e.printStackTrace();
		}
		return null;
	}

	public static void fetchsize(String locvalue) throws Exception {

		List<WebElement> elements = wait.until(ExpectedConditions
				.visibilityOfAllElements(driver.findElements(Locatorsplittedvalues.locatorVariables(locvalue))));

		if (elements.size() > 0) {
			System.out.println("User has enrolled for courses");

		} else {
			System.out.println("user not enrolled");
		}

	}

	public static void windowHandling() throws Exception {
		wait = new WebDriverWait(driver, 20);
		String ParentWindow = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		basemethods.handlingtextboxes(BlogsPage.searchBlog, Basevariables.searchBlog);
		driver.close();
		driver.switchTo().window(ParentWindow);
	}

	public static void handlingdropdowns(String locvalue, String testdata) throws Exception {
		try {
			WebElement element = wait.until(ExpectedConditions
					.visibilityOf(driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue))));

			Select s = new Select(element);
			s.selectByVisibleText(testdata);
			log.info("Successfully able select value from the dropdown " + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to select value from the dropdown " + locvalue);
			TakingScreenshots.screenshots((TakesScreenshot) driver, "handlingdrpdwns");
			e.printStackTrace();
		}
	}

	public static void clearElements(String locvalue) throws Exception {
		try {
			wait = new WebDriverWait(driver, 30);
			WebElement element = driver.findElement(Locatorsplittedvalues.locatorVariables(locvalue));
			element.clear();
			log.info("Successfully able to clear the element " + locvalue);
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to clear the element " + locvalue);
			TakingScreenshots.screenshots((TakesScreenshot) driver, "clearElements");
			e.printStackTrace();
		}
	}

	public static void closebrowser() {
		try {
			driver.quit();
			log.info("Successfully closed the browser");
		} catch (Exception e) {
			System.out.println("the code is failing and we are in catch block");
			MainExecutionScripts.bValue = false;
			log.error("Not able to close the browser");
			e.printStackTrace();
		}

	}
	
	public static void alert(){
		Alert a = driver.switchTo().alert();
		String alert = a.getText();
		System.out.println("Alert message :" + alert);
		a.dismiss();
		
	}
	
	public static void navigateback(){
		driver.navigate().back();
	}
}
