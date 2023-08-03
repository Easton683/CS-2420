import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DanaLewisArray {
	
	public DanaLewisDataPoint[] infoArray = new DanaLewisDataPoint[0];
	//TODO: I want an array for the storage - so you get some practice on that data type

	//TODO: Probably add a constructor?
	
	public void addDataPoint(DanaLewisDataPoint d) {
		//TODO: Get this working
		infoArray = Arrays.copyOf(infoArray, infoArray.length + 1);
		infoArray[infoArray.length-1] = d;
	}
	
	public int getCurrentAverageHeartRate() {
		//TODO: Get this working correctly
		if (infoArray.length == 0) {
			return 0;
		}
		if (infoArray[0] == null){
			return 0;
		}
		if (infoArray.length == 1) {
			return infoArray[0].getHeartRate();
		}
		int sum = 0;
		for (int i = 0; i < infoArray.length; i++) {
			sum +=infoArray[i].getHeartRate();
		}
		return (sum/infoArray.length);
	}

	public int getCurrentAverageInsulinLevel() {
		//TODO: Get this working correctly
		if (infoArray.length == 0) {
			return 0;
		}
		if (infoArray[0] == null){
			return 0;
		}
		if (infoArray.length == 1) {
			return infoArray[0].getInsulinLevel();
		}
		int sum = 0;
		for (int i = 0; i < infoArray.length; i++) {
			sum +=infoArray[i].getInsulinLevel();
		}
		return (sum/infoArray.length);
	}
	
	public static void main(String [] args) {
		//TODO:  Add code in here that reads from the Unknown_Points.txt file.
		//You can test your code on the smaller files if you wish (0001Points.txt)
		//Your code should create a DanaLewisArray, and then lots of DanaLewisDataPoints which should be added using the addDataPoint method
		//Finally, call and print the getCurrentAverageInsulinLevel and getCurrentAverageHeartRate for the file 
				try {
			Scanner scanner = new Scanner(new File("unknownPoints.txt"));
			scanner.nextLine();
			String[] info = new String[0];
			while (scanner.hasNextLine()) {
				String temp = scanner.nextLine();
				info = Arrays.copyOf(info, info.length + 1);
				info[info.length-1] = temp;
			}

			scanner.close();

			//getting time
			String[] time = new String[info.length];
			for (int i = 0; i < info.length; i++) {
				time[i]=info[i].substring(0, info[i].indexOf(" , ")-1);
			}
			//getting heartRate
			int[] heartRate = new int[info.length];
			for (int i = 0; i < info.length; i++) {
				heartRate[i]=Integer.parseInt(info[i].substring(info[i].indexOf(" , ")+3, info[i].indexOf(" , ", info[i].indexOf(" , ")+1)));
			}
			//getting insulin level
			int[] insulinLevel = new int[info.length];
			for (int i = 0; i < insulinLevel.length; i++) {
				insulinLevel[i] = Integer.parseInt(info[i].substring(info[i].lastIndexOf(" , ")+3,info[i].length()));
			}
			

			DanaLewisArray instance = new DanaLewisArray();
			for (int i = 0; i < insulinLevel.length; i++) {
				DanaLewisDataPoint point2 = new DanaLewisDataPoint(time[i], heartRate[i], insulinLevel[i]);
				instance.addDataPoint(point2);
			}

			System.out.println("Average Heart Rate: "+instance.getCurrentAverageHeartRate());
			System.out.println("Average Insulin Level: "+instance.getCurrentAverageInsulinLevel());

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}

