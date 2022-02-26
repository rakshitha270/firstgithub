package day14;


	import java.util.*;
	public class ListIteratorDemo1 {
		public static void main(String[] argv) throws Exception
	    {
	        try {
	  
	           
	            ArrayList<String> arrlist = new ArrayList<String>();
	  
	          
	            arrlist.add("Angel");
	            arrlist.add("Beautiful");
	            arrlist.add("Crazy");
	            arrlist.add("Funny");
	            arrlist.add("Fantastic");
	  
	          
	            System.out.println("ArrayList: "  + arrlist);
	  
	            ListIterator<String>
	                iterator = arrlist.listIterator(2);
	  
	           
	            System.out.println("\nUsing ListIterator" + " from Index 2:\n");
	            while (iterator.hasNext()) {
	                System.out.println("Value is : " + iterator.next());
	            }
	        }
	  
	        catch (IndexOutOfBoundsException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	    }
	}

