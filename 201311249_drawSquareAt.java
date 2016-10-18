import ch.aplu.turtle.*;
void drawSquareAt(int size, double x, double y){
for(int i=0; i<4; i++){
t1.forward(size);
t1.right(90);
}
}
Turtle t1= new Turtle();
drawSquareAt(50,100,90);