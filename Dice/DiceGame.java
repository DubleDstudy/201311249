
class DiceGame {
    Player p1; //플레이어1
    Player p2; // 플레이어2
    private int PointA=0;//플레이어 1의 점수
    private int PointB=0;//플레이어 2의점수
    private String Name1,Name2; //플레이어 이름
    public DiceGame(String N1, String N2){
    	this.p1 = new Player(Name1);
    	this.p2 = new Player(Name2);
    	Name1= N1;
    	Name2= N2;
    	
    }
    public void sort(){
    	if(PointA>PointB){
    		System.out.println(Name1+" : " + PointA+"p\n"+ Name2+ " : " + PointB+"p\n");    	}
    	else if(PointA<PointB){
    		System.out.println(Name2+" : " + PointB+"p\n"+ Name1+ " : " + PointA+"p\n");
    	}
    	else 
    		System.out.println(Name1+" : " + PointA+"p\n"+ Name2+ " : " + PointB+"p\n");
    }
    	
    public void startGame() {
        Player p1 = new Player("CDY");
        Player p2 = new Player("KHS");
        
        p1.play();
        p2.play();
        if (p1.getNum() > p2.getNum()) {
            System.out.println(p1.getName() + " won");
            PointA++;
            sort();
        }
        else if (p1.getNum() == p2.getNum()) {
            System.out.println(" draw");
            sort();
        }
        else if(p1.getNum() < p2.getNum())
        {
            System.out.println(p2.getName() + " won");
        	PointB++;
        	sort();
        }
    }
}