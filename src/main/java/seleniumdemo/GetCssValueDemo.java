package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueDemo {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // all links
		driver.manage().window().maximize();
		String atr = driver.findElement(By.name("login")).getAttribute("name");
		System.out.println(atr);
		
		System.out.println(driver.findElement(By.name("login")).getAttribute("data-testid"));
		System.out.println(driver.findElement(By.name("login")).getAttribute("type"));
		System.out.println(driver.findElement(By.name("login")).getAttribute("class"));
		
		driver.close();

	}

}
