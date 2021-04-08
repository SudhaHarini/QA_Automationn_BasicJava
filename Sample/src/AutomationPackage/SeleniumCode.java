package AutomationPackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("G:\\selenium course\\Webdriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
			 System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
			 	WebDriver driver = new FirefoxDriver();
			 	driver.manage().deleteAllCookies();
				String baseUrl = "https://www.google.com/";
		        driver.get(baseUrl);
		       
		    }
	}
