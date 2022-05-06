package Broweseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="C:\\javaworkspace\\Seleniumtraining\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
        String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", path3);
        
       WebDriver driver=new ChromeDriver();
       

	}

}
