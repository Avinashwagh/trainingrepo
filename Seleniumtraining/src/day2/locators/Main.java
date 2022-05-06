package day2.locators;

public class Main {

	public static void main(String[] args) {
		
int num=31,i=2;
 boolean flag = false;
 while(i<=num/2) {
	 if(num%2==0) {
		 flag=true;
		 break;
	 }
	 ++i;
	 
 }
 if(!flag) {
	 System.out.println("The num is prime..");
	 
 }else {
	 System.out.println("The num is not a prime...");
 }
		 
	}

}
