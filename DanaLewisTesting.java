
public class DanaLewisTesting {

	public static void main(String[] args) {
		System.out.println("Testing DanaLewisDataPoint class");
		DanaLewisArray dla = new DanaLewisArray();
		DanaLewisDataPoint point;
		try {
			point = new DanaLewisDataPoint("01:03", 91, 109);
			if(! "Time 01:03, HR 91, IL 109".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:03, HR 91, IL 109' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:06", 89, 111);
			if(! "Time 01:06, HR 89, IL 111".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:06, HR 89, IL 111' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:09", 89, 109);
			if(! "Time 01:09, HR 89, IL 109".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:09, HR 89, IL 109' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:14", 91, 107);
			if(! "Time 01:14, HR 91, IL 107".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:14, HR 91, IL 107' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:21", 93, 109);
			if(! "Time 01:21, HR 93, IL 109".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:21, HR 93, IL 109' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:26", 93, 109);
			if(! "Time 01:26, HR 93, IL 109".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:26, HR 93, IL 109' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:32", 91, 108);
			if(! "Time 01:32, HR 91, IL 108".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:32, HR 91, IL 108' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:39", 91, 108);
			if(! "Time 01:39, HR 91, IL 108".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:39, HR 91, IL 108' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:42", 89, 109);
			if(! "Time 01:42, HR 89, IL 109".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:42, HR 89, IL 109' received '" + point.toString() + "'");
			}
			point = new DanaLewisDataPoint("01:46", 90, 111);
			if(! "Time 01:46, HR 90, IL 111".equals(point.toString())){
				throw new Exception("Error with toString method: Expecting 'Time 01:46, HR 90, IL 111' received '" + point.toString() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("01:51", 90, 113);
			if(! "01:51".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '01:51' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("01:56", 90, 115);
			if(! "01:56".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '01:56' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:00", 92, 117);
			if(! "02:00".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:00' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:06", 92, 119);
			if(! "02:06".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:06' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:11", 91, 119);
			if(! "02:11".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:11' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:16", 89, 118);
			if(! "02:16".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:16' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:21", 90, 118);
			if(! "02:21".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:21' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:25", 90, 119);
			if(! "02:25".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:25' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:30", 89, 118);
			if(! "02:30".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:30' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("02:35", 87, 117);
			if(! "02:35".equals(point.getTime())){
				throw new Exception("Error with getTime method: Expecting '02:35' received '" + point.getTime() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("02:38", 86, 117);
			if(86 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 86 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:44", 87, 116);
			if(87 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 87 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:47", 88, 116);
			if(88 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 88 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:51", 86, 117);
			if(86 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 86 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:58", 86, 119);
			if(86 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 86 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:01", 86, 119);
			if(86 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 86 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:05", 86, 121);
			if(86 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 86 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:10", 84, 121);
			if(84 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 84 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:15", 83, 122);
			if(83 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 83 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("02:20", 83, 121);
			if(83 != point.getHeartRate()){
				throw new Exception("Error with getHeartRate method: Expecting 83 received " + point.getHeartRate() + "");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("02:24", 84, 119);
			if(119  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 119 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:27", 83, 117);
			if(117  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 117 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:31", 83, 117);
			if(117  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 117 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:36", 84, 118);
			if(118  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 118 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:41", 82, 120);
			if(120  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 120 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:44", 82, 121);
			if(121  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 121 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:47", 80, 122);
			if(122  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 122 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:52", 82, 122);
			if(122  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 122 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("02:57", 84, 122);
			if(122  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 122 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("03:00", 82, 120);
			if(120  != point.getInsulinLevel()){
				throw new Exception("Error with getInsulinLevel method: Expecting 120 received " + point.getInsulinLevel() + "");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("03:05", 82, 119);
			point.setTime("03:05");
			if(! "03:05".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:05' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:08", 83, 119);
			point.setTime("03:08");
			if(! "03:08".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:08' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:11", 81, 120);
			point.setTime("03:11");
			if(! "03:11".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:11' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:15", 81, 120);
			point.setTime("03:15");
			if(! "03:15".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:15' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:19", 81, 120);
			point.setTime("03:19");
			if(! "03:19".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:19' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:25", 82, 119);
			point.setTime("03:25");
			if(! "03:25".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:25' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:28", 84, 117);
			point.setTime("03:28");
			if(! "03:28".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:28' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:33", 85, 117);
			point.setTime("03:33");
			if(! "03:33".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:33' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:39", 86, 118);
			point.setTime("03:39");
			if(! "03:39".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:39' received '" + point.getTime() + "'");
			}
			point = new DanaLewisDataPoint("03:42", 88, 118);
			point.setTime("03:42");
			if(! "03:42".equals(point.getTime())){
				throw new Exception("Error with setTime then calling getTime method: Expecting '03:42' received '" + point.getTime() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("03:46", 89, 116);
			point.setHeartRate(89);
			if(89 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 89 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:51", 89, 116);
			point.setHeartRate(89);
			if(89 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 89 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:55", 91, 114);
			point.setHeartRate(91);
			if(91 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 91 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:02", 91, 114);
			point.setHeartRate(91);
			if(91 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 91 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:09", 93, 114);
			point.setHeartRate(93);
			if(93 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 93 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:14", 95, 112);
			point.setHeartRate(95);
			if(95 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 95 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:17", 96, 111);
			point.setHeartRate(96);
			if(96 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 96 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:22", 96, 111);
			point.setHeartRate(96);
			if(96 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 96 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:27", 97, 110);
			point.setHeartRate(97);
			if(97 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 97 received " + point.getHeartRate() + "");
			}
			point = new DanaLewisDataPoint("03:32", 97, 112);
			point.setHeartRate(97);
			if(97 != point.getHeartRate()){
				throw new Exception("Error with setHeartRate then calling getHeartRate method: Expecting 97 received " + point.getHeartRate() + "");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("03:36", 99, 112);
			point.setInsulinLevel(112);
			if(112  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 112 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("03:41", 99, 110);
			point.setInsulinLevel(110);
			if(110  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 110 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("03:46", 100, 110);
			point.setInsulinLevel(110);
			if(110  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 110 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("03:50", 100, 110);
			point.setInsulinLevel(110);
			if(110  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 110 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("03:55", 100, 109);
			point.setInsulinLevel(109);
			if(109  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 109 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("04:00", 100, 109);
			point.setInsulinLevel(109);
			if(109  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 109 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("04:05", 100, 107);
			point.setInsulinLevel(107);
			if(107  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 107 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("04:10", 102, 106);
			point.setInsulinLevel(106);
			if(106  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 106 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("04:15", 104, 104);
			point.setInsulinLevel(104);
			if(104  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 104 received " + point.getInsulinLevel() + "");
			}
			point = new DanaLewisDataPoint("04:20", 102, 104);
			point.setInsulinLevel(104);
			if(104  != point.getInsulinLevel()){
				throw new Exception("Error with setInsulinLevel then calling getInsulinLevel method: Expecting 104 received " + point.getInsulinLevel() + "");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished testing DanaLewisDataPoint class");
		System.out.println("Testing DanaLewisArray class");
		try {
			point = new DanaLewisDataPoint("04:25", 103, 103);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:30", 103, 103);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:35", 104, 102);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:40", 103, 103);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:45", 103, 101);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:50", 105, 99);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("04:55", 106, 97);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:00", 104, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:05", 104, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:10", 103, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:15", 103, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:20", 104, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:25", 102, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:30", 101, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:35", 103, 93);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:40", 104, 93);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:45", 104, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:50", 103, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("05:55", 104, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:00", 103, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:05", 105, 96);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:10", 106, 96);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:15", 105, 96);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:20", 107, 96);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
			point = new DanaLewisDataPoint("06:25", 106, 95);
			dla.addDataPoint(point);
			if(103 != dla.getCurrentAverageHeartRate()){
				throw new Exception("Error with getCurrentAverageHeartRate method: Expecting '103' received '" + dla.getCurrentAverageHeartRate() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			point = new DanaLewisDataPoint("06:30", 104, 97);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("06:35", 102, 95);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("06:40", 104, 93);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("06:45", 106, 93);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("06:50", 106, 93);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("06:55", 107, 92);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:00", 106, 91);
			dla.addDataPoint(point);
			if(96 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '96' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:05", 106, 92);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:10", 106, 92);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:15", 106, 92);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:20", 108, 90);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:25", 106, 92);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:30", 104, 94);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:35", 105, 94);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:40", 104, 96);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:45", 102, 95);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:50", 104, 93);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("07:55", 106, 95);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:00", 106, 96);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:05", 105, 98);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:10", 107, 98);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:15", 105, 96);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:20", 105, 96);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:25", 103, 95);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
			point = new DanaLewisDataPoint("08:30", 102, 96);
			dla.addDataPoint(point);
			if(95 != dla.getCurrentAverageInsulinLevel()){
				throw new Exception("Error with getCurrentAverageInsulinLevel method: Expecting '95' received '" + dla.getCurrentAverageInsulinLevel() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished testing DanaLewisArray class");

	}

}
