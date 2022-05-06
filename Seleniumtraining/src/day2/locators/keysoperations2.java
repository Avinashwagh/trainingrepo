package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysoperations2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//body")); 
		 element.sendKeys(Keys.ESCAPE);
		 Thread.sleep(1500);
		 element.sendKeys(Keys.chord(Keys.CONTROL,"end"));
		 Thread.sleep(1500);
		 
		 element.sendKeys(Keys.chord(Keys.CONTROL,"home"));

	}

}
