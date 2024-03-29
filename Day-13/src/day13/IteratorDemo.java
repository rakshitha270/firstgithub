package day13;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class IteratorDemo {

      void Display(List<String>list) {
    	  Iterator<String> obj= list.iterator();
    	  while(obj.hasNext()) {
    		  System.out.println("Element is: " +obj.next());
    	  }
      }
      
     public static void main(String[]args) {
    	 List<String>oj=new LinkedList<>();
    	 oj.add("Rakshi");
    	 oj.add("RSK");
    	 oj.add("PSR");
    	 oj.add("QSR");
    	 oj.add("XYZ");
    	 System.out.println("Element is: " +oj);
           IteratorDemo id = new IteratorDemo();
           oj.sort(null);
           id.Display(oj);
           System.out.println("###########################");
            Collections.reverse(oj);
            id.Display(oj);
}
}
