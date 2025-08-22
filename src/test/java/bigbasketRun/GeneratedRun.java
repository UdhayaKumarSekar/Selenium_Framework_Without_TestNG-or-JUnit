package bigbasketRun;

import pageObjectsManager.BigBasketPoManager;
import testBase.BigBasketbase;
import utilities.ConfigurationData;

public class GeneratedRun extends BigBasketbase {
	
	    private BigBasketPoManager BigPOM; // ✅ Declare without initializing

	    public void LoginBigBasket() throws InterruptedException {
	        ConfigurationData config = BigPOM.getCdata(); // ✅ Store config data
	        System.out.println("URL from Config: " + config.getURL());
	    }

//	    private void OpenBrowser() {
//	        driver = BrowserLaunch(); // ✅ Assign WebDriver properly
//	        BigPOM = new BigBasketPoManager(driver); // ✅ Initialize after driver is ready
//	    }

	    private void OpenURL() {
	        launchURL(driver, BigPOM.getCdata().getURL()); // ✅ Ensure driver is initialized
	    }

	    private void LogInBigBasket() {
	        BigPOM.getln(); // ✅ Use existing POM instance
	    }

	    public static void main(String[] args) {
	        GeneratedRun Run = new GeneratedRun();
//	        Run.OpenBrowser();    // ✅ Browser is launched first
	        Run.OpenURL();        // ✅ Then URL is launched
	        Run.LogInBigBasket(); // ✅ Then login happens

	        System.out.println("Browser Launched");
	        System.out.println("Application Launched");
	        System.out.println("Mobile Number Entered");
	    }
	

}
