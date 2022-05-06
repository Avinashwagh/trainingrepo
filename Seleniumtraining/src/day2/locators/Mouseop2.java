package day2.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://globalsqa.com/demo-site/");
	List<WebElement> mainmenu=driver.findElements(By.xpath("//div[@id='mobile_menu']/ul/li/a"));
	System.out.println("main menu of options counts:"+mainmenu.size());
	Actions acts=new Actions(driver);
	mouseHover(acts,mainmenu);
	mouseHoverWithcords(acts,mainmenu.get(1));
	rightClick(acts,mainmenu.get(1));
		

	}

	  static void rightClick(Actions acts, WebElement options) throws InterruptedException  {
		System.out.println("options name count:"+options.getText());
		acts.moveToElement(options).contextClick().build().perform();
		
	}

	static void mouseHoverWithcords(Actions acts, WebElement options) throws InterruptedException {
		System.out.println("options name count:"+options.getText());
	   acts.moveToElement(options,100,0).perform();
		
		
	}

	static void mouseHover(Actions acts, List<WebElement> mainmenu) throws InterruptedException {
		for(int i=0;i<mainmenu.size();i++) {
			WebElement options=mainmenu.get(i);
			acts.moveToElement(options).perform();
			Thread.sleep(1000);
		}
	}

}
