package bigbasketRun;

import pageObjects.LogIn;
import pageObjectsManager.BigBasketPoManager;
import testBase.BigBasketbase;

public class BigBasketRun extends BigBasketbase {

	BigBasketPoManager BigPOM = new BigBasketPoManager(driver);
	static LogIn ln;
	
//	private void OpenURL() {
//		launchURL(driver, BigPOM.getCdata().getURL());
//	}
//	
/*
	private void LogInBigBasket() {
		WebElement logInButton = driver.findElement(By.linkText("Login/ Sign Up"));
		ClickTheElement(logInButton, driver);
		WebElement PhonNum = driver.findElement(By.linkText("Enter Phone number/ Email Id"));
		ClickTheElement(PhonNum, driver);
		InputValues(PhonNum, driver, "9629387725");
		WebElement SubmitButton = driver.findElement(By.linkText("Verify & Continue"));
		ClickTheElement(SubmitButton, driver);
	}
*/
	
//	private void LogInBigBasket() {
//		LogIn Bbl = new LogIn(driver);
//		Bbl.getLoginPage();
//	}
	
	public static void main(String[] args) {
		
		driver = BrowserLaunch();    // ✅ assign returned driver to static driver
		ln = new LogIn(driver);      // ✅ pass driver to page object
		
		ln.getLoginPage();

		System.out.println("Browser Launched");
		System.out.println("Application Launched");
		System.out.println("Mobile Number Entered");
	}
}
