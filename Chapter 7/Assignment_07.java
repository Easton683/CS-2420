import java.util.Scanner;

public class Assignment_07 {
	
	public static int Ackerman(int m, int n) {
		if (m==0) {
			return n+1;
		} else if (m>0&&n==0){
			return Ackerman(m-1,1);
		} else if (m>0&&n>0){
			return Ackerman(m-1,Ackerman(m,n-1));
		} else {
			return -1;
		}
	}
	
	public static int numberOfOnesInBinaryRepresentation(int num) {
		if (num==0) {
			return 0;
		} else if (num%2==1){
			return numberOfOnesInBinaryRepresentation(num/2)+1;
		} else {
			return numberOfOnesInBinaryRepresentation(num/2);
		}
	}

	public static void printReverse(Scanner in) {
		if (in.hasNextLine()) {
			String line = in.nextLine();
			printReverse(in);
			System.out.println(line);
		} else {
			in.close();
		}
	}
	
}
