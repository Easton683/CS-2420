import java.math.BigDecimal;
import java.util.Random;

public class Assignment_03_31_BigComplex_Tester {
	
	
	public static void main(String[] args) {
		
		System.out.println("Starting tests");

		Random r = new Random();
		
		Assignment_03_31_BigComplex bcZero = new Assignment_03_31_BigComplex();
		if(!"0".equals(bcZero.toString())){
			System.err.println("There is trouble with your no argument constructor: Expecting '0' from the toString(), and received '" + bcZero.toString() + "'");
		}

		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				Assignment_03_31_BigComplex bc = new Assignment_03_31_BigComplex(b);
				if(! (b.toString()).equals(bc.toString())){
					throw new Exception("There is trouble with your one argument constructor when I create one with "+b.toString()+": Expecting '" + b.toString() + "' from the toString(), and received '" + bc.toString() + "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b2 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				Assignment_03_31_BigComplex bc = new Assignment_03_31_BigComplex(b1,b2);
				if(! (b1.toString() + " + " + b2.toString() + "i").equals(bc.toString())){
					throw new Exception("There is trouble with your two argument constructor when I create one with "+b1.toString()+" "+b2.toString()+": Expecting '" + b1.toString() + " + " + b2.toString() + "i' from the toString(), and received '" + bc.toString() + "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				String num = b1.toString();
				Assignment_03_31_BigComplex bc = new Assignment_03_31_BigComplex(num);
				if(! num.equals(bc.toString())){
					throw new Exception("There is trouble with your String constructor when I pass '"+num+"': Expecting '" + num + "' from the toString(), and received '" + bc.toString() + "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b2 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				String num = b1 + " + " + b2 + "i";
				Assignment_03_31_BigComplex bc = new Assignment_03_31_BigComplex(num);
				if(! num.equals(bc.toString())){
					throw new Exception("There is trouble with your String constructor when I pass '"+num+"': Expecting '" + num + "' from the toString(), and received '" + bc.toString() + "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b2 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b4 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				while(b3.compareTo(b1) == 0 || b3.compareTo(b2) == 0) {
					b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				}
				Assignment_03_31_BigComplex bc1 = new Assignment_03_31_BigComplex(b1,b2);
				Assignment_03_31_BigComplex bc2 = new Assignment_03_31_BigComplex(b1,b2);
				Assignment_03_31_BigComplex bc3 = new Assignment_03_31_BigComplex(b3,b4);
				
				if(bc1.equals(bc3)) {
					throw new Exception("There is trouble with your equals(BigComplex) method: Expecting '" + bc1.toString() + "', and '" + bc3.toString() + "' to not be equal");
				}
				if(! bc1.equals(bc2)){
					throw new Exception("There is trouble with your equals(BigComplex) method: Expecting '" + bc1.toString() + "', and '" + bc2.toString() + "' to be equal");
				}
				Object o2 = bc2;
				Object o3 = bc3;
				if(bc1.equals(o3)) {
					throw new Exception("There is trouble with your equals(Object) method: Expecting '" + bc1.toString() + "', and '" + bc3.toString() + "' to not be equal");
				}
				if(! bc1.equals(o2)){
					throw new Exception("There is trouble with your equals(Object) constructor: Expecting '" + bc1.toString() + "', and '" + bc2.toString() + "' to be equal");
				}
				if(bc1.equals("Hello") || bc1.equals(b1)) {
					throw new Exception("There is trouble with your equals(Object) constructor: Expecting code that doesn't allow comparison to other objects");
				}
				
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}
		
		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b2 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b4 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				while(b3.compareTo(b1) == 0 || b3.compareTo(b2) == 0) {
					b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				}
				Assignment_03_31_BigComplex bc1 = new Assignment_03_31_BigComplex(b1,b2);
				Assignment_03_31_BigComplex bc2 = new Assignment_03_31_BigComplex(b3,b4);
				Assignment_03_31_BigComplex bc3 = new Assignment_03_31_BigComplex(b1.add(b3),b2.add(b4));
				
				Assignment_03_31_BigComplex addMethodCheckVariable = Assignment_03_31_BigComplex.add(bc1, bc2); 
				
				if(addMethodCheckVariable == null) {
					throw new Exception("There There is trouble with your add method: It is returning null instead of a new number");
				}
				else if(! bc3.equals(addMethodCheckVariable)) {
					throw new Exception("There is trouble with your add method: Expecting '" + bc3.toString() + "', and '" + addMethodCheckVariable.toString() + "' to be equal");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}
		
		try {
			for(int i = 0; i < 20; i++) {
				BigDecimal b1 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b2 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				BigDecimal b4 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				while(b3.compareTo(b1) == 0 || b3.compareTo(b2) == 0) {
					b3 = new BigDecimal((r.nextInt(20)+1) + "." + (r.nextInt(20)+1));
				}
				Assignment_03_31_BigComplex bc1 = new Assignment_03_31_BigComplex(b1,b2);
				Assignment_03_31_BigComplex bc2 = new Assignment_03_31_BigComplex(b3,b4);
				Assignment_03_31_BigComplex bc3 = new Assignment_03_31_BigComplex(b1.subtract(b3),b2.subtract(b4));
				
				Assignment_03_31_BigComplex subtractMethodCheckVariable = Assignment_03_31_BigComplex.subtract(bc1, bc2); 
				
				if(subtractMethodCheckVariable == null) {
					throw new Exception("There There is trouble with your subtract method: It is returning null instead of a new number");
				}
				else if(! bc3.equals(subtractMethodCheckVariable)) {
					throw new Exception("There is trouble with your subtract method: Expecting '" + bc3.toString() + "', and '" + subtractMethodCheckVariable.toString() + "' to be equal");
				}
			}
		}
		catch (Exception e) {
			System.err.println( e.getMessage());
		}

		System.out.println("Ending tests:  No red output in eclipse means success");
	}

}
