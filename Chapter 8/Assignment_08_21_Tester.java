
public class Assignment_08_21_Tester {

	public static void main(String[] args) {
		System.out.println("Starting testing for 08_21");
		Integer [] a = null;
		int k = 0;
		boolean nSquared = false;
		boolean nlgn = false;
		try {
			a = new Integer[]{-280974331, -1613768446, -167876807, -117898022, -40851616, -1306377084, 600573330, -1977819617, -1791263122, 1581269819, -1862629956, -348957270, -450061283, -819049773, 934183095};
			k = -398872353;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  -280974331+-117898022==-398872353");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{-1092870898, 1407890736, -677306230, -1806766809, 601245632, 1540573460, 487105999, 836854976, -343843138, -440569639};
			k = -244499637;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to -244499637");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to -244499637");
			}
			a = new Integer[]{-535490580, 1192435316, 1335255994, 441112286, 935650809, 1968381341, -1755908402, -1364928382, 244034886, -940250690, -682773888, 1302603295, 33210568, 516554803, 133821493, 51107738};
			k = 1819158098;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  1302603295+516554803==1819158098");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{249819509, -1025541717, 1004931768, -1569953622, 114287009, -696288328, -1230501598, 2061858093, 914570374, 1655431585, 838136219, -327722954, 26629171};
			k = 276448680;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  249819509+26629171==276448680");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{546504885, 599659158, 1333076070, -175550856, 1503886185, -316968949, 1972053643, -335517664, -190132092, 45930093, -1197999068};
			k = -652486613;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  -335517664+-316968949==-652486613");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{1402415789, 1826167232, 489716099, 92273363, 1287346118, 423073909, -1539759505, 439795877, 276885850, 214649007, 1849818653, -666137332};
			k = 1942092016;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  1849818653+92273363==1942092016");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{734497815, -2140364808, 785906401, -2004413662, -429629985, -1115309777, -320637226, -589955861, -358379098, -179412681, -74757118, -1845057679, -928744154, 84943842};
			k = -769368542;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  -589955861+-179412681==-769368542");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{2040390506, 1689323330, -1577857413, -624216604, 852761866, -1371936791, 1577526585, 1901098253, -1840724689, 748074376, 1446199758, -752388486, 1475604665, -1221166924, -1013648483, -1298793645, -520683};
			k = 1071145353;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to 1071145353");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to 1071145353");
			}
			a = new Integer[]{1154918278, 1560565813, -702241074, -1008119928, -1734269562, -2083503416, -1704744250, 1044371252, -212617983, 2072818034, -1395500050, 1182842587, 923577025, 1389451521, 1939138367, 1834144066, -164388482, 776775845};
			k = -999852494;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to -999852494");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to -999852494");
			}
			a = new Integer[]{1872186721, 2022975819, -2067772809, 1207367908, 1076087424, -808056914, -488687026, -1797664377, 1804444072, -1673706744, -1426608757, 870862116, -623223988};
			k = -1829604489;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to -1829604489");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to -1829604489");
			}
			a = new Integer[]{501707858, 283750629, 771332002, -709969545, -872391978, -344835728, -2129343660, -1491400846, 730950218, 1945231175, 955205274, 698852768, -1408138274, 839416285};
			k = 1273039860;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  771332002+501707858==1273039860");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{-1420089127, 2111170867, -719608707, 968078871, -1051808418, -1894681469, 721742496, 166324542, 141587387, 40343682, 465654155, -1465274622, -1710428174, -2066886697, 1173884566, 1632437894};
			k = 1008422553;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  968078871+40343682==1008422553");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{1296600489, -654771203, -1921078846, -661607502, -842221736, 1261731644, -60740576, -1225222792, -1677025112, -1378330517, 1718473412, -1350168783, -839834099, -1412775585, 501548638, 2139390195, -883326027, 1863164089, -987905049};
			k = -2033101720;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  -1378330517+-654771203==-2033101720");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{-713333155, -906135720, -678398251, -1498817559, -1095849239, 1323492464, 1384960881, -1670565648, 993277635, 1055126653, -736969572, 1958268258, 1834088232, -1974402039, 1777357377, -40535787, 1943645462, 314836286, -540332065};
			k = 484167737;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to 484167737");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to 484167737");
			}
			a = new Integer[]{-1731546351, -290912845, -824099911, -2115935384, -589318586, 1094945497, -1509968265, 417515513, 1498837975, 1285504687, 1975053819};
			k = -484351136;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to -484351136");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to -484351136");
			}
			a = new Integer[]{1136714628, -1926906865, 1544659414, -1632083372, 2142319496, 1760120319, -647318584, 1139497813, -1376563568, 997518796};
			k = 242653111;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to 242653111");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to 242653111");
			}
			a = new Integer[]{39962929, 208735386, 2105592020, -1460356421, -1190906763, 60570355, -794191309, -855253643, -912350052, 1562806956, 1350861436, 392692429, 1527747090, -628252117, -1992252750, 1873825882, -327966245, 2094161479};
			k = -1183219888;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  -855253643+-327966245==-1183219888");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{1760839907, -354144121, 1112750717, 1379283598, -1305115163, -252790678, 398994610, 1350125743, 1868560522, 780747837, -1535199361, 1589062459, -1040130053, 1424978855, 717806646, -303667977, 794792061, 288185962, 743855322};
			k = -2024900716;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to -2024900716");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to -2024900716");
			}
			a = new Integer[]{361956553, -514205070, 1844533491, 998607094, -1023903332, 258168868, 1416378282, 1163812124, 1832778468, -2003244679, 487480119};
			k = 1778334835;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method -  1416378282+361956553==1778334835");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method");
			}
			a = new Integer[]{411125096, -1139812387, -1238184138, -235542142, -1790961858, -1494818207, -1577949161, 1775166165, -1585155087, 632039661, -1734617951, -1207325282, 978004247, -1775664144, 925020990, -902179679, -803740522, -228582711};
			k = 1938531702;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != false){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - nothing should add up to 1938531702");
			}
			if(nlgn != false){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - nothing should add up to 1938531702");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			a = new Integer[]{516593463, 289889726, -1289699212, -1688167302, -210541626, -397356699, -77508883, 810410209, -2077717025, 406631817, -888579777, -1312324913, -1281984601, -418035124, -1731851700, -1002338118, -167770928, -1175474865};
			k = -2004676236;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - A number can be used twice 2*-1002338118==-2004676236");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - A number can be used twice 2*-1002338118==-2004676236");
			}
			a = new Integer[]{400341877, -1699098822, -1226899679, 860695619, -223662653, -1433777801, 537469007, -1746555784, 1903001244, 768535446, 1516391159};
			k = 1074938014;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - A number can be used twice 2*537469007==1074938014");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - A number can be used twice 2*537469007==1074938014");
			}
			a = new Integer[]{-2146346719, -1043775257, -1418695192, -1257563620, -668944731, 110920570, 1616397584, 2062202171, -1431320559, -765828980, -391631701};
			k = -783263402;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - A number can be used twice 2*-391631701==-783263402");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - A number can be used twice 2*-391631701==-783263402");
			}
			a = new Integer[]{1787329049, -1803443548, -1583618542, -1972637038, -1120333451, 989250424, -103910157, 1278125798, 1070715019, 336423333, -1588400573, -2088250387, -1796076068};
			k = -207820314;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - A number can be used twice 2*-103910157==-207820314");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - A number can be used twice 2*-103910157==-207820314");
			}
			a = new Integer[]{-1379840615, -1623197610, 580882883, -2081663327, 1683749169, 2120344327, -1852815866, 463424631, -1708417575, -1875308264, 27330552, 661095701, 252947590, -2077139460, 1577067410, 184407878, -2119135653, 775249527};
			k = 1322191402;
			nSquared = Assignment_08.doTheNumbersAddToK_NSquared(a,k);
			nlgn = Assignment_08.doTheNumbersAddToK_NLogN(a,k);
			if(nSquared != true){
				throw new Exception("Error with the doTheNumbersAddToK_NSquared method - A number can be used twice 2*661095701==1322191402");
			}
			if(nlgn != true){
				throw new Exception("Error with the doTheNumbersAddToK_NLogN method - A number can be used twice 2*661095701==1322191402");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending testing for 08_21");
	}

}
