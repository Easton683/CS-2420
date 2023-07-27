import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Assignment_07_Tester {

	public static void main(String[] args) {
		System.out.println("Starting tests Assignment 07");
		try {
			if( 7 != Assignment_07.Ackerman(2,2)){
				throw new Exception("Error with Ackerman(2,2) method.  Expected '7' received '"+Assignment_07.Ackerman(2,2)+"'");
			}
			if( 253 != Assignment_07.Ackerman(3,5)){
				throw new Exception("Error with Ackerman(3,5) method.  Expected '253' received '"+Assignment_07.Ackerman(3,5)+"'");
			}
			if( 5 != Assignment_07.Ackerman(2,1)){
				throw new Exception("Error with Ackerman(2,1) method.  Expected '5' received '"+Assignment_07.Ackerman(2,1)+"'");
			}
			if( 253 != Assignment_07.Ackerman(3,5)){
				throw new Exception("Error with Ackerman(3,5) method.  Expected '253' received '"+Assignment_07.Ackerman(3,5)+"'");
			}
			if( 5 != Assignment_07.Ackerman(2,1)){
				throw new Exception("Error with Ackerman(2,1) method.  Expected '5' received '"+Assignment_07.Ackerman(2,1)+"'");
			}
			if( 5 != Assignment_07.Ackerman(2,1)){
				throw new Exception("Error with Ackerman(2,1) method.  Expected '5' received '"+Assignment_07.Ackerman(2,1)+"'");
			}
			if( 29 != Assignment_07.Ackerman(3,2)){
				throw new Exception("Error with Ackerman(3,2) method.  Expected '29' received '"+Assignment_07.Ackerman(3,2)+"'");
			}
			if( 6 != Assignment_07.Ackerman(1,4)){
				throw new Exception("Error with Ackerman(1,4) method.  Expected '6' received '"+Assignment_07.Ackerman(1,4)+"'");
			}
			if( 3 != Assignment_07.Ackerman(1,1)){
				throw new Exception("Error with Ackerman(1,1) method.  Expected '3' received '"+Assignment_07.Ackerman(1,1)+"'");
			}
			if( 29 != Assignment_07.Ackerman(3,2)){
				throw new Exception("Error with Ackerman(3,2) method.  Expected '29' received '"+Assignment_07.Ackerman(3,2)+"'");
			}
			if( 4 != Assignment_07.Ackerman(1,2)){
				throw new Exception("Error with Ackerman(1,2) method.  Expected '4' received '"+Assignment_07.Ackerman(1,2)+"'");
			}
			if( 61 != Assignment_07.Ackerman(3,3)){
				throw new Exception("Error with Ackerman(3,3) method.  Expected '61' received '"+Assignment_07.Ackerman(3,3)+"'");
			}
			if( 7 != Assignment_07.Ackerman(2,2)){
				throw new Exception("Error with Ackerman(2,2) method.  Expected '7' received '"+Assignment_07.Ackerman(2,2)+"'");
			}
			if( 6 != Assignment_07.Ackerman(1,4)){
				throw new Exception("Error with Ackerman(1,4) method.  Expected '6' received '"+Assignment_07.Ackerman(1,4)+"'");
			}
			if( 3 != Assignment_07.Ackerman(1,1)){
				throw new Exception("Error with Ackerman(1,1) method.  Expected '3' received '"+Assignment_07.Ackerman(1,1)+"'");
			}
			if( 253 != Assignment_07.Ackerman(3,5)){
				throw new Exception("Error with Ackerman(3,5) method.  Expected '253' received '"+Assignment_07.Ackerman(3,5)+"'");
			}
			if( 61 != Assignment_07.Ackerman(3,3)){
				throw new Exception("Error with Ackerman(3,3) method.  Expected '61' received '"+Assignment_07.Ackerman(3,3)+"'");
			}
			if( 29 != Assignment_07.Ackerman(3,2)){
				throw new Exception("Error with Ackerman(3,2) method.  Expected '29' received '"+Assignment_07.Ackerman(3,2)+"'");
			}
			if( 125 != Assignment_07.Ackerman(3,4)){
				throw new Exception("Error with Ackerman(3,4) method.  Expected '125' received '"+Assignment_07.Ackerman(3,4)+"'");
			}
			if( 6 != Assignment_07.Ackerman(1,4)){
				throw new Exception("Error with Ackerman(1,4) method.  Expected '6' received '"+Assignment_07.Ackerman(1,4)+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if( 0 != Assignment_07.numberOfOnesInBinaryRepresentation(0)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(0) method.  Expected '0' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(0)+"'");
			}
			if( 1 != Assignment_07.numberOfOnesInBinaryRepresentation(1)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(1) method.  Expected '1' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(1)+"'");
			}
			if( 1 != Assignment_07.numberOfOnesInBinaryRepresentation(2)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(2) method.  Expected '1' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(2)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(3)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(3) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(3)+"'");
			}
			if( 1 != Assignment_07.numberOfOnesInBinaryRepresentation(4)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(4) method.  Expected '1' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(4)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(5)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(5) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(5)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(6)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(6) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(6)+"'");
			}
			if( 3 != Assignment_07.numberOfOnesInBinaryRepresentation(7)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(7) method.  Expected '3' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(7)+"'");
			}
			if( 1 != Assignment_07.numberOfOnesInBinaryRepresentation(8)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(8) method.  Expected '1' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(8)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(9)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(9) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(9)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(10)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(10) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(10)+"'");
			}
			if( 3 != Assignment_07.numberOfOnesInBinaryRepresentation(11)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(11) method.  Expected '3' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(11)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(12)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(12) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(12)+"'");
			}
			if( 3 != Assignment_07.numberOfOnesInBinaryRepresentation(13)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(13) method.  Expected '3' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(13)+"'");
			}
			if( 3 != Assignment_07.numberOfOnesInBinaryRepresentation(14)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(14) method.  Expected '3' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(14)+"'");
			}
			if( 4 != Assignment_07.numberOfOnesInBinaryRepresentation(15)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(15) method.  Expected '4' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(15)+"'");
			}
			if( 1 != Assignment_07.numberOfOnesInBinaryRepresentation(16)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(16) method.  Expected '1' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(16)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(17)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(17) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(17)+"'");
			}
			if( 2 != Assignment_07.numberOfOnesInBinaryRepresentation(18)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(18) method.  Expected '2' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(18)+"'");
			}
			if( 3 != Assignment_07.numberOfOnesInBinaryRepresentation(19)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(19) method.  Expected '3' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(19)+"'");
			}
			if( 8 != Assignment_07.numberOfOnesInBinaryRepresentation(464402)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(464402) method.  Expected '8' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(464402)+"'");
			}
			if( 9 != Assignment_07.numberOfOnesInBinaryRepresentation(342348)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(342348) method.  Expected '9' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(342348)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(554550)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(554550) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(554550)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(923022)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(923022) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(923022)+"'");
			}
			if( 9 != Assignment_07.numberOfOnesInBinaryRepresentation(138823)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(138823) method.  Expected '9' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(138823)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(255005)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(255005) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(255005)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(759918)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(759918) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(759918)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(294670)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(294670) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(294670)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(418742)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(418742) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(418742)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(634481)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(634481) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(634481)+"'");
			}
			if( 8 != Assignment_07.numberOfOnesInBinaryRepresentation(601729)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(601729) method.  Expected '8' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(601729)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(338015)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(338015) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(338015)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(497993)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(497993) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(497993)+"'");
			}
			if( 9 != Assignment_07.numberOfOnesInBinaryRepresentation(795751)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(795751) method.  Expected '9' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(795751)+"'");
			}
			if( 8 != Assignment_07.numberOfOnesInBinaryRepresentation(426821)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(426821) method.  Expected '8' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(426821)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(704764)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(704764) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(704764)+"'");
			}
			if( 8 != Assignment_07.numberOfOnesInBinaryRepresentation(803235)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(803235) method.  Expected '8' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(803235)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(109463)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(109463) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(109463)+"'");
			}
			if( 11 != Assignment_07.numberOfOnesInBinaryRepresentation(629221)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(629221) method.  Expected '11' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(629221)+"'");
			}
			if( 10 != Assignment_07.numberOfOnesInBinaryRepresentation(953793)){
				throw new Exception("Error with numberOfOnesInBinaryRepresentation(953793) method.  Expected '10' received '"+Assignment_07.numberOfOnesInBinaryRepresentation(953793)+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			System.setOut(new PrintStream(baos));
			String alphabet = "";
			String reversed = "";
			Scanner in = null;
			String answer = "";
			String ls = System.lineSeparator();
			PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
			baos.reset();
			alphabet = "a b c d f h j k l m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m l k j h f d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d e f g h j k m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m k j h g f e d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d e g h i k l";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "l k i h g e d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c e f g h i j l m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m l j i h g f e c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b d e f h j k l";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "l k j h f e d b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b d f h i j l";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "l j i h f d b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d e f h j k m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m k j h f e d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d f h j l";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "l j h f d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d e g i k m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m k i g e d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c e f h i j k l";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "l k j i h f e c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b c d e f g i j k m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m k j i g f e d c b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			baos.reset();
			alphabet = "a b d f h j k m";
			alphabet = alphabet.replaceAll(" ",ls);
			reversed = "m k j h f d b a ";
			reversed = reversed.replaceAll(" ",ls);
			in = new Scanner(alphabet);
			Assignment_07.printReverse(in);
			answer = baos.toString();
			if(! reversed.equals(answer)){
				System.setOut(ps);
				throw new Exception("Error with printReverse method.  Expected '"+reversed+"' received '"+answer+"'");
			}
			System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending tests Assignment 07");

	}

}
