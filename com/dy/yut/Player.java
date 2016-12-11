package com.dy.yut;
public class Player {
	protected String name=null;
    private int num=0;
    public Player(String _name) {
        name=_name;
    }
    public void play() {
    		
      Dice d=new Dice();
       
      d.roll();
     
      this.num=d.getNum();
        
        
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}