
public class DrBsAlgorithmAnalysis {

	public static void main(String[] args) {
		timeCodeOnAMethodThatNeedsAnInt(10,45,new SimpleMethod());
	}


	public static void timeCodeOnAMethodThatNeedsAnInt(int numTimesForAverage, 
														int largestBigOhArrayIndex,
														DrBsFunctor f) {

		//An integer array that gradually increases in terms of big oh times
		//sizes.length = 45 currently
		final int [] sizes = {2,3,4,6,8,12,16,24,32,48,64,96,128,192,256,384,512,768,1024,1536,2048,3072,4096,6144,8192,12288,16384,24576,32768,49152,65536,98304,131072,196608,262144,393216,524288,786432,1048576,1572864,2097152,3145728,4194304,6291456,8388608};

		//watch out for too large a size
		if(largestBigOhArrayIndex > sizes.length) {
			largestBigOhArrayIndex = sizes.length;
		}
		

		//It seems the first time doesn't work well with timing....
		//So time something to get the system warmed up;
		long startTime = System.nanoTime();
		f.runThisFuctionThatNeedsAnInt(sizes[largestBigOhArrayIndex/2]);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " Bogus Time\n");

		//Now do the real work
		for(int z = 0; z < largestBigOhArrayIndex; z++) {
			Long [] times = new Long[numTimesForAverage];
			for(int i = 0; i < numTimesForAverage; i++) {
				System.gc();

				startTime = System.nanoTime();
				f.runThisFuctionThatNeedsAnInt(sizes[z]);
				endTime   = System.nanoTime();
				totalTime = endTime - startTime;

				addIntoSortedArray(times, totalTime);
			}
			long averageTime = times[numTimesForAverage/2];
			String s = String.format("Trial, %4d, input size, %10d, average time, %10d", z, sizes[z], averageTime);
			System.out.println(s);
			//Test code to see if sorting works correctly
//			if(z == largestBigOhArrayIndex-1) {
//				for(int i = 0; i < numTimesForAverage; i++) {
//					System.out.println(times[i]);
//				}
//			}
		}
	}

	
	public static void addIntoSortedArray(Long [] a, long x) {
		int spot = -1;
		for(int i = 0; i < a.length; i++) {
			if (a[i] == null || a[i] > x) {
				spot = i;
				break;
			}
		}
		//found a spot, so let's shift the array to put x into its spot
		if(spot > -1) {
			for(int i = a.length-1; i > spot; i--) {
				a[i] = a[i-1];
			}
			a[spot] = x;
		}
	}
}

class SimpleMethod implements DrBsFunctor{

	@Override
	public void runThisFuctionThatNeedsAnInt(int a) {
		//createArrayAndFillWithRandom(a);
		closestNumbers(a);
	}

	public static void closestNumbers(int size) {
		int [] a = createArrayAndFillWithRandom(size);
		//TODO
		//create some code that will check which two numbers are
		//the closest in value in array "a"
		//What do you expect the runtime to be?
	}
	
	public static int[] createArrayAndFillWithRandom(int size) {
		int [] a = new int[size];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*Integer.MAX_VALUE/2);
		}
		return a;
	}

}
