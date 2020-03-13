package easyLearn;

public class StringPallindrome1 {

	public static void main(String[] args) {
		
		String a = "eye", b="";
		int n=a.length();
		for(int i=n-1; i>=0;i--) {
			b=b+a.charAt(i);
			}
		if(a.equalsIgnoreCase(b)) {
			
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}

	}

}
