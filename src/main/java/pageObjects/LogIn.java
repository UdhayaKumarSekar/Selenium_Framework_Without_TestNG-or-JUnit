package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BigBasketbase;
import utilities.ConfigurationData;

public class LogIn extends BigBasketbase implements LogInInterface{

	WebDriver driver;
	ConfigurationData cdata;

	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = LoginBtn_Xpath)
	WebElement LoginBtn;

	@FindBy(xpath = Mobile_Num_xpath)
	WebElement Mobile_Num;

	@FindBy(xpath = SubmitBtn_xpath)
	WebElement SubmitBtn;

	public void getLoginPage() {

		cdata = ConfigurationData.getInstance();
		String url = cdata.getURL();
		String mob_num = cdata.getMobileNum();

		driver = BrowserLaunch();
		
		launchURL(driver, url); // ✅ Open the correct URL
		ClickTheElement(LoginBtn, driver);
		InputValues(Mobile_Num, driver, mob_num);
		ClickTheElement(SubmitBtn, driver);
	}
}
