import java.util.Scanner;

public class Assignment_01_17_UserInput {

	public static void main(String[] args) {
		System.out.println("Door prizes awarded - but not randomly");
		System.out.println();
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the age of the next 4 pretend students who come through the door:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		System.out.println("The first prize goes to the person with the age of: " + Assignment_01_17.max(a, b, c) + ", which, coincidentally, is the oldest person of first 3 people you entered above");
		System.out.println("The next prize goes to the person with the age of: " + Assignment_01_17.max(a, b, c, d) + ", which, coincidentally, is the oldest person of first 4 people you entered above");
		
		in.close();
	}

}
