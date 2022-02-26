package day14;


	import java.util.*;
	public class VectorDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vector<String> vec = new Vector<String>(4);  
	       
	        vec.add("ABC");  
	        vec.add("XYZ");  
	        vec.add("PQR");  
	        vec.add("SRK");  
	      
	        System.out.println("Size is: "+vec.size());  
	        System.out.println("Default capacity is: "+vec.capacity());  
	         
	        System.out.println("Vector element is: "+vec);  
	        vec.addElement("dog");  
	        vec.addElement("Cat");  
	        vec.addElement("monkey");  
	        
	        System.out.println("Size after addition: "+vec.size());  
	        System.out.println("Capacity after addition is: "+vec.capacity());  
	       
	        System.out.println("Elements are: "+vec);  
	             
	          if(vec.contains("ABC"))  
	          {  
	             System.out.println("ABC is present at the index " +vec.indexOf("ABC"));  
	          }  
	          else  
	          {  
	             System.out.println("ABC is not present in the list.");  
	          }  
	          
	        System.out.println("The first element of the vector is = "+vec.firstElement());   
	       
	        System.out.println("The last element of the vector is = "+vec.lastElement());   
		}

	}

