package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleBootStrapDropdown {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/"); //
		driver.manage().window().maximize(); // ctrl+D = Delete

		driver.findElement(By.id("dropdownMenuButton")).click();

		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));

		for (WebElement menu : menus) {

			if (menu.getText().equalsIgnoreCase("Another action")) {
				menu.click();
				System.out.println("I have clicked on Another action DD");
				break;
			}

		}
	}
}
