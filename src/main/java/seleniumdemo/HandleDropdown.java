package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {

		// findElement (8 locators) - one element WebElement
		// findElements(8 locators) - multiple web elements List<WebElement>

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/"); // 
		
		driver.manage().window().maximize();
		//Select DD options
		
		WebElement languageDD=driver.findElement(By.id("searchLanguage"));
		Select select = new Select(languageDD);
		//select.selectByIndex(0); //1st DD value
		//select.selectByValue("af"); //1st DD value
		
		select.selectByVisibleText("हिन्दी");
		
		
		//driver.close();

	}

}
