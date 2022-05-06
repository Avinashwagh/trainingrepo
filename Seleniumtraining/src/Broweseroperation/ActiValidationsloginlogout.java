package Broweseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiValidationsloginlogout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actiTime.com/login.do");
		
		WebElement usernameinputfield=driver.findElement(By.id("username"));
		System.out.println("username input field visiblity status is:"+usernameinputfield.isDisplayed());
		System.out.println("username input field editable status is: "+usernameinputfield.isEnabled());
		String ActualdefaultTextonusernamefield=usernameinputfield.getAttribute("placeholder");
		System.out.println("Actual default Text on username  field:"+ActualdefaultTextonusernamefield.equals("username"));
		usernameinputfield.sendKeys("admin");
		
		WebElement passwordinputfield=driver.findElement(By.name("pwd"));
		System.out.println("password input visiblity status is :"+passwordinputfield.isDisplayed());
		System.out.println("password input  editable field is:"+passwordinputfield.isEnabled());
		String ActualDefaulttextonpasswordfield=passwordinputfield.getAttribute("placeholder");
		System.out.println("Actual default text on password field:"+ ActualDefaulttextonpasswordfield.equals("password"));
		passwordinputfield.sendKeys("manager"); 
		
	
		
	//	driver.findElement(By(className))
	//	driver.findElement(By.id("loginbutton")).click();
		//loginbutton.click();
		
	}
	

}
