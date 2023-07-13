
public class Assignment_05_InPractice {

	public static boolean doesTheArrayMeetCriteria_5_30(int [] a) {
		//TODO Add code here that determines whether an integer i exists such that A[i] = i in an array of increasing integers
		//TODO What is the runtime of your algorithm?
		for (int i = 0; i < a.length; i++) {
			if (a[i]==i) {
				return true;
			}
		}
		return false;
	}

	public static boolean isAPrime(int num) {
		//TODO Add code here.  I am assuming you will be dividing all the odd integers up to sqrt(num) and seeing if any leave a 0 remainder
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean majorityElement(int [] a) {
		//TODO Finish this method appropriately 
		int temp;
		int count=0;
		Long startTime = System.nanoTime();
		boolean majority = false;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (int j = 0; j < a.length; j++) {
				if (temp==a[j]) {
					count++;
				}
				if (count>a.length/2){
					majority=true;
				}
			}
			count=0;
		}
		Long endTime = System.nanoTime();
		Long totalTime = endTime - startTime;
		//System.out.println(totalTime);
		return majority;
	}

}
