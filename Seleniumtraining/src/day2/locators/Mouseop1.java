package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseop1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		                  WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		                 username.sendKeys("admin");
             Actions act=new Actions(driver);
             act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
             WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
             act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
             WebElement adress=driver.findElement(By.cssSelector(".ng-pristine.ng-valid.ng-touched "));
             adress.sendKeys("at jamner,jalgoan");
	}

}
