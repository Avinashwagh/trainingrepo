package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class infocric {

	public static void main(String[] args) {
			
			  System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get("https://www.espncricinfo.com/");
			  
			 WebElement alloptions=driver.findElement(By.cssSelector(" .ds-flex-row>div:nth-of-type(7)>a"));
		//	System.out.println("total identified element:"+( alloptions).Size());
			/* for(int i=0;i<alloptions.size();i++) {
				 WebElement options =alloptions.get(i); 
				String name= options.getText();
				 System.out.println("option name:"+name);
				 if(name.equals("Amazon Pay")) { 
					 options.click();
					 break;
					 
				 }else {
					 System.out.println("not matched"); */
				 }
				 
		//	 }
		//	driver.navigate().back();
				

			


	}



