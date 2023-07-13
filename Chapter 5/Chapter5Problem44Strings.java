
public class Chapter5Problem44Strings {

	public static void main(String[] args) {

		System.gc();
		Long startTime = System.nanoTime();
		makeLongString1(100000);
		Long endTime = System.nanoTime();
		Long totalTime = endTime - startTime;
		System.out.println(totalTime);

		System.gc();
		startTime = System.nanoTime();
		makeLongString2(100000);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

	//TODO List the BigOh Runtime Here: O(N)
	public static String makeLongString1( int N )
	{
		String result = "";
		for( int i = 0; i < N; i++ )
			result += "x";
		return result;
	}

	//TODO List the BigOh Runtime Here: O(N^2)
	public static String makeLongString2( int N )
	{
		StringBuilder result = new StringBuilder( "" );
		for( int i = 0; i < N; i++ )
			result.append( "x" );
		return new String( result );
	}

}
