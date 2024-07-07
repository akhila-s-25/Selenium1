package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		
		
	//	WebDriverManger - Boni Gracia
		
 //Selenium - SeleniumManager - WebDriverManger(Not 
		//FireFox - > browser+ driver (geckodriver.exe)
		//InternetExplore - InternetExplorerdrive
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:/Users/91982/JavaNovBatch/SeleniumDemo/src/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	InternetExplorerDriver driver2= new InternetExplorerDriver();
	///	FirefoxDriver driver3= new FirefoxDriver();
	//	SafariDriver driver4=new SafariDriver();
		
		
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()); //Google
		driver.manage().window().maximize();
		//driver.close();
		
		
		
	/*
	 * Different element locators(8) in Selenium
	 * 
	 * ID 
	 * Name
	 * className
	 * linkText
	 * Partial Link Text
	 * css Selector
	 * Xpath
	 * tagName
	 *
	 *
	 *css Selector and Xpath - 80 % - 90% 
	 * 
	 * 
	 */
		
	//	//*[@id="email"]
		
	/*
	 * Xpath Syntax:
	 *  //tagName[@attribute='value'] - Absolute(starting from html tag till the webelement
	 *   or relative xpath - //directly pointing to required element
	 * 
	 * Absolute xpath
	 * /html/body/div[1]/div[10]/div[1]/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input
	 * 
	 * Relative  xpath
	 * 
	 * 
	 */
		
		
		
		
		
		
		
		
		
		
	}

}
