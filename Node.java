
class Node<AnyType>
{
	public AnyType data;
	public Node<AnyType> nextNode;
	public String b;

	public Node( ) {
		this.data = null;
		this.nextNode = null;
	}
	
	public Node( AnyType x ) {
		this.data = x;
		this.nextNode = null;
	}

	public Node( AnyType x, Node<AnyType> n ) {
		this.data = x;
		this.nextNode = n;
	}

	public AnyType getItem() {
		return this.data;
	}

	public void setItem(AnyType x) {
		this.data = x;
	}

	public void setNextNode(Node<AnyType> n) {
		this.nextNode = n;
	}

	public Node<AnyType> getNextNode(){
		return this.nextNode;
	}

	@Override
	public String toString() {
		//Essentially put your item's toString(), then a space, then whatever comes after you
		//If nothing is after you, don't add that last space
		if (this.getNextNode()!= null) {
			return (this.getItem() + " " + nextNode.toString());
		}else {
			return (this.getItem() + "");
		}

		/*while (nextNode.getNextNode()!=null) {
			b = (this.getItem() + " " + this.getNextNode().toString());
		}
		return b;*/
	}
}
