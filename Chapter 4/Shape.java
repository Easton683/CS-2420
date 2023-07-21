
public abstract class Shape {
	double x;
	double y;
	public abstract double area( );
	public abstract double perimeter( );

	public double semiperimeter( ) {
		return perimeter( ) / 2; 
	}

	public static double distance(Shape s1, Shape s2) {
		//TODO finish this method - The tester code assumes that shapes will be placed with the putShapeHere method
		double xDistance = s1.x - s2.x;
		double yDistance = s1.y - s2.y;
		double hypoNoSqrt = Math.pow(xDistance, 2) + Math.pow(yDistance, 2);
		double hypo = Math.sqrt(hypoNoSqrt);
		return hypo;
	}

	public void putShapeHere(double x, double y) {
		//TODO: This is how you will be getting the information from the test program as to where the shape should be
		//You need to do something with this information
		this.x = x;
		this.y = y;
	}

}
