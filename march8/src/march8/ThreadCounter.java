package march8;
 class ThreadCounter implements Runnable 
{
	      int count = 0; 
	     
	         public void run() {
	          while(count<=5000) {
	          
	        	  System.out.println(Thread.currentThread().getName() + ": " + count);
	               count++;
	      }
	     }

	     public static void main(String[] args) 
	     {
	          ThreadCounter th = new ThreadCounter();
	          Thread th1 = new Thread(th);
	          Thread th2 = new Thread(th);
	          th1.start();
	          th2.start();          
	     }
}
