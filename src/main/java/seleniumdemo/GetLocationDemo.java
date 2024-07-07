package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationDemo {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // all links
		driver.manage().window().maximize();
		// System.out.println(driver.findElement(By.name("login")).getSize());
		Point point = driver.findElement(By.name("login")).getLocation();
		System.out.println(point);
		System.out.println("X Co ordinate"+point.x);
		System.out.println("Y Co ordinate"+point.y);
		driver.close();

	}

}
