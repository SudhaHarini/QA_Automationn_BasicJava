package AutomationTestingQA;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author SudhaHarini 
 * LocatingElements is used to locate the elements to do AutoTest
 *
 */
public class LocatingElements {
	/** Main Method */
	public static void main(String[] args) {
		/* Initiating web driver */
		File file = new File("G:\\selenium course\\Webdriver\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		/* launching screen */
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		/* Locating text box by xpath*/
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Selenium");
		/* closing the browser */
		driver.close();
	}
}
