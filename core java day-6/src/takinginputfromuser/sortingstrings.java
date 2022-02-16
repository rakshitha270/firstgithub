package takinginputfromuser;
import java.util.Arrays;
import java.util.Scanner;

public class sortingstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		sortingstrings ss=new sortingstrings();
		String res=ss.sortstrings(s);
		System.out.println(res);
	}
	String sortstrings(String str) {
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr); 
	}
}