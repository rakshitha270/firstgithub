package day12;


	import java.util.LinkedList;
	public class LinkedListDemo2 
	{
	   public static void main(String[] args) 
	   {
		   LinkedList<String> l=new LinkedList<>();
		   l.add("Rakshitha");
		   l.add("Jai");
		   l.add("DBOSS");
		   l.add("Darshan");
		   l.add("Thoogudeepa");
		   System.out.println(l);
		   System.out.println("the elements in the linked list are");
		   for (int i = 0; i < l.size(); i++) 
		   {
			   System.out.println(l.get(i));
		   }
}
	}
