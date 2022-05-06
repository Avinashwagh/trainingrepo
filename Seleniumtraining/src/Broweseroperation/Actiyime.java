package Broweseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actiyime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		String expectedtitle="actiTIME - Login";
		System.out.println("heres the title:"+driver.getTitle());
		System.out.println("get current url:"+driver.getCurrentUrl());
		if(expectedtitle.equals(title)) {
			System.out.println("matched sucessfully...");
		}else {
			System.out.println("unmatched sucessfully....");
		}
	WebElement usernameinputfield=driver.findElement(By.id("username"));
	usernameinputfield.sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("logoutLink")).click();

	}

}
