package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		System.out.println("The current url : " + driver.getCurrentUrl());

		System.out.println(driver.getPageSource());
		
		//driver.close(); //close the current active window
		driver.quit(); //not only close the parent window but the child window as well
		

	}

}
