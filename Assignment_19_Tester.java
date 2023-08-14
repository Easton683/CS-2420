
public class Assignment_19_Tester {

	public static void main(String [] args) {
		System.out.println("Running tests for Assignment 19: Smaller trees first, then larger ones");
		BinaryNode<Integer> b = null;
		String s = null;
		boolean [] errors = {false, false, false, false, false};
		BinarySearchTree<Integer> t1 = new BinarySearchTree<Integer>();
		t1.insert( -954 );
		t1.insert( 138 );
		t1.insert( -553 );
		t1.insert( -228 );

		b = Assignment_19.findMin(t1);
		if(!errors[0] && (b == null || b.getElement() != -954)){
			errors[0] = true;
			System.err.println("For tree t1, error with findMin method: Expected -954 received " + b);
		}
		b = Assignment_19.findMax(t1);
		if(!errors[1] && (b == null || b.getElement() != 138)){
			errors[1] = true;
			System.err.println("For tree t1, error with findMax method: Expected 138 received " + b);
		}
		b = Assignment_19.find(-228, t1);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -228)){
			errors[2] = true;
			System.err.println("For tree t1, error with find method: Expected the node with -228 inside when looking for existing number");
		}
		b = Assignment_19.find(-788, t1);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t1, error with find method: Expected a null when looking for missing -788");
		}
		s = Assignment_19.toString(t1);
		if(!errors[4] && ! "-954, -553, -228, 138".equals(s)){
			errors[4] = true;
			System.err.println("For tree t1, error with toString method: Expected '-954, -553, -228, 138' received '" + s +"'");
		}

		BinarySearchTree<Integer> t2 = new BinarySearchTree<Integer>();
		t2.insert( -153 );
		t2.insert( -265 );
		t2.insert( -660 );
		t2.insert( 688 );

		b = Assignment_19.findMin(t2);
		if(!errors[0] && (b == null || b.getElement() != -660)){
			errors[0] = true;
			System.err.println("For tree t2, error with findMin method: Expected -660 received " + b);
		}
		b = Assignment_19.findMax(t2);
		if(!errors[1] && (b == null || b.getElement() != 688)){
			errors[1] = true;
			System.err.println("For tree t2, error with findMax method: Expected 688 received " + b);
		}
		b = Assignment_19.find(-265, t2);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -265)){
			errors[2] = true;
			System.err.println("For tree t2, error with find method: Expected the node with -265 inside when looking for existing number");
		}
		b = Assignment_19.find(860, t2);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t2, error with find method: Expected a null when looking for missing 860");
		}
		s = Assignment_19.toString(t2);
		if(!errors[4] && ! "-660, -265, -153, 688".equals(s)){
			errors[4] = true;
			System.err.println("For tree t2, error with toString method: Expected '-660, -265, -153, 688' received '" + s +"'");
		}

		BinarySearchTree<Integer> t3 = new BinarySearchTree<Integer>();
		t3.insert( -38 );
		t3.insert( -228 );

		b = Assignment_19.findMin(t3);
		if(!errors[0] && (b == null || b.getElement() != -228)){
			errors[0] = true;
			System.err.println("For tree t3, error with findMin method: Expected -228 received " + b);
		}
		b = Assignment_19.findMax(t3);
		if(!errors[1] && (b == null || b.getElement() != -38)){
			errors[1] = true;
			System.err.println("For tree t3, error with findMax method: Expected -38 received " + b);
		}
		b = Assignment_19.find(-228, t3);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -228)){
			errors[2] = true;
			System.err.println("For tree t3, error with find method: Expected the node with -228 inside when looking for existing number");
		}
		b = Assignment_19.find(90, t3);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t3, error with find method: Expected a null when looking for missing 90");
		}
		s = Assignment_19.toString(t3);
		if(!errors[4] && ! "-228, -38".equals(s)){
			errors[4] = true;
			System.err.println("For tree t3, error with toString method: Expected '-228, -38' received '" + s +"'");
		}

		BinarySearchTree<Integer> t4 = new BinarySearchTree<Integer>();
		t4.insert( -486 );
		t4.insert( -477 );

		b = Assignment_19.findMin(t4);
		if(!errors[0] && (b == null || b.getElement() != -486)){
			errors[0] = true;
			System.err.println("For tree t4, error with findMin method: Expected -486 received " + b);
		}
		b = Assignment_19.findMax(t4);
		if(!errors[1] && (b == null || b.getElement() != -477)){
			errors[1] = true;
			System.err.println("For tree t4, error with findMax method: Expected -477 received " + b);
		}
		b = Assignment_19.find(-486, t4);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -486)){
			errors[2] = true;
			System.err.println("For tree t4, error with find method: Expected the node with -486 inside when looking for existing number");
		}
		b = Assignment_19.find(110, t4);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t4, error with find method: Expected a null when looking for missing 110");
		}
		s = Assignment_19.toString(t4);
		if(!errors[4] && ! "-486, -477".equals(s)){
			errors[4] = true;
			System.err.println("For tree t4, error with toString method: Expected '-486, -477' received '" + s +"'");
		}

		BinarySearchTree<Integer> t5 = new BinarySearchTree<Integer>();
		t5.insert( -506 );
		t5.insert( -789 );
		t5.insert( -691 );
		t5.insert( -556 );
		t5.insert( 472 );
		t5.insert( -813 );

		b = Assignment_19.findMin(t5);
		if(!errors[0] && (b == null || b.getElement() != -813)){
			errors[0] = true;
			System.err.println("For tree t5, error with findMin method: Expected -813 received " + b);
		}
		b = Assignment_19.findMax(t5);
		if(!errors[1] && (b == null || b.getElement() != 472)){
			errors[1] = true;
			System.err.println("For tree t5, error with findMax method: Expected 472 received " + b);
		}
		b = Assignment_19.find(-691, t5);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -691)){
			errors[2] = true;
			System.err.println("For tree t5, error with find method: Expected the node with -691 inside when looking for existing number");
		}
		b = Assignment_19.find(-908, t5);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t5, error with find method: Expected a null when looking for missing -908");
		}
		s = Assignment_19.toString(t5);
		if(!errors[4] && ! "-813, -789, -691, -556, -506, 472".equals(s)){
			errors[4] = true;
			System.err.println("For tree t5, error with toString method: Expected '-813, -789, -691, -556, -506, 472' received '" + s +"'");
		}

		BinarySearchTree<Integer> t6 = new BinarySearchTree<Integer>();
		t6.insert( -222 );
		t6.insert( 881 );
		t6.insert( 176 );
		t6.insert( 284 );

		b = Assignment_19.findMin(t6);
		if(!errors[0] && (b == null || b.getElement() != -222)){
			errors[0] = true;
			System.err.println("For tree t6, error with findMin method: Expected -222 received " + b);
		}
		b = Assignment_19.findMax(t6);
		if(!errors[1] && (b == null || b.getElement() != 881)){
			errors[1] = true;
			System.err.println("For tree t6, error with findMax method: Expected 881 received " + b);
		}
		b = Assignment_19.find(284, t6);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 284)){
			errors[2] = true;
			System.err.println("For tree t6, error with find method: Expected the node with 284 inside when looking for existing number");
		}
		b = Assignment_19.find(333, t6);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t6, error with find method: Expected a null when looking for missing 333");
		}
		s = Assignment_19.toString(t6);
		if(!errors[4] && ! "-222, 176, 284, 881".equals(s)){
			errors[4] = true;
			System.err.println("For tree t6, error with toString method: Expected '-222, 176, 284, 881' received '" + s +"'");
		}

		BinarySearchTree<Integer> t7 = new BinarySearchTree<Integer>();
		t7.insert( 198 );
		t7.insert( 879 );

		b = Assignment_19.findMin(t7);
		if(!errors[0] && (b == null || b.getElement() != 198)){
			errors[0] = true;
			System.err.println("For tree t7, error with findMin method: Expected 198 received " + b);
		}
		b = Assignment_19.findMax(t7);
		if(!errors[1] && (b == null || b.getElement() != 879)){
			errors[1] = true;
			System.err.println("For tree t7, error with findMax method: Expected 879 received " + b);
		}
		b = Assignment_19.find(198, t7);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 198)){
			errors[2] = true;
			System.err.println("For tree t7, error with find method: Expected the node with 198 inside when looking for existing number");
		}
		b = Assignment_19.find(345, t7);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t7, error with find method: Expected a null when looking for missing 345");
		}
		s = Assignment_19.toString(t7);
		if(!errors[4] && ! "198, 879".equals(s)){
			errors[4] = true;
			System.err.println("For tree t7, error with toString method: Expected '198, 879' received '" + s +"'");
		}

		BinarySearchTree<Integer> t8 = new BinarySearchTree<Integer>();
		t8.insert( -783 );
		t8.insert( -916 );
		t8.insert( -951 );
		t8.insert( -810 );
		t8.insert( 351 );
		t8.insert( 215 );

		b = Assignment_19.findMin(t8);
		if(!errors[0] && (b == null || b.getElement() != -951)){
			errors[0] = true;
			System.err.println("For tree t8, error with findMin method: Expected -951 received " + b);
		}
		b = Assignment_19.findMax(t8);
		if(!errors[1] && (b == null || b.getElement() != 351)){
			errors[1] = true;
			System.err.println("For tree t8, error with findMax method: Expected 351 received " + b);
		}
		b = Assignment_19.find(215, t8);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 215)){
			errors[2] = true;
			System.err.println("For tree t8, error with find method: Expected the node with 215 inside when looking for existing number");
		}
		b = Assignment_19.find(109, t8);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t8, error with find method: Expected a null when looking for missing 109");
		}
		s = Assignment_19.toString(t8);
		if(!errors[4] && ! "-951, -916, -810, -783, 215, 351".equals(s)){
			errors[4] = true;
			System.err.println("For tree t8, error with toString method: Expected '-951, -916, -810, -783, 215, 351' received '" + s +"'");
		}

		BinarySearchTree<Integer> t9 = new BinarySearchTree<Integer>();
		t9.insert( 159 );
		t9.insert( -224 );

		b = Assignment_19.findMin(t9);
		if(!errors[0] && (b == null || b.getElement() != -224)){
			errors[0] = true;
			System.err.println("For tree t9, error with findMin method: Expected -224 received " + b);
		}
		b = Assignment_19.findMax(t9);
		if(!errors[1] && (b == null || b.getElement() != 159)){
			errors[1] = true;
			System.err.println("For tree t9, error with findMax method: Expected 159 received " + b);
		}
		b = Assignment_19.find(-224, t9);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -224)){
			errors[2] = true;
			System.err.println("For tree t9, error with find method: Expected the node with -224 inside when looking for existing number");
		}
		b = Assignment_19.find(-75, t9);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t9, error with find method: Expected a null when looking for missing -75");
		}
		s = Assignment_19.toString(t9);
		if(!errors[4] && ! "-224, 159".equals(s)){
			errors[4] = true;
			System.err.println("For tree t9, error with toString method: Expected '-224, 159' received '" + s +"'");
		}

		BinarySearchTree<Integer> t10 = new BinarySearchTree<Integer>();
		t10.insert( 817 );
		t10.insert( -12 );
		t10.insert( 592 );
		t10.insert( -208 );

		b = Assignment_19.findMin(t10);
		if(!errors[0] && (b == null || b.getElement() != -208)){
			errors[0] = true;
			System.err.println("For tree t10, error with findMin method: Expected -208 received " + b);
		}
		b = Assignment_19.findMax(t10);
		if(!errors[1] && (b == null || b.getElement() != 817)){
			errors[1] = true;
			System.err.println("For tree t10, error with findMax method: Expected 817 received " + b);
		}
		b = Assignment_19.find(592, t10);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 592)){
			errors[2] = true;
			System.err.println("For tree t10, error with find method: Expected the node with 592 inside when looking for existing number");
		}
		b = Assignment_19.find(-791, t10);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t10, error with find method: Expected a null when looking for missing -791");
		}
		s = Assignment_19.toString(t10);
		if(!errors[4] && ! "-208, -12, 592, 817".equals(s)){
			errors[4] = true;
			System.err.println("For tree t10, error with toString method: Expected '-208, -12, 592, 817' received '" + s +"'");
		}

		BinarySearchTree<Integer> t11 = new BinarySearchTree<Integer>();
		t11.insert( 548 );
		t11.insert( 254 );
		t11.insert( 490 );
		t11.insert( -647 );
		t11.insert( 103 );
		t11.insert( 156 );
		t11.insert( 220 );
		t11.insert( -293 );
		t11.insert( -921 );
		t11.insert( -70 );
		t11.insert( 277 );
		t11.insert( 781 );
		t11.insert( -85 );
		t11.insert( 336 );
		t11.insert( 339 );
		t11.insert( -473 );
		t11.insert( 929 );
		t11.insert( -403 );
		t11.insert( 629 );
		t11.insert( -9 );
		t11.insert( -466 );
		t11.insert( 661 );
		t11.insert( -485 );
		t11.insert( 40 );
		t11.insert( -345 );
		t11.insert( 93 );
		t11.insert( 188 );
		t11.insert( 888 );
		t11.insert( -417 );
		t11.insert( -575 );
		t11.insert( -381 );
		t11.insert( -363 );
		t11.insert( -585 );
		t11.insert( 915 );
		t11.insert( 571 );
		t11.insert( 327 );
		t11.insert( -253 );
		t11.insert( -676 );
		t11.insert( 247 );
		t11.insert( -967 );
		t11.insert( -698 );
		t11.insert( 162 );
		t11.insert( -283 );
		t11.insert( 553 );
		t11.insert( -561 );
		t11.insert( 206 );
		t11.insert( -21 );
		t11.insert( 448 );
		t11.insert( 444 );
		t11.insert( 226 );
		t11.insert( 173 );
		t11.insert( -531 );
		t11.insert( -320 );
		t11.insert( -270 );
		t11.insert( -413 );
		t11.insert( -917 );
		t11.insert( 856 );
		t11.insert( -721 );
		t11.insert( -552 );
		t11.insert( -342 );
		t11.insert( -650 );
		t11.insert( -788 );
		t11.insert( -17 );
		t11.insert( 611 );
		t11.insert( 483 );
		t11.insert( 50 );
		t11.insert( 271 );
		t11.insert( -409 );
		t11.insert( 316 );
		t11.insert( -551 );
		t11.insert( 72 );
		t11.insert( -427 );
		t11.insert( -370 );
		t11.insert( -846 );
		t11.insert( -36 );
		t11.insert( 688 );
		t11.insert( -484 );
		t11.insert( -916 );
		t11.insert( 921 );
		t11.insert( -504 );
		t11.insert( -729 );
		t11.insert( 425 );
		t11.insert( 753 );
		t11.insert( 466 );
		t11.insert( 133 );
		t11.insert( -611 );
		t11.insert( 677 );
		t11.insert( 546 );
		t11.insert( -189 );
		t11.insert( 172 );
		t11.insert( 798 );
		t11.insert( -257 );
		t11.insert( 715 );
		t11.insert( -424 );
		t11.insert( 213 );
		t11.insert( 946 );
		t11.insert( -629 );
		t11.insert( 704 );
		t11.insert( 55 );
		t11.insert( -478 );
		t11.insert( -732 );
		t11.insert( -88 );
		t11.insert( 903 );
		t11.insert( -830 );
		t11.insert( -964 );
		t11.insert( -276 );
		t11.insert( 999 );
		t11.insert( -51 );
		t11.insert( -723 );
		t11.insert( 560 );
		t11.insert( 341 );
		t11.insert( 63 );
		t11.insert( 136 );
		t11.insert( 443 );
		t11.insert( 827 );
		t11.insert( -663 );
		t11.insert( 305 );
		t11.insert( -212 );
		t11.insert( 166 );
		t11.insert( 830 );
		t11.insert( 623 );
		t11.insert( 960 );
		t11.insert( -11 );
		t11.insert( -282 );
		t11.insert( -16 );
		t11.insert( -668 );
		t11.insert( -751 );
		t11.insert( -735 );
		t11.insert( -578 );
		t11.insert( 197 );
		t11.insert( -291 );
		t11.insert( 995 );
		t11.insert( 170 );
		t11.insert( 458 );
		t11.insert( -446 );
		t11.insert( -814 );
		t11.insert( 36 );

		b = Assignment_19.findMin(t11);
		if(!errors[0] && (b == null || b.getElement() != -967)){
			errors[0] = true;
			System.err.println("For tree t11, error with findMin method: Expected -967 received " + b);
		}
		b = Assignment_19.findMax(t11);
		if(!errors[1] && (b == null || b.getElement() != 999)){
			errors[1] = true;
			System.err.println("For tree t11, error with findMax method: Expected 999 received " + b);
		}
		b = Assignment_19.find(-270, t11);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -270)){
			errors[2] = true;
			System.err.println("For tree t11, error with find method: Expected the node with -270 inside when looking for existing number");
		}
		b = Assignment_19.find(-304, t11);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t11, error with find method: Expected a null when looking for missing -304");
		}
		s = Assignment_19.toString(t11);
		if(!errors[4] && ! "-967, -964, -921, -917, -916, -846, -830, -814, -788, -751, -735, -732, -729, -723, -721, -698, -676, -668, -663, -650, -647, -629, -611, -585, -578, -575, -561, -552, -551, -531, -504, -485, -484, -478, -473, -466, -446, -427, -424, -417, -413, -409, -403, -381, -370, -363, -345, -342, -320, -293, -291, -283, -282, -276, -270, -257, -253, -212, -189, -88, -85, -70, -51, -36, -21, -17, -16, -11, -9, 36, 40, 50, 55, 63, 72, 93, 103, 133, 136, 156, 162, 166, 170, 172, 173, 188, 197, 206, 213, 220, 226, 247, 254, 271, 277, 305, 316, 327, 336, 339, 341, 425, 443, 444, 448, 458, 466, 483, 490, 546, 548, 553, 560, 571, 611, 623, 629, 661, 677, 688, 704, 715, 753, 781, 798, 827, 830, 856, 888, 903, 915, 921, 929, 946, 960, 995, 999".equals(s)){
			errors[4] = true;
			System.err.println("For tree t11, error with toString method: Expected '-967, -964, -921, -917, -916, -846, -830, -814, -788, -751, -735, -732, -729, -723, -721, -698, -676, -668, -663, -650, -647, -629, -611, -585, -578, -575, -561, -552, -551, -531, -504, -485, -484, -478, -473, -466, -446, -427, -424, -417, -413, -409, -403, -381, -370, -363, -345, -342, -320, -293, -291, -283, -282, -276, -270, -257, -253, -212, -189, -88, -85, -70, -51, -36, -21, -17, -16, -11, -9, 36, 40, 50, 55, 63, 72, 93, 103, 133, 136, 156, 162, 166, 170, 172, 173, 188, 197, 206, 213, 220, 226, 247, 254, 271, 277, 305, 316, 327, 336, 339, 341, 425, 443, 444, 448, 458, 466, 483, 490, 546, 548, 553, 560, 571, 611, 623, 629, 661, 677, 688, 704, 715, 753, 781, 798, 827, 830, 856, 888, 903, 915, 921, 929, 946, 960, 995, 999' received '" + s +"'");
		}
		BinarySearchTree<Integer> t12 = new BinarySearchTree<Integer>();
		t12.insert( 735 );
		t12.insert( -719 );
		t12.insert( 347 );
		t12.insert( -844 );
		t12.insert( 268 );
		t12.insert( -312 );
		t12.insert( 103 );
		t12.insert( 931 );
		t12.insert( 509 );
		t12.insert( -345 );
		t12.insert( -487 );
		t12.insert( -151 );
		t12.insert( 265 );
		t12.insert( 932 );
		t12.insert( 85 );
		t12.insert( 256 );
		t12.insert( 98 );
		t12.insert( 402 );
		t12.insert( -777 );
		t12.insert( -561 );
		t12.insert( 720 );
		t12.insert( 194 );
		t12.insert( -347 );
		t12.insert( -287 );
		t12.insert( -50 );
		t12.insert( 749 );
		t12.insert( 599 );
		t12.insert( -556 );
		t12.insert( -136 );
		t12.insert( -211 );
		t12.insert( -842 );
		t12.insert( -966 );
		t12.insert( 64 );
		t12.insert( -405 );
		t12.insert( 102 );
		t12.insert( 168 );
		t12.insert( 770 );
		t12.insert( 544 );
		t12.insert( 730 );
		t12.insert( -77 );
		t12.insert( 830 );
		t12.insert( 406 );
		t12.insert( 218 );
		t12.insert( -343 );
		t12.insert( 696 );
		t12.insert( 553 );
		t12.insert( 481 );
		t12.insert( 109 );
		t12.insert( 897 );
		t12.insert( -40 );
		t12.insert( -491 );
		t12.insert( 512 );

		b = Assignment_19.findMin(t12);
		if(!errors[0] && (b == null || b.getElement() != -966)){
			errors[0] = true;
			System.err.println("For tree t12, error with findMin method: Expected -966 received " + b);
		}
		b = Assignment_19.findMax(t12);
		if(!errors[1] && (b == null || b.getElement() != 932)){
			errors[1] = true;
			System.err.println("For tree t12, error with findMax method: Expected 932 received " + b);
		}
		b = Assignment_19.find(347, t12);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 347)){
			errors[2] = true;
			System.err.println("For tree t12, error with find method: Expected the node with 347 inside when looking for existing number");
		}
		b = Assignment_19.find(-401, t12);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t12, error with find method: Expected a null when looking for missing -401");
		}
		s = Assignment_19.toString(t12);
		if(!errors[4] && ! "-966, -844, -842, -777, -719, -561, -556, -491, -487, -405, -347, -345, -343, -312, -287, -211, -151, -136, -77, -50, -40, 64, 85, 98, 102, 103, 109, 168, 194, 218, 256, 265, 268, 347, 402, 406, 481, 509, 512, 544, 553, 599, 696, 720, 730, 735, 749, 770, 830, 897, 931, 932".equals(s)){
			errors[4] = true;
			System.err.println("For tree t12, error with toString method: Expected '-966, -844, -842, -777, -719, -561, -556, -491, -487, -405, -347, -345, -343, -312, -287, -211, -151, -136, -77, -50, -40, 64, 85, 98, 102, 103, 109, 168, 194, 218, 256, 265, 268, 347, 402, 406, 481, 509, 512, 544, 553, 599, 696, 720, 730, 735, 749, 770, 830, 897, 931, 932' received '" + s +"'");
		}
		BinarySearchTree<Integer> t13 = new BinarySearchTree<Integer>();
		t13.insert( -830 );
		t13.insert( 562 );
		t13.insert( -291 );
		t13.insert( -397 );
		t13.insert( -504 );
		t13.insert( -337 );
		t13.insert( 274 );
		t13.insert( 537 );
		t13.insert( -769 );
		t13.insert( -416 );
		t13.insert( -970 );
		t13.insert( -803 );
		t13.insert( -749 );
		t13.insert( -286 );
		t13.insert( -699 );
		t13.insert( -513 );
		t13.insert( 205 );
		t13.insert( 894 );
		t13.insert( 102 );
		t13.insert( -372 );
		t13.insert( 78 );
		t13.insert( -290 );
		t13.insert( -178 );
		t13.insert( -316 );
		t13.insert( 150 );
		t13.insert( 684 );
		t13.insert( -897 );
		t13.insert( 18 );
		t13.insert( -321 );
		t13.insert( -20 );
		t13.insert( 108 );
		t13.insert( -447 );
		t13.insert( -462 );
		t13.insert( -861 );
		t13.insert( 745 );
		t13.insert( -525 );
		t13.insert( -733 );
		t13.insert( 701 );
		t13.insert( 387 );
		t13.insert( 891 );
		t13.insert( -238 );
		t13.insert( -700 );
		t13.insert( 869 );
		t13.insert( 290 );
		t13.insert( 785 );
		t13.insert( -402 );
		t13.insert( -458 );
		t13.insert( -727 );
		t13.insert( -199 );
		t13.insert( 784 );
		t13.insert( 570 );
		t13.insert( 599 );
		t13.insert( -965 );
		t13.insert( -552 );
		t13.insert( 365 );
		t13.insert( -43 );
		t13.insert( -597 );
		t13.insert( 579 );
		t13.insert( 587 );
		t13.insert( -924 );
		t13.insert( -791 );
		t13.insert( 48 );
		t13.insert( -640 );
		t13.insert( 693 );
		t13.insert( -503 );
		t13.insert( -960 );
		t13.insert( 540 );
		t13.insert( -34 );
		t13.insert( 792 );
		t13.insert( 870 );
		t13.insert( 313 );
		t13.insert( -613 );
		t13.insert( -172 );
		t13.insert( -202 );
		t13.insert( 731 );
		t13.insert( -411 );
		t13.insert( -271 );
		t13.insert( -468 );
		t13.insert( -350 );
		t13.insert( -770 );
		t13.insert( -817 );
		t13.insert( -322 );
		t13.insert( 939 );
		t13.insert( -301 );
		t13.insert( -909 );
		t13.insert( 617 );
		t13.insert( -346 );
		t13.insert( 942 );
		t13.insert( -393 );
		t13.insert( 651 );
		t13.insert( 764 );
		t13.insert( -267 );
		t13.insert( -413 );
		t13.insert( 516 );
		t13.insert( -183 );
		t13.insert( -832 );
		t13.insert( -187 );
		t13.insert( 833 );
		t13.insert( 580 );
		t13.insert( 437 );
		t13.insert( -689 );
		t13.insert( -705 );
		t13.insert( -940 );
		t13.insert( 986 );
		t13.insert( 633 );
		t13.insert( 987 );
		t13.insert( -531 );
		t13.insert( 487 );
		t13.insert( 397 );
		t13.insert( 143 );
		t13.insert( 753 );
		t13.insert( -586 );
		t13.insert( -483 );
		t13.insert( 362 );
		t13.insert( 100 );
		t13.insert( -510 );
		t13.insert( 578 );
		t13.insert( 834 );
		t13.insert( -460 );
		t13.insert( 145 );
		t13.insert( 685 );
		t13.insert( 676 );
		t13.insert( 23 );
		t13.insert( 17 );
		t13.insert( -356 );
		t13.insert( 940 );
		t13.insert( 657 );
		t13.insert( 605 );
		t13.insert( 932 );
		t13.insert( 968 );
		t13.insert( -622 );
		t13.insert( -123 );
		t13.insert( 544 );
		t13.insert( -878 );
		t13.insert( -618 );
		t13.insert( -169 );
		t13.insert( 3 );
		t13.insert( -836 );
		t13.insert( -297 );

		b = Assignment_19.findMin(t13);
		if(!errors[0] && (b == null || b.getElement() != -970)){
			errors[0] = true;
			System.err.println("For tree t13, error with findMin method: Expected -970 received " + b);
		}
		b = Assignment_19.findMax(t13);
		if(!errors[1] && (b == null || b.getElement() != 987)){
			errors[1] = true;
			System.err.println("For tree t13, error with findMax method: Expected 987 received " + b);
		}
		b = Assignment_19.find(23, t13);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 23)){
			errors[2] = true;
			System.err.println("For tree t13, error with find method: Expected the node with 23 inside when looking for existing number");
		}
		b = Assignment_19.find(-641, t13);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t13, error with find method: Expected a null when looking for missing -641");
		}
		s = Assignment_19.toString(t13);
		if(!errors[4] && ! "-970, -965, -960, -940, -924, -909, -897, -878, -861, -836, -832, -830, -817, -803, -791, -770, -769, -749, -733, -727, -705, -700, -699, -689, -640, -622, -618, -613, -597, -586, -552, -531, -525, -513, -510, -504, -503, -483, -468, -462, -460, -458, -447, -416, -413, -411, -402, -397, -393, -372, -356, -350, -346, -337, -322, -321, -316, -301, -297, -291, -290, -286, -271, -267, -238, -202, -199, -187, -183, -178, -172, -169, -123, -43, -34, -20, 3, 17, 18, 23, 48, 78, 100, 102, 108, 143, 145, 150, 205, 274, 290, 313, 362, 365, 387, 397, 437, 487, 516, 537, 540, 544, 562, 570, 578, 579, 580, 587, 599, 605, 617, 633, 651, 657, 676, 684, 685, 693, 701, 731, 745, 753, 764, 784, 785, 792, 833, 834, 869, 870, 891, 894, 932, 939, 940, 942, 968, 986, 987".equals(s)){
			errors[4] = true;
			System.err.println("For tree t13, error with toString method: Expected '-970, -965, -960, -940, -924, -909, -897, -878, -861, -836, -832, -830, -817, -803, -791, -770, -769, -749, -733, -727, -705, -700, -699, -689, -640, -622, -618, -613, -597, -586, -552, -531, -525, -513, -510, -504, -503, -483, -468, -462, -460, -458, -447, -416, -413, -411, -402, -397, -393, -372, -356, -350, -346, -337, -322, -321, -316, -301, -297, -291, -290, -286, -271, -267, -238, -202, -199, -187, -183, -178, -172, -169, -123, -43, -34, -20, 3, 17, 18, 23, 48, 78, 100, 102, 108, 143, 145, 150, 205, 274, 290, 313, 362, 365, 387, 397, 437, 487, 516, 537, 540, 544, 562, 570, 578, 579, 580, 587, 599, 605, 617, 633, 651, 657, 676, 684, 685, 693, 701, 731, 745, 753, 764, 784, 785, 792, 833, 834, 869, 870, 891, 894, 932, 939, 940, 942, 968, 986, 987' received '" + s +"'");
		}
		BinarySearchTree<Integer> t14 = new BinarySearchTree<Integer>();
		t14.insert( 24 );
		t14.insert( -945 );
		t14.insert( 242 );
		t14.insert( -403 );
		t14.insert( -471 );
		t14.insert( -96 );
		t14.insert( -415 );
		t14.insert( 258 );
		t14.insert( -250 );
		t14.insert( -842 );
		t14.insert( 279 );
		t14.insert( -410 );
		t14.insert( -882 );
		t14.insert( -609 );
		t14.insert( 905 );
		t14.insert( -9 );
		t14.insert( -745 );
		t14.insert( -340 );
		t14.insert( 686 );
		t14.insert( 196 );
		t14.insert( -102 );
		t14.insert( 246 );
		t14.insert( -844 );
		t14.insert( 830 );
		t14.insert( -585 );
		t14.insert( -772 );
		t14.insert( -643 );
		t14.insert( -677 );
		t14.insert( -303 );
		t14.insert( -468 );
		t14.insert( 99 );
		t14.insert( -744 );
		t14.insert( 661 );
		t14.insert( 584 );
		t14.insert( -541 );
		t14.insert( 219 );
		t14.insert( -937 );
		t14.insert( -240 );
		t14.insert( 499 );
		t14.insert( -121 );
		t14.insert( 856 );
		t14.insert( -557 );
		t14.insert( -971 );
		t14.insert( 80 );
		t14.insert( 7 );
		t14.insert( -262 );
		t14.insert( 55 );
		t14.insert( -405 );
		t14.insert( -755 );
		t14.insert( 559 );
		t14.insert( 634 );
		t14.insert( -683 );
		t14.insert( 78 );
		t14.insert( 208 );
		t14.insert( -273 );
		t14.insert( -359 );
		t14.insert( 118 );
		t14.insert( 373 );
		t14.insert( 859 );
		t14.insert( 107 );
		t14.insert( -349 );
		t14.insert( -34 );
		t14.insert( 445 );
		t14.insert( 399 );
		t14.insert( 329 );
		t14.insert( 163 );
		t14.insert( -127 );
		t14.insert( -710 );
		t14.insert( 815 );
		t14.insert( 727 );
		t14.insert( 259 );
		t14.insert( -721 );
		t14.insert( 170 );
		t14.insert( -170 );
		t14.insert( -860 );
		t14.insert( 748 );
		t14.insert( 987 );
		t14.insert( 185 );
		t14.insert( 352 );
		t14.insert( 510 );
		t14.insert( -365 );
		t14.insert( -623 );
		t14.insert( 145 );
		t14.insert( 947 );
		t14.insert( -573 );
		t14.insert( 460 );
		t14.insert( -507 );
		t14.insert( 558 );
		t14.insert( 187 );
		t14.insert( 8 );
		t14.insert( 322 );
		t14.insert( 212 );
		t14.insert( -728 );
		t14.insert( -430 );
		t14.insert( 134 );
		t14.insert( -840 );
		t14.insert( 552 );
		t14.insert( 538 );
		t14.insert( 144 );
		t14.insert( -241 );
		t14.insert( 112 );
		t14.insert( 186 );
		t14.insert( 672 );
		t14.insert( -514 );
		t14.insert( 984 );
		t14.insert( 436 );
		t14.insert( 658 );
		t14.insert( -658 );
		t14.insert( 478 );
		t14.insert( 853 );
		t14.insert( -104 );
		t14.insert( -493 );
		t14.insert( 412 );
		t14.insert( -705 );
		t14.insert( 869 );
		t14.insert( -225 );
		t14.insert( 829 );
		t14.insert( -355 );
		t14.insert( -69 );
		t14.insert( 137 );
		t14.insert( -285 );
		t14.insert( 938 );
		t14.insert( -267 );
		t14.insert( 607 );
		t14.insert( 272 );
		t14.insert( 288 );
		t14.insert( -921 );
		t14.insert( 294 );
		t14.insert( -792 );
		t14.insert( -480 );
		t14.insert( -830 );
		t14.insert( -321 );
		t14.insert( -547 );
		t14.insert( -103 );
		t14.insert( -364 );
		t14.insert( 200 );
		t14.insert( 518 );

		b = Assignment_19.findMin(t14);
		if(!errors[0] && (b == null || b.getElement() != -971)){
			errors[0] = true;
			System.err.println("For tree t14, error with findMin method: Expected -971 received " + b);
		}
		b = Assignment_19.findMax(t14);
		if(!errors[1] && (b == null || b.getElement() != 987)){
			errors[1] = true;
			System.err.println("For tree t14, error with findMax method: Expected 987 received " + b);
		}
		b = Assignment_19.find(-609, t14);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -609)){
			errors[2] = true;
			System.err.println("For tree t14, error with find method: Expected the node with -609 inside when looking for existing number");
		}
		b = Assignment_19.find(515, t14);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t14, error with find method: Expected a null when looking for missing 515");
		}
		s = Assignment_19.toString(t14);
		if(!errors[4] && ! "-971, -945, -937, -921, -882, -860, -844, -842, -840, -830, -792, -772, -755, -745, -744, -728, -721, -710, -705, -683, -677, -658, -643, -623, -609, -585, -573, -557, -547, -541, -514, -507, -493, -480, -471, -468, -430, -415, -410, -405, -403, -365, -364, -359, -355, -349, -340, -321, -303, -285, -273, -267, -262, -250, -241, -240, -225, -170, -127, -121, -104, -103, -102, -96, -69, -34, -9, 7, 8, 24, 55, 78, 80, 99, 107, 112, 118, 134, 137, 144, 145, 163, 170, 185, 186, 187, 196, 200, 208, 212, 219, 242, 246, 258, 259, 272, 279, 288, 294, 322, 329, 352, 373, 399, 412, 436, 445, 460, 478, 499, 510, 518, 538, 552, 558, 559, 584, 607, 634, 658, 661, 672, 686, 727, 748, 815, 829, 830, 853, 856, 859, 869, 905, 938, 947, 984, 987".equals(s)){
			errors[4] = true;
			System.err.println("For tree t14, error with toString method: Expected '-971, -945, -937, -921, -882, -860, -844, -842, -840, -830, -792, -772, -755, -745, -744, -728, -721, -710, -705, -683, -677, -658, -643, -623, -609, -585, -573, -557, -547, -541, -514, -507, -493, -480, -471, -468, -430, -415, -410, -405, -403, -365, -364, -359, -355, -349, -340, -321, -303, -285, -273, -267, -262, -250, -241, -240, -225, -170, -127, -121, -104, -103, -102, -96, -69, -34, -9, 7, 8, 24, 55, 78, 80, 99, 107, 112, 118, 134, 137, 144, 145, 163, 170, 185, 186, 187, 196, 200, 208, 212, 219, 242, 246, 258, 259, 272, 279, 288, 294, 322, 329, 352, 373, 399, 412, 436, 445, 460, 478, 499, 510, 518, 538, 552, 558, 559, 584, 607, 634, 658, 661, 672, 686, 727, 748, 815, 829, 830, 853, 856, 859, 869, 905, 938, 947, 984, 987' received '" + s +"'");
		}
		BinarySearchTree<Integer> t15 = new BinarySearchTree<Integer>();
		t15.insert( 972 );
		t15.insert( 122 );
		t15.insert( 969 );
		t15.insert( 869 );
		t15.insert( 233 );
		t15.insert( 415 );
		t15.insert( 765 );
		t15.insert( -655 );
		t15.insert( -391 );
		t15.insert( 565 );
		t15.insert( 920 );
		t15.insert( -316 );
		t15.insert( -78 );
		t15.insert( -420 );
		t15.insert( 638 );
		t15.insert( 621 );
		t15.insert( -454 );
		t15.insert( 35 );
		t15.insert( 309 );
		t15.insert( -400 );
		t15.insert( 74 );
		t15.insert( 646 );
		t15.insert( -884 );
		t15.insert( 368 );
		t15.insert( -525 );
		t15.insert( -191 );
		t15.insert( 594 );
		t15.insert( -704 );
		t15.insert( 126 );
		t15.insert( -784 );
		t15.insert( 425 );
		t15.insert( 985 );
		t15.insert( -124 );
		t15.insert( 340 );
		t15.insert( -352 );
		t15.insert( -851 );
		t15.insert( -87 );
		t15.insert( -44 );
		t15.insert( -458 );
		t15.insert( 458 );
		t15.insert( 136 );
		t15.insert( -313 );
		t15.insert( -522 );
		t15.insert( -410 );
		t15.insert( 480 );
		t15.insert( -930 );
		t15.insert( 194 );
		t15.insert( 538 );
		t15.insert( -355 );
		t15.insert( -432 );
		t15.insert( 153 );
		t15.insert( 936 );
		t15.insert( 620 );
		t15.insert( 571 );
		t15.insert( -95 );
		t15.insert( 98 );
		t15.insert( -518 );
		t15.insert( -471 );
		t15.insert( 702 );
		t15.insert( 241 );
		t15.insert( 2 );
		t15.insert( -939 );
		t15.insert( -952 );
		t15.insert( -490 );
		t15.insert( -151 );
		t15.insert( 129 );
		t15.insert( 218 );
		t15.insert( -746 );
		t15.insert( 308 );
		t15.insert( 197 );

		b = Assignment_19.findMin(t15);
		if(!errors[0] && (b == null || b.getElement() != -952)){
			errors[0] = true;
			System.err.println("For tree t15, error with findMin method: Expected -952 received " + b);
		}
		b = Assignment_19.findMax(t15);
		if(!errors[1] && (b == null || b.getElement() != 985)){
			errors[1] = true;
			System.err.println("For tree t15, error with findMax method: Expected 985 received " + b);
		}
		b = Assignment_19.find(538, t15);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 538)){
			errors[2] = true;
			System.err.println("For tree t15, error with find method: Expected the node with 538 inside when looking for existing number");
		}
		b = Assignment_19.find(319, t15);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t15, error with find method: Expected a null when looking for missing 319");
		}
		s = Assignment_19.toString(t15);
		if(!errors[4] && ! "-952, -939, -930, -884, -851, -784, -746, -704, -655, -525, -522, -518, -490, -471, -458, -454, -432, -420, -410, -400, -391, -355, -352, -316, -313, -191, -151, -124, -95, -87, -78, -44, 2, 35, 74, 98, 122, 126, 129, 136, 153, 194, 197, 218, 233, 241, 308, 309, 340, 368, 415, 425, 458, 480, 538, 565, 571, 594, 620, 621, 638, 646, 702, 765, 869, 920, 936, 969, 972, 985".equals(s)){
			errors[4] = true;
			System.err.println("For tree t15, error with toString method: Expected '-952, -939, -930, -884, -851, -784, -746, -704, -655, -525, -522, -518, -490, -471, -458, -454, -432, -420, -410, -400, -391, -355, -352, -316, -313, -191, -151, -124, -95, -87, -78, -44, 2, 35, 74, 98, 122, 126, 129, 136, 153, 194, 197, 218, 233, 241, 308, 309, 340, 368, 415, 425, 458, 480, 538, 565, 571, 594, 620, 621, 638, 646, 702, 765, 869, 920, 936, 969, 972, 985' received '" + s +"'");
		}
		BinarySearchTree<Integer> t16 = new BinarySearchTree<Integer>();
		t16.insert( 625 );
		t16.insert( 958 );
		t16.insert( 43 );
		t16.insert( 225 );
		t16.insert( 568 );
		t16.insert( 567 );
		t16.insert( -903 );
		t16.insert( 871 );
		t16.insert( -932 );
		t16.insert( -330 );
		t16.insert( -622 );
		t16.insert( 704 );
		t16.insert( -859 );
		t16.insert( -369 );
		t16.insert( 725 );
		t16.insert( 848 );
		t16.insert( -713 );
		t16.insert( -78 );
		t16.insert( -599 );
		t16.insert( -651 );
		t16.insert( -997 );
		t16.insert( 962 );
		t16.insert( 992 );
		t16.insert( 128 );
		t16.insert( -315 );
		t16.insert( 678 );
		t16.insert( 700 );
		t16.insert( -666 );
		t16.insert( 574 );
		t16.insert( -212 );
		t16.insert( 778 );
		t16.insert( 986 );
		t16.insert( -701 );
		t16.insert( 894 );
		t16.insert( 334 );
		t16.insert( 715 );
		t16.insert( 4 );
		t16.insert( 646 );
		t16.insert( 673 );
		t16.insert( 275 );
		t16.insert( -933 );
		t16.insert( 367 );
		t16.insert( -136 );
		t16.insert( 540 );
		t16.insert( 926 );
		t16.insert( 892 );
		t16.insert( -658 );
		t16.insert( 752 );
		t16.insert( -371 );
		t16.insert( 999 );
		t16.insert( 610 );
		t16.insert( 281 );
		t16.insert( 278 );
		t16.insert( -551 );
		t16.insert( 995 );
		t16.insert( 472 );
		t16.insert( 106 );
		t16.insert( 898 );
		t16.insert( 313 );
		t16.insert( -591 );
		t16.insert( 148 );
		t16.insert( -520 );
		t16.insert( 291 );
		t16.insert( 260 );
		t16.insert( 345 );
		t16.insert( -297 );
		t16.insert( 377 );
		t16.insert( 75 );
		t16.insert( 234 );
		t16.insert( 261 );
		t16.insert( -645 );
		t16.insert( -372 );
		t16.insert( 511 );
		t16.insert( -621 );
		t16.insert( -55 );
		t16.insert( -324 );
		t16.insert( -427 );
		t16.insert( -484 );
		t16.insert( 799 );
		t16.insert( -443 );
		t16.insert( -38 );
		t16.insert( -568 );
		t16.insert( -145 );
		t16.insert( 259 );
		t16.insert( 536 );
		t16.insert( 254 );
		t16.insert( -282 );
		t16.insert( -123 );
		t16.insert( -868 );
		t16.insert( -505 );
		t16.insert( 614 );
		t16.insert( -486 );
		t16.insert( 246 );
		t16.insert( -529 );
		t16.insert( -507 );
		t16.insert( -109 );
		t16.insert( -865 );
		t16.insert( -923 );
		t16.insert( 212 );
		t16.insert( -915 );
		t16.insert( 250 );
		t16.insert( -759 );
		t16.insert( -161 );
		t16.insert( -382 );
		t16.insert( 91 );
		t16.insert( -727 );
		t16.insert( 121 );
		t16.insert( -974 );
		t16.insert( 708 );
		t16.insert( 301 );
		t16.insert( -332 );
		t16.insert( 48 );
		t16.insert( -357 );
		t16.insert( -502 );
		t16.insert( -880 );
		t16.insert( 6 );
		t16.insert( 980 );
		t16.insert( 338 );
		t16.insert( 904 );
		t16.insert( -313 );
		t16.insert( 41 );
		t16.insert( 907 );
		t16.insert( -245 );
		t16.insert( 575 );
		t16.insert( -441 );
		t16.insert( -267 );
		t16.insert( 187 );
		t16.insert( -465 );
		t16.insert( 229 );
		t16.insert( -806 );
		t16.insert( 705 );
		t16.insert( 433 );
		t16.insert( 208 );
		t16.insert( 782 );
		t16.insert( 171 );
		t16.insert( -237 );
		t16.insert( -812 );
		t16.insert( 95 );
		t16.insert( -244 );
		t16.insert( 88 );
		t16.insert( 446 );
		t16.insert( 465 );
		t16.insert( 414 );

		b = Assignment_19.findMin(t16);
		if(!errors[0] && (b == null || b.getElement() != -997)){
			errors[0] = true;
			System.err.println("For tree t16, error with findMin method: Expected -997 received " + b);
		}
		b = Assignment_19.findMax(t16);
		if(!errors[1] && (b == null || b.getElement() != 999)){
			errors[1] = true;
			System.err.println("For tree t16, error with findMax method: Expected 999 received " + b);
		}
		b = Assignment_19.find(-812, t16);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -812)){
			errors[2] = true;
			System.err.println("For tree t16, error with find method: Expected the node with -812 inside when looking for existing number");
		}
		b = Assignment_19.find(160, t16);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t16, error with find method: Expected a null when looking for missing 160");
		}
		s = Assignment_19.toString(t16);
		if(!errors[4] && ! "-997, -974, -933, -932, -923, -915, -903, -880, -868, -865, -859, -812, -806, -759, -727, -713, -701, -666, -658, -651, -645, -622, -621, -599, -591, -568, -551, -529, -520, -507, -505, -502, -486, -484, -465, -443, -441, -427, -382, -372, -371, -369, -357, -332, -330, -324, -315, -313, -297, -282, -267, -245, -244, -237, -212, -161, -145, -136, -123, -109, -78, -55, -38, 4, 6, 41, 43, 48, 75, 88, 91, 95, 106, 121, 128, 148, 171, 187, 208, 212, 225, 229, 234, 246, 250, 254, 259, 260, 261, 275, 278, 281, 291, 301, 313, 334, 338, 345, 367, 377, 414, 433, 446, 465, 472, 511, 536, 540, 567, 568, 574, 575, 610, 614, 625, 646, 673, 678, 700, 704, 705, 708, 715, 725, 752, 778, 782, 799, 848, 871, 892, 894, 898, 904, 907, 926, 958, 962, 980, 986, 992, 995, 999".equals(s)){
			errors[4] = true;
			System.err.println("For tree t16, error with toString method: Expected '-997, -974, -933, -932, -923, -915, -903, -880, -868, -865, -859, -812, -806, -759, -727, -713, -701, -666, -658, -651, -645, -622, -621, -599, -591, -568, -551, -529, -520, -507, -505, -502, -486, -484, -465, -443, -441, -427, -382, -372, -371, -369, -357, -332, -330, -324, -315, -313, -297, -282, -267, -245, -244, -237, -212, -161, -145, -136, -123, -109, -78, -55, -38, 4, 6, 41, 43, 48, 75, 88, 91, 95, 106, 121, 128, 148, 171, 187, 208, 212, 225, 229, 234, 246, 250, 254, 259, 260, 261, 275, 278, 281, 291, 301, 313, 334, 338, 345, 367, 377, 414, 433, 446, 465, 472, 511, 536, 540, 567, 568, 574, 575, 610, 614, 625, 646, 673, 678, 700, 704, 705, 708, 715, 725, 752, 778, 782, 799, 848, 871, 892, 894, 898, 904, 907, 926, 958, 962, 980, 986, 992, 995, 999' received '" + s +"'");
		}
		BinarySearchTree<Integer> t17 = new BinarySearchTree<Integer>();
		t17.insert( -162 );
		t17.insert( 999 );
		t17.insert( 571 );
		t17.insert( 870 );
		t17.insert( 538 );
		t17.insert( -495 );
		t17.insert( -324 );
		t17.insert( -897 );
		t17.insert( 224 );
		t17.insert( -405 );
		t17.insert( 278 );
		t17.insert( 982 );
		t17.insert( 374 );
		t17.insert( -482 );
		t17.insert( 683 );
		t17.insert( -362 );
		t17.insert( -102 );
		t17.insert( 549 );
		t17.insert( 190 );
		t17.insert( 188 );
		t17.insert( 97 );
		t17.insert( 437 );
		t17.insert( 669 );
		t17.insert( 132 );
		t17.insert( -724 );
		t17.insert( 524 );
		t17.insert( -203 );
		t17.insert( 357 );
		t17.insert( -16 );
		t17.insert( -46 );
		t17.insert( -476 );
		t17.insert( -858 );
		t17.insert( -153 );
		t17.insert( -762 );
		t17.insert( -660 );
		t17.insert( -2 );
		t17.insert( 333 );
		t17.insert( -457 );
		t17.insert( -389 );
		t17.insert( 119 );
		t17.insert( -644 );
		t17.insert( -747 );
		t17.insert( -188 );
		t17.insert( 829 );
		t17.insert( 8 );
		t17.insert( 736 );
		t17.insert( 461 );
		t17.insert( 840 );
		t17.insert( 377 );
		t17.insert( -451 );
		t17.insert( 558 );
		t17.insert( -149 );
		t17.insert( 36 );
		t17.insert( 961 );
		t17.insert( 962 );
		t17.insert( -561 );
		t17.insert( 249 );
		t17.insert( 360 );
		t17.insert( -242 );
		t17.insert( -211 );
		t17.insert( -920 );
		t17.insert( 855 );
		t17.insert( 345 );
		t17.insert( -511 );
		t17.insert( 351 );
		t17.insert( 446 );
		t17.insert( 323 );
		t17.insert( -647 );
		t17.insert( 735 );
		t17.insert( -995 );
		t17.insert( 38 );
		t17.insert( 96 );
		t17.insert( -721 );
		t17.insert( -96 );
		t17.insert( -922 );
		t17.insert( 693 );
		t17.insert( -572 );
		t17.insert( -136 );
		t17.insert( 807 );
		t17.insert( -302 );
		t17.insert( 580 );
		t17.insert( -860 );
		t17.insert( -229 );
		t17.insert( 567 );
		t17.insert( 562 );
		t17.insert( -54 );
		t17.insert( -227 );
		t17.insert( -144 );
		t17.insert( 30 );
		t17.insert( 789 );
		t17.insert( -298 );
		t17.insert( -544 );
		t17.insert( -346 );
		t17.insert( 614 );
		t17.insert( -855 );
		t17.insert( 984 );
		t17.insert( -533 );
		t17.insert( 198 );
		t17.insert( 401 );
		t17.insert( -723 );
		t17.insert( -189 );
		t17.insert( -413 );
		t17.insert( -764 );
		t17.insert( -571 );
		t17.insert( -192 );
		t17.insert( 960 );
		t17.insert( 575 );
		t17.insert( 654 );
		t17.insert( -661 );
		t17.insert( 56 );
		t17.insert( -861 );
		t17.insert( -301 );
		t17.insert( 566 );
		t17.insert( -680 );
		t17.insert( 930 );
		t17.insert( -138 );
		t17.insert( -998 );
		t17.insert( 299 );
		t17.insert( 786 );
		t17.insert( -618 );
		t17.insert( 706 );
		t17.insert( -465 );
		t17.insert( -992 );
		t17.insert( -845 );
		t17.insert( -369 );
		t17.insert( 420 );
		t17.insert( 638 );
		t17.insert( -385 );
		t17.insert( -316 );
		t17.insert( -997 );
		t17.insert( 597 );
		t17.insert( 75 );
		t17.insert( -50 );
		t17.insert( 667 );
		t17.insert( -84 );
		t17.insert( 339 );
		t17.insert( -822 );
		t17.insert( -250 );
		t17.insert( 344 );
		t17.insert( -373 );
		t17.insert( 617 );
		t17.insert( -127 );
		t17.insert( 721 );
		t17.insert( -896 );

		b = Assignment_19.findMin(t17);
		if(!errors[0] && (b == null || b.getElement() != -998)){
			errors[0] = true;
			System.err.println("For tree t17, error with findMin method: Expected -998 received " + b);
		}
		b = Assignment_19.findMax(t17);
		if(!errors[1] && (b == null || b.getElement() != 999)){
			errors[1] = true;
			System.err.println("For tree t17, error with findMax method: Expected 999 received " + b);
		}
		b = Assignment_19.find(870, t17);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 870)){
			errors[2] = true;
			System.err.println("For tree t17, error with find method: Expected the node with 870 inside when looking for existing number");
		}
		b = Assignment_19.find(-801, t17);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t17, error with find method: Expected a null when looking for missing -801");
		}
		s = Assignment_19.toString(t17);
		if(!errors[4] && ! "-998, -997, -995, -992, -922, -920, -897, -896, -861, -860, -858, -855, -845, -822, -764, -762, -747, -724, -723, -721, -680, -661, -660, -647, -644, -618, -572, -571, -561, -544, -533, -511, -495, -482, -476, -465, -457, -451, -413, -405, -389, -385, -373, -369, -362, -346, -324, -316, -302, -301, -298, -250, -242, -229, -227, -211, -203, -192, -189, -188, -162, -153, -149, -144, -138, -136, -127, -102, -96, -84, -54, -50, -46, -16, -2, 8, 30, 36, 38, 56, 75, 96, 97, 119, 132, 188, 190, 198, 224, 249, 278, 299, 323, 333, 339, 344, 345, 351, 357, 360, 374, 377, 401, 420, 437, 446, 461, 524, 538, 549, 558, 562, 566, 567, 571, 575, 580, 597, 614, 617, 638, 654, 667, 669, 683, 693, 706, 721, 735, 736, 786, 789, 807, 829, 840, 855, 870, 930, 960, 961, 962, 982, 984, 999".equals(s)){
			errors[4] = true;
			System.err.println("For tree t17, error with toString method: Expected '-998, -997, -995, -992, -922, -920, -897, -896, -861, -860, -858, -855, -845, -822, -764, -762, -747, -724, -723, -721, -680, -661, -660, -647, -644, -618, -572, -571, -561, -544, -533, -511, -495, -482, -476, -465, -457, -451, -413, -405, -389, -385, -373, -369, -362, -346, -324, -316, -302, -301, -298, -250, -242, -229, -227, -211, -203, -192, -189, -188, -162, -153, -149, -144, -138, -136, -127, -102, -96, -84, -54, -50, -46, -16, -2, 8, 30, 36, 38, 56, 75, 96, 97, 119, 132, 188, 190, 198, 224, 249, 278, 299, 323, 333, 339, 344, 345, 351, 357, 360, 374, 377, 401, 420, 437, 446, 461, 524, 538, 549, 558, 562, 566, 567, 571, 575, 580, 597, 614, 617, 638, 654, 667, 669, 683, 693, 706, 721, 735, 736, 786, 789, 807, 829, 840, 855, 870, 930, 960, 961, 962, 982, 984, 999' received '" + s +"'");
		}
		BinarySearchTree<Integer> t18 = new BinarySearchTree<Integer>();
		t18.insert( 19 );
		t18.insert( -698 );
		t18.insert( 881 );
		t18.insert( -54 );
		t18.insert( -412 );
		t18.insert( 316 );
		t18.insert( -856 );
		t18.insert( 715 );
		t18.insert( 569 );
		t18.insert( 803 );
		t18.insert( 891 );
		t18.insert( 143 );
		t18.insert( 233 );
		t18.insert( 955 );
		t18.insert( -972 );
		t18.insert( -965 );
		t18.insert( 593 );
		t18.insert( -4 );
		t18.insert( -176 );
		t18.insert( 664 );
		t18.insert( -632 );
		t18.insert( 493 );
		t18.insert( 797 );
		t18.insert( -135 );
		t18.insert( 645 );
		t18.insert( -331 );
		t18.insert( 329 );
		t18.insert( 637 );
		t18.insert( 734 );
		t18.insert( -233 );
		t18.insert( -957 );
		t18.insert( 390 );
		t18.insert( 328 );
		t18.insert( -241 );
		t18.insert( -68 );
		t18.insert( -384 );
		t18.insert( 770 );
		t18.insert( 384 );
		t18.insert( -901 );
		t18.insert( -895 );
		t18.insert( -61 );
		t18.insert( -134 );
		t18.insert( 41 );
		t18.insert( 653 );
		t18.insert( 88 );
		t18.insert( 496 );
		t18.insert( -519 );
		t18.insert( -175 );
		t18.insert( 756 );
		t18.insert( -137 );
		t18.insert( 613 );
		t18.insert( -686 );
		t18.insert( 893 );
		t18.insert( -709 );
		t18.insert( -151 );
		t18.insert( -944 );
		t18.insert( -299 );
		t18.insert( -115 );
		t18.insert( 729 );
		t18.insert( 584 );
		t18.insert( 302 );
		t18.insert( -174 );
		t18.insert( -196 );
		t18.insert( 673 );
		t18.insert( -623 );
		t18.insert( 976 );
		t18.insert( -748 );
		t18.insert( -708 );
		t18.insert( -843 );
		t18.insert( 330 );
		t18.insert( 94 );
		t18.insert( 333 );
		t18.insert( 970 );
		t18.insert( 162 );
		t18.insert( -732 );
		t18.insert( 541 );
		t18.insert( -740 );
		t18.insert( -253 );
		t18.insert( -517 );
		t18.insert( 211 );
		t18.insert( 481 );
		t18.insert( -48 );
		t18.insert( 7 );
		t18.insert( 567 );
		t18.insert( -386 );
		t18.insert( -655 );
		t18.insert( -203 );
		t18.insert( 215 );
		t18.insert( 836 );
		t18.insert( 391 );
		t18.insert( -404 );
		t18.insert( -808 );
		t18.insert( -487 );
		t18.insert( -93 );
		t18.insert( -913 );
		t18.insert( -19 );
		t18.insert( 799 );
		t18.insert( -245 );
		t18.insert( -930 );
		t18.insert( -226 );
		t18.insert( 122 );
		t18.insert( -789 );
		t18.insert( 560 );
		t18.insert( -816 );
		t18.insert( -511 );
		t18.insert( -622 );
		t18.insert( 896 );
		t18.insert( -272 );
		t18.insert( 103 );
		t18.insert( -792 );
		t18.insert( 404 );
		t18.insert( 251 );
		t18.insert( -420 );
		t18.insert( -60 );
		t18.insert( 749 );
		t18.insert( 47 );
		t18.insert( 284 );
		t18.insert( -675 );
		t18.insert( -441 );
		t18.insert( 407 );
		t18.insert( -917 );
		t18.insert( 410 );
		t18.insert( -32 );
		t18.insert( -842 );
		t18.insert( 40 );
		t18.insert( -17 );
		t18.insert( 873 );
		t18.insert( 897 );
		t18.insert( 248 );
		t18.insert( -978 );
		t18.insert( 736 );
		t18.insert( 931 );
		t18.insert( -157 );
		t18.insert( -480 );
		t18.insert( 263 );
		t18.insert( 228 );
		t18.insert( 827 );
		t18.insert( 995 );
		t18.insert( 531 );
		t18.insert( 279 );
		t18.insert( -997 );
		t18.insert( -525 );
		t18.insert( 911 );
		t18.insert( -629 );
		t18.insert( -469 );
		t18.insert( -258 );
		t18.insert( 855 );
		t18.insert( -734 );
		t18.insert( 678 );

		b = Assignment_19.findMin(t18);
		if(!errors[0] && (b == null || b.getElement() != -997)){
			errors[0] = true;
			System.err.println("For tree t18, error with findMin method: Expected -997 received " + b);
		}
		b = Assignment_19.findMax(t18);
		if(!errors[1] && (b == null || b.getElement() != 995)){
			errors[1] = true;
			System.err.println("For tree t18, error with findMax method: Expected 995 received " + b);
		}
		b = Assignment_19.find(-226, t18);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -226)){
			errors[2] = true;
			System.err.println("For tree t18, error with find method: Expected the node with -226 inside when looking for existing number");
		}
		b = Assignment_19.find(767, t18);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t18, error with find method: Expected a null when looking for missing 767");
		}
		s = Assignment_19.toString(t18);
		if(!errors[4] && ! "-997, -978, -972, -965, -957, -944, -930, -917, -913, -901, -895, -856, -843, -842, -816, -808, -792, -789, -748, -740, -734, -732, -709, -708, -698, -686, -675, -655, -632, -629, -623, -622, -525, -519, -517, -511, -487, -480, -469, -441, -420, -412, -404, -386, -384, -331, -299, -272, -258, -253, -245, -241, -233, -226, -203, -196, -176, -175, -174, -157, -151, -137, -135, -134, -115, -93, -68, -61, -60, -54, -48, -32, -19, -17, -4, 7, 19, 40, 41, 47, 88, 94, 103, 122, 143, 162, 211, 215, 228, 233, 248, 251, 263, 279, 284, 302, 316, 328, 329, 330, 333, 384, 390, 391, 404, 407, 410, 481, 493, 496, 531, 541, 560, 567, 569, 584, 593, 613, 637, 645, 653, 664, 673, 678, 715, 729, 734, 736, 749, 756, 770, 797, 799, 803, 827, 836, 855, 873, 881, 891, 893, 896, 897, 911, 931, 955, 970, 976, 995".equals(s)){
			errors[4] = true;
			System.err.println("For tree t18, error with toString method: Expected '-997, -978, -972, -965, -957, -944, -930, -917, -913, -901, -895, -856, -843, -842, -816, -808, -792, -789, -748, -740, -734, -732, -709, -708, -698, -686, -675, -655, -632, -629, -623, -622, -525, -519, -517, -511, -487, -480, -469, -441, -420, -412, -404, -386, -384, -331, -299, -272, -258, -253, -245, -241, -233, -226, -203, -196, -176, -175, -174, -157, -151, -137, -135, -134, -115, -93, -68, -61, -60, -54, -48, -32, -19, -17, -4, 7, 19, 40, 41, 47, 88, 94, 103, 122, 143, 162, 211, 215, 228, 233, 248, 251, 263, 279, 284, 302, 316, 328, 329, 330, 333, 384, 390, 391, 404, 407, 410, 481, 493, 496, 531, 541, 560, 567, 569, 584, 593, 613, 637, 645, 653, 664, 673, 678, 715, 729, 734, 736, 749, 756, 770, 797, 799, 803, 827, 836, 855, 873, 881, 891, 893, 896, 897, 911, 931, 955, 970, 976, 995' received '" + s +"'");
		}
		BinarySearchTree<Integer> t19 = new BinarySearchTree<Integer>();
		t19.insert( -726 );
		t19.insert( 292 );
		t19.insert( -328 );
		t19.insert( 260 );
		t19.insert( 392 );
		t19.insert( -173 );
		t19.insert( 4 );
		t19.insert( 37 );
		t19.insert( 733 );
		t19.insert( -408 );
		t19.insert( -371 );
		t19.insert( 558 );
		t19.insert( 165 );
		t19.insert( 58 );
		t19.insert( -41 );
		t19.insert( 171 );
		t19.insert( -994 );
		t19.insert( 110 );
		t19.insert( 937 );
		t19.insert( 228 );
		t19.insert( -278 );
		t19.insert( -652 );
		t19.insert( 541 );
		t19.insert( 586 );
		t19.insert( 981 );
		t19.insert( -564 );
		t19.insert( 474 );
		t19.insert( 272 );
		t19.insert( -784 );
		t19.insert( -480 );
		t19.insert( 750 );
		t19.insert( -261 );
		t19.insert( 187 );
		t19.insert( -623 );
		t19.insert( -10 );
		t19.insert( -217 );
		t19.insert( 497 );
		t19.insert( -804 );
		t19.insert( -581 );
		t19.insert( 481 );
		t19.insert( 340 );
		t19.insert( 682 );
		t19.insert( 802 );
		t19.insert( -701 );
		t19.insert( 408 );
		t19.insert( 490 );
		t19.insert( -165 );
		t19.insert( 883 );
		t19.insert( -613 );
		t19.insert( -69 );
		t19.insert( 875 );
		t19.insert( 60 );
		t19.insert( 122 );
		t19.insert( 354 );
		t19.insert( 356 );
		t19.insert( 280 );
		t19.insert( -348 );
		t19.insert( 636 );
		t19.insert( -660 );
		t19.insert( -955 );
		t19.insert( -114 );
		t19.insert( -330 );
		t19.insert( 778 );
		t19.insert( -745 );
		t19.insert( -725 );
		t19.insert( 440 );
		t19.insert( 563 );
		t19.insert( 274 );
		t19.insert( -584 );
		t19.insert( -202 );
		t19.insert( -93 );
		t19.insert( 840 );
		t19.insert( 950 );
		t19.insert( -944 );
		t19.insert( -586 );
		t19.insert( -870 );
		t19.insert( -283 );
		t19.insert( 529 );
		t19.insert( 584 );
		t19.insert( -588 );
		t19.insert( 828 );
		t19.insert( -952 );
		t19.insert( -398 );
		t19.insert( 753 );
		t19.insert( 116 );
		t19.insert( -634 );
		t19.insert( -360 );
		t19.insert( -522 );
		t19.insert( 859 );
		t19.insert( -545 );
		t19.insert( 505 );
		t19.insert( -691 );
		t19.insert( 879 );
		t19.insert( -368 );
		t19.insert( 537 );
		t19.insert( -476 );
		t19.insert( 690 );
		t19.insert( 629 );
		t19.insert( -617 );
		t19.insert( -242 );
		t19.insert( -363 );
		t19.insert( -101 );
		t19.insert( -459 );
		t19.insert( 619 );
		t19.insert( -275 );
		t19.insert( 630 );
		t19.insert( -665 );
		t19.insert( -250 );
		t19.insert( 211 );
		t19.insert( 323 );
		t19.insert( 409 );
		t19.insert( -423 );
		t19.insert( -88 );
		t19.insert( -945 );
		t19.insert( 728 );

		b = Assignment_19.findMin(t19);
		if(!errors[0] && (b == null || b.getElement() != -994)){
			errors[0] = true;
			System.err.println("For tree t19, error with findMin method: Expected -994 received " + b);
		}
		b = Assignment_19.findMax(t19);
		if(!errors[1] && (b == null || b.getElement() != 981)){
			errors[1] = true;
			System.err.println("For tree t19, error with findMax method: Expected 981 received " + b);
		}
		b = Assignment_19.find(-330, t19);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != -330)){
			errors[2] = true;
			System.err.println("For tree t19, error with find method: Expected the node with -330 inside when looking for existing number");
		}
		b = Assignment_19.find(652, t19);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t19, error with find method: Expected a null when looking for missing 652");
		}
		s = Assignment_19.toString(t19);
		if(!errors[4] && ! "-994, -955, -952, -945, -944, -870, -804, -784, -745, -726, -725, -701, -691, -665, -660, -652, -634, -623, -617, -613, -588, -586, -584, -581, -564, -545, -522, -480, -476, -459, -423, -408, -398, -371, -368, -363, -360, -348, -330, -328, -283, -278, -275, -261, -250, -242, -217, -202, -173, -165, -114, -101, -93, -88, -69, -41, -10, 4, 37, 58, 60, 110, 116, 122, 165, 171, 187, 211, 228, 260, 272, 274, 280, 292, 323, 340, 354, 356, 392, 408, 409, 440, 474, 481, 490, 497, 505, 529, 537, 541, 558, 563, 584, 586, 619, 629, 630, 636, 682, 690, 728, 733, 750, 753, 778, 802, 828, 840, 859, 875, 879, 883, 937, 950, 981".equals(s)){
			errors[4] = true;
			System.err.println("For tree t19, error with toString method: Expected '-994, -955, -952, -945, -944, -870, -804, -784, -745, -726, -725, -701, -691, -665, -660, -652, -634, -623, -617, -613, -588, -586, -584, -581, -564, -545, -522, -480, -476, -459, -423, -408, -398, -371, -368, -363, -360, -348, -330, -328, -283, -278, -275, -261, -250, -242, -217, -202, -173, -165, -114, -101, -93, -88, -69, -41, -10, 4, 37, 58, 60, 110, 116, 122, 165, 171, 187, 211, 228, 260, 272, 274, 280, 292, 323, 340, 354, 356, 392, 408, 409, 440, 474, 481, 490, 497, 505, 529, 537, 541, 558, 563, 584, 586, 619, 629, 630, 636, 682, 690, 728, 733, 750, 753, 778, 802, 828, 840, 859, 875, 879, 883, 937, 950, 981' received '" + s +"'");
		}
		BinarySearchTree<Integer> t20 = new BinarySearchTree<Integer>();
		t20.insert( -404 );
		t20.insert( 907 );
		t20.insert( 353 );
		t20.insert( 680 );
		t20.insert( 270 );
		t20.insert( 965 );
		t20.insert( -208 );
		t20.insert( 352 );
		t20.insert( 364 );
		t20.insert( 339 );
		t20.insert( -728 );
		t20.insert( -185 );
		t20.insert( 423 );
		t20.insert( 946 );
		t20.insert( 149 );
		t20.insert( 494 );
		t20.insert( 809 );
		t20.insert( -858 );
		t20.insert( -570 );
		t20.insert( 723 );
		t20.insert( 367 );
		t20.insert( -414 );
		t20.insert( -488 );
		t20.insert( 197 );
		t20.insert( -818 );
		t20.insert( -967 );
		t20.insert( -432 );
		t20.insert( 28 );
		t20.insert( 303 );
		t20.insert( -8 );
		t20.insert( 598 );
		t20.insert( 499 );
		t20.insert( -88 );
		t20.insert( 922 );
		t20.insert( -550 );
		t20.insert( 547 );
		t20.insert( 71 );
		t20.insert( -99 );
		t20.insert( 471 );
		t20.insert( 870 );
		t20.insert( -817 );
		t20.insert( 407 );
		t20.insert( -221 );
		t20.insert( 346 );
		t20.insert( 213 );
		t20.insert( 249 );
		t20.insert( 811 );
		t20.insert( 479 );
		t20.insert( -71 );
		t20.insert( 513 );
		t20.insert( -523 );
		t20.insert( -101 );
		t20.insert( -619 );
		t20.insert( 200 );
		t20.insert( -599 );
		t20.insert( 674 );
		t20.insert( -320 );
		t20.insert( -247 );
		t20.insert( 974 );
		t20.insert( 694 );
		t20.insert( 285 );
		t20.insert( -879 );
		t20.insert( 55 );
		t20.insert( 27 );
		t20.insert( 538 );
		t20.insert( 121 );
		t20.insert( -431 );
		t20.insert( 713 );
		t20.insert( -635 );
		t20.insert( -560 );
		t20.insert( 20 );
		t20.insert( 531 );
		t20.insert( 214 );
		t20.insert( -120 );
		t20.insert( -787 );
		t20.insert( 596 );
		t20.insert( -529 );
		t20.insert( 297 );
		t20.insert( 23 );
		t20.insert( 869 );
		t20.insert( 487 );
		t20.insert( -901 );
		t20.insert( -657 );
		t20.insert( 393 );
		t20.insert( -486 );
		t20.insert( -615 );
		t20.insert( 761 );
		t20.insert( -651 );
		t20.insert( 293 );
		t20.insert( 64 );
		t20.insert( 77 );
		t20.insert( 417 );
		t20.insert( 874 );
		t20.insert( 219 );
		t20.insert( 852 );
		t20.insert( -525 );
		t20.insert( -883 );
		t20.insert( 602 );
		t20.insert( -439 );
		t20.insert( 703 );
		t20.insert( -543 );
		t20.insert( 245 );

		b = Assignment_19.findMin(t20);
		if(!errors[0] && (b == null || b.getElement() != -967)){
			errors[0] = true;
			System.err.println("For tree t20, error with findMin method: Expected -967 received " + b);
		}
		b = Assignment_19.findMax(t20);
		if(!errors[1] && (b == null || b.getElement() != 974)){
			errors[1] = true;
			System.err.println("For tree t20, error with findMax method: Expected 974 received " + b);
		}
		b = Assignment_19.find(393, t20);
		if(!errors[2] && (b == null || b.getElement() == null || b.getElement() != 393)){
			errors[2] = true;
			System.err.println("For tree t20, error with find method: Expected the node with 393 inside when looking for existing number");
		}
		b = Assignment_19.find(918, t20);
		if(!errors[3] && b != null){
			errors[3] = true;
			System.err.println("For tree t20, error with find method: Expected a null when looking for missing 918");
		}
		s = Assignment_19.toString(t20);
		if(!errors[4] && ! "-967, -901, -883, -879, -858, -818, -817, -787, -728, -657, -651, -635, -619, -615, -599, -570, -560, -550, -543, -529, -525, -523, -488, -486, -439, -432, -431, -414, -404, -320, -247, -221, -208, -185, -120, -101, -99, -88, -71, -8, 20, 23, 27, 28, 55, 64, 71, 77, 121, 149, 197, 200, 213, 214, 219, 245, 249, 270, 285, 293, 297, 303, 339, 346, 352, 353, 364, 367, 393, 407, 417, 423, 471, 479, 487, 494, 499, 513, 531, 538, 547, 596, 598, 602, 674, 680, 694, 703, 713, 723, 761, 809, 811, 852, 869, 870, 874, 907, 922, 946, 965, 974".equals(s)){
			errors[4] = true;
			System.err.println("For tree t20, error with toString method: Expected '-967, -901, -883, -879, -858, -818, -817, -787, -728, -657, -651, -635, -619, -615, -599, -570, -560, -550, -543, -529, -525, -523, -488, -486, -439, -432, -431, -414, -404, -320, -247, -221, -208, -185, -120, -101, -99, -88, -71, -8, 20, 23, 27, 28, 55, 64, 71, 77, 121, 149, 197, 200, 213, 214, 219, 245, 249, 270, 285, 293, 297, 303, 339, 346, 352, 353, 364, 367, 393, 407, 417, 423, 471, 479, 487, 494, 499, 513, 531, 538, 547, 596, 598, 602, 674, 680, 694, 703, 713, 723, 761, 809, 811, 852, 869, 870, 874, 907, 922, 946, 965, 974' received '" + s +"'");
		}
		System.out.println("Finished tests");

	}
}
