package testBase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigurationData;

public class BigBasketbase {
	protected static WebDriver driver;
	protected static JavascriptExecutor Jse;
	public static ConfigurationData cd;

//	method to launch the browser
	protected static WebDriver BrowserLaunch() {

		cd = ConfigurationData.getInstance();
		String br = cd.getBrowser();
		
		if (br.equals("chrome")) {
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments("incognito");
			Options.addArguments("--remote-allow-origins*=");
			driver = new ChromeDriver(Options);

		} else if (br.equals("Firefox")) {
			driver = new FirefoxDriver();

		} else if (br.equals("Edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	protected static void launchURL(WebDriver driver, String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Errors occur Line Number: ");
			e.printStackTrace();
		}
	}

	protected static void ClickTheElement(WebElement element, WebDriver driver) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static void InputValues(WebElement element, WebDriver driver, String Value) {

		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static String textvalue(WebElement element, WebDriver driver) {
		return element.getText();
	}

	protected static Boolean selected(WebElement element) {
		return element.isSelected();
	}

	protected static void javascript(WebDriver driver, String script) {
		Jse = (JavascriptExecutor) driver;
		Jse.executeScript(script);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException Ie) {
			Ie.printStackTrace();
		}
	}

	protected static void jsclick(String script, WebElement element) {
		Jse = (JavascriptExecutor) driver;
		Jse.executeScript(script, element);
	}

	protected static void iFrame(WebDriver driver, String frameName) {
		driver.switchTo().frame(Integer.parseInt(frameName));
	}

	protected static void alert(WebDriver driver, WebElement element) {
		driver.switchTo().alert().dismiss();
	}

}
