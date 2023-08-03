import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SeaTurtle {

	private String name;
	private int numEggs2020;
	private int numEggs2021;
	private int numEggs2022;

	public SeaTurtle(String name){
		this.name = name;
	}

	public SeaTurtle(String name, int numEggs2020, int numEggs2021, int numEggs2022) {
		//TODO finish this constructor
		//The name given in this constructor should match the String returned from the getName method 
		//Probably create room for 3 numbers for the eggs?
		this.name = name;
		this.numEggs2020 = numEggs2020;
		this.numEggs2021 = numEggs2021;
		this.numEggs2022 = numEggs2022;
	}
	
	public String getName() {
		//TODO finish this method
		//The string this method returns should match the string provided to the constructor
		return name;
	}
	
	public void setNumEggs(int whichYear, int numEggs) {
		//TODO finish this method
		//All years should be ignored except the following: 2020, 2021, 2022
		//This method should remember the number of eggs provided for the given year
		//This information should then match the number returned from the getNumEggs method
		if(whichYear==2020){
			numEggs2020 = numEggs;
		}else if (whichYear==2021){
			numEggs2021 = numEggs;
		}else if (whichYear==2022){
			numEggs2022 = numEggs;
		}
	}

	public int getNumEggs(int whichYear) {
		//TODO finish this method
		//Years outside the following list should return -1: 2020, 2021, 2022
		//The integer returned from this method should match based on the year and number provided to the setNumEggs method 
		if(whichYear==2020){
			return numEggs2020;
		}else if (whichYear==2021){
			return numEggs2021;
		}else if (whichYear==2022){
			return numEggs2022;
		}else {
			return -1;
		}
	}

	public int getTotalNumberOfEggs() {
		//TODO finish this method
		//This method should return the sum of the total number of eggs over the years recorded
		//If a year doesn't have data, that year shouldn't affect the total
		int sum = 0;
		if (numEggs2020!=-1) {
			sum+=numEggs2020;
		}
		if (numEggs2021!=-1) {
			sum+=numEggs2021;
		}
		if (numEggs2022!=-1) {
			sum+=numEggs2022;
		}
		return sum;
	}
	
	public static void main(String [] args) {
		//TODO:  Add code in here that reads from the WildlifeDataFull.txt file.
		//You can test your code on the smaller files if you wish (WildlifeDataSmall.txt)
		//Your code should create a SeaTurtle array filled with all the sea turtles in the file
		//You can assume there will be fewer than 500 sea turtles in the file
		try{
			Scanner scanner = new Scanner(new File("WildlifeDataFull.txt"));
			scanner.nextLine();
			String[] turtle = new String[0];
			while (scanner.hasNextLine()) {
				String temp = scanner.nextLine();
				turtle = Arrays.copyOf(turtle, turtle.length+1);
				turtle[turtle.length-1] = temp;
			}
			String[] name = new String[turtle.length];
			for (int i = 0; i < name.length; i++) {
				name[i] = turtle[i].substring(0, turtle[i].indexOf(" , "));
			}

			int[] eggs2020 = new int[turtle.length];
			for (int i = 0; i < eggs2020.length; i++) {
				int first = turtle[i].indexOf(" , ");
				int second = turtle[i].indexOf(" , ",first + 1);
				eggs2020[i] = Integer.parseInt(turtle[i].substring(first+3,second));
				if (eggs2020[i] == -1) {
					eggs2020[i] = 0;
				}
			}

			int[] eggs2021 = new int[turtle.length];
			for (int i = 0; i < eggs2021.length; i++) {
				int first = turtle[i].indexOf(" , ");
				int second = turtle[i].indexOf(" , ",first + 1);
				int third = turtle[i].indexOf(" , ", second+1);
				eggs2021[i] = Integer.parseInt(turtle[i].substring(second+3, third));
				if (eggs2021[i] == -1) {
					eggs2021[i] = 0;
				}
			}

			int[] eggs2022 = new int [turtle.length];
			for (int i = 0; i < eggs2022.length; i++) {
				int first = turtle[i].indexOf(" , ");
				int second = turtle[i].indexOf(" , ",first + 1);
				int third = turtle[i].indexOf(" , ", second+1);
				eggs2022[i] = Integer.parseInt(turtle[i].substring(third+3, turtle[i].length()));
			}

			SeaTurtle[] turtleObj = new SeaTurtle[turtle.length];
			for (int i = 0; i < eggs2022.length; i++) {
				SeaTurtle instance = new SeaTurtle(name[i], eggs2020[i], eggs2021[i], eggs2022[i]);
				turtleObj[i] = instance; 
			}
		//TODO - call the following method after you fill up your array			
			printTotalEggs(turtleObj);


		} catch(FileNotFoundException e){
			System.out.println(e);
		}


	}
	
	//This method works great!
	//TODO Answer the BigOh runtime question using this methodAdd
	public static void printTotalEggs(SeaTurtle [] a) {
		if(a == null) {
			System.out.println("The total number of eggs in the file is: -1");
			return;
		}
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				total += a[i].getTotalNumberOfEggs();
			}
		}
		System.out.println("The total number of eggs in the file is: " + total);
	}


}
