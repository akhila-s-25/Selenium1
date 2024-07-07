package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		
		//C:\Users\91982\JavaNovBatch\SeleniumAutomation
		System.out.println(System.getProperty("user.dir")); 
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.cssSelector("#email")); //Enter email id// NoSuchElementException
		email.sendKeys("TestUser123@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("P2373743434348364364634"); //Enter password
		
		driver.findElement(By.name("pass")).submit();
		//driver.findElement(null).click();
		//driver.findElement(By.name("login")).click();
		
		try {
			Thread.sleep(5000); //5000 ms = 5secs
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		driver.close();
		
		
		

	}

}
