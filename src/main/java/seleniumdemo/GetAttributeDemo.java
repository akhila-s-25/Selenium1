package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // all links
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.name("login")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("border"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("border-radius"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("line-height"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("padding"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("width"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("text-decoration"));
		
		driver.close();

	}

}
