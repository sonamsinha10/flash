package bjs;

public class Cricket {
    public void FavPlayer(){
    	System.out.println("dhoni");
    	
    }
    public void FavBowler(){
    	System.out.println("bumrah");
    	
    }
    
    public void FavFielder(){
    	System.out.println("jadeja");
    	
    }
    
	public static void main(String[] args) {
      
		Cricket ball = new Cricket();
		ball.FavPlayer();
		ball.FavFielder();
		ball.FavBowler();
		

	}

}
