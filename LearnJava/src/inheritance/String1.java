package inheritance;
import java.lang.String;

public class String1 extends Searching {
	
	public void charAt() {
		String s = "sonam";
		System.out.println(s.charAt(3));
		
	}
	public void compareTo() {
		String s2 = "rachel";
		String s3= "ross";
		System.out.println(s3.compareTo(s2));
		
	}
	
	public static void main(String[] args) {
		String1 s1 = new String1();
		s1.charAt();
		
		String1 s4 = new String1();
		s4.compareTo();
		
	}

}