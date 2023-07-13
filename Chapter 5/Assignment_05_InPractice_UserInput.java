import java.util.Scanner;

public class Assignment_05_InPractice_UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a large integer that you are just dying to know if it is prime or not");
		if(Assignment_05_InPractice.isAPrime(in.nextInt())) {
			System.out.println("That number is prime");
		} else {
			System.out.println("That number is NOT prime");
		}
		System.out.println();

		int [] a = new int[5];
		System.out.println("Please enter 5 integers");
		for(int i = 0; i < 5; i++) {
			a[i] = in.nextInt();
		}

		if(Assignment_05_InPractice.doesTheArrayMeetCriteria_5_30(a)) {
			System.out.println("There is a location where [i] == i");
		} else {
			System.out.println("There is NOT a location where [i] == i");
		}

		if(Assignment_05_InPractice.majorityElement(a)) {
			System.out.println("The array has a majority element");
		} else {
			System.out.println("The array does NOT have a majority element");
		}

		in.close();

	}

}
