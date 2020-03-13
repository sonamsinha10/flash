package bjs;

public class GlobalVar {
	
	int c;
	public void addition() {
		int a = 30;
		int b = 20;
		c= a+b;
	
	System.out.println(c);
	}
   
	public void sub() {
		int x = 20;
		int y = 10;
		c = x-y;
		System.out.println(c);
		
	}
	 public void multiply() {
		 int a = 10;
		 int b = 20;
		 c= a*b;
		 System.out.println(c);
	 }
	public static void main(String[] args) {
    GlobalVar ob = new GlobalVar();
    		ob.addition();
            ob.sub();
            ob.multiply();
	}

}
