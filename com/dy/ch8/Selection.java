package com.dy.ch8;
public class Selection {
	Selection(){
		System.out.println("First : Rectangle! Second : Cube!");		
	}
		
	public void select(Rectangle r){
		r.setSelected(true);
		System.out.println("selected : "+ r.isSelected);
	}
	
	public static void main(String[] args) {
		Selection s = new Selection();
		
		
		Rectangle r = new Rectangle(20,30);			
	
		
		s.select(r);
		
		
		
	}



}
