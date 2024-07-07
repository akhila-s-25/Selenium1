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

public class WebElementCommandDemo2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//clear method
		driver.findElement(By.id("email")).sendKeys("TestUser236623623@gmail.com");
		
		boolean displayed=driver.findElement(By.xpath("//h2")).isDisplayed();
		System.out.println(displayed);
		
		boolean displayed2=driver.findElement(By.id("email")).isEnabled();
		System.out.println(displayed2);
		//Assertion validation
		
		
		
		
		driver.close();
	}

}
