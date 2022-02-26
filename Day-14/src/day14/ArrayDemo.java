package day14;
import java.util.ArrayList;
public class ArrayDemo {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>(); 
	  list.add("ABC");//Adding object in    
	  list.add("PSR");    
	  list.add("BPQ");    
	  list.add("SRR");    
	  for(String fruit:list)    
	    System.out.println(fruit);   
}
}