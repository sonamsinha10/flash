package easyLearn;
import java.util.Scanner;
public class Summation {

	public static void main(String[] args) {
		
		int i, sum = 0;
		int arr[] = new int [10];
		
		System.out.println("enter 10 numbers");
		
		Scanner ob = new Scanner(System.in);
		
		for(i=0;i<10;++i)
			arr[i] = ob.nextInt();
		
				i=0;
				while(i<10) {
					++i;
				if(i==6) {
				
					break;
				}
					sum= sum+arr[i];
				}
				
				System.out.println("sum of numbers is:" +sum);

	}

}
