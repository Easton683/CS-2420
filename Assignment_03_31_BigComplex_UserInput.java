import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Assignment_03_31_BigComplex_UserInput {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Dr. B's Complex Number Calculator");
		System.out.println("Please enter the real and imaginary parts of your first complex numbers as a double");
		double r1 = in.nextDouble();
		double r2 = in.nextDouble();
		
		System.out.println("Please enter the real and imaginary parts of your second complex numbers as a double");
		double r3 = in.nextDouble();
		double r4 = in.nextDouble();
		
		Assignment_03_31_BigComplex first = new Assignment_03_31_BigComplex(new BigDecimal(r1), new BigDecimal(r2));
		Assignment_03_31_BigComplex second = new Assignment_03_31_BigComplex(new BigDecimal(r3), new BigDecimal(r4));
		
		System.out.println("I show you entered the following numbers:");
		System.out.println(first.toString());
		System.out.println(second.toString());
		
		System.out.println("Equality:");
		if(first.equals(second)) {
			System.out.println("These numbers are equal");
		} else {
			System.out.println("These numbers are NOT equal");
		}
		System.out.println("Addition:");
		System.out.println(first.toString() + " + " + second.toString() + " = " + Assignment_03_31_BigComplex.add(first, second).toString());
		System.out.println("Subtraction:");
		System.out.println(first.toString() + " - " + second.toString() + " = " + Assignment_03_31_BigComplex.subtract(first, second).toString());
	}
}
