package goShoppingApp;

import java.util.Scanner;

import application.*;
import framework.*;
import application.GSNormalAcc;
public class GoShopping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		int accNo = scan.nextInt();
		System.out.println("Enter the Account Name");
		String accNm = scan.next();
		System.out.println("Enter the charge");
		float charges = scan.nextFloat();
		
		shopfact sf = new GSShopFact();
		while(true) {
			System.out.println("Press 1  prime Account");
			System.out.println("Press 2 Normal Account");
			System.out.println("Any Other Number  Stop");
			System.out.println("Enter your Choice: ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
			sf.getNewprimeAcc(accNo, accNm, charges, true);
			PrimeAcc pa = new GSprimeAcc(accNo , accNm, charges, true);
			pa.bookProduct(charges);
			String s = pa.toString();
			System.out.println(s);
			System.exit(0);
			case 2: 
				sf.getNewNormalAcc(accNo, accNm, charges);
				NormalAcc sr = new GSNormalAcc(ch, accNm, charges);
				sr.bookProduct(charges);
				String n = s.toString();
				System.out.println(n);
				System.exit(0);
			default:
				System.out.println("INVALID ACCOUNT!!");
				System.exit(0);
			}
		}
	}
}