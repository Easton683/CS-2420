import java.util.Scanner;

public class Assignment_01_20_UserInput {

	public static void main(String[] args) {
		System.out.println("Welcome to the Roman Empire");
		System.out.println("All numbers must be converted!");
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer to convert to Roman Numerals, or a negative number to quit");
		int a = in.nextInt();
		while(a >= 0) {
			System.out.println("Your Roman Numeral number is: " + Assignment_01_20.convertToRoman(a));
			
			System.out.println("Please enter another integer, or a negative number to quit");
			a = in.nextInt();
		}
		
		in.close();
	}

}
