
 class Rockgame {
	static int user1 = 0;
	static int user2 = 0;
	
	static void Game(String dy, String hs){
	
		if(dy.equals("rock")&& hs.equals("rock")){
			
			System.out.println("draw");
			
			
		}
		else if(dy.equals("rock")&&hs.equals("paper")){
			
			System.out.println("lose");
			user2++;
		}
	
		else if(dy.equals("rock")&& hs.equals("scissors")){
			System.out.println("win");
			user1++;
			
		}
	
		else if(dy.equals("scissors")&& hs.equals("scissors")){
			
			System.out.println("draw");
			
			
		}
		else if(dy.equals("scissors")&&hs.equals("rock")){
			
			System.out.println("lose");
			user2++;
		}
	
		else if(dy.equals("scissors")&& hs.equals("paper")){
			System.out.println("lose");
			user1++;
			
		}
		else if(dy.equals("paper")&& hs.equals("paper")){
			
			System.out.println("draw");
			
			
		}
		else if(dy.equals("paper")&&hs.equals("rock")){
			
			System.out.println("lose");
			user2++;
		}
	
		else if(dy.equals("paper")&& hs.equals("rock")){
			System.out.println("win");
			user1++;
			
		}
	}
public static void Score(){
	if(user1>user2){
		
	System.out.println("CDY:"+user1);
	}
	else{
		System.out.println("Khs:"+user2);
	}
}
	
public static void main(String[] args) {
	
	System.out.println("gameStart");
	String dy ="rock";
	String hs ="paper";
	System.out.println("CDY:"+dy);
	System.out.println("KHS:"+hs);
	Game(dy, hs);
	System.out.println("-------------");
	Score();
	

	}
	
}