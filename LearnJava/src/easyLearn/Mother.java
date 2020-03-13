package easyLearn;

public class Mother extends Father {
	
	public void Properties() {
		String s1 = "loving and caring";
		System.out.println("Properties of mom:" + "    "+ s1);
	}

	public static void main(String[] args) {

		Mother m = new Mother();
		Father f = new Father();
		f.Home();
		m.Properties();
		f.Properties();
		f.NoOfFamilyMem();
		
		
	}

}
