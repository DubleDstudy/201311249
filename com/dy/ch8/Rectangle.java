package com.dy.ch8;
public class Rectangle {

	protected double length;
  protected double width;
	protected boolean isSelected;
	
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}
	
	public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    
	public void setSelected(boolean b){
		System.out.println("Select Rectangle!");
		isSelected = b;
	}
	
	public boolean getSelected(){
		return isSelected;
	}


}
