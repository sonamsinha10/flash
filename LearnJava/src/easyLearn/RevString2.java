package easyLearn;

public class RevString2 {

	public static void main(String[] args) {

		String str= "ABCD";
		String rev="";
		char a[]= str.toCharArray();
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("reverse string is:"+ rev);
	}

}
