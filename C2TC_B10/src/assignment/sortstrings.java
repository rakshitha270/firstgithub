package assignment;

import java.util.Arrays;

import java.util.Scanner;
public class sortstrings {
	private static Scanner sc;
	private static Scanner sc2;
public static void main(String[] args) {
	sc = new Scanner(System.in);
	sc2 = new Scanner(System.in);
	
	System.out.print("Enter the Total Strings you enter = ");
	int Size = sc.nextInt();
	
	String str[] = new String[Size];
	
	System.out.format("Enter %d Strings one by one\n", Size);
	for(int i = 0; i < Size; i++) 
	{
		str[i] = sc2.nextLine();
	}
	
	Arrays.sort(str);
	
	System.out.format("\nAfter Sorting the String Alphabetically\n");
	for(String s: str) 
	{
		System.out.print(s + "  ");
	}
}
}

       