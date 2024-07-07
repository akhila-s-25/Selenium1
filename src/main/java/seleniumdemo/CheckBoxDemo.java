package seleniumdemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91982\\JavaNovBatch\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");

//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

		// Check the status of the check box
		// check it if not checked and dnt check it of already selected
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// for each
//		for(WebElement check:checkBox) {
//			
//			if(!check.isSelected()) {
//				check.click();
//			}
//		}

		// for loop
//		for(int i=0;i<checkBox.size();i++) {
//			
//			if(!checkBox.get(i).isSelected()) {
//				checkBox.get(i).click();
//			}
//		}

// Iterator - collection

		Iterator<WebElement> itr = checkBox.iterator();
		while (itr.hasNext()) {
			if(!(itr.next().isSelected())) {
				itr.next().click();
			}
			
		}

	}
}
