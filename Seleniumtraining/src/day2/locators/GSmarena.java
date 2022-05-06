package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GSmarena {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> alloptions=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));

		System.out.println("printing size of elements:"+alloptions.size());
		for(int i=0;i<alloptions.size();i++) {
			System.out.println("printing all elements:"+((WebElement) alloptions).getText());
		WebElement options=alloptions.get(i);
	  //  System.out.println("dsdfsdfss:"+driver.getCurrentUrl());
		String name=options.getText();
		System.out.println("dsdfsdfss:"+driver.getCurrentUrl());
		
	
		//System.out.println("printing all elements:"+((WebElement) alloptions).getText());
	if(name.equals("ASUS")) {
			
		
			options.click();
			
			break;
			
		}
		}

	}
}


