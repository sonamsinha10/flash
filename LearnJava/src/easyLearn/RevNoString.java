package easyLearn;

import java.util.Scanner;

public class RevNoString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");

		
		int num = sc.nextInt();
		
		StringBuffer ob = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=ob.reverse();
		System.out.println("rev no");

		System.out.println(rev);
	}

}
