package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeloginlogoutwithouthomepagevalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver= new ChromeDriver();
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
		    WebElement logoutButton=driver.findElement(By.id("logoutLink"));
			WebDriverWait wait =new WebDriverWait(driver,20) ;
			wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
			String actualHomePageTitle=driver.getTitle();
			System.out.println("actualhomepagetitle:"+actualHomePageTitle);
			String expectedHomePageTitle="actitime-Enter TimeTack";
			if(actualHomePageTitle.equals(expectedHomePageTitle)) {
				System.out.println("login sucessfully and home page is also verified..");
			}else {
				System.out.println("Either log in failed or home page title is changed");
				
			}
			driver.findElement(By.linkText("logout")).click();
			
			driver.findElement(By.linkText("LogoutLink")).click(); 

	}

}
