public class P6_Circle extends P6_Shape {
	private double radius =  3.141592;
	private double half,area,perimeter;
	public P6_Circle(double half){
		this.half = half;
		this.area = half*half*radius;
		this.perimeter = 2*(radius*half);
	}	
	public double calcArea() {		
		return area;
	}	
	public double calcPerimeter() {		
		return perimeter;
	}
	public String toString(){
		return "Circle..."+super.toString();
	}
}