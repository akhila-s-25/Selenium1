package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
//browser navigation commands:
//to(String arg0) : void  
//driver.navigate().forward();  
//driver.navigate().back();  
//driver.navigate().refresh(); 
public class BrowserNavigationCommands {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		System.out.println("Page title : "+driver.getTitle());
		driver.navigate().back(); // fb.com
		System.out.println("Page title : "+driver.getTitle());
		driver.navigate().forward(); // google.com
		System.out.println("Page title : "+driver.getTitle());
		System.out.println("git branch");
		
		//refresh
		
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		driver.navigate().refresh();
		
		for(int i=1;i<=10;i++) {
			driver.navigate().refresh();
			System.out.println("Refreshed browser counter: "+i);
		}


		
		
		driver.close();
	}

}
