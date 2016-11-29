package com.dy.ch8;
public class Circle extends Point{
	double radius;
	double pai=3.141592;
	
	public Circle(int x,int y,double radius){
		super(x,y);
		
		this.radius=radius;
		
		
	}
	
	
	double getArea(){
		
		return (radius*radius)*pai;
		
		
	}
	

}
