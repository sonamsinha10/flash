package easyLearn;

public class CountNumbers {

	public static void main(String[] args) {

		int num=123478879;
		
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("total digits in the no: " + count );
	}

}
