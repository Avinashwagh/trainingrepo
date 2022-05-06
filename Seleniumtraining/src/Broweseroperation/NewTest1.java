package Broweseroperation;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void testCase5() {
	  System.out.println("hi, i am testcase5 ");
	  displayDetails();
	  
  }
  @Test
  public void testcase6() {
	  System.out.println("hi ,i am testcase6");
	  displayDetails();
  }
  void displayDetails() {
	  System.out.println(" i am display method of details...");
  }
}
