package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	//	=driver.findElement(By.ByCssSelector)
List <WebElement> alloptions=driver.findElements(By.cssSelector("div._37M3Pb>.eFQ30H .xtXmba"));
	System.out.println("printing size of elements:"+alloptions.size());
	for(int i=0;i<alloptions.size();i++) {
	WebElement option=alloptions.get(i);
	String name=option.getText();
	if(name.equals("Home")) {
		option.click();
		break;
	}
	}
	               
		
		}
		

	}

	
