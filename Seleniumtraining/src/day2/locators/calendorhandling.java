package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import utilities.seleniumutilities;
import utilities.seleniumutility;

public class calendorhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumutility s1=new seleniumutility();
		WebDriver driver=s1.setUp("chrome", "https://www.makemytrip.com/");
		//close login pop up
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select any date from next month
		driver.findElement(By.cssSelector("44a4bxedxPwGQtSnEzGzdejnCdtrDJqkJ6uqWwGbXmdx5zrjGdHivmr9pyd7x8rVQMgumwGPCfuwseieCg8tuN5jNNeMJPU")).click();

	}

}
