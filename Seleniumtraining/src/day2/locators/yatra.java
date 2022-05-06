package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.seleniumutility;

public class yatra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumutility s1=new seleniumutility();
		WebDriver driver=s1.setUp("chrome", "https://www.yatra.com/");
		driver.findElement(By.cssSelector("#BE_flight_origin_date")).click();
	driver.findElement(By.cssSelector(".day-container>.day-container-table>.BE_flight_origin_date>:nth-of-type(3)>:nth-of-type(3) span")).click();


	}

}
