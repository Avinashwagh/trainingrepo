package day2.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.seleniumutility;

public class MultiselectDropdown {

	public static void main(String[] args) {
		
		seleniumutility s1=new seleniumutility();
		WebDriver driver=s1.setUp("chrome", "http://omayo.blogspot.com/");
		WebElement cardropdown=driver.findElement(By.id("drop1"));
		Select selectskill=new Select(cardropdown);
		List<WebElement> options=selectskill.getOptions();
		System.out.println("options count is:"+options.size());
		//selectskill.getFirstSelectedOption().getText();
		for(int i=0;i<options.size();i++) {
			System.out.println("options:"+options.get(i).getText());
			
		}

	}

}
