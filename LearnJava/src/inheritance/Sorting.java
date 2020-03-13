package inheritance;

public class Sorting {

	public void bubbleSort() {
		
		System.out.println("this is sorting class");

		
		int n, i , j , temp;
		int arr[] = {28, 53, 5, 60, 7,2};
		n = 6;
		
	
	for(i=0; i<=5; i++) {
		{
			for(j=0;j<5-i;j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	for(i=0;i<6;i++) {
		System.out.println(arr[i]);
	}
	}
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.bubbleSort();
		
	}

}
