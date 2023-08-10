
public class Assignment_08_33_Tester {


	public static void main(String[] args) {
		System.out.println("Starting testing for 08_33");
		System.out.println("Initial tests borrowed from Internet Anagram Server");
		try {
			if(Assignment_08.areTheseAnagrams("internet anagram server", "isnt rearrangement rave") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Internet Anagram Server' and 'Isnt rearrangement rave'");
			}
			if(Assignment_08.areTheseAnagrams("dormitory", "dirty room") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Dormitory' and 'Dirty Room'");
			}
			if(Assignment_08.areTheseAnagrams("eleven plus two", "twelve plus one") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Eleven plus two' and 'Twelve plus one'");
			}
			if(Assignment_08.areTheseAnagrams("schoolmaster", "the classroom") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Schoolmaster' and 'The classroom'");
			}
			if(Assignment_08.areTheseAnagrams("elvis", "lives") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Elvis' and 'Lives'");
			}
			if(Assignment_08.areTheseAnagrams("listen", "silent") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Listen' and 'Silent'");
			}
			if(Assignment_08.areTheseAnagrams("clint eastwood", "old west action") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Clint Eastwood' and 'Old West Action'");
			}
			if(Assignment_08.areTheseAnagrams("conversationalists", "conservationalists") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Conversationalists' and 'Conservationalists'");
			}
			if(Assignment_08.areTheseAnagrams("western union", "no wire unsent") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Western Union' and 'No Wire Unsent'");
			}
			if(Assignment_08.areTheseAnagrams("the countryside", "no city dust here") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'The countryside' and 'No city dust here'");
			}
			if(Assignment_08.areTheseAnagrams("astronomers", "moon starers") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Astronomers' and 'Moon starers'");
			}
			if(Assignment_08.areTheseAnagrams("postmaster", "stamp store") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Postmaster' and 'Stamp Store'");
			}
			if(Assignment_08.areTheseAnagrams("a telescope", "to see place") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'A telescope' and 'To see place'");
			}
			if(Assignment_08.areTheseAnagrams("the eyes", "they see") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'The eyes' and 'They see'");
			}
			if(Assignment_08.areTheseAnagrams("the morse code", "here come dots") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'The Morse code' and 'Here come dots'");
			}
			if(Assignment_08.areTheseAnagrams("the meaning of life", "the fine game of nil") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'The meaning of life' and 'The fine game of nil'");
			}
			if(Assignment_08.areTheseAnagrams("slot machines", "cash lost in em") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'Slot Machines' and 'Cash lost in em'");
			}
			if(Assignment_08.areTheseAnagrams("buawtgiebe", "ibtiweeuga") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'buawtgiebe' and 'ibtiweeuga'");
			}
			if(Assignment_08.areTheseAnagrams("ytbyhzunrz", "bzntzyrhuy") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'ytbyhzunrz' and 'bzntzyrhuy'");
			}
			if(Assignment_08.areTheseAnagrams("dhriqaosvf", "qviosrafhi") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'dhriqaosvf' and 'qviosrafhi'");
			}
			if(Assignment_08.areTheseAnagrams("moctrrnmna", "macnotnrmr") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'moctrrnmna' and 'macnotnrmr'");
			}
			if(Assignment_08.areTheseAnagrams("xhetmzmgbw", "bmgtxwzhme") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'xhetmzmgbw' and 'bmgtxwzhme'");
			}
			if(Assignment_08.areTheseAnagrams("eonvdxoxfa", "odeaoxxvnf") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'eonvdxoxfa' and 'odeaoxxvnf'");
			}
			if(Assignment_08.areTheseAnagrams("mzktxsplpv", "xvklptxspz") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'mzktxsplpv' and 'xvklptxspz'");
			}
			if(Assignment_08.areTheseAnagrams("xcfxonhuru", "uonrfcxxhu") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'xcfxonhuru' and 'uonrfcxxhu'");
			}
			if(Assignment_08.areTheseAnagrams("vjhjdonjgs", "sjjhdojngv") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'vjhjdonjgs' and 'sjjhdojngv'");
			}
			if(Assignment_08.areTheseAnagrams("knemixuvho", "oixehumyvn") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'knemixuvho' and 'oixehumyvn'");
			}
			if(Assignment_08.areTheseAnagrams("tsoouizdfc", "sczdsuoofi") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'tsoouizdfc' and 'sczdsuoofi'");
			}
			if(Assignment_08.areTheseAnagrams("vindjdhucd", "cjddnhiudl") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'vindjdhucd' and 'cjddnhiudl'");
			}
			if(Assignment_08.areTheseAnagrams("wkjlshilff", "llfksjvfhi") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'wkjlshilff' and 'llfksjvfhi'");
			}
			if(Assignment_08.areTheseAnagrams("oioscmblgn", "egcnimbsol") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'oioscmblgn' and 'egcnimbsol'");
			}
			if(Assignment_08.areTheseAnagrams("wyluypndse", "ynupedsnly") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'wyluypndse' and 'ynupedsnly'");
			}
			if(Assignment_08.areTheseAnagrams("gjalckuwly", "cwjuyjlakl") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'gjalckuwly' and 'cwjuyjlakl'");
			}
			if(Assignment_08.areTheseAnagrams("czvrbiylbe", "zircbbyvel") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'czvrbiylbe' and 'zircbbyvel'");
			}
			if(Assignment_08.areTheseAnagrams("njsundcwob", "ndojwcwubs") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'njsundcwob' and 'ndojwcwubs'");
			}
			if(Assignment_08.areTheseAnagrams("ovkxytofvg", "pkvovygftx") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'ovkxytofvg' and 'pkvovygftx'");
			}
			if(Assignment_08.areTheseAnagrams("whvusktown", "oknwtgvush") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'whvusktown' and 'oknwtgvush'");
			}
			if(Assignment_08.areTheseAnagrams("gdondhhuxt", "dxouhhdtnf") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'gdondhhuxt' and 'dxouhhdtnf'");
			}
			if(Assignment_08.areTheseAnagrams("uismmlmxgx", "slgmxmivxm") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'uismmlmxgx' and 'slgmxmivxm'");
			}
			if(Assignment_08.areTheseAnagrams("xtbnqsrhhw", "rwtqhhbsxn") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'xtbnqsrhhw' and 'rwtqhhbsxn'");
			}
			if(Assignment_08.areTheseAnagrams("vgtzvkwzye", "ztwksezvgy") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'vgtzvkwzye' and 'ztwksezvgy'");
			}
			if(Assignment_08.areTheseAnagrams("pioxharciv", "ixovarphic") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'pioxharciv' and 'ixovarphic'");
			}
			if(Assignment_08.areTheseAnagrams("gublacxibs", "xibhlbcasu") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'gublacxibs' and 'xibhlbcasu'");
			}
			if(Assignment_08.areTheseAnagrams("yxidlxzmjx", "xxdimlzjxy") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'yxidlxzmjx' and 'xxdimlzjxy'");
			}
			if(Assignment_08.areTheseAnagrams("qhdkywhefo", "fqykdehwoh") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'qhdkywhefo' and 'fqykdehwoh'");
			}
			if(Assignment_08.areTheseAnagrams("umdgdbziop", "zmpuddbiog") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'umdgdbziop' and 'zmpuddbiog'");
			}
			if(Assignment_08.areTheseAnagrams("xgcmsludkm", "vlgmkucsdm") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'xgcmsludkm' and 'vlgmkucsdm'");
			}
			if(Assignment_08.areTheseAnagrams("hvdxkgopvw", "vphgvkdxow") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'hvdxkgopvw' and 'vphgvkdxow'");
			}
			if(Assignment_08.areTheseAnagrams("ulbmryvmdk", "mdulvkmryb") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'ulbmryvmdk' and 'mdulvkmryb'");
			}
			if(Assignment_08.areTheseAnagrams("bczuwhmxwq", "ghqzwwxmuc") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'bczuwhmxwq' and 'ghqzwwxmuc'");
			}
			if(Assignment_08.areTheseAnagrams("ggqwjihgrx", "rjgwhxgiqv") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'ggqwjihgrx' and 'rjgwhxgiqv'");
			}
			if(Assignment_08.areTheseAnagrams("itibzprbsn", "bspibirtnz") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'itibzprbsn' and 'bspibirtnz'");
			}
			if(Assignment_08.areTheseAnagrams("mrgchvybzp", "zcbympgrhv") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'mrgchvybzp' and 'zcbympgrhv'");
			}
			if(Assignment_08.areTheseAnagrams("tdbemhuucm", "uudbcmemqh") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'tdbemhuucm' and 'uudbcmemqh'");
			}
			if(Assignment_08.areTheseAnagrams("qvioanejgk", "geaoniqkvj") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'qvioanejgk' and 'geaoniqkvj'");
			}
			if(Assignment_08.areTheseAnagrams("pyvyhwjtjo", "hystjvyjow") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'pyvyhwjtjo' and 'hystjvyjow'");
			}
			if(Assignment_08.areTheseAnagrams("pvyubcptpd", "tucybpdtpv") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'pvyubcptpd' and 'tucybpdtpv'");
			}
			if(Assignment_08.areTheseAnagrams("pchcfrpssb", "rsphcfbspc") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'pchcfrpssb' and 'rsphcfbspc'");
			}
			if(Assignment_08.areTheseAnagrams("yaejtjtanp", "ytnepjtjaa") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'yaejtjtanp' and 'ytnepjtjaa'");
			}
			if(Assignment_08.areTheseAnagrams("tipilpdpga", "gppiwiplda") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'tipilpdpga' and 'gppiwiplda'");
			}
			if(Assignment_08.areTheseAnagrams("hxkwsxdqwj", "wjysxqdxkw") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'hxkwsxdqwj' and 'wjysxqdxkw'");
			}
			if(Assignment_08.areTheseAnagrams("gsercwrqkc", "cswgrecqkr") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'gsercwrqkc' and 'cswgrecqkr'");
			}
			if(Assignment_08.areTheseAnagrams("znhgtpkbas", "shptnngkba") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'znhgtpkbas' and 'shptnngkba'");
			}
			if(Assignment_08.areTheseAnagrams("npxqcdkxen", "pckxqdnxne") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'npxqcdkxen' and 'pckxqdnxne'");
			}
			if(Assignment_08.areTheseAnagrams("eilnbgipaz", "bligeanpzi") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'eilnbgipaz' and 'bligeanpzi'");
			}
			if(Assignment_08.areTheseAnagrams("agvbffjyjc", "rjfygfjcbv") == true){
				throw new Exception("Error with the areTheseAnagrams method expected false for 'agvbffjyjc' and 'rjfygfjcbv'");
			}
			if(Assignment_08.areTheseAnagrams("zzjwsrseex", "wzerssxejz") == false){
				throw new Exception("Error with the areTheseAnagrams method expected true for 'zzjwsrseex' and 'wzerssxejz'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Ending testing for 08_33");

	}

}
