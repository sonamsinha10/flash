package easyLearn;

public class Math {
	
	public void profit(){
		int cp= 20, sp= 30,profitres=sp-cp;
		int propercentage = (profitres*100)/cp;
		System.out.println("profit:"+ profitres);
		System.out.println("profit percentage="+ propercentage);
		
	}
	
	public void speed(){
		
		
		int distance=3;
		int time=3;
		int speedres= distance/time;
		System.out.println("speed="+speedres);
	}
	
public void distance(){
		
		int speed=2;
		
		int time=3;
		int distanceres= speed*time;
		System.out.println("distance="+distanceres);
}

	public static void main(String[] args) {

		
		Math cal = new Math();
		cal.profit();
		cal.speed();
		cal.distance();
		
	}

}
