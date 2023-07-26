
public class GenericMemoryCell<AnyType> implements Comparable<GenericMemoryCell<AnyType>> {

	private AnyType storedValue;

	public AnyType read( )         { return storedValue; }
	public void write( AnyType x ) { storedValue = x; }


	@Override
	public int compareTo(GenericMemoryCell<AnyType> o) {
		// TODO Finish this method
		return (int)(Math.random()*10-5);
	}

}
