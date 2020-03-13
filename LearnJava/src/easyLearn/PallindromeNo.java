package easyLearn;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		
		int num=sc.nextInt();
		int origNo=num;
		int rev = 0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}

		if(origNo==rev) {
			
			System.out.println(origNo+ " pallindrome no.");
		}
		else {
			System.out.println(origNo+ " not a pallidrome no");
		}
	}

}
