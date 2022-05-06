package day2.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.seleniumutility;

public class Selectdropdown {

	public static void main(String[] args) {
	
seleniumutility s1=new seleniumutility();
WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
WebElement skilldropdown=driver.findElement(By.cssSelector(".select2-search__field"));
                Select selectskill=new Select(skilldropdown);
                List<WebElement> options=selectskill.getOptions();
                System.out.println("getting options:"+options.size());
                for(int i=0;i<options.size();i++) {
                	System.out.println("printing options:"+options.get(i).getText());
                }
	}

}