import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheBooksString {

	//My recreation of Figure 20.2
	public static int hash(String key, int tableSize) {
		int hashVal = 0;
		
		for(int i = 0; i < key.length(); i++) {
			hashVal = 37 * hashVal + key.charAt(i);
		}

		hashVal %= tableSize;
		if(hashVal < 0) {
			hashVal += tableSize;
		}
		
		return hashVal;
	}
	
	
	public static void main(String[] args) {
		//TODO Place the code for 20.17 here
		//Create array size of 48447
		String[] dictionary = new String[48447];
		int[] tableArr = new int[48447];
		int iterator = 0;

		//filling dictionary Array
				try {
			Scanner scanner = new Scanner(new File("onlineDictionary.txt"));

			while (scanner.hasNextLine()) {
				dictionary[iterator] = scanner.nextLine();
				iterator++;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < tableArr.length; i++) {
			tableArr[i] = 0;
		}

		for (int i = 0; i < dictionary.length; i++) {
			tableArr[hash(dictionary[i], dictionary.length)] = tableArr[hash(dictionary[i], dictionary.length)] + 1;
		}
		
		System.out.println("Here is your distribution: ");
		for (int i = 0; i < tableArr.length; i++) {
			System.out.println(i + ", " + tableArr[i]);
		}
	}

}
