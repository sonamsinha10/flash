package easyLearn;

import java.util.Scanner;

public class RevNoStringBuilder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("reverse is " + rev);
	}

}
