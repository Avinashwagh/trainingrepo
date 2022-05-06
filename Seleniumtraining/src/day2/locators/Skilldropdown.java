package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skilldropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
 WebElement options55=driver.findElement(By.id("skills"));
 Select selectskill=new Select(options55);
 
 List<WebElement> croptions=selectskill.getOptions();
 System.out.println("options count:"+croptions.size());
 for(int i=0;i<croptions.size();i++) {
	 System.out.println("potions:"+croptions.get(i).getText());
 }

	}

}
