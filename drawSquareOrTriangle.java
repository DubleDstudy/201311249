import ch.aplu.turtle.*;
class p1_TurtleTriangle{
 enum Shape{TRIANGLE,SQUARE}
 Shape sel = Shape.TRIANGLE;
  int size = 100;
  int sides;
  double angle;
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
  void drawSquareOrTriangle(int size,int sides, double angle){
     t1.home();
     t1.clear();
     for(int i=0;i<sides;i++){
        t1.forward(size);
        t1.right(angle);
        
        }
  }
  public static void main(String[] args){
 


    Turtle t1 = new Turtle();
 
  
    drawSquareOrTriangle(100,sides,angle);
    }
  
  }