import java.util.Arrays;

public class Assignment_08 {


	//8.21
	public static boolean doTheNumbersAddToK_NSquared(Integer [] a, int k) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == k) {
					return true;
				}
			}
		}
		return false;

	}
	
	public static boolean doTheNumbersAddToK_NLogN(Integer [] a, int k) {
		Arrays.sort(a);
		int endIndex = a.length - 1;
		int startIndex = 0;
		int currentSum;
		while (startIndex<endIndex) {
			currentSum = a[startIndex] + a[endIndex];
			if (currentSum == k) {
				return true;
			}else if(currentSum<k){
				startIndex++;
			}else{
				endIndex--;
			}
		}
		return false;
	}
	
	//8.27
	public static <AnyType extends Comparable<? super AnyType>> int howManyNonDuplicates(AnyType [] a) {
		for( int p = 1; p < a.length; p++ )
        {
            AnyType tmp = a[ p ];
            int j = p;

            for( ; j > 0 && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }

		int uniqueCount = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                uniqueCount++;
            }
        }
        return uniqueCount;
		
	}
	
	//8.33
	public static boolean areTheseAnagrams(String s1, String s2) {
		//To make it more interesting, let's remove all spaces
		s1 = s1.replaceAll(" ",  "");
		s2 = s2.replaceAll(" ",  "");

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if(s1.length()!=s2.length()){
			return true;
		}

		char[] s1Char = new char[s1.length()];
		char[] s2Char = new char[s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			s1Char[i] = s1.charAt(i);
		}

		for (int i = 0; i < s2.length(); i++) {
			s2Char[i] = s2.charAt(i);
		}

		Arrays.sort(s1Char);
		Arrays.sort(s2Char);

		return Arrays.equals(s1Char,s2Char);
	}

}
