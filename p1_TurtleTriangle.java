
import ch.aplu.turtle.*;
 class p1_TurtleTriangle {
	enum Shape{TRIANGLE,SQUARE};
	
	static void drawSquareOrTriangle(int size, int sides , double angle){
		Turtle t1 = new Turtle();
			t1.home();
		  t1.clear();
		  for(int i=0;i<sides;i++){
		     t1.forward(size);
		     t1.right(angle);
		     
		     }	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sel = Shape.TRIANGLE;
		int size = 100;
		int sides = 0;
		double angle = 0;
		switch(sel){
		   
		   case TRIANGLE:
		       sides =3;
		       angle=120;
		       break;
		   case SQUARE:
		       sides =4;
		       angle=90;
		       break;
		   }
			
			drawSquareOrTriangle(100,sides,angle);
	}
 }
  

	

  