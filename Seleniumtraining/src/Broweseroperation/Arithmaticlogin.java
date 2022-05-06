package Broweseroperation;

//import org.openga.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openga.selenium.weblement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arithmaticlogin {

	public static void main(String[] args) {
	
String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver.", driverpath);
WebDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
String expectedTitle="actiTime-Login";
String actualTitle=driver.getTitle();
if(actualTitle.equals(expectedTitle)) {
	System.out.println("login page opened successfully");
     }else {
    	 System.out.println("either page login not opened or page title got changed...");
}
		
	}

}
