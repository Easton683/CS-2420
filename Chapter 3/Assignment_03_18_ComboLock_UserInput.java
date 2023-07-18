import java.util.Random;
import java.util.Scanner;

public class Assignment_03_18_ComboLock_UserInput {

	public static void main(String[] args) {
		System.out.println("Welcome to Dr B's Automatic Combo Protection");
		System.out.println("As this is your first contact with our system, please enter 3 integers to secure your locker");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		Assignment_03_18_ComboLock mine = new Assignment_03_18_ComboLock(a,b,c);
		System.out.println("Lock created and secured");

		boolean keepGoing = true;
		while(keepGoing) {
			System.out.println("Please select from the following:");
			System.out.println("\tType 1 to open the locker - Locker automatically closes and locks");
			System.out.println("\tType 2 to change the combo");
			System.out.println("\tType -1 to exit");
			int choice = in.nextInt();
			if(choice == 1) {
				System.out.println("Please enter your locks current 3 integers");
				a = in.nextInt();
				b = in.nextInt();
				c = in.nextInt();
				if(mine.open(a, b, c)) {
					System.out.println("Locker successfully opened, and will automatically close and lock");
				}
				else {
					System.out.println("Your attempt was incorrect.  As you sure this is your locker?  Santa may be notified upon further incorrect entries");
				}
			}
			else if (choice == 2) {
				System.out.println("Please enter your locks current 3 integers");
				a = in.nextInt();
				b = in.nextInt();
				c = in.nextInt();
				System.out.println("Please enter the 3 integers for your new combination");
				int d = in.nextInt();
				int e = in.nextInt();
				int f = in.nextInt();
				
				if(mine.changeCombo(a, b, c, d, e, f)) {
					System.out.println("Combination successfully changed");
				}
				else {
					System.out.println("Your attempt was incorrect.  As you sure this is your locker?  Santa may be notified upon further incorrect entries");
				}
			}
			else {
				System.out.println("Thank you for using Dr. B's Automatic Combo Protection");
				keepGoing = false;
			}
			System.out.println();
		}
		System.out.println("System exiting");
	}

}
