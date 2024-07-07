package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Grocery")).click();
		
		//Partial Link Text
		
		//Grocery product available in India Grocery product available in India Grocery product available in India
		driver.findElement(By.partialLinkText("Groce")).click();
		
		
		
	}

}
