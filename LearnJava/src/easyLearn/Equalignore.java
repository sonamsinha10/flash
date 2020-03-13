package easyLearn;

public class Equalignore {

	public static void main(String[] args) {
 
		String s1="INDIAN";
		String s2="INDIAN";
		String s3="indian";
        String s4="bharat";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

	}

}
