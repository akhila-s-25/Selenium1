package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueDemo2 {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // all links
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.name("login")).getSize());
		Dimension dim=driver.findElement(By.name("login")).getSize();
		System.out.println(dim);
		System.out.println(dim.height);
		System.out.println(dim.width);

		driver.close();

	}

}
