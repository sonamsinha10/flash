package easyLearn;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		
		int n, i,j , temp;
		int arr[]= new int[50];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter total no. of elements");
		n = scan.nextInt();
		
		System.out.println("enter" + n+ "numbers:");
		for(i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.println("sorting array using bubble sort technique..");
		for(i=0; i<(n-1); i++)
		{
			for(j=0; j<(n-i-1); j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		
		//System.out.println("array sorted succesfully..!! \n");
		
		//System.out.println("sorted list in ascending order:");
		for(i=0; i<n; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
