package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		String text=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).getText();
		System.out.println(text);
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).getText());
		driver.close();

		
	}

}
