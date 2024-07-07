package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLInks3 {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com"); // all links
		driver.manage().window().maximize();

		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		System.out.println("No of links are : "+tags.size());
		for(WebElement tag:tags) {
			System.out.println(tag.getAttribute("href"));
		}
		
		driver.close();

	}

}
