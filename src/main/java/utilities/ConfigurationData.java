package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationData {

	private static ConfigurationData instance;
	private Properties p;

	public ConfigurationData() {
		p = new Properties();
		loadProperties();
	}

	private void loadProperties() {

		try {
			FileInputStream fis = new FileInputStream("src\\main\\java\\utilities\\config.properties");

			p.load(fis);
			fis.close();

		} catch (IOException e) {

			System.out.println("Error loading properties file: " + e.getMessage());
		}
	}

	public static ConfigurationData getInstance() {

		if (instance == null) {
			synchronized (ConfigurationData.class) {
				if (instance == null) {
					instance = new ConfigurationData();
				}
			}
		}

		return instance;
	}

	public String getURL() {

		String URL = p.getProperty("URL", "https://www.bigbasket.com/"); // default value also provided
		return URL;
	}

	public String getBrowser() {
		String Browser = p.getProperty("Browser", "Chrome");
		return Browser;
	}

	public String getMobileNum() {
		String Mob_num = p.getProperty("Mobile_Num", "9629387725");
		return Mob_num;
	}

	public static void main(String[] args) {

		ConfigurationData Cd = new ConfigurationData();

		System.out.println("Browser: " + Cd.getBrowser());
		System.out.println("URL: " + Cd.getURL());
		System.out.println("Mobile Number: " + Cd.getMobileNum());

	}
}
