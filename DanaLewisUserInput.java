import java.util.Scanner;

public class DanaLewisUserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("System starting: Monitoring your insulin levels and heart rate could result in better health");
		System.out.println("System must be shut down manually");
		System.out.println();

		DanaLewisArray a = new DanaLewisArray();
		
		while(true) {
			System.out.println("Please enter your heart rate for the current time:");
			int hr = in.nextInt();
			System.out.println("Please enter your insulin level for the current time:");
			int il = in.nextInt();
			
			a.addDataPoint(new DanaLewisDataPoint("Not implemented", hr, il));
			
			System.out.println("Current average heart rate is: " + a.getCurrentAverageHeartRate());
			System.out.println("Current average insulin level is: " + a.getCurrentAverageInsulinLevel());
		}
	}

}
