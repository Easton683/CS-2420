
public class Assignment_18_Tester {

	public static void main(String [] args) {
		System.out.println("Running tests for Assignment 18: Smaller trees first, then larger ones");

		BinaryTree<Integer> t0 = new BinaryTree<Integer>( );
		t0.merge(50, new BinaryTree<Integer>(38), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t1 = new BinaryTree<Integer>( );
		t1.merge(1, new BinaryTree<Integer>(40), new BinaryTree<Integer>(63));//Two Children

		BinaryTree<Integer> t2 = new BinaryTree<Integer>( );
		t2.merge(81, t0, t1);

		BinaryTree<Integer> t3 = new BinaryTree<Integer>( );
		t3.merge(67, new BinaryTree<Integer>(), new BinaryTree<Integer>(63));//Right Child

		BinaryTree<Integer> t4 = new BinaryTree<Integer>( );
		t4.merge(12, new BinaryTree<Integer>(52), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t5 = new BinaryTree<Integer>( );
		t5.merge(46, t3, t4);

		BinaryTree<Integer> t6 = new BinaryTree<Integer>( );
		t6.merge(94, t2, t5);

		if(Assignment_18.numberOfLeaves(t6) != 5){
			System.err.println("For tree t6, error with numberOfLeaves method: Expected 5 received " + Assignment_18.numberOfLeaves(t6));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t6) != 3){
			System.err.println("For tree t6, error with numberOfNodesWithOneNonNullChild method: Expected 3 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t6));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t6) != 4){
			System.err.println("For tree t6, error with numberOfNodesWithTwoNonNullChildren method: Expected 4 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t6));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t6) != 7){
			System.err.println("For tree t6, error with numberOfNodesWithEvenDataItems method: Expected 7 received " + Assignment_18.numberOfNodesWithEvenDataItems(t6));
		}
		if(Assignment_18.sumOfAllItems(t6) != 607){
			System.err.println("For tree t6, error with sumOfAllItems method: Expected 607 received " + Assignment_18.sumOfAllItems(t6));
		}


		BinaryTree<Integer> t7 = new BinaryTree<Integer>( 40 );//No Children

		BinaryTree<Integer> t8 = new BinaryTree<Integer>( );
		t8.merge(38, new BinaryTree<Integer>(59), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t9 = new BinaryTree<Integer>( );
		t9.merge(4, t7, t8);

		BinaryTree<Integer> t10 = new BinaryTree<Integer>( );
		t10.merge(90, new BinaryTree<Integer>(), new BinaryTree<Integer>(50));//Right Child

		BinaryTree<Integer> t11 = new BinaryTree<Integer>( 9 );//No Children

		BinaryTree<Integer> t12 = new BinaryTree<Integer>( );
		t12.merge(12, t10, t11);

		BinaryTree<Integer> t13 = new BinaryTree<Integer>( );
		t13.merge(18, t9, t12);

		if(Assignment_18.numberOfLeaves(t13) != 4){
			System.err.println("For tree t13, error with numberOfLeaves method: Expected 4 received " + Assignment_18.numberOfLeaves(t13));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t13) != 2){
			System.err.println("For tree t13, error with numberOfNodesWithOneNonNullChild method: Expected 2 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t13));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t13) != 3){
			System.err.println("For tree t13, error with numberOfNodesWithTwoNonNullChildren method: Expected 3 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t13));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t13) != 7){
			System.err.println("For tree t13, error with numberOfNodesWithEvenDataItems method: Expected 7 received " + Assignment_18.numberOfNodesWithEvenDataItems(t13));
		}
		if(Assignment_18.sumOfAllItems(t13) != 320){
			System.err.println("For tree t13, error with sumOfAllItems method: Expected 320 received " + Assignment_18.sumOfAllItems(t13));
		}


		BinaryTree<Integer> t14 = new BinaryTree<Integer>( );
		t14.merge(36, new BinaryTree<Integer>(91), new BinaryTree<Integer>(33));//Two Children

		BinaryTree<Integer> t15 = new BinaryTree<Integer>( );
		t15.merge(17, new BinaryTree<Integer>(79), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t16 = new BinaryTree<Integer>( );
		t16.merge(29, t14, t15);

		BinaryTree<Integer> t17 = new BinaryTree<Integer>( 48 );//No Children

		BinaryTree<Integer> t18 = new BinaryTree<Integer>( );
		t18.merge(57, new BinaryTree<Integer>(13), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t19 = new BinaryTree<Integer>( );
		t19.merge(30, t17, t18);

		BinaryTree<Integer> t20 = new BinaryTree<Integer>( );
		t20.merge(8, t16, t19);

		if(Assignment_18.numberOfLeaves(t20) != 5){
			System.err.println("For tree t20, error with numberOfLeaves method: Expected 5 received " + Assignment_18.numberOfLeaves(t20));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t20) != 2){
			System.err.println("For tree t20, error with numberOfNodesWithOneNonNullChild method: Expected 2 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t20));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t20) != 4){
			System.err.println("For tree t20, error with numberOfNodesWithTwoNonNullChildren method: Expected 4 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t20));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t20) != 4){
			System.err.println("For tree t20, error with numberOfNodesWithEvenDataItems method: Expected 4 received " + Assignment_18.numberOfNodesWithEvenDataItems(t20));
		}
		if(Assignment_18.sumOfAllItems(t20) != 441){
			System.err.println("For tree t20, error with sumOfAllItems method: Expected 441 received " + Assignment_18.sumOfAllItems(t20));
		}


		BinaryTree<Integer> t21 = new BinaryTree<Integer>( );
		t21.merge(52, new BinaryTree<Integer>(99), new BinaryTree<Integer>(3));//Two Children

		BinaryTree<Integer> t22 = new BinaryTree<Integer>( );
		t22.merge(15, new BinaryTree<Integer>(18), new BinaryTree<Integer>(0));//Two Children

		BinaryTree<Integer> t23 = new BinaryTree<Integer>( );
		t23.merge(90, t21, t22);

		BinaryTree<Integer> t24 = new BinaryTree<Integer>( );
		t24.merge(66, new BinaryTree<Integer>(6), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t25 = new BinaryTree<Integer>( 33 );//No Children

		BinaryTree<Integer> t26 = new BinaryTree<Integer>( );
		t26.merge(64, t24, t25);

		BinaryTree<Integer> t27 = new BinaryTree<Integer>( );
		t27.merge(1, t23, t26);

		if(Assignment_18.numberOfLeaves(t27) != 6){
			System.err.println("For tree t27, error with numberOfLeaves method: Expected 6 received " + Assignment_18.numberOfLeaves(t27));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t27) != 1){
			System.err.println("For tree t27, error with numberOfNodesWithOneNonNullChild method: Expected 1 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t27));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t27) != 5){
			System.err.println("For tree t27, error with numberOfNodesWithTwoNonNullChildren method: Expected 5 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t27));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t27) != 7){
			System.err.println("For tree t27, error with numberOfNodesWithEvenDataItems method: Expected 7 received " + Assignment_18.numberOfNodesWithEvenDataItems(t27));
		}
		if(Assignment_18.sumOfAllItems(t27) != 447){
			System.err.println("For tree t27, error with sumOfAllItems method: Expected 447 received " + Assignment_18.sumOfAllItems(t27));
		}


		BinaryTree<Integer> t28 = new BinaryTree<Integer>( );
		t28.merge(26, new BinaryTree<Integer>(58), new BinaryTree<Integer>(64));//Two Children

		BinaryTree<Integer> t29 = new BinaryTree<Integer>( );
		t29.merge(88, new BinaryTree<Integer>(58), new BinaryTree<Integer>(45));//Two Children

		BinaryTree<Integer> t30 = new BinaryTree<Integer>( );
		t30.merge(28, t28, t29);

		BinaryTree<Integer> t31 = new BinaryTree<Integer>( 42 );//No Children

		BinaryTree<Integer> t32 = new BinaryTree<Integer>( );
		t32.merge(70, new BinaryTree<Integer>(92), new BinaryTree<Integer>(24));//Two Children

		BinaryTree<Integer> t33 = new BinaryTree<Integer>( );
		t33.merge(30, t31, t32);

		BinaryTree<Integer> t34 = new BinaryTree<Integer>( );
		t34.merge(85, t30, t33);

		if(Assignment_18.numberOfLeaves(t34) != 7){
			System.err.println("For tree t34, error with numberOfLeaves method: Expected 7 received " + Assignment_18.numberOfLeaves(t34));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t34) != 0){
			System.err.println("For tree t34, error with numberOfNodesWithOneNonNullChild method: Expected 0 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t34));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t34) != 6){
			System.err.println("For tree t34, error with numberOfNodesWithTwoNonNullChildren method: Expected 6 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t34));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t34) != 11){
			System.err.println("For tree t34, error with numberOfNodesWithEvenDataItems method: Expected 11 received " + Assignment_18.numberOfNodesWithEvenDataItems(t34));
		}
		if(Assignment_18.sumOfAllItems(t34) != 710){
			System.err.println("For tree t34, error with sumOfAllItems method: Expected 710 received " + Assignment_18.sumOfAllItems(t34));
		}


		BinaryTree<Integer> t35 = new BinaryTree<Integer>( 99 );//No Children

		BinaryTree<Integer> t36 = new BinaryTree<Integer>( );
		t36.merge(24, new BinaryTree<Integer>(5), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t37 = new BinaryTree<Integer>( );
		t37.merge(67, t35, t36);

		BinaryTree<Integer> t38 = new BinaryTree<Integer>( );
		t38.merge(19, new BinaryTree<Integer>(), new BinaryTree<Integer>(33));//Right Child

		BinaryTree<Integer> t39 = new BinaryTree<Integer>( );
		t39.merge(73, new BinaryTree<Integer>(56), new BinaryTree<Integer>(38));//Two Children

		BinaryTree<Integer> t40 = new BinaryTree<Integer>( );
		t40.merge(67, t38, t39);

		BinaryTree<Integer> t41 = new BinaryTree<Integer>( );
		t41.merge(94, t37, t40);

		if(Assignment_18.numberOfLeaves(t41) != 5){
			System.err.println("For tree t41, error with numberOfLeaves method: Expected 5 received " + Assignment_18.numberOfLeaves(t41));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t41) != 2){
			System.err.println("For tree t41, error with numberOfNodesWithOneNonNullChild method: Expected 2 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t41));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t41) != 4){
			System.err.println("For tree t41, error with numberOfNodesWithTwoNonNullChildren method: Expected 4 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t41));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t41) != 4){
			System.err.println("For tree t41, error with numberOfNodesWithEvenDataItems method: Expected 4 received " + Assignment_18.numberOfNodesWithEvenDataItems(t41));
		}
		if(Assignment_18.sumOfAllItems(t41) != 575){
			System.err.println("For tree t41, error with sumOfAllItems method: Expected 575 received " + Assignment_18.sumOfAllItems(t41));
		}


		BinaryTree<Integer> t42 = new BinaryTree<Integer>( );
		t42.merge(76, new BinaryTree<Integer>(5), new BinaryTree<Integer>(57));//Two Children

		BinaryTree<Integer> t43 = new BinaryTree<Integer>( );
		t43.merge(25, new BinaryTree<Integer>(67), new BinaryTree<Integer>(69));//Two Children

		BinaryTree<Integer> t44 = new BinaryTree<Integer>( );
		t44.merge(27, t42, t43);

		BinaryTree<Integer> t45 = new BinaryTree<Integer>( 41 );//No Children

		BinaryTree<Integer> t46 = new BinaryTree<Integer>( );
		t46.merge(89, new BinaryTree<Integer>(20), new BinaryTree<Integer>(12));//Two Children

		BinaryTree<Integer> t47 = new BinaryTree<Integer>( );
		t47.merge(94, t45, t46);

		BinaryTree<Integer> t48 = new BinaryTree<Integer>( );
		t48.merge(71, t44, t47);

		if(Assignment_18.numberOfLeaves(t48) != 7){
			System.err.println("For tree t48, error with numberOfLeaves method: Expected 7 received " + Assignment_18.numberOfLeaves(t48));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t48) != 0){
			System.err.println("For tree t48, error with numberOfNodesWithOneNonNullChild method: Expected 0 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t48));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t48) != 6){
			System.err.println("For tree t48, error with numberOfNodesWithTwoNonNullChildren method: Expected 6 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t48));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t48) != 4){
			System.err.println("For tree t48, error with numberOfNodesWithEvenDataItems method: Expected 4 received " + Assignment_18.numberOfNodesWithEvenDataItems(t48));
		}
		if(Assignment_18.sumOfAllItems(t48) != 653){
			System.err.println("For tree t48, error with sumOfAllItems method: Expected 653 received " + Assignment_18.sumOfAllItems(t48));
		}


		BinaryTree<Integer> t49 = new BinaryTree<Integer>( 68 );//No Children

		BinaryTree<Integer> t50 = new BinaryTree<Integer>( );
		t50.merge(22, new BinaryTree<Integer>(18), new BinaryTree<Integer>(83));//Two Children

		BinaryTree<Integer> t51 = new BinaryTree<Integer>( );
		t51.merge(29, t49, t50);

		BinaryTree<Integer> t52 = new BinaryTree<Integer>( 27 );//No Children

		BinaryTree<Integer> t53 = new BinaryTree<Integer>( );
		t53.merge(39, new BinaryTree<Integer>(20), new BinaryTree<Integer>(35));//Two Children

		BinaryTree<Integer> t54 = new BinaryTree<Integer>( );
		t54.merge(62, t52, t53);

		BinaryTree<Integer> t55 = new BinaryTree<Integer>( );
		t55.merge(20, t51, t54);

		if(Assignment_18.numberOfLeaves(t55) != 6){
			System.err.println("For tree t55, error with numberOfLeaves method: Expected 6 received " + Assignment_18.numberOfLeaves(t55));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t55) != 0){
			System.err.println("For tree t55, error with numberOfNodesWithOneNonNullChild method: Expected 0 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t55));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t55) != 5){
			System.err.println("For tree t55, error with numberOfNodesWithTwoNonNullChildren method: Expected 5 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t55));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t55) != 6){
			System.err.println("For tree t55, error with numberOfNodesWithEvenDataItems method: Expected 6 received " + Assignment_18.numberOfNodesWithEvenDataItems(t55));
		}
		if(Assignment_18.sumOfAllItems(t55) != 423){
			System.err.println("For tree t55, error with sumOfAllItems method: Expected 423 received " + Assignment_18.sumOfAllItems(t55));
		}


		BinaryTree<Integer> t56 = new BinaryTree<Integer>( );
		t56.merge(28, new BinaryTree<Integer>(87), new BinaryTree<Integer>(13));//Two Children

		BinaryTree<Integer> t57 = new BinaryTree<Integer>( 17 );//No Children

		BinaryTree<Integer> t58 = new BinaryTree<Integer>( );
		t58.merge(81, t56, t57);

		BinaryTree<Integer> t59 = new BinaryTree<Integer>( );
		t59.merge(66, new BinaryTree<Integer>(), new BinaryTree<Integer>(3));//Right Child

		BinaryTree<Integer> t60 = new BinaryTree<Integer>( );
		t60.merge(34, new BinaryTree<Integer>(61), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t61 = new BinaryTree<Integer>( );
		t61.merge(7, t59, t60);

		BinaryTree<Integer> t62 = new BinaryTree<Integer>( );
		t62.merge(81, t58, t61);

		if(Assignment_18.numberOfLeaves(t62) != 5){
			System.err.println("For tree t62, error with numberOfLeaves method: Expected 5 received " + Assignment_18.numberOfLeaves(t62));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t62) != 2){
			System.err.println("For tree t62, error with numberOfNodesWithOneNonNullChild method: Expected 2 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t62));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t62) != 4){
			System.err.println("For tree t62, error with numberOfNodesWithTwoNonNullChildren method: Expected 4 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t62));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t62) != 3){
			System.err.println("For tree t62, error with numberOfNodesWithEvenDataItems method: Expected 3 received " + Assignment_18.numberOfNodesWithEvenDataItems(t62));
		}
		if(Assignment_18.sumOfAllItems(t62) != 478){
			System.err.println("For tree t62, error with sumOfAllItems method: Expected 478 received " + Assignment_18.sumOfAllItems(t62));
		}


		BinaryTree<Integer> t63 = new BinaryTree<Integer>( );
		t63.merge(77, new BinaryTree<Integer>(8), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t64 = new BinaryTree<Integer>( );
		t64.merge(33, new BinaryTree<Integer>(), new BinaryTree<Integer>(19));//Right Child

		BinaryTree<Integer> t65 = new BinaryTree<Integer>( );
		t65.merge(84, t63, t64);

		BinaryTree<Integer> t66 = new BinaryTree<Integer>( 16 );//No Children

		BinaryTree<Integer> t67 = new BinaryTree<Integer>( );
		t67.merge(74, new BinaryTree<Integer>(5), new BinaryTree<Integer>(90));//Two Children

		BinaryTree<Integer> t68 = new BinaryTree<Integer>( );
		t68.merge(75, t66, t67);

		BinaryTree<Integer> t69 = new BinaryTree<Integer>( );
		t69.merge(62, t65, t68);

		if(Assignment_18.numberOfLeaves(t69) != 5){
			System.err.println("For tree t69, error with numberOfLeaves method: Expected 5 received " + Assignment_18.numberOfLeaves(t69));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t69) != 2){
			System.err.println("For tree t69, error with numberOfNodesWithOneNonNullChild method: Expected 2 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t69));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t69) != 4){
			System.err.println("For tree t69, error with numberOfNodesWithTwoNonNullChildren method: Expected 4 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t69));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t69) != 6){
			System.err.println("For tree t69, error with numberOfNodesWithEvenDataItems method: Expected 6 received " + Assignment_18.numberOfNodesWithEvenDataItems(t69));
		}
		if(Assignment_18.sumOfAllItems(t69) != 543){
			System.err.println("For tree t69, error with sumOfAllItems method: Expected 543 received " + Assignment_18.sumOfAllItems(t69));
		}


		BinaryTree<Integer> t70 = new BinaryTree<Integer>( );
		t70.merge(51, new BinaryTree<Integer>(), new BinaryTree<Integer>(0));//Right Child

		BinaryTree<Integer> t71 = new BinaryTree<Integer>( );
		t71.merge(80, new BinaryTree<Integer>(3), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t72 = new BinaryTree<Integer>( );
		t72.merge(18, t70, t71);

		BinaryTree<Integer> t73 = new BinaryTree<Integer>( );
		t73.merge(3, new BinaryTree<Integer>(23), new BinaryTree<Integer>(83));//Two Children

		BinaryTree<Integer> t74 = new BinaryTree<Integer>( 11 );//No Children

		BinaryTree<Integer> t75 = new BinaryTree<Integer>( );
		t75.merge(17, t73, t74);

		BinaryTree<Integer> t76 = new BinaryTree<Integer>( );
		t76.merge(23, t72, t75);

		BinaryTree<Integer> t77 = new BinaryTree<Integer>( );
		t77.merge(68, new BinaryTree<Integer>(21), new BinaryTree<Integer>(27));//Two Children

		BinaryTree<Integer> t78 = new BinaryTree<Integer>( );
		t78.merge(80, new BinaryTree<Integer>(92), new BinaryTree<Integer>(43));//Two Children

		BinaryTree<Integer> t79 = new BinaryTree<Integer>( );
		t79.merge(70, t77, t78);

		BinaryTree<Integer> t80 = new BinaryTree<Integer>( );
		t80.merge(9, new BinaryTree<Integer>(2), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t81 = new BinaryTree<Integer>( 50 );//No Children

		BinaryTree<Integer> t82 = new BinaryTree<Integer>( );
		t82.merge(30, t80, t81);

		BinaryTree<Integer> t83 = new BinaryTree<Integer>( );
		t83.merge(55, t79, t82);

		BinaryTree<Integer> t84 = new BinaryTree<Integer>( );
		t84.merge(84, t76, t83);

		BinaryTree<Integer> t85 = new BinaryTree<Integer>( );
		t85.merge(56, new BinaryTree<Integer>(16), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t86 = new BinaryTree<Integer>( );
		t86.merge(76, new BinaryTree<Integer>(47), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t87 = new BinaryTree<Integer>( );
		t87.merge(2, t85, t86);

		BinaryTree<Integer> t88 = new BinaryTree<Integer>( );
		t88.merge(87, new BinaryTree<Integer>(), new BinaryTree<Integer>(96));//Right Child

		BinaryTree<Integer> t89 = new BinaryTree<Integer>( );
		t89.merge(14, new BinaryTree<Integer>(), new BinaryTree<Integer>(51));//Right Child

		BinaryTree<Integer> t90 = new BinaryTree<Integer>( );
		t90.merge(64, t88, t89);

		BinaryTree<Integer> t91 = new BinaryTree<Integer>( );
		t91.merge(96, t87, t90);

		BinaryTree<Integer> t92 = new BinaryTree<Integer>( );
		t92.merge(20, new BinaryTree<Integer>(70), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t93 = new BinaryTree<Integer>( 36 );//No Children

		BinaryTree<Integer> t94 = new BinaryTree<Integer>( );
		t94.merge(61, t92, t93);

		BinaryTree<Integer> t95 = new BinaryTree<Integer>( 70 );//No Children

		BinaryTree<Integer> t96 = new BinaryTree<Integer>( 35 );//No Children

		BinaryTree<Integer> t97 = new BinaryTree<Integer>( );
		t97.merge(10, t95, t96);

		BinaryTree<Integer> t98 = new BinaryTree<Integer>( );
		t98.merge(82, t94, t97);

		BinaryTree<Integer> t99 = new BinaryTree<Integer>( );
		t99.merge(60, t91, t98);

		BinaryTree<Integer> t100 = new BinaryTree<Integer>( );
		t100.merge(43, t84, t99);

		if(Assignment_18.numberOfLeaves(t100) != 19){
			System.err.println("For tree t100, error with numberOfLeaves method: Expected 19 received " + Assignment_18.numberOfLeaves(t100));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t100) != 8){
			System.err.println("For tree t100, error with numberOfNodesWithOneNonNullChild method: Expected 8 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t100));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t100) != 18){
			System.err.println("For tree t100, error with numberOfNodesWithTwoNonNullChildren method: Expected 18 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t100));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t100) != 26){
			System.err.println("For tree t100, error with numberOfNodesWithEvenDataItems method: Expected 26 received " + Assignment_18.numberOfNodesWithEvenDataItems(t100));
		}
		if(Assignment_18.sumOfAllItems(t100) != 2035){
			System.err.println("For tree t100, error with sumOfAllItems method: Expected 2035 received " + Assignment_18.sumOfAllItems(t100));
		}


		BinaryTree<Integer> t101 = new BinaryTree<Integer>( );
		t101.merge(27, new BinaryTree<Integer>(11), new BinaryTree<Integer>(43));//Two Children

		BinaryTree<Integer> t102 = new BinaryTree<Integer>( );
		t102.merge(66, new BinaryTree<Integer>(9), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t103 = new BinaryTree<Integer>( );
		t103.merge(60, t101, t102);

		BinaryTree<Integer> t104 = new BinaryTree<Integer>( 47 );//No Children

		BinaryTree<Integer> t105 = new BinaryTree<Integer>( );
		t105.merge(58, new BinaryTree<Integer>(60), new BinaryTree<Integer>(42));//Two Children

		BinaryTree<Integer> t106 = new BinaryTree<Integer>( );
		t106.merge(50, t104, t105);

		BinaryTree<Integer> t107 = new BinaryTree<Integer>( );
		t107.merge(55, t103, t106);

		BinaryTree<Integer> t108 = new BinaryTree<Integer>( );
		t108.merge(9, new BinaryTree<Integer>(2), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t109 = new BinaryTree<Integer>( );
		t109.merge(72, new BinaryTree<Integer>(), new BinaryTree<Integer>(17));//Right Child

		BinaryTree<Integer> t110 = new BinaryTree<Integer>( );
		t110.merge(58, t108, t109);

		BinaryTree<Integer> t111 = new BinaryTree<Integer>( );
		t111.merge(74, new BinaryTree<Integer>(), new BinaryTree<Integer>(82));//Right Child

		BinaryTree<Integer> t112 = new BinaryTree<Integer>( );
		t112.merge(92, new BinaryTree<Integer>(76), new BinaryTree<Integer>(2));//Two Children

		BinaryTree<Integer> t113 = new BinaryTree<Integer>( );
		t113.merge(0, t111, t112);

		BinaryTree<Integer> t114 = new BinaryTree<Integer>( );
		t114.merge(48, t110, t113);

		BinaryTree<Integer> t115 = new BinaryTree<Integer>( );
		t115.merge(41, t107, t114);

		BinaryTree<Integer> t116 = new BinaryTree<Integer>( );
		t116.merge(80, new BinaryTree<Integer>(35), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t117 = new BinaryTree<Integer>( );
		t117.merge(51, new BinaryTree<Integer>(33), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t118 = new BinaryTree<Integer>( );
		t118.merge(24, t116, t117);

		BinaryTree<Integer> t119 = new BinaryTree<Integer>( );
		t119.merge(20, new BinaryTree<Integer>(), new BinaryTree<Integer>(46));//Right Child

		BinaryTree<Integer> t120 = new BinaryTree<Integer>( );
		t120.merge(27, new BinaryTree<Integer>(97), new BinaryTree<Integer>(23));//Two Children

		BinaryTree<Integer> t121 = new BinaryTree<Integer>( );
		t121.merge(11, t119, t120);

		BinaryTree<Integer> t122 = new BinaryTree<Integer>( );
		t122.merge(73, t118, t121);

		BinaryTree<Integer> t123 = new BinaryTree<Integer>( 99 );//No Children

		BinaryTree<Integer> t124 = new BinaryTree<Integer>( 89 );//No Children

		BinaryTree<Integer> t125 = new BinaryTree<Integer>( );
		t125.merge(75, t123, t124);

		BinaryTree<Integer> t126 = new BinaryTree<Integer>( );
		t126.merge(25, new BinaryTree<Integer>(), new BinaryTree<Integer>(23));//Right Child

		BinaryTree<Integer> t127 = new BinaryTree<Integer>( );
		t127.merge(53, new BinaryTree<Integer>(38), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t128 = new BinaryTree<Integer>( );
		t128.merge(47, t126, t127);

		BinaryTree<Integer> t129 = new BinaryTree<Integer>( );
		t129.merge(2, t125, t128);

		BinaryTree<Integer> t130 = new BinaryTree<Integer>( );
		t130.merge(30, t122, t129);

		BinaryTree<Integer> t131 = new BinaryTree<Integer>( );
		t131.merge(72, t115, t130);

		if(Assignment_18.numberOfLeaves(t131) != 20){
			System.err.println("For tree t131, error with numberOfLeaves method: Expected 20 received " + Assignment_18.numberOfLeaves(t131));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t131) != 9){
			System.err.println("For tree t131, error with numberOfNodesWithOneNonNullChild method: Expected 9 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t131));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t131) != 19){
			System.err.println("For tree t131, error with numberOfNodesWithTwoNonNullChildren method: Expected 19 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t131));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t131) != 24){
			System.err.println("For tree t131, error with numberOfNodesWithEvenDataItems method: Expected 24 received " + Assignment_18.numberOfNodesWithEvenDataItems(t131));
		}
		if(Assignment_18.sumOfAllItems(t131) != 2174){
			System.err.println("For tree t131, error with sumOfAllItems method: Expected 2174 received " + Assignment_18.sumOfAllItems(t131));
		}


		BinaryTree<Integer> t132 = new BinaryTree<Integer>( );
		t132.merge(12, new BinaryTree<Integer>(59), new BinaryTree<Integer>(16));//Two Children

		BinaryTree<Integer> t133 = new BinaryTree<Integer>( );
		t133.merge(27, new BinaryTree<Integer>(), new BinaryTree<Integer>(63));//Right Child

		BinaryTree<Integer> t134 = new BinaryTree<Integer>( );
		t134.merge(88, t132, t133);

		BinaryTree<Integer> t135 = new BinaryTree<Integer>( 0 );//No Children

		BinaryTree<Integer> t136 = new BinaryTree<Integer>( );
		t136.merge(54, new BinaryTree<Integer>(32), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t137 = new BinaryTree<Integer>( );
		t137.merge(36, t135, t136);

		BinaryTree<Integer> t138 = new BinaryTree<Integer>( );
		t138.merge(33, t134, t137);

		BinaryTree<Integer> t139 = new BinaryTree<Integer>( );
		t139.merge(25, new BinaryTree<Integer>(), new BinaryTree<Integer>(80));//Right Child

		BinaryTree<Integer> t140 = new BinaryTree<Integer>( );
		t140.merge(33, new BinaryTree<Integer>(18), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t141 = new BinaryTree<Integer>( );
		t141.merge(70, t139, t140);

		BinaryTree<Integer> t142 = new BinaryTree<Integer>( );
		t142.merge(78, new BinaryTree<Integer>(12), new BinaryTree<Integer>(71));//Two Children

		BinaryTree<Integer> t143 = new BinaryTree<Integer>( );
		t143.merge(22, new BinaryTree<Integer>(), new BinaryTree<Integer>(16));//Right Child

		BinaryTree<Integer> t144 = new BinaryTree<Integer>( );
		t144.merge(71, t142, t143);

		BinaryTree<Integer> t145 = new BinaryTree<Integer>( );
		t145.merge(73, t141, t144);

		BinaryTree<Integer> t146 = new BinaryTree<Integer>( );
		t146.merge(54, t138, t145);

		BinaryTree<Integer> t147 = new BinaryTree<Integer>( 96 );//No Children

		BinaryTree<Integer> t148 = new BinaryTree<Integer>( );
		t148.merge(71, new BinaryTree<Integer>(), new BinaryTree<Integer>(3));//Right Child

		BinaryTree<Integer> t149 = new BinaryTree<Integer>( );
		t149.merge(40, t147, t148);

		BinaryTree<Integer> t150 = new BinaryTree<Integer>( );
		t150.merge(11, new BinaryTree<Integer>(72), new BinaryTree<Integer>(42));//Two Children

		BinaryTree<Integer> t151 = new BinaryTree<Integer>( );
		t151.merge(62, new BinaryTree<Integer>(), new BinaryTree<Integer>(60));//Right Child

		BinaryTree<Integer> t152 = new BinaryTree<Integer>( );
		t152.merge(46, t150, t151);

		BinaryTree<Integer> t153 = new BinaryTree<Integer>( );
		t153.merge(20, t149, t152);

		BinaryTree<Integer> t154 = new BinaryTree<Integer>( );
		t154.merge(71, new BinaryTree<Integer>(18), new BinaryTree<Integer>(86));//Two Children

		BinaryTree<Integer> t155 = new BinaryTree<Integer>( );
		t155.merge(53, new BinaryTree<Integer>(31), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t156 = new BinaryTree<Integer>( );
		t156.merge(78, t154, t155);

		BinaryTree<Integer> t157 = new BinaryTree<Integer>( 93 );//No Children

		BinaryTree<Integer> t158 = new BinaryTree<Integer>( );
		t158.merge(53, new BinaryTree<Integer>(), new BinaryTree<Integer>(83));//Right Child

		BinaryTree<Integer> t159 = new BinaryTree<Integer>( );
		t159.merge(63, t157, t158);

		BinaryTree<Integer> t160 = new BinaryTree<Integer>( );
		t160.merge(98, t156, t159);

		BinaryTree<Integer> t161 = new BinaryTree<Integer>( );
		t161.merge(88, t153, t160);

		BinaryTree<Integer> t162 = new BinaryTree<Integer>( );
		t162.merge(68, t146, t161);

		if(Assignment_18.numberOfLeaves(t162) != 20){
			System.err.println("For tree t162, error with numberOfLeaves method: Expected 20 received " + Assignment_18.numberOfLeaves(t162));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t162) != 9){
			System.err.println("For tree t162, error with numberOfNodesWithOneNonNullChild method: Expected 9 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t162));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t162) != 19){
			System.err.println("For tree t162, error with numberOfNodesWithTwoNonNullChildren method: Expected 19 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t162));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t162) != 29){
			System.err.println("For tree t162, error with numberOfNodesWithEvenDataItems method: Expected 29 received " + Assignment_18.numberOfNodesWithEvenDataItems(t162));
		}
		if(Assignment_18.sumOfAllItems(t162) != 2449){
			System.err.println("For tree t162, error with sumOfAllItems method: Expected 2449 received " + Assignment_18.sumOfAllItems(t162));
		}


		BinaryTree<Integer> t163 = new BinaryTree<Integer>( );
		t163.merge(57, new BinaryTree<Integer>(95), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t164 = new BinaryTree<Integer>( 71 );//No Children

		BinaryTree<Integer> t165 = new BinaryTree<Integer>( );
		t165.merge(47, t163, t164);

		BinaryTree<Integer> t166 = new BinaryTree<Integer>( );
		t166.merge(22, new BinaryTree<Integer>(), new BinaryTree<Integer>(74));//Right Child

		BinaryTree<Integer> t167 = new BinaryTree<Integer>( );
		t167.merge(24, new BinaryTree<Integer>(), new BinaryTree<Integer>(76));//Right Child

		BinaryTree<Integer> t168 = new BinaryTree<Integer>( );
		t168.merge(63, t166, t167);

		BinaryTree<Integer> t169 = new BinaryTree<Integer>( );
		t169.merge(82, t165, t168);

		BinaryTree<Integer> t170 = new BinaryTree<Integer>( );
		t170.merge(95, new BinaryTree<Integer>(), new BinaryTree<Integer>(85));//Right Child

		BinaryTree<Integer> t171 = new BinaryTree<Integer>( );
		t171.merge(17, new BinaryTree<Integer>(55), new BinaryTree<Integer>(97));//Two Children

		BinaryTree<Integer> t172 = new BinaryTree<Integer>( );
		t172.merge(94, t170, t171);

		BinaryTree<Integer> t173 = new BinaryTree<Integer>( );
		t173.merge(69, new BinaryTree<Integer>(52), new BinaryTree<Integer>(71));//Two Children

		BinaryTree<Integer> t174 = new BinaryTree<Integer>( );
		t174.merge(4, new BinaryTree<Integer>(22), new BinaryTree<Integer>(12));//Two Children

		BinaryTree<Integer> t175 = new BinaryTree<Integer>( );
		t175.merge(10, t173, t174);

		BinaryTree<Integer> t176 = new BinaryTree<Integer>( );
		t176.merge(34, t172, t175);

		BinaryTree<Integer> t177 = new BinaryTree<Integer>( );
		t177.merge(44, t169, t176);

		BinaryTree<Integer> t178 = new BinaryTree<Integer>( );
		t178.merge(84, new BinaryTree<Integer>(13), new BinaryTree<Integer>(80));//Two Children

		BinaryTree<Integer> t179 = new BinaryTree<Integer>( );
		t179.merge(84, new BinaryTree<Integer>(76), new BinaryTree<Integer>(88));//Two Children

		BinaryTree<Integer> t180 = new BinaryTree<Integer>( );
		t180.merge(10, t178, t179);

		BinaryTree<Integer> t181 = new BinaryTree<Integer>( );
		t181.merge(18, new BinaryTree<Integer>(21), new BinaryTree<Integer>(96));//Two Children

		BinaryTree<Integer> t182 = new BinaryTree<Integer>( );
		t182.merge(84, new BinaryTree<Integer>(), new BinaryTree<Integer>(6));//Right Child

		BinaryTree<Integer> t183 = new BinaryTree<Integer>( );
		t183.merge(79, t181, t182);

		BinaryTree<Integer> t184 = new BinaryTree<Integer>( );
		t184.merge(0, t180, t183);

		BinaryTree<Integer> t185 = new BinaryTree<Integer>( );
		t185.merge(99, new BinaryTree<Integer>(83), new BinaryTree<Integer>(21));//Two Children

		BinaryTree<Integer> t186 = new BinaryTree<Integer>( );
		t186.merge(69, new BinaryTree<Integer>(69), new BinaryTree<Integer>(62));//Two Children

		BinaryTree<Integer> t187 = new BinaryTree<Integer>( );
		t187.merge(39, t185, t186);

		BinaryTree<Integer> t188 = new BinaryTree<Integer>( );
		t188.merge(59, new BinaryTree<Integer>(45), new BinaryTree<Integer>(63));//Two Children

		BinaryTree<Integer> t189 = new BinaryTree<Integer>( );
		t189.merge(45, new BinaryTree<Integer>(77), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t190 = new BinaryTree<Integer>( );
		t190.merge(3, t188, t189);

		BinaryTree<Integer> t191 = new BinaryTree<Integer>( );
		t191.merge(92, t187, t190);

		BinaryTree<Integer> t192 = new BinaryTree<Integer>( );
		t192.merge(58, t184, t191);

		BinaryTree<Integer> t193 = new BinaryTree<Integer>( );
		t193.merge(91, t177, t192);

		if(Assignment_18.numberOfLeaves(t193) != 25){
			System.err.println("For tree t193, error with numberOfLeaves method: Expected 25 received " + Assignment_18.numberOfLeaves(t193));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t193) != 6){
			System.err.println("For tree t193, error with numberOfNodesWithOneNonNullChild method: Expected 6 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t193));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t193) != 24){
			System.err.println("For tree t193, error with numberOfNodesWithTwoNonNullChildren method: Expected 24 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t193));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t193) != 27){
			System.err.println("For tree t193, error with numberOfNodesWithEvenDataItems method: Expected 27 received " + Assignment_18.numberOfNodesWithEvenDataItems(t193));
		}
		if(Assignment_18.sumOfAllItems(t193) != 3086){
			System.err.println("For tree t193, error with sumOfAllItems method: Expected 3086 received " + Assignment_18.sumOfAllItems(t193));
		}


		BinaryTree<Integer> t194 = new BinaryTree<Integer>( );
		t194.merge(93, new BinaryTree<Integer>(), new BinaryTree<Integer>(21));//Right Child

		BinaryTree<Integer> t195 = new BinaryTree<Integer>( );
		t195.merge(67, new BinaryTree<Integer>(58), new BinaryTree<Integer>(51));//Two Children

		BinaryTree<Integer> t196 = new BinaryTree<Integer>( );
		t196.merge(70, t194, t195);

		BinaryTree<Integer> t197 = new BinaryTree<Integer>( 72 );//No Children

		BinaryTree<Integer> t198 = new BinaryTree<Integer>( );
		t198.merge(0, new BinaryTree<Integer>(22), new BinaryTree<Integer>(24));//Two Children

		BinaryTree<Integer> t199 = new BinaryTree<Integer>( );
		t199.merge(22, t197, t198);

		BinaryTree<Integer> t200 = new BinaryTree<Integer>( );
		t200.merge(9, t196, t199);

		BinaryTree<Integer> t201 = new BinaryTree<Integer>( );
		t201.merge(53, new BinaryTree<Integer>(), new BinaryTree<Integer>(39));//Right Child

		BinaryTree<Integer> t202 = new BinaryTree<Integer>( );
		t202.merge(70, new BinaryTree<Integer>(73), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t203 = new BinaryTree<Integer>( );
		t203.merge(4, t201, t202);

		BinaryTree<Integer> t204 = new BinaryTree<Integer>( );
		t204.merge(16, new BinaryTree<Integer>(92), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t205 = new BinaryTree<Integer>( );
		t205.merge(80, new BinaryTree<Integer>(3), new BinaryTree<Integer>(69));//Two Children

		BinaryTree<Integer> t206 = new BinaryTree<Integer>( );
		t206.merge(32, t204, t205);

		BinaryTree<Integer> t207 = new BinaryTree<Integer>( );
		t207.merge(16, t203, t206);

		BinaryTree<Integer> t208 = new BinaryTree<Integer>( );
		t208.merge(73, t200, t207);

		BinaryTree<Integer> t209 = new BinaryTree<Integer>( 55 );//No Children

		BinaryTree<Integer> t210 = new BinaryTree<Integer>( );
		t210.merge(72, new BinaryTree<Integer>(36), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t211 = new BinaryTree<Integer>( );
		t211.merge(90, t209, t210);

		BinaryTree<Integer> t212 = new BinaryTree<Integer>( );
		t212.merge(37, new BinaryTree<Integer>(14), new BinaryTree<Integer>(37));//Two Children

		BinaryTree<Integer> t213 = new BinaryTree<Integer>( );
		t213.merge(72, new BinaryTree<Integer>(), new BinaryTree<Integer>(36));//Right Child

		BinaryTree<Integer> t214 = new BinaryTree<Integer>( );
		t214.merge(79, t212, t213);

		BinaryTree<Integer> t215 = new BinaryTree<Integer>( );
		t215.merge(24, t211, t214);

		BinaryTree<Integer> t216 = new BinaryTree<Integer>( );
		t216.merge(31, new BinaryTree<Integer>(), new BinaryTree<Integer>(45));//Right Child

		BinaryTree<Integer> t217 = new BinaryTree<Integer>( );
		t217.merge(62, new BinaryTree<Integer>(), new BinaryTree<Integer>(15));//Right Child

		BinaryTree<Integer> t218 = new BinaryTree<Integer>( );
		t218.merge(19, t216, t217);

		BinaryTree<Integer> t219 = new BinaryTree<Integer>( );
		t219.merge(24, new BinaryTree<Integer>(24), new BinaryTree<Integer>(47));//Two Children

		BinaryTree<Integer> t220 = new BinaryTree<Integer>( );
		t220.merge(88, new BinaryTree<Integer>(), new BinaryTree<Integer>(77));//Right Child

		BinaryTree<Integer> t221 = new BinaryTree<Integer>( );
		t221.merge(38, t219, t220);

		BinaryTree<Integer> t222 = new BinaryTree<Integer>( );
		t222.merge(89, t218, t221);

		BinaryTree<Integer> t223 = new BinaryTree<Integer>( );
		t223.merge(27, t215, t222);

		BinaryTree<Integer> t224 = new BinaryTree<Integer>( );
		t224.merge(45, t208, t223);

		if(Assignment_18.numberOfLeaves(t224) != 21){
			System.err.println("For tree t224, error with numberOfLeaves method: Expected 21 received " + Assignment_18.numberOfLeaves(t224));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t224) != 9){
			System.err.println("For tree t224, error with numberOfNodesWithOneNonNullChild method: Expected 9 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t224));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t224) != 20){
			System.err.println("For tree t224, error with numberOfNodesWithTwoNonNullChildren method: Expected 20 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t224));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t224) != 26){
			System.err.println("For tree t224, error with numberOfNodesWithEvenDataItems method: Expected 26 received " + Assignment_18.numberOfNodesWithEvenDataItems(t224));
		}
		if(Assignment_18.sumOfAllItems(t224) != 2312){
			System.err.println("For tree t224, error with sumOfAllItems method: Expected 2312 received " + Assignment_18.sumOfAllItems(t224));
		}


		BinaryTree<Integer> t225 = new BinaryTree<Integer>( );
		t225.merge(70, new BinaryTree<Integer>(), new BinaryTree<Integer>(10));//Right Child

		BinaryTree<Integer> t226 = new BinaryTree<Integer>( );
		t226.merge(7, new BinaryTree<Integer>(69), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t227 = new BinaryTree<Integer>( );
		t227.merge(2, t225, t226);

		BinaryTree<Integer> t228 = new BinaryTree<Integer>( );
		t228.merge(68, new BinaryTree<Integer>(77), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t229 = new BinaryTree<Integer>( );
		t229.merge(58, new BinaryTree<Integer>(6), new BinaryTree<Integer>(25));//Two Children

		BinaryTree<Integer> t230 = new BinaryTree<Integer>( );
		t230.merge(73, t228, t229);

		BinaryTree<Integer> t231 = new BinaryTree<Integer>( );
		t231.merge(63, t227, t230);

		BinaryTree<Integer> t232 = new BinaryTree<Integer>( );
		t232.merge(54, new BinaryTree<Integer>(88), new BinaryTree<Integer>(36));//Two Children

		BinaryTree<Integer> t233 = new BinaryTree<Integer>( );
		t233.merge(36, new BinaryTree<Integer>(60), new BinaryTree<Integer>(21));//Two Children

		BinaryTree<Integer> t234 = new BinaryTree<Integer>( );
		t234.merge(25, t232, t233);

		BinaryTree<Integer> t235 = new BinaryTree<Integer>( 84 );//No Children

		BinaryTree<Integer> t236 = new BinaryTree<Integer>( 34 );//No Children

		BinaryTree<Integer> t237 = new BinaryTree<Integer>( );
		t237.merge(10, t235, t236);

		BinaryTree<Integer> t238 = new BinaryTree<Integer>( );
		t238.merge(89, t234, t237);

		BinaryTree<Integer> t239 = new BinaryTree<Integer>( );
		t239.merge(11, t231, t238);

		BinaryTree<Integer> t240 = new BinaryTree<Integer>( );
		t240.merge(28, new BinaryTree<Integer>(), new BinaryTree<Integer>(12));//Right Child

		BinaryTree<Integer> t241 = new BinaryTree<Integer>( 73 );//No Children

		BinaryTree<Integer> t242 = new BinaryTree<Integer>( );
		t242.merge(86, t240, t241);

		BinaryTree<Integer> t243 = new BinaryTree<Integer>( );
		t243.merge(96, new BinaryTree<Integer>(), new BinaryTree<Integer>(41));//Right Child

		BinaryTree<Integer> t244 = new BinaryTree<Integer>( 20 );//No Children

		BinaryTree<Integer> t245 = new BinaryTree<Integer>( );
		t245.merge(38, t243, t244);

		BinaryTree<Integer> t246 = new BinaryTree<Integer>( );
		t246.merge(65, t242, t245);

		BinaryTree<Integer> t247 = new BinaryTree<Integer>( 21 );//No Children

		BinaryTree<Integer> t248 = new BinaryTree<Integer>( );
		t248.merge(96, new BinaryTree<Integer>(), new BinaryTree<Integer>(20));//Right Child

		BinaryTree<Integer> t249 = new BinaryTree<Integer>( );
		t249.merge(71, t247, t248);

		BinaryTree<Integer> t250 = new BinaryTree<Integer>( );
		t250.merge(97, new BinaryTree<Integer>(85), new BinaryTree<Integer>(39));//Two Children

		BinaryTree<Integer> t251 = new BinaryTree<Integer>( );
		t251.merge(52, new BinaryTree<Integer>(44), new BinaryTree<Integer>(91));//Two Children

		BinaryTree<Integer> t252 = new BinaryTree<Integer>( );
		t252.merge(28, t250, t251);

		BinaryTree<Integer> t253 = new BinaryTree<Integer>( );
		t253.merge(19, t249, t252);

		BinaryTree<Integer> t254 = new BinaryTree<Integer>( );
		t254.merge(56, t246, t253);

		BinaryTree<Integer> t255 = new BinaryTree<Integer>( );
		t255.merge(79, t239, t254);

		if(Assignment_18.numberOfLeaves(t255) != 21){
			System.err.println("For tree t255, error with numberOfLeaves method: Expected 21 received " + Assignment_18.numberOfLeaves(t255));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t255) != 6){
			System.err.println("For tree t255, error with numberOfNodesWithOneNonNullChild method: Expected 6 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t255));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t255) != 20){
			System.err.println("For tree t255, error with numberOfNodesWithTwoNonNullChildren method: Expected 20 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t255));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t255) != 26){
			System.err.println("For tree t255, error with numberOfNodesWithEvenDataItems method: Expected 26 received " + Assignment_18.numberOfNodesWithEvenDataItems(t255));
		}
		if(Assignment_18.sumOfAllItems(t255) != 2333){
			System.err.println("For tree t255, error with sumOfAllItems method: Expected 2333 received " + Assignment_18.sumOfAllItems(t255));
		}


		BinaryTree<Integer> t256 = new BinaryTree<Integer>( );
		t256.merge(92, new BinaryTree<Integer>(24), new BinaryTree<Integer>(22));//Two Children

		BinaryTree<Integer> t257 = new BinaryTree<Integer>( );
		t257.merge(81, new BinaryTree<Integer>(37), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t258 = new BinaryTree<Integer>( );
		t258.merge(78, t256, t257);

		BinaryTree<Integer> t259 = new BinaryTree<Integer>( );
		t259.merge(20, new BinaryTree<Integer>(), new BinaryTree<Integer>(7));//Right Child

		BinaryTree<Integer> t260 = new BinaryTree<Integer>( );
		t260.merge(10, new BinaryTree<Integer>(57), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t261 = new BinaryTree<Integer>( );
		t261.merge(95, t259, t260);

		BinaryTree<Integer> t262 = new BinaryTree<Integer>( );
		t262.merge(23, t258, t261);

		BinaryTree<Integer> t263 = new BinaryTree<Integer>( );
		t263.merge(38, new BinaryTree<Integer>(45), new BinaryTree<Integer>(88));//Two Children

		BinaryTree<Integer> t264 = new BinaryTree<Integer>( );
		t264.merge(40, new BinaryTree<Integer>(90), new BinaryTree<Integer>(90));//Two Children

		BinaryTree<Integer> t265 = new BinaryTree<Integer>( );
		t265.merge(94, t263, t264);

		BinaryTree<Integer> t266 = new BinaryTree<Integer>( 38 );//No Children

		BinaryTree<Integer> t267 = new BinaryTree<Integer>( );
		t267.merge(29, new BinaryTree<Integer>(62), new BinaryTree<Integer>(6));//Two Children

		BinaryTree<Integer> t268 = new BinaryTree<Integer>( );
		t268.merge(45, t266, t267);

		BinaryTree<Integer> t269 = new BinaryTree<Integer>( );
		t269.merge(97, t265, t268);

		BinaryTree<Integer> t270 = new BinaryTree<Integer>( );
		t270.merge(56, t262, t269);

		BinaryTree<Integer> t271 = new BinaryTree<Integer>( );
		t271.merge(19, new BinaryTree<Integer>(), new BinaryTree<Integer>(53));//Right Child

		BinaryTree<Integer> t272 = new BinaryTree<Integer>( 10 );//No Children

		BinaryTree<Integer> t273 = new BinaryTree<Integer>( );
		t273.merge(57, t271, t272);

		BinaryTree<Integer> t274 = new BinaryTree<Integer>( );
		t274.merge(51, new BinaryTree<Integer>(), new BinaryTree<Integer>(55));//Right Child

		BinaryTree<Integer> t275 = new BinaryTree<Integer>( );
		t275.merge(95, new BinaryTree<Integer>(47), new BinaryTree<Integer>(82));//Two Children

		BinaryTree<Integer> t276 = new BinaryTree<Integer>( );
		t276.merge(73, t274, t275);

		BinaryTree<Integer> t277 = new BinaryTree<Integer>( );
		t277.merge(7, t273, t276);

		BinaryTree<Integer> t278 = new BinaryTree<Integer>( );
		t278.merge(51, new BinaryTree<Integer>(65), new BinaryTree<Integer>(79));//Two Children

		BinaryTree<Integer> t279 = new BinaryTree<Integer>( );
		t279.merge(71, new BinaryTree<Integer>(87), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t280 = new BinaryTree<Integer>( );
		t280.merge(6, t278, t279);

		BinaryTree<Integer> t281 = new BinaryTree<Integer>( );
		t281.merge(90, new BinaryTree<Integer>(), new BinaryTree<Integer>(81));//Right Child

		BinaryTree<Integer> t282 = new BinaryTree<Integer>( );
		t282.merge(30, new BinaryTree<Integer>(58), new BinaryTree<Integer>(86));//Two Children

		BinaryTree<Integer> t283 = new BinaryTree<Integer>( );
		t283.merge(29, t281, t282);

		BinaryTree<Integer> t284 = new BinaryTree<Integer>( );
		t284.merge(56, t280, t283);

		BinaryTree<Integer> t285 = new BinaryTree<Integer>( );
		t285.merge(26, t277, t284);

		BinaryTree<Integer> t286 = new BinaryTree<Integer>( );
		t286.merge(89, t270, t285);

		if(Assignment_18.numberOfLeaves(t286) != 23){
			System.err.println("For tree t286, error with numberOfLeaves method: Expected 23 received " + Assignment_18.numberOfLeaves(t286));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t286) != 7){
			System.err.println("For tree t286, error with numberOfNodesWithOneNonNullChild method: Expected 7 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t286));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t286) != 22){
			System.err.println("For tree t286, error with numberOfNodesWithTwoNonNullChildren method: Expected 22 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t286));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t286) != 25){
			System.err.println("For tree t286, error with numberOfNodesWithEvenDataItems method: Expected 25 received " + Assignment_18.numberOfNodesWithEvenDataItems(t286));
		}
		if(Assignment_18.sumOfAllItems(t286) != 2817){
			System.err.println("For tree t286, error with sumOfAllItems method: Expected 2817 received " + Assignment_18.sumOfAllItems(t286));
		}


		BinaryTree<Integer> t287 = new BinaryTree<Integer>( );
		t287.merge(73, new BinaryTree<Integer>(), new BinaryTree<Integer>(95));//Right Child

		BinaryTree<Integer> t288 = new BinaryTree<Integer>( );
		t288.merge(54, new BinaryTree<Integer>(), new BinaryTree<Integer>(90));//Right Child

		BinaryTree<Integer> t289 = new BinaryTree<Integer>( );
		t289.merge(24, t287, t288);

		BinaryTree<Integer> t290 = new BinaryTree<Integer>( );
		t290.merge(87, new BinaryTree<Integer>(73), new BinaryTree<Integer>(10));//Two Children

		BinaryTree<Integer> t291 = new BinaryTree<Integer>( );
		t291.merge(67, new BinaryTree<Integer>(), new BinaryTree<Integer>(69));//Right Child

		BinaryTree<Integer> t292 = new BinaryTree<Integer>( );
		t292.merge(63, t290, t291);

		BinaryTree<Integer> t293 = new BinaryTree<Integer>( );
		t293.merge(44, t289, t292);

		BinaryTree<Integer> t294 = new BinaryTree<Integer>( );
		t294.merge(9, new BinaryTree<Integer>(80), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t295 = new BinaryTree<Integer>( 94 );//No Children

		BinaryTree<Integer> t296 = new BinaryTree<Integer>( );
		t296.merge(50, t294, t295);

		BinaryTree<Integer> t297 = new BinaryTree<Integer>( 5 );//No Children

		BinaryTree<Integer> t298 = new BinaryTree<Integer>( );
		t298.merge(98, new BinaryTree<Integer>(51), new BinaryTree<Integer>(65));//Two Children

		BinaryTree<Integer> t299 = new BinaryTree<Integer>( );
		t299.merge(27, t297, t298);

		BinaryTree<Integer> t300 = new BinaryTree<Integer>( );
		t300.merge(99, t296, t299);

		BinaryTree<Integer> t301 = new BinaryTree<Integer>( );
		t301.merge(60, t293, t300);

		BinaryTree<Integer> t302 = new BinaryTree<Integer>( );
		t302.merge(16, new BinaryTree<Integer>(28), new BinaryTree<Integer>(66));//Two Children

		BinaryTree<Integer> t303 = new BinaryTree<Integer>( );
		t303.merge(37, new BinaryTree<Integer>(66), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t304 = new BinaryTree<Integer>( );
		t304.merge(2, t302, t303);

		BinaryTree<Integer> t305 = new BinaryTree<Integer>( 77 );//No Children

		BinaryTree<Integer> t306 = new BinaryTree<Integer>( );
		t306.merge(4, new BinaryTree<Integer>(), new BinaryTree<Integer>(92));//Right Child

		BinaryTree<Integer> t307 = new BinaryTree<Integer>( );
		t307.merge(86, t305, t306);

		BinaryTree<Integer> t308 = new BinaryTree<Integer>( );
		t308.merge(82, t304, t307);

		BinaryTree<Integer> t309 = new BinaryTree<Integer>( );
		t309.merge(74, new BinaryTree<Integer>(89), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t310 = new BinaryTree<Integer>( );
		t310.merge(51, new BinaryTree<Integer>(78), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t311 = new BinaryTree<Integer>( );
		t311.merge(3, t309, t310);

		BinaryTree<Integer> t312 = new BinaryTree<Integer>( );
		t312.merge(64, new BinaryTree<Integer>(87), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t313 = new BinaryTree<Integer>( );
		t313.merge(38, new BinaryTree<Integer>(61), new BinaryTree<Integer>(81));//Two Children

		BinaryTree<Integer> t314 = new BinaryTree<Integer>( );
		t314.merge(91, t312, t313);

		BinaryTree<Integer> t315 = new BinaryTree<Integer>( );
		t315.merge(26, t311, t314);

		BinaryTree<Integer> t316 = new BinaryTree<Integer>( );
		t316.merge(13, t308, t315);

		BinaryTree<Integer> t317 = new BinaryTree<Integer>( );
		t317.merge(6, t301, t316);

		if(Assignment_18.numberOfLeaves(t317) != 20){
			System.err.println("For tree t317, error with numberOfLeaves method: Expected 20 received " + Assignment_18.numberOfLeaves(t317));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t317) != 9){
			System.err.println("For tree t317, error with numberOfNodesWithOneNonNullChild method: Expected 9 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t317));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t317) != 19){
			System.err.println("For tree t317, error with numberOfNodesWithTwoNonNullChildren method: Expected 19 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t317));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t317) != 25){
			System.err.println("For tree t317, error with numberOfNodesWithEvenDataItems method: Expected 25 received " + Assignment_18.numberOfNodesWithEvenDataItems(t317));
		}
		if(Assignment_18.sumOfAllItems(t317) != 2705){
			System.err.println("For tree t317, error with sumOfAllItems method: Expected 2705 received " + Assignment_18.sumOfAllItems(t317));
		}


		BinaryTree<Integer> t318 = new BinaryTree<Integer>( );
		t318.merge(27, new BinaryTree<Integer>(), new BinaryTree<Integer>(82));//Right Child

		BinaryTree<Integer> t319 = new BinaryTree<Integer>( );
		t319.merge(44, new BinaryTree<Integer>(), new BinaryTree<Integer>(91));//Right Child

		BinaryTree<Integer> t320 = new BinaryTree<Integer>( );
		t320.merge(19, t318, t319);

		BinaryTree<Integer> t321 = new BinaryTree<Integer>( 79 );//No Children

		BinaryTree<Integer> t322 = new BinaryTree<Integer>( );
		t322.merge(62, new BinaryTree<Integer>(), new BinaryTree<Integer>(53));//Right Child

		BinaryTree<Integer> t323 = new BinaryTree<Integer>( );
		t323.merge(92, t321, t322);

		BinaryTree<Integer> t324 = new BinaryTree<Integer>( );
		t324.merge(70, t320, t323);

		BinaryTree<Integer> t325 = new BinaryTree<Integer>( );
		t325.merge(43, new BinaryTree<Integer>(58), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t326 = new BinaryTree<Integer>( );
		t326.merge(51, new BinaryTree<Integer>(), new BinaryTree<Integer>(15));//Right Child

		BinaryTree<Integer> t327 = new BinaryTree<Integer>( );
		t327.merge(68, t325, t326);

		BinaryTree<Integer> t328 = new BinaryTree<Integer>( 19 );//No Children

		BinaryTree<Integer> t329 = new BinaryTree<Integer>( );
		t329.merge(0, new BinaryTree<Integer>(92), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t330 = new BinaryTree<Integer>( );
		t330.merge(18, t328, t329);

		BinaryTree<Integer> t331 = new BinaryTree<Integer>( );
		t331.merge(43, t327, t330);

		BinaryTree<Integer> t332 = new BinaryTree<Integer>( );
		t332.merge(89, t324, t331);

		BinaryTree<Integer> t333 = new BinaryTree<Integer>( );
		t333.merge(61, new BinaryTree<Integer>(), new BinaryTree<Integer>(39));//Right Child

		BinaryTree<Integer> t334 = new BinaryTree<Integer>( );
		t334.merge(4, new BinaryTree<Integer>(), new BinaryTree<Integer>(75));//Right Child

		BinaryTree<Integer> t335 = new BinaryTree<Integer>( );
		t335.merge(31, t333, t334);

		BinaryTree<Integer> t336 = new BinaryTree<Integer>( );
		t336.merge(93, new BinaryTree<Integer>(28), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t337 = new BinaryTree<Integer>( );
		t337.merge(28, new BinaryTree<Integer>(), new BinaryTree<Integer>(35));//Right Child

		BinaryTree<Integer> t338 = new BinaryTree<Integer>( );
		t338.merge(36, t336, t337);

		BinaryTree<Integer> t339 = new BinaryTree<Integer>( );
		t339.merge(92, t335, t338);

		BinaryTree<Integer> t340 = new BinaryTree<Integer>( );
		t340.merge(35, new BinaryTree<Integer>(18), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t341 = new BinaryTree<Integer>( );
		t341.merge(86, new BinaryTree<Integer>(98), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t342 = new BinaryTree<Integer>( );
		t342.merge(30, t340, t341);

		BinaryTree<Integer> t343 = new BinaryTree<Integer>( );
		t343.merge(16, new BinaryTree<Integer>(7), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t344 = new BinaryTree<Integer>( );
		t344.merge(36, new BinaryTree<Integer>(79), new BinaryTree<Integer>(77));//Two Children

		BinaryTree<Integer> t345 = new BinaryTree<Integer>( );
		t345.merge(23, t343, t344);

		BinaryTree<Integer> t346 = new BinaryTree<Integer>( );
		t346.merge(67, t342, t345);

		BinaryTree<Integer> t347 = new BinaryTree<Integer>( );
		t347.merge(13, t339, t346);

		BinaryTree<Integer> t348 = new BinaryTree<Integer>( );
		t348.merge(48, t332, t347);

		if(Assignment_18.numberOfLeaves(t348) != 17){
			System.err.println("For tree t348, error with numberOfLeaves method: Expected 17 received " + Assignment_18.numberOfLeaves(t348));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t348) != 13){
			System.err.println("For tree t348, error with numberOfNodesWithOneNonNullChild method: Expected 13 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t348));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t348) != 16){
			System.err.println("For tree t348, error with numberOfNodesWithTwoNonNullChildren method: Expected 16 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t348));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t348) != 22){
			System.err.println("For tree t348, error with numberOfNodesWithEvenDataItems method: Expected 22 received " + Assignment_18.numberOfNodesWithEvenDataItems(t348));
		}
		if(Assignment_18.sumOfAllItems(t348) != 2270){
			System.err.println("For tree t348, error with sumOfAllItems method: Expected 2270 received " + Assignment_18.sumOfAllItems(t348));
		}


		BinaryTree<Integer> t349 = new BinaryTree<Integer>( );
		t349.merge(31, new BinaryTree<Integer>(54), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t350 = new BinaryTree<Integer>( );
		t350.merge(14, new BinaryTree<Integer>(55), new BinaryTree<Integer>(63));//Two Children

		BinaryTree<Integer> t351 = new BinaryTree<Integer>( );
		t351.merge(56, t349, t350);

		BinaryTree<Integer> t352 = new BinaryTree<Integer>( );
		t352.merge(5, new BinaryTree<Integer>(), new BinaryTree<Integer>(77));//Right Child

		BinaryTree<Integer> t353 = new BinaryTree<Integer>( 32 );//No Children

		BinaryTree<Integer> t354 = new BinaryTree<Integer>( );
		t354.merge(85, t352, t353);

		BinaryTree<Integer> t355 = new BinaryTree<Integer>( );
		t355.merge(19, t351, t354);

		BinaryTree<Integer> t356 = new BinaryTree<Integer>( );
		t356.merge(48, new BinaryTree<Integer>(72), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t357 = new BinaryTree<Integer>( );
		t357.merge(92, new BinaryTree<Integer>(78), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t358 = new BinaryTree<Integer>( );
		t358.merge(76, t356, t357);

		BinaryTree<Integer> t359 = new BinaryTree<Integer>( );
		t359.merge(96, new BinaryTree<Integer>(69), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t360 = new BinaryTree<Integer>( );
		t360.merge(41, new BinaryTree<Integer>(), new BinaryTree<Integer>(25));//Right Child

		BinaryTree<Integer> t361 = new BinaryTree<Integer>( );
		t361.merge(79, t359, t360);

		BinaryTree<Integer> t362 = new BinaryTree<Integer>( );
		t362.merge(53, t358, t361);

		BinaryTree<Integer> t363 = new BinaryTree<Integer>( );
		t363.merge(0, t355, t362);

		BinaryTree<Integer> t364 = new BinaryTree<Integer>( );
		t364.merge(14, new BinaryTree<Integer>(65), new BinaryTree<Integer>(19));//Two Children

		BinaryTree<Integer> t365 = new BinaryTree<Integer>( );
		t365.merge(46, new BinaryTree<Integer>(15), new BinaryTree<Integer>(86));//Two Children

		BinaryTree<Integer> t366 = new BinaryTree<Integer>( );
		t366.merge(77, t364, t365);

		BinaryTree<Integer> t367 = new BinaryTree<Integer>( );
		t367.merge(55, new BinaryTree<Integer>(88), new BinaryTree<Integer>(56));//Two Children

		BinaryTree<Integer> t368 = new BinaryTree<Integer>( );
		t368.merge(68, new BinaryTree<Integer>(11), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t369 = new BinaryTree<Integer>( );
		t369.merge(11, t367, t368);

		BinaryTree<Integer> t370 = new BinaryTree<Integer>( );
		t370.merge(84, t366, t369);

		BinaryTree<Integer> t371 = new BinaryTree<Integer>( );
		t371.merge(66, new BinaryTree<Integer>(48), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t372 = new BinaryTree<Integer>( );
		t372.merge(50, new BinaryTree<Integer>(77), new BinaryTree<Integer>() );//Left Child

		BinaryTree<Integer> t373 = new BinaryTree<Integer>( );
		t373.merge(63, t371, t372);

		BinaryTree<Integer> t374 = new BinaryTree<Integer>( 46 );//No Children

		BinaryTree<Integer> t375 = new BinaryTree<Integer>( );
		t375.merge(88, new BinaryTree<Integer>(), new BinaryTree<Integer>(67));//Right Child

		BinaryTree<Integer> t376 = new BinaryTree<Integer>( );
		t376.merge(39, t374, t375);

		BinaryTree<Integer> t377 = new BinaryTree<Integer>( );
		t377.merge(51, t373, t376);

		BinaryTree<Integer> t378 = new BinaryTree<Integer>( );
		t378.merge(98, t370, t377);

		BinaryTree<Integer> t379 = new BinaryTree<Integer>( );
		t379.merge(38, t363, t378);

		if(Assignment_18.numberOfLeaves(t379) != 20){
			System.err.println("For tree t379, error with numberOfLeaves method: Expected 20 received " + Assignment_18.numberOfLeaves(t379));
		}
		if(Assignment_18.numberOfNodesWithOneNonNullChild(t379) != 10){
			System.err.println("For tree t379, error with numberOfNodesWithOneNonNullChild method: Expected 10 received " + Assignment_18.numberOfNodesWithOneNonNullChild(t379));
		}
		if(Assignment_18.numberOfNodesWithTwoNonNullChildren(t379) != 19){
			System.err.println("For tree t379, error with numberOfNodesWithTwoNonNullChildren method: Expected 19 received " + Assignment_18.numberOfNodesWithTwoNonNullChildren(t379));
		}
		if(Assignment_18.numberOfNodesWithEvenDataItems(t379) != 25){
			System.err.println("For tree t379, error with numberOfNodesWithEvenDataItems method: Expected 25 received " + Assignment_18.numberOfNodesWithEvenDataItems(t379));
		}
		if(Assignment_18.sumOfAllItems(t379) != 2646){
			System.err.println("For tree t379, error with sumOfAllItems method: Expected 2646 received " + Assignment_18.sumOfAllItems(t379));
		}

		Assignment_18.printRuntimes();
		System.out.println("Finished tests");

	}
}
