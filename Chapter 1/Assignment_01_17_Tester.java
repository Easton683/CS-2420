
public class Assignment_01_17_Tester {

	public static void main(String[] args) {
		System.out.println("Testing Max of 3 methods");
		try{
			if( Assignment_01_17.max(29, 62, 86) != 86) {
				throw new Exception("Error with Assignment_01_17.max(29, 62, 86); Expected 86 received "+Assignment_01_17.max(29, 62, 86));
			}
			if( Assignment_01_17.max(39, 51, 11) != 51) {
				throw new Exception("Error with Assignment_01_17.max(39, 51, 11); Expected 51 received "+Assignment_01_17.max(39, 51, 11));
			}
			if( Assignment_01_17.max(5, 32, 12) != 32) {
				throw new Exception("Error with Assignment_01_17.max(5, 32, 12); Expected 32 received "+Assignment_01_17.max(5, 32, 12));
			}
			if( Assignment_01_17.max(96, 68, 45) != 96) {
				throw new Exception("Error with Assignment_01_17.max(96, 68, 45); Expected 96 received "+Assignment_01_17.max(96, 68, 45));
			}
			if( Assignment_01_17.max(0, 4, 77) != 77) {
				throw new Exception("Error with Assignment_01_17.max(0, 4, 77); Expected 77 received "+Assignment_01_17.max(0, 4, 77));
			}
			if( Assignment_01_17.max(95, 18, 67) != 95) {
				throw new Exception("Error with Assignment_01_17.max(95, 18, 67); Expected 95 received "+Assignment_01_17.max(95, 18, 67));
			}
			if( Assignment_01_17.max(24, 89, 23) != 89) {
				throw new Exception("Error with Assignment_01_17.max(24, 89, 23); Expected 89 received "+Assignment_01_17.max(24, 89, 23));
			}
			if( Assignment_01_17.max(75, 59, 45) != 75) {
				throw new Exception("Error with Assignment_01_17.max(75, 59, 45); Expected 75 received "+Assignment_01_17.max(75, 59, 45));
			}
			if( Assignment_01_17.max(35, 67, 99) != 99) {
				throw new Exception("Error with Assignment_01_17.max(35, 67, 99); Expected 99 received "+Assignment_01_17.max(35, 67, 99));
			}
			if( Assignment_01_17.max(45, 90, 93) != 93) {
				throw new Exception("Error with Assignment_01_17.max(45, 90, 93); Expected 93 received "+Assignment_01_17.max(45, 90, 93));
			}
			if( Assignment_01_17.max(80, 49, 60) != 80) {
				throw new Exception("Error with Assignment_01_17.max(80, 49, 60); Expected 80 received "+Assignment_01_17.max(80, 49, 60));
			}
			if( Assignment_01_17.max(57, 84, 37) != 84) {
				throw new Exception("Error with Assignment_01_17.max(57, 84, 37); Expected 84 received "+Assignment_01_17.max(57, 84, 37));
			}
			if( Assignment_01_17.max(63, 34, 77) != 77) {
				throw new Exception("Error with Assignment_01_17.max(63, 34, 77); Expected 77 received "+Assignment_01_17.max(63, 34, 77));
			}
			if( Assignment_01_17.max(70, 62, 31) != 70) {
				throw new Exception("Error with Assignment_01_17.max(70, 62, 31); Expected 70 received "+Assignment_01_17.max(70, 62, 31));
			}
			if( Assignment_01_17.max(56, 33, 18) != 56) {
				throw new Exception("Error with Assignment_01_17.max(56, 33, 18); Expected 56 received "+Assignment_01_17.max(56, 33, 18));
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished Testing Max of 3 methods");
		System.out.println("Testing Max of 4 methods");
		try{
			if( Assignment_01_17.max(53, 79, 7, 60) != 79) {
				throw new Exception("Error with Assignment_01_17.max(53, 79, 7, 60); Expected 79 received "+Assignment_01_17.max(53, 79, 7, 60));
			}
			if( Assignment_01_17.max(26, 23, 66, 74) != 74) {
				throw new Exception("Error with Assignment_01_17.max(26, 23, 66, 74); Expected 74 received "+Assignment_01_17.max(26, 23, 66, 74));
			}
			if( Assignment_01_17.max(18, 51, 45, 8) != 51) {
				throw new Exception("Error with Assignment_01_17.max(18, 51, 45, 8); Expected 51 received "+Assignment_01_17.max(18, 51, 45, 8));
			}
			if( Assignment_01_17.max(72, 80, 73, 2) != 80) {
				throw new Exception("Error with Assignment_01_17.max(72, 80, 73, 2); Expected 80 received "+Assignment_01_17.max(72, 80, 73, 2));
			}
			if( Assignment_01_17.max(69, 35, 51, 40) != 69) {
				throw new Exception("Error with Assignment_01_17.max(69, 35, 51, 40); Expected 69 received "+Assignment_01_17.max(69, 35, 51, 40));
			}
			if( Assignment_01_17.max(29, 9, 87, 81) != 87) {
				throw new Exception("Error with Assignment_01_17.max(29, 9, 87, 81); Expected 87 received "+Assignment_01_17.max(29, 9, 87, 81));
			}
			if( Assignment_01_17.max(91, 88, 75, 21) != 91) {
				throw new Exception("Error with Assignment_01_17.max(91, 88, 75, 21); Expected 91 received "+Assignment_01_17.max(91, 88, 75, 21));
			}
			if( Assignment_01_17.max(84, 88, 24, 56) != 88) {
				throw new Exception("Error with Assignment_01_17.max(84, 88, 24, 56); Expected 88 received "+Assignment_01_17.max(84, 88, 24, 56));
			}
			if( Assignment_01_17.max(7, 31, 20, 25) != 31) {
				throw new Exception("Error with Assignment_01_17.max(7, 31, 20, 25); Expected 31 received "+Assignment_01_17.max(7, 31, 20, 25));
			}
			if( Assignment_01_17.max(18, 44, 72, 49) != 72) {
				throw new Exception("Error with Assignment_01_17.max(18, 44, 72, 49); Expected 72 received "+Assignment_01_17.max(18, 44, 72, 49));
			}
			if( Assignment_01_17.max(77, 61, 3, 28) != 77) {
				throw new Exception("Error with Assignment_01_17.max(77, 61, 3, 28); Expected 77 received "+Assignment_01_17.max(77, 61, 3, 28));
			}
			if( Assignment_01_17.max(45, 78, 95, 70) != 95) {
				throw new Exception("Error with Assignment_01_17.max(45, 78, 95, 70); Expected 95 received "+Assignment_01_17.max(45, 78, 95, 70));
			}
			if( Assignment_01_17.max(60, 98, 19, 27) != 98) {
				throw new Exception("Error with Assignment_01_17.max(60, 98, 19, 27); Expected 98 received "+Assignment_01_17.max(60, 98, 19, 27));
			}
			if( Assignment_01_17.max(78, 42, 30, 21) != 78) {
				throw new Exception("Error with Assignment_01_17.max(78, 42, 30, 21); Expected 78 received "+Assignment_01_17.max(78, 42, 30, 21));
			}
			if( Assignment_01_17.max(48, 0, 84, 79) != 84) {
				throw new Exception("Error with Assignment_01_17.max(48, 0, 84, 79); Expected 84 received "+Assignment_01_17.max(48, 0, 84, 79));
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished Testing Max of 4 methods");

	}

}
