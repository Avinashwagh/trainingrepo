package day2.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe.");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://omayo.blogspot.com/");
WebElement cardropdown=driver.findElement(By.id("multiselect1"));
   Select selectskill=new Select(cardropdown);
   System.out.println("dropdown is multiselect or not:"+selectskill.isMultiple());
 List<WebElement> options = selectskill.getOptions();
 System.out.println("in order to get count:"+options.size());
 for(int i=0;i<options.size();i++) {
	 System.out.println ("options:"+options.get(i).getText());
	 
	 selectskill.selectByIndex(0);
	 selectskill.selectByIndex(2);
	 selectskill.selectByIndex(3);
	 
	List<WebElement> selectcars= selectskill.getAllSelectedOptions();
	System.out.println("selected car count:"+selectcars.size());
 }
 
	}

}
