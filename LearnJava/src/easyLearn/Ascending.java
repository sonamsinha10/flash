package easyLearn;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {

		int n, i,j , temp;
		int arr[]= new int[10];
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter total no. of elements");
		n = ob.nextInt();
		
		System.out.println("enter" + n+ "numbers:");
		for(i=0; i<n; i++)
		{
			arr[i] = ob.nextInt();
		}

		
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
		
		
		for(i=0; i<n; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

	}


