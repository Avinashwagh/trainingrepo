package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmcssselector {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
String cred=driver.findElement(By.tagName("span")).getText();
String[] loginDetails=cred.split(" ") ;
driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[3]);
driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[7]);
driver.findElement(By.id("btnLogin")).click();


	}

}
