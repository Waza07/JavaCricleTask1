//created by: Tirupati Rao Medepalli
//Date: Mar-10-2018

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Circle c1 = new Circle();
		System.out.println("Area of Circle1 is:"+ c1.getArea());
		
		c1.setRadius(5);
		System.out.println("Area of Circle1 is:"+ c1.getArea());
		
		//Test the methods created for a circle with radius 2.5
		Circle c2 = new Circle(2.5);
		System.out.println("Radius of Circle 2 is:"+ c2.getRadius());
		System.out.println("Diameter of Circle 2 is:"+ c2.getDiameter());
		System.out.println("Area of Circle2 is:"+ c2.getArea());
		System.out.println("Circumference of Circle2 is:"+ c2.getCircumference());
				
	}

}
