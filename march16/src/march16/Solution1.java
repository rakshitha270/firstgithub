package march16;


	import java.util.*;
	class Solution1
	{
	    public static int evenSum (int m, int n, int k, int N) 
	    {
	    
	        if (k == 1)
	            return n;
	        else
	            return (N - (m - n) * evenSum (m, n, k - 1, n) % (1000000007));
	    }
	  
	    public static void main (String[]args) 
	    {
	        Scanner sc = new Scanner (System.in);
	        int low = sc.nextInt ();
	        int high = sc.nextInt ();
	        int k = sc.nextInt ();
	        int diff = high - low + 1;
	        int out, n, N, m;
	    
	        if (diff % 2 == 0)
	        {
	            m = diff / 2;
	            n = m;
	        }
	        else
	        {
		    
	            if (low % 2 == 0)
	    	    {
	                m = (diff - 1) / 2;
	                n = m + 1;
	            }
	        	else
	    	    {
	                m = (diff + 1) / 2;
	                n = m - 1;
	            }
	        }
	        N = m;
	        for (int i = 0; i < k - 1; i++)
	            N = (N * (m + n)) % 1000000007;
	        out = evenSum (m, n, k, N) % 1000000007;
	        System.out.println (out);
	    } 
	}

