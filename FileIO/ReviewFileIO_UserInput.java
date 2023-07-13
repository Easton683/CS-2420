package FileIO;
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewFileIO_UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Scrabble Helper program");
		System.out.println("I can help you find words that might give you a huge score bonus!");
		System.out.println("Please enter a string representing what the word should start with");
		String pre = in.next();
		System.out.println("Please enter a string representing what the word should end with");
		String post = in.next();
		System.out.println("Here are those words:");
		ArrayList<String> words = ReviewFileIO.findWords("words3.txt", pre, post);
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println("I wish you many happy points");
		

	}
}
