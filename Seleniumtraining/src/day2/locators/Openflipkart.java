package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openflipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		
List <WebElement> icon=driver.findElements(By.cssSelector(".ds-flex .ds-flex-row>div>a"));
		System.out.println("printing size of elements:"+icon.size());
		for(int i=0;i<icon.size();i++) {
			WebElement name=icon.get(i);
			System.out.println("printing one by one:"+name);
		}
		
		
	}

}
