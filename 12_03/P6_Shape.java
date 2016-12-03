public abstract class P6_Shape {
	public String name = "Shape";
	  public abstract double calcArea();
	  public abstract double calcPerimeter();
	  public String getName(){return this.name;}
	  public String toString(){
	    return "Shape..."+super.toString();
	  }
	  	  
	  
}