package Broweseroperation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class operationsbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String geckoDriverpath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
        String ChromeDriverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        
        openbrowser(geckoDriverpath,"firefox");
        openbrowser(ChromeDriverpath,"chrome");
        
	}

	static void openbrowser(String path, String browserName) {
		
	if(browserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();                      //Runtime polymorphism acheived(proper example of Runtime polymorphism)
		
	} else if(browserName.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",path);
		WebDriver driver= new FirefoxDriver();  
		 driver.get("https://www.facebook.com");                                         
		                                                 //Runtime polymorphism acheived(proper example of Runtime polymorphism)
		driver.close();
		
	}
		
		
	}
		
	}
	
        
        
	


