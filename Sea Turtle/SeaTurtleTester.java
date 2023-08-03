
public class SeaTurtleTester {

	public static void main(String[] args) {
		System.out.println("Testing SeaTurtle class");
		System.out.println("Testing constructor and all methods with no data added");
		SeaTurtle t;
		try {
			t = new SeaTurtle("Aj");
			if(! "Aj".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Aj' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method for year 2022: Expecting '0' received '" + t.getNumEggs(2022) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Mitch");
			if(! "Mitch".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Mitch' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method for year 2020: Expecting '0' received '" + t.getNumEggs(2020) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Addie");
			if(! "Addie".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Addie' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method for year 2020: Expecting '0' received '" + t.getNumEggs(2020) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Waldo");
			if(! "Waldo".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Waldo' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method for year 2021: Expecting '0' received '" + t.getNumEggs(2021) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Bacchus");
			if(! "Bacchus".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Bacchus' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method for year 2020: Expecting '0' received '" + t.getNumEggs(2020) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Isabella");
			if(! "Isabella".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Isabella' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method for year 2020: Expecting '0' received '" + t.getNumEggs(2020) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Hugh");
			if(! "Hugh".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Hugh' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method for year 2022: Expecting '0' received '" + t.getNumEggs(2022) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Peanuts");
			if(! "Peanuts".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Peanuts' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method for year 2022: Expecting '0' received '" + t.getNumEggs(2022) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Bear");
			if(! "Bear".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Bear' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method for year 2021: Expecting '0' received '" + t.getNumEggs(2021) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Mollie");
			if(! "Mollie".equals(t.getName())){
				throw new Exception("Error with getName method: Expecting 'Mollie' received '" + t.getName() + "'");
			}
			if(0 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method for year 2022: Expecting '0' received '" + t.getNumEggs(2022) + "'");
			}
			if(0 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '0' received '" + t.getTotalNumberOfEggs() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Testing setNumEggs and getNumEggs methods");
		try {
			t = new SeaTurtle("Jesse");
			t.setNumEggs( 2022, 3);
			if(3 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '3' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2020, 3);
			if(3 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '3' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2021, 7);
			if(7 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '7' received '" + t.getNumEggs(2021) + "'");
			}
			t = new SeaTurtle("Itsy");
			t.setNumEggs( 2022, 4);
			if(4 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '4' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2020, 8);
			if(8 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '8' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2021, 5);
			if(5 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '5' received '" + t.getNumEggs(2021) + "'");
			}
			t = new SeaTurtle("Astro");
			t.setNumEggs( 2020, 7);
			if(7 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '7' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2022, 3);
			if(3 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '3' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2021, 4);
			if(4 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '4' received '" + t.getNumEggs(2021) + "'");
			}
			t = new SeaTurtle("Jack");
			t.setNumEggs( 2021, 5);
			if(5 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '5' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2020, 3);
			if(3 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '3' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2022, 5);
			if(5 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '5' received '" + t.getNumEggs(2022) + "'");
			}
			t = new SeaTurtle("Jake");
			t.setNumEggs( 2022, 7);
			if(7 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '7' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2021, 10);
			if(10 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '10' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2020, 1);
			if(1 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '1' received '" + t.getNumEggs(2020) + "'");
			}
			t = new SeaTurtle("Jenny");
			t.setNumEggs( 2021, 1);
			if(1 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '1' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2020, 9);
			if(9 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '9' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2022, 8);
			if(8 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '8' received '" + t.getNumEggs(2022) + "'");
			}
			t = new SeaTurtle("Hunter");
			t.setNumEggs( 2022, 3);
			if(3 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '3' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2020, 2);
			if(2 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '2' received '" + t.getNumEggs(2020) + "'");
			}
			t.setNumEggs( 2021, 4);
			if(4 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '4' received '" + t.getNumEggs(2021) + "'");
			}
			t = new SeaTurtle("Harry");
			t.setNumEggs( 2021, 9);
			if(9 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '9' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2022, 9);
			if(9 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '9' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2020, 6);
			if(6 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '6' received '" + t.getNumEggs(2020) + "'");
			}
			t = new SeaTurtle("April");
			t.setNumEggs( 2021, 2);
			if(2 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '2' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2022, 4);
			if(4 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '4' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2020, 2);
			if(2 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '2' received '" + t.getNumEggs(2020) + "'");
			}
			t = new SeaTurtle("Beau");
			t.setNumEggs( 2022, 1);
			if(1 != t.getNumEggs(2022)){
				throw new Exception("Error with getNumEggs method: Expecting '1' received '" + t.getNumEggs(2022) + "'");
			}
			t.setNumEggs( 2021, 5);
			if(5 != t.getNumEggs(2021)){
				throw new Exception("Error with getNumEggs method: Expecting '5' received '" + t.getNumEggs(2021) + "'");
			}
			t.setNumEggs( 2020, 10);
			if(10 != t.getNumEggs(2020)){
				throw new Exception("Error with getNumEggs method: Expecting '10' received '" + t.getNumEggs(2020) + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Testing setNumEggs and getTotalNumberOfEggs methods");
		try {
			t = new SeaTurtle("Ivy");
			t.setNumEggs( 2020, 2);
			if(2 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '2' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 6);
			if(8 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '8' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 6);
			if(14 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '14' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Big");
			t.setNumEggs( 2022, 8);
			if(8 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '8' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 6);
			if(14 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '14' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2020, 7);
			if(21 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '21' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Houdini");
			t.setNumEggs( 2020, 9);
			if(9 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '9' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 10);
			if(19 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '19' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 4);
			if(23 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '23' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Angus");
			t.setNumEggs( 2021, 3);
			if(3 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '3' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 8);
			if(11 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '11' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2020, 3);
			if(14 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '14' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Bambi");
			t.setNumEggs( 2020, 6);
			if(6 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '6' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 7);
			if(13 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '13' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 6);
			if(19 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '19' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Ace");
			t.setNumEggs( 2021, 2);
			if(2 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '2' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 4);
			if(6 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '6' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2020, 5);
			if(11 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '11' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Jasmine");
			t.setNumEggs( 2021, 5);
			if(5 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '5' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 6);
			if(11 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '11' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2020, 1);
			if(12 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '12' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Mittens");
			t.setNumEggs( 2020, 8);
			if(8 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '8' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 10);
			if(18 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '18' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 3);
			if(21 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '21' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Alfie");
			t.setNumEggs( 2020, 1);
			if(1 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '1' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2021, 6);
			if(7 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '7' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 7);
			if(14 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '14' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t = new SeaTurtle("Sheba");
			t.setNumEggs( 2021, 3);
			if(3 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '3' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2020, 5);
			if(8 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '8' received '" + t.getTotalNumberOfEggs() + "'");
			}
			t.setNumEggs( 2022, 8);
			if(16 != t.getTotalNumberOfEggs()){
				throw new Exception("Error with getTotalNumberOfEggs method: Expecting '16' received '" + t.getTotalNumberOfEggs() + "'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
