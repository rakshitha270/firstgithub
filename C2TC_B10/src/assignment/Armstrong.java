package assignment;

public class Armstrong {

	public static void main(String[] args) {
	     int num=153;
	     int rem,result=0;
	     int temp=num;
	     while(temp!=0)
	     {
	    	 rem=temp%10;
	    	 result=result+rem*rem*rem;
	    	 temp=temp/10;
	    			 
	     }
	     if(result==num)
	     {
	    	 System.out.println(num +" is a armstrong number");
	     }
	     else
	     {
	    	 System.out.println(num +" is not a armstrong number");
	     }
	}

}
