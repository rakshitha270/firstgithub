package takinginputfromuser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrom {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str1=br.readLine();
		char arr1[]=str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		String str2=new String(arr2);
		if(str1.equals(str2)==true) {
			System.out.println("The given string is a Palindrome");
		}
		else {
			System.out.println("The given string is not a Palindrome");
		}
	}
}