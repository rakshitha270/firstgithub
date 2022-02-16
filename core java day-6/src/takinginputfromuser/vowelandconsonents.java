package takinginputfromuser;


	import java.util.Scanner;

	public class vowelandconsonents {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a character");
			char ch=sc.nextLine().charAt(0);
			char x=Character.toUpperCase(ch);

			if((x=='A' || x=='E' || x=='I' || x=='O' || x=='U')) {
				System.out.println(ch+" is vowel");
			}
			else {
				System.out.println(ch+" is consonant");
			}
		}
}
