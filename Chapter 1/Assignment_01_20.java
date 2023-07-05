
public class Assignment_01_20 {

	public static String convertToRoman(int num) {
	String numeral = "";
	do{
		if (num/1000 > 0){
			numeral = numeral + "M";
			num = num - 1000;
		}
	}while(num/1000>0);

	do{
		if (num/900 > 0){
			numeral = numeral + "CM";
			num = num - 900;
		}
	}while(num/900>0);

	do{
		if (num/500 > 0){
			numeral = numeral + "D";
			num = num - 500;
		}
	}while(num/500>0);

	do{
		if (num/400 > 0){
			numeral = numeral + "CD";
			num = num - 400;
		}
	}while(num/400>0);

	do{
		if (num/100 > 0){
			numeral = numeral + "C";
			num = num - 100;
		}
	}while(num/100>0);

	do{
		if (num/90 > 0){
			numeral = numeral + "XC";
			num = num - 90;
		}
	}while(num/90>0);

	do{
		if (num/50 > 0){
			numeral = numeral + "L";
			num = num - 50;
		}
	}while(num/50>0);

	do{
		if (num/40 > 0){
			numeral = numeral + "XL";
			num = num - 40;
		}
	}while(num/40>0);

	do{
		if (num/10 > 0){
			numeral = numeral + "X";
			num = num - 10;
		}
	}while(num/10>0);

	do{
		if (num/9 > 0){
			numeral = numeral + "IX";
			num = num - 9;
		}
	}while(num/9>0);

	do{
		if (num/5 > 0){
			numeral = numeral + "V";
			num = num - 5;
		}
	}while(num/5>0);

	do{
		if (num/4 > 0){
			numeral = numeral + "IV";
			num = num - 4;
		}
	}while(num/4>0);

	do{
		if (num/1 > 0){
			numeral = numeral + "I";
			num = num - 1;
		}
	}while(num/1>0);

	return numeral;

	}
}
