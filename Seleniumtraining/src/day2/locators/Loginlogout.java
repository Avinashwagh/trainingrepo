package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginlogout {

	public static void main(String[] args) {
		
String path1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//String path2=".\\executables\\chromedriver.exe";
//String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://demo.actiTime.com/login.do");
String expectedTitle="acTitime-Login";
String actualTitle=driver.getTitle();
if(actualTitle.equals(expectedTitle)) {
	System.out.println("login page opened successefully..");
}else {
	System.out.println(("login page terminated....")); 
}
 driver.findElement(By.id("username")).sendKeys("admin");
 //driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.id("loginButton")).click();
 WebElement  logoutButton=driver.findElement(By.id("logoutLink"));
 WebDriverWait wait=new WebDriverWait(driver,20);
 wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
 String actualHomepageTitle=driver.getTitle();
 System.out.println("ActualHomepagetitle:"+actualHomepageTitle);
 String expectedHomepageTitle="actiTime-EnterTime-Track";
 if(actualHomepageTitle.equals(expectedHomepageTitle)) {
	 System.out.println("login successfull and Title Verified....");
	 
 }else {
	 System.out.println("either login crashed or homepage changed... ");
 }
	}

}
