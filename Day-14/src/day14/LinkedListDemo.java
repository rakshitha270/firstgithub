package day14;

	import java.util.Iterator;
	import java.util.LinkedList;
	public class LinkedListDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList<String> al=new LinkedList<String>();  
			  al.add("Rakshitha");  
			  al.add("sharathk");  
			  al.add("Raksha");  
			  al.add("Bharath");  
			  
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  
		}

	}

