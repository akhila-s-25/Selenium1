package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownAllOptions {

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
		
		List<WebElement> allDDOptions = select.getOptions();
		System.out.println("No of DD options: "+allDDOptions.size());
		for(WebElement option:allDDOptions) {
			System.out.println(option.getText());
		}
		driver.close();

		/*
		No of DD options: 71
		Afrikaans
		Polski
		العربية
		Asturianu
		Azərbaycanca
		Български
		বাংলা
		Беларуская
		Català
		Čeština
		Cymraeg
		Dansk
		Deutsch
		Eesti
		Ελληνικά
		English
		Español
		Esperanto
		Euskara
		فارسی
		Français
		Galego
		한국어
		हिन्दी
		Hrvatski
		Bahasa Indonesia
		Italiano
		עברית
		ქართული
		Ladin
		Latina
		Latviešu
		Lietuvių
		Magyar
		Македонски
		مصرى
		Bahasa Melayu
		Bahaso Minangkabau
		Nederlands
		日本語
		Norsk (bokmål)
		Norsk (nynorsk)
		Oʻzbekcha / Ўзбекча
		Português
		Қазақша / Qazaqşa / قازاقشا
		Română
		Simple English
		Sinugboanong Binisaya
		Slovenčina
		Slovenščina
		Српски / Srpski
		Srpskohrvatski / Српскохрватски
		Suomi
		Svenska
		தமிழ்
		Татарча / Tatarça
		ภาษาไทย
		Тоҷикӣ
		تۆرکجه
		Türkçe
		Українська
		اردو
		Tiếng Việt
		Winaray
		中文
		Русский
		Нохчийн
		Հայերեն
		မြန်မာဘာသာ
		粵語
		閩南語 / Bân-lâm-gú
		
		*/

	}

}
