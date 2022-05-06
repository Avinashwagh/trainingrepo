package Broweseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cromebroweser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="C:\\javaworkspace\\Seleniumtraining\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
        String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", path3);
        
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.get("https://www.facebook.com");
       driver.get("https://www.myntra.com");
     //  String sourcecode=driver.getPageSource();
    //   System.out.println("drivers source sode:"+sourcecode);
       System.out.println("Applications current url:"+driver.getCurrentUrl());
       System.out.println("Applications current title:"+driver.getTitle());
       if(driver.getTitle().equals("Google")) {
    	   System.out.println("Google search page get open successfully");
       }else {
    	   System.out.println(" Either Google search not open successfully or title got changed");
       }
     //  driver.close();
	}

}
