
public class P6_RectangleSim {
	public static void main(String args[]){
		  P6_Rectangle r = new P6_Rectangle(3, 4);		  
		  P6_Circle c = new P6_Circle(5);
		  System.out.println("Rectangle Area : "+r.calcArea());
		  System.out.println("Cicle Area : "+c.calcArea());
		  
		  P6_Shape dy = new P6_Rectangle(4,5);
		  P6_Shape hs = new P6_Circle(6);
		  
		  System.out.println();
		  if(dy instanceof P6_Shape && dy instanceof P6_Rectangle){
			  System.out.println(dy.toString());
		  }
		  
		  if(hs instanceof P6_Shape && hs instanceof P6_Shape){
			  System.out.println(hs.toString());
		  }
		  System.out.println();
		  if(dy.getClass()==P6_Rectangle.class){
			  System.out.println(" Rectangle True!");
		  }
		  if(hs.getClass()==P6_Circle.class){
			  System.out.println(" Circle  True!!");
		  }
		  
		  P6_Shape[] s=new P6_Shape[2];
		  s[0]=r;
		  s[1]=c;
		  
		  System.out.println();
		  for(P6_Shape cdy:s){
			  System.out.println(cdy.toString());
		  }
	  }

}
