import java.util.Random;

public class Assignment_03_18_ComboLock {

	boolean open = false;
	int lockNum1;
	int lockNum2;
	int lockNum3;

	public Assignment_03_18_ComboLock() {
		//TODO - the code should be set to 0,0,0
		lockNum1 = 0;
		lockNum2 = 0;
		lockNum3 = 0;
	}

	public Assignment_03_18_ComboLock(int num1, int num2, int num3) {
		//TODO the three numbers provided should be the combo
		lockNum1 = num1;
		lockNum2 = num2;
		lockNum3 = num3;
	}

	public boolean open(int num1, int num2, int num3) {
		//TODO This method should return true if the three number above match the current combo - false otherwise
		if (num1 == lockNum1) {
			if (num2 == lockNum2) {
				if (num3 == lockNum3) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean changeCombo(int num1, int num2, int num3, int newNum1, int newNum2, int newNum3) {
		//TODO This method should return true AND change the combo to the new 3 numbers if the first 3 numbers match the current combo - false otherwise
		if (num1 == lockNum1) {
			if (num2 == lockNum2) {
				if (num3 == lockNum3) {
					lockNum1 = newNum1;
					lockNum2 = newNum2;
					lockNum3 = newNum3;
					return true;
				}
			}
		}
		return false;
	}

}
