
public class Assignment_18 {

	public static int leaveCounter = 0;
	public static int oneNonNullCounter = 0;
	public static int runningSum = 0;
	public static int evenDataCount = 0;

	//18.9 a
	public static <AnyType> int numberOfLeaves(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return numberOfLeaves(t.getRoot());
	}
	public static <AnyType> int numberOfLeaves(BinaryNode<AnyType> t) {
		if (t.getRight()!=null) {
			numberOfLeaves(t.getRight());
		} else if (t.getLeft()!=null){
			numberOfLeaves(t.getLeft());
		}

		if (t.getRight()==null && t.getLeft()==null) {
			leaveCounter++;
		}
		
		return leaveCounter;
	}
	
	//18.9 b
	public static <AnyType> int numberOfNodesWithOneNonNullChild(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithOneNonNullChild(t.getRoot()); 
	}
	public static <AnyType> int numberOfNodesWithOneNonNullChild(BinaryNode<AnyType> t) {
		if (t.getRight()!=null && t.getLeft()==null){
			oneNonNullCounter++;
			return numberOfNodesWithOneNonNullChild(t.getRight());
		} else if (t.getRight()==null && t.getLeft()!=null){
			oneNonNullCounter++;
			return numberOfNodesWithOneNonNullChild(t.getLeft());
		} else if (t.getRight()==null && t.getLeft()==null) {
			return 0;
		} else {
			numberOfNodesWithOneNonNullChild(t.getLeft());
			numberOfNodesWithOneNonNullChild(t.getRight());
			return oneNonNullCounter;
		}
	}
	
	//18.9 c
	public static <AnyType> int numberOfNodesWithTwoNonNullChildren(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithTwoNonNullChildren(t.getRoot()); 
	}
	public static <AnyType> int numberOfNodesWithTwoNonNullChildren(BinaryNode<AnyType> t) {
		if (t.getRight()!=null && t.getLeft()==null){
			oneNonNullCounter++;
			return numberOfNodesWithOneNonNullChild(t.getRight());
		} else if (t.getRight()==null && t.getLeft()!=null){
			oneNonNullCounter++;
			return numberOfNodesWithOneNonNullChild(t.getLeft());
		} else if (t.getRight()==null && t.getLeft()==null) {
			return 0;
		} else {
			numberOfNodesWithOneNonNullChild(t.getLeft());
			numberOfNodesWithOneNonNullChild(t.getRight());
			return oneNonNullCounter;
		}
	}
	
	//18.10 a
	public static int numberOfNodesWithEvenDataItems(BinaryTree<Integer> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithEvenDataItems(t.getRoot()); 
	}
	public static int numberOfNodesWithEvenDataItems(BinaryNode<Integer> t) {
		if (t.getRight()!=null) {
			sumOfAllItems(t.getRight());
		}
		if (t.getLeft()!=null) {
			sumOfAllItems(t.getLeft());
		}
		if (t.getElement()%2==0) {
			evenDataCount++;
		}
		return evenDataCount;
	}
	
	//18.10 b
	public static int sumOfAllItems(BinaryTree<Integer> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: sumOfAllItems(t.getRoot()); 
	}
	public static int sumOfAllItems(BinaryNode<Integer> t) {
		if (t.getRight()!=null) {
			sumOfAllItems(t.getRight());
		}
		if (t.getLeft()!=null) {
			sumOfAllItems(t.getLeft());
		}
		runningSum = runningSum + t.getElement();
		return runningSum;
	}

	public static void printRuntimes() {
		//TODO type in the runtimes on these lines: i.e. log(n), n, n log(n), n*n, etc
		System.out.println("BigOh runtime of numberOfLeaves is: n");
		System.out.println("BigOh runtime of numberOfNodesWithOneNonNullChild is: n");
		System.out.println("BigOh runtime of numberOfNodesWithTwoNonNullChildren is: n");
		System.out.println("BigOh runtime of numberOfNodesWithEvenDataItems is: n");
		System.out.println("BigOh runtime of sumOfAllItems is: n");
		
	}
	
}
