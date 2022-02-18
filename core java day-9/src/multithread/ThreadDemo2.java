package multithread;
class P extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
    
	}
}
class Q extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
}
}
class R extends Thread{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
}
class D implements Runnable{
	public void run() {
		System.out.println("Current ID of A:" + Thread.currentThread().getId());
	}
}

public class ThreadDemo2 {
	public static void main(String[]args) {
		P p=new P();
		p.start();
		Q q=new Q();
		q.start();
		R r=new R();
		r.start();
		D d=new D();
		Thread th=new Thread(d);
		th.start();
		System.out.println("ID of Main Method:" + Thread.currentThread().getId());
		
	}
}



