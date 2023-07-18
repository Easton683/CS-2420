
public class LinkedList<AnyType> {

    public Node<AnyType> nextNode;

	public LinkedList( ) {
        this.nextNode = null;
	}

    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
    	if(nextNode.equals(null)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty( ){
        this.nextNode = null;
    }


    /**
     * Insert at the front
     * @param x the item to insert.
     */
    public void insertFront( AnyType x ) {
        this.nextNode.setItem(x);
    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public Node<AnyType> find( AnyType x ) {
        return null;
    }

    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    public void remove( AnyType x ) {

    }

    /**
     * Return a string representation of the list
     */
    @Override
    public String toString() {
    	//Essentially put a space between each of what the node items toString methods return
    	return null;
    }


    /**
     * Return the size of the list
     * @return
     */
    public static <AnyType> int listSize( LinkedList<AnyType> theList ) {
    	return -1;
    }

    
    
    
    
    
	//Methods for the Chapter 17 Programming assignment
    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd( AnyType x ) {

    }

    
    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType x) {
		
	}
	
    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */	
	public void removeAll(AnyType x) {
		
	}
	
    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the first item in the list.
     * 
     */
	public Node<AnyType> previous(AnyType x) {
		return null;
	}

	/**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     * 
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
	public Node<AnyType> findAndMoveToFront(AnyType x) {
		return null;
	}


}
