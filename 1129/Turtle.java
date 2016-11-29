package com.dy.ch8;

public class Turtle{
  protected int nlimbs=4;
  protected String food;
  
  public void setFood(String f){
    this.food= f;
    
   }
 
  public int getlimbs(){
	  return nlimbs;
  }
   
   public void eat(){
    System.out.println("Turtle eats"+food);
   }
   
}
