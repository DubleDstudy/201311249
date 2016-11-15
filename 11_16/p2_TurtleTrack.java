import java.util.ArrayList;
import ch.aplu.turtle.*;
class p2_TurtleTrack{
	static void turtletrack(){
		Turtle t1= new Turtle();
	ArrayList<Double[]> posArr = new ArrayList<Double[]>();
	int i=0;
	while(i<4){
		Double[] pos = new Double[2];
		pos[0] = t1.getX();
		pos[1] = t1.getY();
		
		posArr.add(pos);
		t1.forward(100);
		t1.right(90);
		i++;
		
		}
	for(Double[] d:posArr){
	    System.out.printf("(%.1f,%.1f)", d[0],d[1]);
		}
	}
	public static void main(String[] args){
		
		turtletrack();
	}
	
}