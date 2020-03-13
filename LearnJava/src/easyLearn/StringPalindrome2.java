package easyLearn;
import java.util.Scanner;

public class StringPalindrome2 {

	public static void main(String[] args) {
		
		String reverse="";
		System.out.println("enter string");
		Scanner sc= new Scanner(System.in);
		String original=sc.nextLine();
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
			if(original.equalsIgnoreCase(reverse)) {
				System.out.println("String is pallindrome");
			}else {System.out.println("String is not pallindrome");
		}
		

	

}}
