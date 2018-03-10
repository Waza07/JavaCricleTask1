//created by: Tirupati Rao Medepalli
//Date: Mar-10-2018

public class Circle {

	private double r; //to store radius of circle.
	
	//methods & constructors 
	
	public Circle() {
		r=0.0; //by defalut set radius to something so we have a circle 
	}
	
	public Circle(double radius) {
		r= radius;
	} //end of constructor with radius passed as parameter.

	public double getRadius() {
		return r;
	}

	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getDiameter() {
		
		return r*2.0; //Diameter is twice the radius
	}
	 
	//Area of Circle
	public double getArea() {
		return Math.PI*r*r;
	}
	
	//Circumference of Circle
	public double getCircumference() {
		return Math.PI*2*r;
	}
	
}//end of Cirlce Class
