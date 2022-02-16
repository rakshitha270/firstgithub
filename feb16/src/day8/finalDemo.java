package day8;

class A{
	int a=10;
	final void m1() {
		a=15;
		System.out.println("print the value a"+a);
	}
	void m2() {
		System.out.println(" I am in method2");
				}
	}
public class finalDemo extends A{
	
	@override
	void m2() {
	System.out.println("I am method m2 of finalDemo");
	}
	public static void main(String[]args) {
		A a= new A();
		finalDemo fd= new finalDemo();
		a.m1();
		a.m2();
		fd.m1();
	}
}
