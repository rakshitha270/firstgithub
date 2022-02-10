package rakshitha;
import java.util.Scanner;

class D {
	void m1() {
		System.out.println("I am in method 1");
	}
}
public class ScannerClassDemo{
	
	public static void main(String[]args) {
		System.out.println("Enter the number 1");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Entered value for number 1"+ x);
		D a=new D();
		a.m1();
	}
}