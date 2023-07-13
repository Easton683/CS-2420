package FileIO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReviewFileIO_Tester {

	public static void main(String[] args) {
		System.out.println("If you are using a mac, let me know if it doesn't work, because I might not have tested it on a mac yet");

		System.out.println("Starting tests for writeWordsToNewFile method");
		try {
			String [] a = {"If", "debugging", "is", "the", "process", "of", "removing", "software", "bugs,", "then", "programming", "must", "be", "the", "process", "of", "putting", "them", "in.", "Edsger", "Dijkstra"};
			String [] b = {"Computer", "science", "education", "cannot", "make", "anybody", "an", "expert", "programmer", "any", "more", "than", "studying", "brushes", "and", "pigment", "can", "make", "somebody", "an", "expert", "painter.", "Eric", "S.", "Raymond"};
			String [] c = {"Computers", "are", "good", "at", "following", "instructions,", "but", "not", "at", "reading", "your", "mind.", "Donald", "Knuth"};
			ArrayList<String> a1 = new ArrayList<String>();
			ArrayList<String> a2 = new ArrayList<String>();
			ArrayList<String> a3 = new ArrayList<String>();

			a1.addAll(Arrays.asList(a));
			a2.addAll(Arrays.asList(b));
			a3.addAll(Arrays.asList(c));

			delFile("writingOutput1.txt");
			delFile("writingOutput2.txt");
			delFile("writingOutput3.txt");

			//ReviewFileIO.writeWordsToNewFile(null, null);  //There is enough to do without this complication

			ReviewFileIO.writeWordsToNewFile(a1, "writingOutput1.txt");
			ReviewFileIO.writeWordsToNewFile(a2, "writingOutput2.txt");
			ReviewFileIO.writeWordsToNewFile(a3, "writingOutput3.txt");

			compareFiles("writingTest1.txt", "writingOutput1.txt");
			compareFiles("writingTest2.txt", "writingOutput2.txt");
			compareFiles("writingTest3.txt", "writingOutput3.txt");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending tests for writeWordsToNewFile method");

		System.out.println("Starting tests for whatIsTheWord method");
		String [] words = {"rigged", "shroffing", "sidler", "drinking", "compas", "kolkhoznik", "charity", "soubises", "inducement", "remnants" };
		try {
			for(int i = 0; i < words.length; i++) {
				if(!words[i].equals(ReviewFileIO.whatIsTheWord("words1.txt", i))) {
					throw new Exception("Error with whatIsTheWord method: Expecting " + words[i] + " for position " + i + " received " + ReviewFileIO.whatIsTheWord("words1.txt", i));
				}
			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			for(int i = 0; i < 10; i++) {
				int num = words.length + (int)(Math.random()*10);
				if(ReviewFileIO.whatIsTheWord("words1.txt", num) != null) {
					throw new Exception("Error with whatIsTheWord method for too large a number: Expecting null instead of " + ReviewFileIO.whatIsTheWord("words1.txt", num));
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			for(int i = 0; i < 10; i++) {
				int num = -1*(int)(Math.random()*100)-1;
				if(ReviewFileIO.whatIsTheWord("words1.txt", num) != null) {
					throw new Exception("Error with whatIsTheWord method for too small a number: Expecting null instead of " + ReviewFileIO.whatIsTheWord("words1.txt", num));
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		testLargeFile();

		System.out.println("Ending tests for whatIsTheWord method");

		System.out.println("Starting tests for findWordsOfThisSize method");

		try {
			delFile("words1_6.txt");
			delFile("words1_9.txt");
			delFile("words2_3.txt");
			delFile("words2_9.txt");

			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWordsOfThisSize("words1.txt", 6), "words1_6.txt");
			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWordsOfThisSize("words1.txt", 9), "words1_9.txt");
			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWordsOfThisSize("words2.txt", 3), "words2_3.txt");
			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWordsOfThisSize("words2.txt", 9), "words2_9.txt");

			compareFiles("words1_6.txt", "words1_6_expected.txt");
			compareFiles("words1_9.txt", "words1_9_expected.txt");
			compareFiles("words2_3.txt" ,"words2_3_expected.txt");
			compareFiles("words2_9.txt", "words2_9_expected.txt");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Ending tests for copyWordsToNewFile method");

		System.out.println("Starting tests for findWords method");

		try {
			delFile("writingOutput4.txt");
			delFile("writingOutput5.txt");
			delFile("writingOutput6.txt");

			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWords("words3.txt", "ba", "er"), "writingOutput4.txt");
			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWords("words3.txt", "e", "y"), "writingOutput5.txt");
			ReviewFileIO.writeWordsToNewFile(ReviewFileIO.findWords("words3.txt", "g", "m"), "writingOutput6.txt");

			compareFiles("writingTest4.txt", "writingOutput4.txt");
			compareFiles("writingTest5.txt", "writingOutput5.txt");
			compareFiles("writingTest6.txt" ,"writingOutput6.txt");

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending tests for findWords method");

	}

	public static void compareFiles(String f1, String f2) throws Exception{
		String methodCall = null;
		int exitCode = 0;
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			methodCall = "fc";
		}
		else {
			methodCall = "diff";
		}

		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(methodCall + " " + f1 + " " + f2);

		BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

		String s = input.readLine();
		while(s != null) {
			s = input.readLine();
		}
		int exitVal = pr.waitFor();
		//System.out.println("The exit value for " + command + " is " + exitVal);
		if(exitVal != exitCode){
			throw new Exception("The following files don't match like they should: " + f1 + " " + f2);
		}
		//System.out.println("Exited with error code "+exitVal);
	}


	public static void delFile(String filename) {
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			delFilesWindows(filename);
		}
		else {
			delFilesMac(filename);
		}
	}

	private static void delFilesWindows(String filename){
		delTheFile("cmd /c del", filename, 0);
	}
	private static void delFilesMac(String filename){
		delTheFile("rm", filename, 0);
	}

	private static void delTheFile(String delCommand, String file, int exitCode) {
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec(delCommand + " " + file).waitFor();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("\tUnable to delete old file: " + file + ". Don't worry about this if you haven't created it yet");
		}
	}


	public static void testLargeFile() {
		try {
			if(!"cangues".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1250))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'cangues'for 1250 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1250) +"'");
			}
			if(!"anestrus".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1490))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'anestrus'for 1490 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1490) +"'");
			}
			if(!"altarpiece".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3292))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'altarpiece'for 3292 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3292) +"'");
			}
			if(!"eschewer".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2887))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'eschewer'for 2887 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2887) +"'");
			}
			if(!"subparts".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3198))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'subparts'for 3198 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3198) +"'");
			}
			if(!"poverties".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1684))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'poverties'for 1684 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1684) +"'");
			}
			if(!"criterium".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3029))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'criterium'for 3029 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3029) +"'");
			}
			if(!"metaphases".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2642))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'metaphases'for 2642 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2642) +"'");
			}
			if(!"headpin".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1593))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'headpin'for 1593 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1593) +"'");
			}
			if(!"pinheadedness".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2815))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'pinheadedness'for 2815 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2815) +"'");
			}
			if(!"exterminates".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2625))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'exterminates'for 2625 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2625) +"'");
			}
			if(!"spiraling".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3080))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'spiraling'for 3080 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3080) +"'");
			}
			if(!"plater".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2566))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'plater'for 2566 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2566) +"'");
			}
			if(!"shirty".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3933))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'shirty'for 3933 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3933) +"'");
			}
			if(!"excised".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3381))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'excised'for 3381 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3381) +"'");
			}
			if(!"provincials".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1246))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'provincials'for 1246 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1246) +"'");
			}
			if(!"collyria".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1047))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'collyria'for 1047 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1047) +"'");
			}
			if(!"ruddinesses".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3251))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'ruddinesses'for 3251 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3251) +"'");
			}
			if(!"copyholder".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3207))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'copyholder'for 3207 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3207) +"'");
			}
			if(!"verso".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3821))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'verso'for 3821 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3821) +"'");
			}
			if(!"acetamides".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1088))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'acetamides'for 1088 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1088) +"'");
			}
			if(!"anapaest".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2662))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'anapaest'for 2662 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2662) +"'");
			}
			if(!"numbnesses".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3680))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'numbnesses'for 3680 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3680) +"'");
			}
			if(!"deadlifts".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3955))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'deadlifts'for 3955 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3955) +"'");
			}
			if(!"otherguess".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3843))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'otherguess'for 3843 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3843) +"'");
			}
			if(!"waterscape".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3875))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'waterscape'for 3875 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3875) +"'");
			}
			if(!"sheikdoms".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1867))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'sheikdoms'for 1867 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1867) +"'");
			}
			if(!"impuissances".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3589))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'impuissances'for 3589 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3589) +"'");
			}
			if(!"turnoff".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3827))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'turnoff'for 3827 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3827) +"'");
			}
			if(!"pedicured".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1377))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'pedicured'for 1377 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1377) +"'");
			}
			if(!"quarreler".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3124))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'quarreler'for 3124 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3124) +"'");
			}
			if(!"pintadas".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3386))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'pintadas'for 3386 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3386) +"'");
			}
			if(!"sensitometers".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3028))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'sensitometers'for 3028 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3028) +"'");
			}
			if(!"lavatory".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2924))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'lavatory'for 2924 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2924) +"'");
			}
			if(!"bigwigs".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3920))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'bigwigs'for 3920 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3920) +"'");
			}
			if(!"riveting".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3599))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'riveting'for 3599 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3599) +"'");
			}
			if(!"peridotite".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2793))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'peridotite'for 2793 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2793) +"'");
			}
			if(!"fermate".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1905))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'fermate'for 1905 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1905) +"'");
			}
			if(!"plaistered".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2285))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'plaistered'for 2285 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2285) +"'");
			}
			if(!"interaction".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2012))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'interaction'for 2012 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2012) +"'");
			}
			if(!"crossarms".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3024))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'crossarms'for 3024 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3024) +"'");
			}
			if(!"capercailzie".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1642))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'capercailzie'for 1642 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1642) +"'");
			}
			if(!"outgrows".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1981))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'outgrows'for 1981 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1981) +"'");
			}
			if(!"agnations".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3446))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'agnations'for 3446 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3446) +"'");
			}
			if(!"babbled".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2275))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'babbled'for 2275 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2275) +"'");
			}
			if(!"impossibly".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1477))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'impossibly'for 1477 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1477) +"'");
			}
			if(!"loggerhead".equals(ReviewFileIO.whatIsTheWord("words2.txt", 2766))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'loggerhead'for 2766 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 2766) +"'");
			}
			if(!"gospellers".equals(ReviewFileIO.whatIsTheWord("words2.txt", 1334))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'gospellers'for 1334 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 1334) +"'");
			}
			if(!"chloroses".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3642))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'chloroses'for 3642 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3642) +"'");
			}
			if(!"leishmaniases".equals(ReviewFileIO.whatIsTheWord("words2.txt", 3406))) {
				throw new Exception("Error with whatIsTheWord() method on the words2.txt file.  Expected 'leishmaniases'for 3406 received '" + ReviewFileIO.whatIsTheWord("words2.txt", 3406) +"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
