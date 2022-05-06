package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
                  WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
                  firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
                  firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
                  
                  driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"V"));
                 
                  
	}

}
