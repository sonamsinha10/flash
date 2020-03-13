package easyLearn;

public class Father {
	
	public void Home() {
		String s1 = "Laxmi nagar Bhopal";
		System.out.println("Home:"+ "                 " +s1);
	}
	
	public void Properties() {
		String s2 = "Humble & Kind";
		System.out.println("Properties of Father:" + " " +s2);
	}
	
	public void NoOfFamilyMem() {
		int a = 5;
		System.out.println("No Of Family members:" + " "+a);
	}
	public static void main(String[] args) {
   
		Father f = new Father();
		f.Home();
		f.Properties();
		f.NoOfFamilyMem();
		
	}

}
