package Broweseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeloginlogout {

	public static void main(String[] args) {
		String path1="C:\\javaworkspace\\Seleniumtraining\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
        String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", path3);
        
       WebDriver driver=new ChromeDriver();
      
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTime-Login";
		String actualTitle=driver.getTitle();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("login page opened successfully");
		     }else {
		    	 System.out.println("either page login not opened or page title got changed...");
		     }
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click(); 
	//	webelement logoutbutton=driver
		


	}

}
