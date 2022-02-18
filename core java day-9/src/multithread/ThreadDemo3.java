package multithread;
class  X extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
    
	}
}
class Y extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
}
}
class Z extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
}
class S implements Runnable{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
}

public class ThreadDemo3 {
	public static void main(String[]args) {
		X x=new X();
		x.start();
		Y y=new Y();
		y.start();
		Z z=new Z();
		z.start();
		S s=new S();
		Thread th=new Thread(s);
		th.start();
		for(int i=0;i<3;i++)
		System.out.println("ID of Main Method:" + Thread.currentThread().getId());
		
	}
}



