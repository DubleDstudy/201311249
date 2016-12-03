public class P6_Rectangle extends P6_Shape {
	private double width, height, area, perimeter;
	public P6_Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		this.area = width*height;
		this.perimeter = 2*(width+height);
	}
	public double calcArea(){
		return this.area;
	}
	public double calcPerimeter(){
		return this.perimeter;
	}
	public String toString(){
		return "Rectangle..."+super.toString();
	}
}