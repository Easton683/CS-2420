
public class Assignment_01_20_Tester {

	public static void main(String[] args) {
		System.out.println("Testing Roman Numeral Conversion method");
		try{
			if( !"I".equals(Assignment_01_20.convertToRoman(1)) ){
				throw new Exception("Error with 1 Expected I given " + Assignment_01_20.convertToRoman(1));
			}
			if( !"V".equals(Assignment_01_20.convertToRoman(5)) ){
				throw new Exception("Error with 5 Expected V given " + Assignment_01_20.convertToRoman(5));
			}
			if( !"X".equals(Assignment_01_20.convertToRoman(10)) ){
				throw new Exception("Error with 10 Expected X given " + Assignment_01_20.convertToRoman(10));
			}
			if( !"L".equals(Assignment_01_20.convertToRoman(50)) ){
				throw new Exception("Error with 50 Expected L given " + Assignment_01_20.convertToRoman(50));
			}
			if( !"C".equals(Assignment_01_20.convertToRoman(100)) ){
				throw new Exception("Error with 100 Expected C given " + Assignment_01_20.convertToRoman(100));
			}
			if( !"D".equals(Assignment_01_20.convertToRoman(500)) ){
				throw new Exception("Error with 500 Expected D given " + Assignment_01_20.convertToRoman(500));
			}
			if( !"M".equals(Assignment_01_20.convertToRoman(1000)) ){
				throw new Exception("Error with 1000 Expected M given " + Assignment_01_20.convertToRoman(1000));
			}
			if( !"III".equals(Assignment_01_20.convertToRoman(3)) ){
				throw new Exception("Error with 3 Expected III given " + Assignment_01_20.convertToRoman(3));
			}
			if( !"IV".equals(Assignment_01_20.convertToRoman(4)) ){
				throw new Exception("Error with 4 Expected IV given " + Assignment_01_20.convertToRoman(4));
			}
			if( !"IX".equals(Assignment_01_20.convertToRoman(9)) ){
				throw new Exception("Error with 9 Expected IX given " + Assignment_01_20.convertToRoman(9));
			}
			if( !"XIII".equals(Assignment_01_20.convertToRoman(13)) ){
				throw new Exception("Error with 13 Expected XIII given " + Assignment_01_20.convertToRoman(13));
			}
			if( !"XLVIII".equals(Assignment_01_20.convertToRoman(48)) ){
				throw new Exception("Error with 48 Expected XLVIII given " + Assignment_01_20.convertToRoman(48));
			}
			if( !"LVIII".equals(Assignment_01_20.convertToRoman(58)) ){
				throw new Exception("Error with 58 Expected LVIII given " + Assignment_01_20.convertToRoman(58));
			}
			if( !"XCII".equals(Assignment_01_20.convertToRoman(92)) ){
				throw new Exception("Error with 92 Expected XCII given " + Assignment_01_20.convertToRoman(92));
			}
			if( !"CX".equals(Assignment_01_20.convertToRoman(110)) ){
				throw new Exception("Error with 110 Expected CX given " + Assignment_01_20.convertToRoman(110));
			}
			if( !"CDXCIII".equals(Assignment_01_20.convertToRoman(493)) ){
				throw new Exception("Error with 493 Expected CDXCIII given " + Assignment_01_20.convertToRoman(493));
			}
			if( !"DXIV".equals(Assignment_01_20.convertToRoman(514)) ){
				throw new Exception("Error with 514 Expected DXIV given " + Assignment_01_20.convertToRoman(514));
			}
			if( !"CMXCIX".equals(Assignment_01_20.convertToRoman(999)) ){
				throw new Exception("Error with 999 Expected CMXCIX given " + Assignment_01_20.convertToRoman(999));
			}
			if( !"MV".equals(Assignment_01_20.convertToRoman(1005)) ){
				throw new Exception("Error with 1005 Expected MV given " + Assignment_01_20.convertToRoman(1005));
			}
			if( !"MDCCXXI".equals(Assignment_01_20.convertToRoman(1721)) ){
				throw new Exception("Error with 1721 Expected MDCCXXI given " + Assignment_01_20.convertToRoman(1721));
			}
			if( !"MMDCLXXXVIII".equals(Assignment_01_20.convertToRoman(2688)) ){
				throw new Exception("Error with 2688 Expected MMDCLXXXVIII given " + Assignment_01_20.convertToRoman(2688));
			}
			if( !"MMDCLXXXVII".equals(Assignment_01_20.convertToRoman(2687)) ){
				throw new Exception("Error with 2687 Expected MMDCLXXXVII given " + Assignment_01_20.convertToRoman(2687));
			}
			if( !"MMDCCCXII".equals(Assignment_01_20.convertToRoman(2812)) ){
				throw new Exception("Error with 2812 Expected MMDCCCXII given " + Assignment_01_20.convertToRoman(2812));
			}
			if( !"MDCCXII".equals(Assignment_01_20.convertToRoman(1712)) ){
				throw new Exception("Error with 1712 Expected MDCCXII given " + Assignment_01_20.convertToRoman(1712));
			}
			if( !"MMCLXXVIII".equals(Assignment_01_20.convertToRoman(2178)) ){
				throw new Exception("Error with 2178 Expected MMCLXXVIII given " + Assignment_01_20.convertToRoman(2178));
			}
			if( !"MMDCCCXXXIV".equals(Assignment_01_20.convertToRoman(2834)) ){
				throw new Exception("Error with 2834 Expected MMDCCCXXXIV given " + Assignment_01_20.convertToRoman(2834));
			}
			if( !"MDIX".equals(Assignment_01_20.convertToRoman(1509)) ){
				throw new Exception("Error with 1509 Expected MDIX given " + Assignment_01_20.convertToRoman(1509));
			}
			if( !"MDCLIII".equals(Assignment_01_20.convertToRoman(1653)) ){
				throw new Exception("Error with 1653 Expected MDCLIII given " + Assignment_01_20.convertToRoman(1653));
			}
			if( !"MMDIV".equals(Assignment_01_20.convertToRoman(2504)) ){
				throw new Exception("Error with 2504 Expected MMDIV given " + Assignment_01_20.convertToRoman(2504));
			}
			if( !"MMDCCCXVIII".equals(Assignment_01_20.convertToRoman(2818)) ){
				throw new Exception("Error with 2818 Expected MMDCCCXVIII given " + Assignment_01_20.convertToRoman(2818));
			}
			if( !"MMMDCCCXXXI".equals(Assignment_01_20.convertToRoman(3831)) ){
				throw new Exception("Error with 3831 Expected MMMDCCCXXXI given " + Assignment_01_20.convertToRoman(3831));
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished Testing Roman Numeral Conversion method");

	}
}
