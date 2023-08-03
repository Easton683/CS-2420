
public class DanaLewisDataPoint {

	String time;
	int heartRate;
	int insulinLevel;

	public DanaLewisDataPoint(String time, int heartRate, int insulinLevel) {
		//TODO finish this constructor
		this.time=time;
		this.heartRate=heartRate;
		this.insulinLevel=insulinLevel;

	}

	public String getTime() {
		//TODO finish this method
		return time;
	}

	public void setTime(String time) {
		//TODO finish this method
		time=this.time;
	}

	public int getHeartRate() {
		//TODO finish this method
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		//TODO finish this method
		heartRate=this.heartRate;
	}

	public int getInsulinLevel() {
		//TODO finish this method
		return insulinLevel;
	}

	public void setInsulinLevel(int insulinLeveli) {
		//TODO finish this method
		insulinLevel=insulinLeveli;
	}

	@Override
	public String toString() {
		//TODO Finish this method.  It should return the information in the following format
		//"Time 20:25, HR 103, IL 116"
		String result = ("Time " + getTime() + ", HR " + getHeartRate() + ", IL " + getInsulinLevel());
		return result;
	}

}
