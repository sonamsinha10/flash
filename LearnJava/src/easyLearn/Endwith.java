package easyLearn;

public class Endwith {

	public static void main(String[] args) {
	
		String str = "Welcome to bjshub.com";
		System.out.println(str.endsWith("hub"));
		if(str.endsWith(".com")) {
			System.out.println("String ends with .com");
		} else System.out.println("it does not end woth .com");

	}

}
