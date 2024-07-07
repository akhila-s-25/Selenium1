package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@name='email']")); //Enter email id// NoSuchElementException
		email.sendKeys("TestUser123@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("P2373743434348364364634"); //Enter password
		
		driver.findElement(By.name("pass")).submit();
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
