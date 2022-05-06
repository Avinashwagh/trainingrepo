package Broweseroperation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdriver22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1=".";
        String path2=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path2);
        
      FirefoxDriver gdriver= new FirefoxDriver();
	}

}
