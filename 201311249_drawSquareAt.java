import ch.aplu.turtle.*;
void drawSquareAt(int size, double x, double y){
for(int i=0; i<4; i++){
t1.forward(x);
t1.right(y);
}
}
Turtle t1= new Turtle();
drawSquareAt(50,100,90);