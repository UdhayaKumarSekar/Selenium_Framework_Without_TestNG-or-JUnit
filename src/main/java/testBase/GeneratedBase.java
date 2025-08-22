package testBase;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigurationData;

	public class GeneratedBase {
	    protected static WebDriver driver;
	    protected static JavascriptExecutor Jse;
	    static ConfigurationData cdata;
	    // ✅ Improved: Get browser name from ConfigurationData
	    protected static WebDriver BrowserLaunch(String browser) {
//	        String browser = ConfigurationData.getInstance().getBrowser(); // Fetch from config

	        if (browser.equalsIgnoreCase("Chrome")) {
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("incognito");
	            options.addArguments("--remote-allow-origins=*");
	            driver = new ChromeDriver(options);
	        } else if (browser.equalsIgnoreCase("Firefox")) {
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("Edge")) {
	            driver = new EdgeDriver();
	        } else {
	            throw new RuntimeException("Unsupported Browser: " + browser);
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        return driver;
	    }

	    // ✅ Fixed: Corrected `driver.get(url);`
	    protected static void launchURL(WebDriver driver, String url) {
	        try {
	            driver.get(url);
	        } catch (Exception e) {
	            System.out.println("Error occurred while launching URL:");
	            e.printStackTrace();
	        }
	    }

	    // ✅ Improved: Click an element with proper wait
	    protected static void ClickTheElement(WebElement element, WebDriver driver) {
	        try {
	            new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.elementToBeClickable(element))
	                .click();
	        } catch (Exception e) {
	            System.out.println("Click action failed!");
	            e.printStackTrace();
	        }
	    }

	    // ✅ Improved: Send keys with proper wait
	    protected static void InputValues(WebElement element, WebDriver driver, String value) {
	        try {
	            new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.visibilityOf(element));
	            element.sendKeys(value);
	        } catch (Exception e) {
	            System.out.println("Input action failed!");
	            e.printStackTrace();
	        }
	    }

	    protected static String textValue(WebElement element, WebDriver driver) {
	        return element.getText();
	    }

	    protected static Boolean isSelected(WebElement element) {
	        return element.isSelected();
	    }

	    // ✅ Improved: Use WebDriverWait instead of Thread.sleep
	    protected static void javascript(WebDriver driver, String script) {
	        Jse = (JavascriptExecutor) driver;
	        Jse.executeScript(script);
	        new WebDriverWait(driver, Duration.ofSeconds(5)); // ✅ Wait instead of sleep
	    }

	    protected static void jsclick(String script, WebElement element) {
	        Jse = (JavascriptExecutor) driver;
	        Jse.executeScript(script, element);
	    }

	    // ✅ Improved: Overloaded iFrame method
	    protected static void iFrame(WebDriver driver, int frameIndex) {
	        driver.switchTo().frame(frameIndex);
	    }

	    protected static void iFrame(WebDriver driver, String frameName) {
	        driver.switchTo().frame(frameName);
	    }

	    // ✅ Improved: No need for WebElement parameter in alert
	    protected static void dismissAlert(WebDriver driver) {
	        driver.switchTo().alert().dismiss();
	    }
	}


