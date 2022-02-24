package day13;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class JavaCollections{
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
           JavaCollections jc = new JavaCollections();
    	      jc.Display(oj);
     }
}


