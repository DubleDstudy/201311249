package com.dy.ch8;

public class TurtleSim {

	public static void main(String[] args) {
		
		
		Turtle t1= new Turtle();
		SeaTurtle st = new SeaTurtle();
		LandTurtle lt = new LandTurtle();
		
		t1.setFood("pizza");
		t1.eat();
		st.setFood("chi");
		st.eat();
		lt.eat();
		
		System.out.println(t1.getlimbs());
		System.out.println(st.getlimbs());
		System.out.println(lt.getlimbs());
		
		
		

	}
	

}
