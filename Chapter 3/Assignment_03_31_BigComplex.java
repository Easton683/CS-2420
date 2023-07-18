import java.math.BigDecimal;
import java.util.Random;

public class Assignment_03_31_BigComplex {
	
	public BigDecimal real;
	public BigDecimal imaginary;

	public Assignment_03_31_BigComplex() {
		//TODO this constructor should represent the number 0+0i
		//Note - Be sure to use BigDecimals's!
		real = new BigDecimal("0");
		imaginary = new BigDecimal("0");
	}
	public Assignment_03_31_BigComplex(BigDecimal real) {
		//TODO this constructor should represent the number real+0i
		this.real = real;
		imaginary = new BigDecimal("0");
	}
	public Assignment_03_31_BigComplex(BigDecimal real, BigDecimal imaginary) {
		//TODO this constructor should represent the number real+imaginary i
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Assignment_03_31_BigComplex(String s) {
		//TODO this constructor should represent the number shown in the String - Assume the number will be something like "4.6" or "4.6 + 8.35i"
		if(s.contains(" + ")){
			real = new BigDecimal(s.substring(0, s.indexOf(" + ")));
			imaginary = new BigDecimal(s.substring(s.indexOf(" + ")+3, s.length()-1));
		}else {
			real = new BigDecimal(s);
			imaginary = BigDecimal.ZERO;
		}
	}

	public static Assignment_03_31_BigComplex add(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of adding a and b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		Assignment_03_31_BigComplex c = new Assignment_03_31_BigComplex(a.real.add(b.real),a.imaginary.add(b.imaginary));
		return c;
		
	}
	
	public static Assignment_03_31_BigComplex subtract(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of subtracting b from a.  I.e. a-b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		Assignment_03_31_BigComplex c = new Assignment_03_31_BigComplex(a.real.subtract(b.real),a.imaginary.subtract(b.imaginary));
		return c;
	}

	public boolean equals(Assignment_03_31_BigComplex a) {
		//TODO - I am adding this equals method so that you can have a slightly easier time thinking about equality before you tackle the next method
		if (this.real.equals(a.real)){
			if (this.imaginary.equals(a.imaginary)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public boolean equals(Object a) {
		//TODO - This method should follow a similar pattern to the example in the book - where you check if a is actually a complex number
		if (!(a instanceof Assignment_03_31_BigComplex)){
			return false;
		} 
		Assignment_03_31_BigComplex aCheck = (Assignment_03_31_BigComplex) a;
		if (aCheck.imaginary.equals(this.imaginary)) {
			if (aCheck.real.equals(this.real)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		//TODO - this method should return the string representation of the number.  My main method assumes there will be a space around both sides of the plus sign, but no space before the i
		//NOTE: This method needs to work correctly so that almost all the tests work!!!!!
		//NOTE: Also, don't just always put the i part on - only if i isn't 0
		//NOTE: You do NOT have to convert the + to a - if the imaginary part is negative!!! 
		String realString = this.real.toString();
		if (this.imaginary.toString().equals("0")) {
			return realString;
		} else {
			return (realString + " + " + this.imaginary.toString() + "i");
		}
	}
	
	
}
