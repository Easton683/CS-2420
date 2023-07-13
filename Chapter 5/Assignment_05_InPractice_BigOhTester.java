import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Assignment_05_InPractice_BigOhTester {

	public static int [] generateSortedArray(int size) {
		Random r = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			if(size < 1000000) {
				a.add(r.nextInt() % (size*10));
			}else {
				a.add(r.nextInt());
			}
		}
		Collections.sort(a);
		int [] b = new int[size];
		for(int i = 0; i < b.length; i++) {
			b[i] = a.get(i);
		}

		return b;
	}
	
	public static int [] generateMajorityElement(int size) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			a.add((int)(Math.random()*size));
		}
		Collections.sort(a);

		int spot = (int)(Math.random()*size);
		int numToDo = (int)(size/2.0); //Already 1 in the array
		int i = spot+1;
		while(i < a.size() && a.get(i) == a.get(spot)) {
			numToDo--;
			i++;
		}
		i = spot-1;
		while(i >= 0 && a.get(i) == a.get(spot)) {
			numToDo--;
			i--;
		}
		i = 0;
		while(i < numToDo) {
			int r = (int)(Math.random()*size);
			if(a.get(r) != a.get(spot)) {
				i++;
				a.set(r, a.get(spot));
			}
		}
		Collections.shuffle(a);
		int [] b = new int[size];
		for(i = 0; i < b.length; i++) {
			b[i] = a.get(i);
		}
		return b;
	}


	public static void main(String[] args) {

		int [] numbers = {100,1000,10000,100000};//TODO You may need to get rid of this last number if it takes too long

		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("5.30: Median time for size %,10d", numbers[i]);
			ArrayList<Long> times = new ArrayList<Long>();
			for(int j = 0; j < 10; j++) {
				int [] a = generateSortedArray(numbers[i]);

				long startTime = System.nanoTime();
				Assignment_05_InPractice.doesTheArrayMeetCriteria_5_30(a);
				long stopTime = System.nanoTime();
				long duration = stopTime - startTime;
				times.add(duration);

			}
			Collections.sort(times);
			System.out.println(" is: " + times.get(times.size()/2));

		}

		ArrayList<Long> times;
		long startTime;
		long stopTime;
		long duration;

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",5);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(17);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(17);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(19);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(19);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(19);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(19);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(23);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",10);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(557);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(809);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(751);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(787);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(947);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(839);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(571);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(859);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(557);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(733);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",15);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(25819);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(21701);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29959);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(25183);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(23753);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29059);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(30941);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(23029);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(22567);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(29717);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",20);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(644747);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(835421);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(836821);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(709211);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(689771);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(1031911);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(980197);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(849217);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(739397);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(761597);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",25);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(26157629);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(19039649);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(25169929);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(30449383);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(28065949);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(31941199);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(17439619);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(27746501);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(27128587);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(22757599);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));

		times = new ArrayList<Long>();
		System.out.printf("Prime: Median time for num bits %,5d",30);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(1066464323);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(632987779);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(637998443);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(764474197);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(1005534659);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(681242959);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(937648541);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(581858957);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(626997347);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		startTime = System.nanoTime();
		Assignment_05_InPractice.isAPrime(912945239);
		stopTime = System.nanoTime();
		duration = stopTime - startTime;
		times.add(duration);
		Collections.sort(times);
		System.out.println(" is: " + times.get(times.size()/2));


		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Majority Element: Median time for size %,10d", numbers[i]);
			times = new ArrayList<Long>();
			for(int j = 0; j < 10; j++) {
				int [] a = generateSortedArray(numbers[i]);

				startTime = System.nanoTime();
				Assignment_05_InPractice.majorityElement(a);
				stopTime = System.nanoTime();
				duration = stopTime - startTime;
				times.add(duration);

			}
			Collections.sort(times);
			System.out.println(" is: " + times.get(times.size()/2));

		}



	}

}
