public class Rectangle{
private int width;
private int height;
public Rectangle(int w,int h){
this.width=w;
this.height=h;
}
public int getWidth(){
return width;
}
public int getHeight(){
return height;
}
public void setHeight(int h){
height =h;
}
public void setWidth(int w){
width = w;
}
public void setSize(int w, int h){
setWidth(w);
setHeight(h);
}
public int calcArea(){
return width*height;
}
}
Rectangle re = new Rectangle(3,4);
re.calcArea();
System.out.println("size:"+re.calcArea());
re.setSize(4,5);
System.out.println("size:"+re.calcArea());