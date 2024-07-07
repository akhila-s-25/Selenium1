package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//clear() : void  
//sendKeys(CharSequence? KeysToSend) : void  
//click() : void  
//isDisplayed() : boolean  
//isEnabled() : boolean  
//isSelected() : boolean  
//submit() : void  
//getText() : String  
//getTagName() : String  
//getCssvalue() : String  
//getAttribute(String Name) : String  
//getSize() : Dimension  
//element.getSize();  
//getLocation() : Point  

public class WebElementCommandDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//clear method
		driver.findElement(By.id("email")).sendKeys("TestUser236623623@gmail.com");
		
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		System.out.println("Cleared the email Text box");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("TestUser236623623@gmail.com");
		
		System.out.println("Entered TestUser236623623@gmail.com");
		
		
		
		
		
		
		
		driver.close();
	}

}
