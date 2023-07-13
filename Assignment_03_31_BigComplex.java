import java.math.BigDecimal;
import java.util.Random;

public class Assignment_03_31_BigComplex {
	
	public Assignment_03_31_BigComplex() {
		//TODO this constructor should represent the number 0+0i
		//Note - Be sure to use BigDecimals's!
	}
	public Assignment_03_31_BigComplex(BigDecimal real) {
		//TODO this constructor should represent the number real+0i
	}
	public Assignment_03_31_BigComplex(BigDecimal real, BigDecimal imaginary) {
		//TODO this constructor should represent the number real+imaginary i
	}
	
	public Assignment_03_31_BigComplex(String s) {
		//TODO this constructor should represent the number shown in the String - Assume the number will be something like "4.6" or "4.6 + 8.35i"
	}

	public static Assignment_03_31_BigComplex add(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of adding a and b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		return null;
	}
	
	public static Assignment_03_31_BigComplex subtract(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of subtracting b from a.  I.e. a-b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		return null;
	}

	public boolean equals(Assignment_03_31_BigComplex a) {
		//TODO - I am adding this equals method so that you can have a slightly easier time thinking about equality before you tackle the next method
		return Math.random() < 0.5;
	}

	@Override
	public boolean equals(Object a) {
		//TODO - This method should follow a similar pattern to the example in the book - where you check if a is actually a complex number
		return Math.random() < 0.5;
	}
	
	@Override
	public String toString() {
		//TODO - this method should return the string representation of the number.  My main method assumes there will be a space around both sides of the plus sign, but no space before the i
		//NOTE: This method needs to work correctly so that almost all the tests work!!!!!
		//NOTE: Also, don't just always put the i part on - only if i isn't 0
		//NOTE: You do NOT have to convert the + to a - if the imaginary part is negative!!! 
		return "TODO";
	}
	
	
}
