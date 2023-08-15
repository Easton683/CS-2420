import java.util.HashMap;
import java.util.Random;

public class Assignment_08_21_BigOh {

	public static void main(String[] args) {
		System.out.println("Creating and filling arrays");
		
		//This creates arrays of increasing size
		Integer [] a = new Integer[10000];
		Integer [] b = new Integer[100000];
		Integer [] c = new Integer[1000000];
		Integer [] d = new Integer[100000000];
//		Integer [] e = new Integer[1000000000];

		//This fills the arrays with data and returns a k to look for
		//Note - to properly test the runtime, the k will be the worst case scenario and not be found
		Integer kA = fillArrayForAssignment8_21(a);
		Integer kB = fillArrayForAssignment8_21(b);
		Integer kC = fillArrayForAssignment8_21(c);
		Integer kD = fillArrayForAssignment8_21(d);
//		Integer kE = fillArrayForAssignment8_21(e);
		
		System.out.println("Ready to run the methods");
		
		//TODO: Time and plot each of the following individually.
		Assignment_08.doTheNumbersAddToK_NSquared(a, kA);
		Assignment_08.doTheNumbersAddToK_NSquared(b, kB);
		Assignment_08.doTheNumbersAddToK_NSquared(c, kC);
		Assignment_08.doTheNumbersAddToK_NSquared(d, kD);
//		Assignment_08.doTheNumbersAddToK_NSquared(e, kE);
		

		Assignment_08.doTheNumbersAddToK_NLogN(a, kA);
		Assignment_08.doTheNumbersAddToK_NLogN(b, kB);
		Assignment_08.doTheNumbersAddToK_NLogN(c, kC);
		Assignment_08.doTheNumbersAddToK_NLogN(d, kD);
//		Assignment_08.doTheNumbersAddToK_NLogN(e, kE);
		
		
		System.out.println("Finshed running all methods");
	}

	
	//This method creates a worst case scenario for assignment 8 21
	//Note all locations contain positive values and the k returned is a negative value
	public static Integer fillArrayForAssignment8_21(Integer [] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		return -1;
	}

	
}
