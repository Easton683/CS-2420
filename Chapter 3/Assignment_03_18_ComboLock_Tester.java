import java.util.Random;

public class Assignment_03_18_ComboLock_Tester {

	public static void main(String[] args) {

		System.out.println("Starting tests");

		Random r = new Random();
		try {
			for(int i = 0; i < 100; i++) {
				Assignment_03_18_ComboLock a = new Assignment_03_18_ComboLock();
				if(a.open(0, 0, 0) != true) {
					throw new Exception();
				}
				if(a.open(r.nextInt(9)+1, r.nextInt(9)+1, r.nextInt(9)+1) == true) {
					throw new Exception();
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error with no argument constructor - a new combo lock should have the combo 0, 0, 0 and be able to be opened with that combo and no other combo");
		}
		
		try {
			for(int i = 0; i < 100; i++) {
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				int c = r.nextInt(100);
				Assignment_03_18_ComboLock z = new Assignment_03_18_ComboLock(a, b, c);
				if(z.open(a, b, c) != true) {
					throw new Exception();
				}
				int d = r.nextInt(100);
				int e = r.nextInt(100);
				int f = r.nextInt(100);
				while(a == d && b == e && c == f) {
					d = r.nextInt(100);
					e = r.nextInt(100);
					f = r.nextInt(100);
				}
				if(z.open(d,e,f) == true) {
					throw new Exception();
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error with 3 argument constructor - a new combo lock should have the combo 0, 0, 0 and be able to be opened with that combo and no other combo");
		}

		try {
			for(int i = 0; i < 100; i++) {
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				int c = r.nextInt(100);
				int d = r.nextInt(100);
				int e = r.nextInt(100);
				int f = r.nextInt(100);
				while(a == d && b == e && c == f) {
					d = r.nextInt(100);
					e = r.nextInt(100);
					f = r.nextInt(100);
				}
				Assignment_03_18_ComboLock z = new Assignment_03_18_ComboLock(a, b, c);
				boolean didChange = z.changeCombo(a, b, c, d, e, f);
				if(!didChange || z.open(d,e,f) != true) {
					throw new Exception();
				}
				a = d;
				b = e;
				c = f;
				d = r.nextInt(100);
				e = r.nextInt(100);
				f = r.nextInt(100);
				while(a == d && b == e && c == f) {
					d = r.nextInt(100);
					e = r.nextInt(100);
					f = r.nextInt(100);
				}
				if(z.open(d,e,f) == true) {
					throw new Exception();
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error with change combo method - the combo should be able to open with the new combo and no other one.  It should also return true if the proper combo is provided");
		}

		try {
			for(int index = 0; index < 100; index++) {
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				int c = r.nextInt(100);
				int d = r.nextInt(100);
				int e = r.nextInt(100);
				int f = r.nextInt(100);
				while(a == d && b == e && c == f) {
					d = r.nextInt(100);
					e = r.nextInt(100);
					f = r.nextInt(100);
				}
				int g = r.nextInt(100);
				int h = r.nextInt(100);
				int i = r.nextInt(100);
				while(d == g && e == h && f == i) {
					g = r.nextInt(100);
					h = r.nextInt(100);
					i = r.nextInt(100);
				}
				Assignment_03_18_ComboLock z = new Assignment_03_18_ComboLock(a, b, c);
				boolean didChange = z.changeCombo(d, e, f, g, h, i);
				if(didChange || z.open(d,e,f) == true || z.open(g,h,i) == true ||z.open(a, b, c) == false) {
					throw new Exception();
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error with change combo method - the combo should not change, and return false if the improper combo is provided");
		}

		System.out.println("Ending tests:  No red output in eclipse means success");

	}

}
