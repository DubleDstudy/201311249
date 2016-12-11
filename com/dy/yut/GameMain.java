package com.dy.yut;
import java.util.Scanner;

public class GameMain {  
	  
   
  	 public static void main(String[] args){  
  		 
  		Yut y =new Yut();
  		y.roll();
  		 	
  		 while(true){
  			 Scanner sc = new Scanner(System.in);
  	  		 System.out.println("Dice : 1 or yut : 2 exit : 3");
  	  		 int select = sc.nextInt();
  	  		 System.out.println("선택하셨습니다.");
  	  		 if(select == 3 ){
  	  			
  	  			System.out.println("goodbye");
  	  			 break;
  	  			 }
  	  		 System.out.println("이름을 입력하세요");
  	  		 Scanner name1 = new Scanner(System.in);
 	  		 String player1 = name1.next();
 	  		 System.out.printf("또입력하세요");
	  		 Scanner name2 = new Scanner(System.in);
	  		 String player2 = name2.next();
	  	
  	  		 if(select == 1){  			
  	  			 	Game d = new Game(player1,player2);
	  			 d.startGame();
	  		 } 
  	  		 else if(select==2){
  	  			 GameGui daeyoung = new GameGui(player1,player2);
  	  			
  	  		 	}
  	  		 
  	  		 }
  	  		 
  	  				 
  		 }  		 
  	 }     
   