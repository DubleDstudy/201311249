package com.dy.yut;
import java.util.Date;  
class Game {
    protected Player p1; //�÷��̾�1
    protected Player p2; // �÷��̾�2
    private static int PointA=0;//�÷��̾� 1�� ����
    private static int PointB=0;//�÷��̾� 2������
    private String Name1,Name2; //�÷��̾� �̸�
    public Game(String N1, String N2){
    	Name1= N1;
    	Name2= N2;
    	
    	this.p1 = new Player(Name1);
    	this.p2 = new Player(Name2);
    	
    	
    	
    	
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
    public void Date(){			//���ó�¥�� �ҷ��´�.
    	Date now = new Date();  
  		System.out.println(now);  
    	
    }
    	
    public void startGame() {
    		Date();
    		p1.play();
    		p2.play();
    		
    		
    		sort();
    		
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