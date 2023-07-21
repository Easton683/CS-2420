
public class Square extends Shape implements Comparable<Square>{

	private double length;
	//TODO 4.33 - get this entire class working correctly
	public Square( double sideLength ) {
		if (sideLength < 0) {
			throw new IllegalArgumentException("Length cannot be negative");
		}else {
		length = sideLength;
		}
	}

	@Override
	public int compareTo(Square o) {
		//Assume squares are differentiated by the length of their side
		//Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
		double result = this.length-o.length;
		return (int)result;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return length*4;
	}


}
