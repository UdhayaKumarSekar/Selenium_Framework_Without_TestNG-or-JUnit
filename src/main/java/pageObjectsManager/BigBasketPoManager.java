package pageObjectsManager;

import org.openqa.selenium.WebDriver;
import pageObjects.LogIn;
import testBase.BigBasketbase;
import utilities.ConfigurationData;

public class BigBasketPoManager extends BigBasketbase {

	private LogIn Bbp;
	private ConfigurationData Cdata;
	
	//Constructor to initialize WebDriver
	public BigBasketPoManager(WebDriver driver) {
		BigBasketbase.driver = driver;
	}
	
//	WebDriver should be used from parent class
	public LogIn getln() {
		if(Bbp ==null) {
			Bbp = new LogIn(driver);
		}
		
		return Bbp;
	}
	
	public ConfigurationData getCdata() {
		if(Cdata == null) {
			Cdata = ConfigurationData.getInstance();
		}
		
		return Cdata;
	}
	
}