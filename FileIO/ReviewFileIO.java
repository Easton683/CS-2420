package FileIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ReviewFileIO {

	//I have listed this method first, because it needs to be working properly before my autograder can check the other methods
	//For auto-grading - each word should be on it's own line, and have a windows newline \r\n after it
	public static void writeWordsToNewFile(ArrayList<String> words, String outputFilename) {
try {
      	File myObj = new File(outputFilename);
         BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));
			for (int i = 0; i < words.size()-1; i++) {
				writer.append(words.get(i));
				writer.append("\r\n");
      }
      		writer.append(words.get(words.size()-1));
        writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	}

	//This method should return null if the wordNumber is too large, or too small
	//This method should assume an array number style.  I.e. the first word is number 0
	public static String whatIsTheWord(String inputFilename, int wordNumber) {
		try {
		Scanner s = new Scanner(new File(inputFilename));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
			list.add(s.next());
		}
		s.close();
		if (wordNumber>=list.size()||wordNumber<0){
			return null;
		}else{
			return list.get(wordNumber);
		}
		} catch (Exception e) {
			System.out.println("File does not exist");
			return null;
		}
	}

	//This method should look through the file and find words that are of appropriate size
	public static ArrayList<String> findWordsOfThisSize(String inputFilename, int wordSize) {
		ArrayList<String> file = new ArrayList<String>(); //This variable has been created for you, just in case you haven't seen how to do this
		ArrayList<String> words = new ArrayList<String>();
		try{
		Scanner s = new Scanner(new File(inputFilename));
		while (s.hasNext()){
			file.add(s.next());
		}
		for (int j = 0; j < file.size(); j++) {
		if(file.get(j).length() == wordSize) {
			words.add(file.get(j));
		}	
		}
	}catch(Exception e){
		System.out.println(e);
	}
		return words;//Finally you return all those words
	}

	//This method should look in the file represented by inputFilename, and return all the words matching the prefix and postfix
	public static ArrayList<String> findWords(String inputFilename, String prefix, String postfix){

		ArrayList<String> file = new ArrayList<String>(); 
		ArrayList<String> words = new ArrayList<String>();
		try{
		Scanner s = new Scanner(new File(inputFilename));
		while (s.hasNext()){
			file.add(s.next());
		}
		for (int j = 0; j < file.size(); j++) {
		if(file.get(j).startsWith(prefix)) {
			if (file.get(j).endsWith(postfix)) {
			words.add(file.get(j));	
			}
		}	
		}
	}catch(Exception e){
		System.out.println(e);
	}
		return words;
	}
	
}
