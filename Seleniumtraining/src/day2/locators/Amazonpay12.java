package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpay12 {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("https://www.amazon.in/");
  
/* List<WebElement> alloptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
 System.out.println("total identified element:"+alloptions.size());
 for(int i=0;i<alloptions.size();i++) {
	 WebElement options =alloptions.get(i); 
	String name= options.getText();
	 System.out.println("option name:"+name);
	 if(name.equals("Amazon Pay")) { 
		 options.click();
		 break;
		 
	 }else {
		 System.out.println("not matched");
	 }
	 
 }
driver.navigate().back(); */
  
 //driver.findElement(By.className(".nav-a")).click();
 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clothes");
 // driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
