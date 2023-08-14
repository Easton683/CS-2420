
public class Assignment_19 {

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMin(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return findMin(t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
		if( t != null ) {
			while( t.left != null ) {
				t = t.left;
			}
		}
		return t;
	}

	
	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMax(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return findMax(t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
		if( t != null ) {
			while( t.right != null ) {
				t = t.right;
			}
		}
		return t;
	}

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> find(AnyType x, BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return find(x, t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> find(AnyType x, BinaryNode<AnyType> t) {
		while( t != null ){
			if( x.compareTo( t.element ) < 0 ) {
				t = t.left;
			}
			else if( x.compareTo( t.element ) > 0 ) {
				t = t.right;
			}
			else {
				return t; // Match
			}
		}
		return null; // Not found
	}
	
	
	//19.27
	//Ideally the toString methods are stuck in the BinarySearchTree and BinaryNode files
	//to make it easier for me to grade, and you to program, I put them here and changed the methods a little
	public static <AnyType extends Comparable<? super AnyType>> String toString(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return toString(t.root); 
	}
	
	//Note: You can take a screenshot for your report like you did for the other methods, but the tester makes sure you programmed it correctly
	//so the screenshot of no errors in the main is all I really need
	private static <AnyType extends Comparable<? super AnyType>> String toString(BinaryNode<AnyType> t) {
		//Note, if you are going to use recursion, use the methods calls like toString(t) instead of t.toString() as you would if this method was inside the BinaryNode class
		return null; 
	}

}
