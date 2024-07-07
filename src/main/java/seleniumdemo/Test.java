package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	/*
	 * Identify any webelement findElement() - single matching node or element
	 * findElements() - Finding multiple matching elements
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		
		// Print all the links on a give web page
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("Total links on this page : "+tags.size());
		

		for (WebElement tag : tags) {
			System.out.println(tag.getAttribute("href"));
		}

		driver.close();
	}

}
