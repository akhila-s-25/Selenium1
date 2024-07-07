package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/checkboxes"); //

		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Check of if checkbox is not check

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement checkBox : checkBoxes) {

			if (checkBox.isSelected()) {
				checkBox.click();
			}

		}

	}

}
