package easyLearn;

public class Trapezium1 {

	public static void main(String[] args) {
    
		int count1=0, count2=0;
		int N=4;
		for(int i=N;i>=1;i--) {
			for(int j=N; j>i; j--)
				System.out.println("");
			
			for(int k=1;k<=i;k--)
				System.out.println(++count1+"*");
			
			for(int l=1;l<=i;l++) {
				
				System.out.println(++count2+i*i);
				if(l!=i)
					System.out.println("*");
			}
			System.out.println();
				
		}
	}

}
