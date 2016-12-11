package com.dy.yut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.util.*;

public  class GameGui extends JFrame implements ActionListener{
	
	JButton throw1,throw2;
	
	JButton clear;
	
	JLabel Nickname1;
	JLabel Nickname2;
	JTextField resultvalue1, resultvalue2;
	JTextField point1,point2;
	JTextField gameset;
	int Pointtwt1,Pointtwt2;
	int score1=0;
	int score2 =0;
	String ending="end!";

	
	
	Player player1,player2;


	public GameGui(String name1,String name2){
		this.player1= new Player(name1);
		this.player2 = new Player(name2);
		JPanel up=new JPanel(new GridLayout(2,3));
		JPanel middle = new JPanel(new GridLayout(1,2));
		JPanel down = new JPanel(new  GridLayout(1,2));
		Nickname1 = new JLabel(name1);
		Nickname2 = new JLabel(name2);
		
		throw1 = new JButton("throw1!");
		throw2 = new JButton("thorw2!");
		
		resultvalue1 = new JTextField(" ");
		resultvalue2 = new JTextField(" ");
		
		point1 = new JTextField("point1");
		point2 = new JTextField("point2");
		clear = new JButton("clear?");
		gameset = new JTextField("winner?");
		
		
		
		
		up.add(Nickname1);
		up.add(throw1);
		up.add(resultvalue1);
		up.add(Nickname2);
		up.add(throw2);
		up.add(resultvalue2); // up부분 패널 만들기
		
		middle.add(point1);
		
		middle.add(point2); //미들 부분 만들기
		
		down.add(clear); //다운부분 만들기
		down.add(gameset);
		
		throw1.addActionListener(this);
		throw2.addActionListener(this);
		clear.addActionListener(this);
		
		add(up,BorderLayout.PAGE_START);
		add(middle,BorderLayout.CENTER);
		add(down,BorderLayout.PAGE_END);
		setTitle("Yut!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		
		pack();
		setVisible(true);
	}
	
		

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == throw1){
			
			Yut tw = new Yut();
			tw.roll();
			
			
			if(tw.getNum()==1){
				
				resultvalue1.setText("도");
				
			}
			else if(tw.getNum()==2){
			
				
				resultvalue1.setText("개");
				
				
			}
			else if(tw.getNum()==3){
				
				
				resultvalue1.setText("걸");
				
				
			}
			else if(tw.getNum()==4){
				
				
				resultvalue1.setText("윷 한번더 하세여!");
				
				
			}
			else if(tw.getNum()==5){
				
				
				resultvalue1.setText("모 한번더 하세여!");
				
			}
			if(score1>=20){
				gameset.setText(player1.getName()+"이김");
			
				
				
			}
			else if(score1<20){
				
				point1.setText(Integer.toString(score1));
				
			}
			else if(score1==score2){
				resultvalue2.setText("잡앗다한번더!");
				score1=0;
				point1.setText(Integer.toString(score1));
				
			}
			
			score1+=tw.getNum();
			point1.setText(Integer.toString(score1));
				}
		
			
		else if(e.getSource()==throw2){
			Yut tw = new Yut();
			tw.roll();
			
			if(tw.getNum()==1){
				
				resultvalue2.setText("도");
				
			}
			else if(tw.getNum()==2){
			
				
				resultvalue2.setText("개");
				
				
			}
			else if(tw.getNum()==3){
				
				
				resultvalue2.setText("걸");
				
				
			}
			else if(tw.getNum()==4){
				
				
				resultvalue2.setText("윷! 한번더 하세여!");
				
				
			}
			else if(tw.getNum()==5){
				
				
				resultvalue2.setText("모 한번더 하세여!");
			
			}
			
			if(score2>=20){
				gameset.setText(player2.getName()+"이김");
				
				
			}
			else if(score2<20){
				point2.setText(Integer.toString(score2));
			}
			else if(score2==score1){
				resultvalue1.setText("잡앗다한번더!");
				score2=0;
				point2.setText(Integer.toString(score2));
				
			}
				score2+=tw.getNum();
			
				point2.setText(Integer.toString(score2));
		
			
			}
		
		else if(e.getSource()==clear){
				score1 = 0;
				score2 = 0;
				resultvalue1.setText(Integer.toString(score1));
				resultvalue2.setText(Integer.toString(score2));
				point1.setText(Integer.toString(score1));
				point2.setText(Integer.toString(score2));
				gameset.setText("winner?");
			
				}
	
		
		
		
		
		
	}
}
