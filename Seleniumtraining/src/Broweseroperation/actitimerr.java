package Broweseroperation;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actitimerr {
@Test
	public  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Assert.assertEquals(driver.getTitle(), "actiTime -Login");
		WebElement usernamefield=driver.findElement(By.id("username"));
		usernamefield.sendKeys("admin");
		System.out.println("get tag;name:"+usernamefield.getLocation());
	//	System.out.println("get url:"+driver.getTitle());
        String actualnameusername=usernamefield.getAttribute("placeholder");
        System.out.println(actualnameusername.equals("Username"));
       
        WebElement passfield=driver.findElement(By.name("pwd"));
        passfield.sendKeys("manager");
         String actualnamepassword=passfield.getAttribute("placeholder");
        System.out.println(actualnamepassword.equals("Password"));
        WebElement logfield=driver.findElement(By.id("loginButton"));
        logfield.click();
        System.out.println("get naame for login field:"+logfield.getText());
        driver.findElement(By.id("container_tasks")).click();
	}

}
