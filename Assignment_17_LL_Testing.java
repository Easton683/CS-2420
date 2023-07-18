
public class Assignment_17_LL_Testing {

	public static void main(String[] args) {
		System.out.println("Testing Node Methods");
		Node<String> n;
		Node<String> p = new Node<String>("");
		try {
			n = new Node<String>();
			n.setItem("Computers");
			if(! "Computers".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'Computers' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("are");
			if(! "are".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'are' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("good");
			if(! "good".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'good' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("at");
			if(! "at".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'at' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("following");
			if(! "following".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'following' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("instructions,");
			if(! "instructions,".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'instructions,' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("but");
			if(! "but".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'but' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("not");
			if(! "not".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'not' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("at");
			if(! "at".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'at' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("reading");
			if(! "reading".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'reading' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("your");
			if(! "your".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'your' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("mind.");
			if(! "mind.".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'mind.' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("–Donald");
			if(! "–Donald".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected '–Donald' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			n = new Node<String>();
			n.setItem("Knuth");
			if(! "Knuth".equals(n.getItem())){
				throw new Exception("Error with setItem/getItem method.  Expected 'Knuth' received '"+n.getItem()+"'");
			}
			n.setNextNode(p);
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode/setNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			p = new Node<String>("");
			n = new Node<String>("Dijkstra", p);
			if(! "Dijkstra".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'Dijkstra' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("Edsger", p);
			if(! "Edsger".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'Edsger' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("–", p);
			if(! "–".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected '–' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("in.", p);
			if(! "in.".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'in.' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("them", p);
			if(! "them".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'them' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("putting", p);
			if(! "putting".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'putting' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("of", p);
			if(! "of".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'of' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("process", p);
			if(! "process".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'process' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("the", p);
			if(! "the".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'the' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("be", p);
			if(! "be".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'be' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("must", p);
			if(! "must".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'must' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("programming", p);
			if(! "programming".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'programming' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("then", p);
			if(! "then".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'then' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("bugs,", p);
			if(! "bugs,".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'bugs,' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("software", p);
			if(! "software".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'software' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("removing", p);
			if(! "removing".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'removing' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("of", p);
			if(! "of".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'of' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("process", p);
			if(! "process".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'process' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("the", p);
			if(! "the".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'the' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("is", p);
			if(! "is".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'is' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("debugging", p);
			if(! "debugging".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'debugging' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
			n = new Node<String>("If", p);
			if(! "If".equals(n.getItem())){
				throw new Exception("Error with getItem method.  Expected 'If' received '"+n.getItem()+"'");
			}
			if( p != n.getNextNode()){
				throw new Exception("Error with getNextNode method.  Expected node with '"+p.getItem()+"' received node with '"+n.getItem()+"'");
			}
			p = n;
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			p = new Node<String>("Raymond");
			p = new Node<String>("S.", p);
			if(! "S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("Eric", p);
			if(! "Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("–", p);
			if(! "– Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected '– Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("painter.", p);
			if(! "painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("expert", p);
			if(! "expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("an", p);
			if(! "an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("somebody", p);
			if(! "somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("make", p);
			if(! "make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("can", p);
			if(! "can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("pigment", p);
			if(! "pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("and", p);
			if(! "and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("brushes", p);
			if(! "brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("studying", p);
			if(! "studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("than", p);
			if(! "than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("more", p);
			if(! "more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("any", p);
			if(! "any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("programmer", p);
			if(! "programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("expert", p);
			if(! "expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("an", p);
			if(! "an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("anybody", p);
			if(! "anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("make", p);
			if(! "make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("cannot", p);
			if(! "cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("education", p);
			if(! "education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("science", p);
			if(! "science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
			p = new Node<String>("Computer", p);
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(p.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+p.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished Testing Node Methods");
		System.out.println("Testing LinkedList methods");
		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();
		try {
			if(a.toString() != null){
				throw new Exception("Error with toString method when list is empty.  Expected null received '"+a.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			a.insertFront("Dijkstra");
			if(LinkedList.listSize(a) != 1){
				throw new Exception("Error with listSize() method.  Expected '1' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("Edsger");
			if(LinkedList.listSize(a) != 2){
				throw new Exception("Error with listSize() method.  Expected '2' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("–");
			if(LinkedList.listSize(a) != 3){
				throw new Exception("Error with listSize() method.  Expected '3' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("in.");
			if(LinkedList.listSize(a) != 4){
				throw new Exception("Error with listSize() method.  Expected '4' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("them");
			if(LinkedList.listSize(a) != 5){
				throw new Exception("Error with listSize() method.  Expected '5' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("putting");
			if(LinkedList.listSize(a) != 6){
				throw new Exception("Error with listSize() method.  Expected '6' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("of");
			if(LinkedList.listSize(a) != 7){
				throw new Exception("Error with listSize() method.  Expected '7' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("process");
			if(LinkedList.listSize(a) != 8){
				throw new Exception("Error with listSize() method.  Expected '8' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("the");
			if(LinkedList.listSize(a) != 9){
				throw new Exception("Error with listSize() method.  Expected '9' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("be");
			if(LinkedList.listSize(a) != 10){
				throw new Exception("Error with listSize() method.  Expected '10' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("must");
			if(LinkedList.listSize(a) != 11){
				throw new Exception("Error with listSize() method.  Expected '11' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("programming");
			if(LinkedList.listSize(a) != 12){
				throw new Exception("Error with listSize() method.  Expected '12' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("then");
			if(LinkedList.listSize(a) != 13){
				throw new Exception("Error with listSize() method.  Expected '13' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("bugs,");
			if(LinkedList.listSize(a) != 14){
				throw new Exception("Error with listSize() method.  Expected '14' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("software");
			if(LinkedList.listSize(a) != 15){
				throw new Exception("Error with listSize() method.  Expected '15' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("removing");
			if(LinkedList.listSize(a) != 16){
				throw new Exception("Error with listSize() method.  Expected '16' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("of");
			if(LinkedList.listSize(a) != 17){
				throw new Exception("Error with listSize() method.  Expected '17' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("process");
			if(LinkedList.listSize(a) != 18){
				throw new Exception("Error with listSize() method.  Expected '18' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("the");
			if(LinkedList.listSize(a) != 19){
				throw new Exception("Error with listSize() method.  Expected '19' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("is");
			if(LinkedList.listSize(a) != 20){
				throw new Exception("Error with listSize() method.  Expected '20' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("debugging");
			if(LinkedList.listSize(a) != 21){
				throw new Exception("Error with listSize() method.  Expected '21' received '"+LinkedList.listSize(a)+"'");
			}
			a.insertFront("If");
			if(LinkedList.listSize(a) != 22){
				throw new Exception("Error with listSize() method.  Expected '22' received '"+LinkedList.listSize(a)+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			b.insertFront("Raymond");
			if(! "Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("S.");
			if(! "S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("Eric");
			if(! "Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("–");
			if(! "– Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected '– Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("painter.");
			if(! "painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("expert");
			if(! "expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("an");
			if(! "an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("somebody");
			if(! "somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("make");
			if(! "make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("can");
			if(! "can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("pigment");
			if(! "pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("and");
			if(! "and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("brushes");
			if(! "brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("studying");
			if(! "studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("than");
			if(! "than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("more");
			if(! "more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("any");
			if(! "any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("programmer");
			if(! "programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("expert");
			if(! "expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("an");
			if(! "an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("anybody");
			if(! "anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("make");
			if(! "make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("cannot");
			if(! "cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("education");
			if(! "education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("science");
			if(! "science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
			b.insertFront("Computer");
			if(! "Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with toString method.  Expected 'Computer science education cannot make anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if(a.find("Dijkstra") == null || ! "Dijkstra".equals(a.find("Dijkstra").getItem())){
				throw new Exception("Error with find method.  Expected 'Dijkstra' received '"+a.find("Dijkstra").getItem()+"'");
			}
			if(a.find("Edsger") == null || ! "Edsger".equals(a.find("Edsger").getItem())){
				throw new Exception("Error with find method.  Expected 'Edsger' received '"+a.find("Edsger").getItem()+"'");
			}
			if(a.find("–") == null || ! "–".equals(a.find("–").getItem())){
				throw new Exception("Error with find method.  Expected '–' received '"+a.find("–").getItem()+"'");
			}
			if(a.find("in.") == null || ! "in.".equals(a.find("in.").getItem())){
				throw new Exception("Error with find method.  Expected 'in.' received '"+a.find("in.").getItem()+"'");
			}
			if(a.find("them") == null || ! "them".equals(a.find("them").getItem())){
				throw new Exception("Error with find method.  Expected 'them' received '"+a.find("them").getItem()+"'");
			}
			if(a.find("putting") == null || ! "putting".equals(a.find("putting").getItem())){
				throw new Exception("Error with find method.  Expected 'putting' received '"+a.find("putting").getItem()+"'");
			}
			if(a.find("of") == null || ! "of".equals(a.find("of").getItem())){
				throw new Exception("Error with find method.  Expected 'of' received '"+a.find("of").getItem()+"'");
			}
			if(a.find("process") == null || ! "process".equals(a.find("process").getItem())){
				throw new Exception("Error with find method.  Expected 'process' received '"+a.find("process").getItem()+"'");
			}
			if(a.find("the") == null || ! "the".equals(a.find("the").getItem())){
				throw new Exception("Error with find method.  Expected 'the' received '"+a.find("the").getItem()+"'");
			}
			if(a.find("be") == null || ! "be".equals(a.find("be").getItem())){
				throw new Exception("Error with find method.  Expected 'be' received '"+a.find("be").getItem()+"'");
			}
			if(a.find("must") == null || ! "must".equals(a.find("must").getItem())){
				throw new Exception("Error with find method.  Expected 'must' received '"+a.find("must").getItem()+"'");
			}
			if(a.find("programming") == null || ! "programming".equals(a.find("programming").getItem())){
				throw new Exception("Error with find method.  Expected 'programming' received '"+a.find("programming").getItem()+"'");
			}
			if(a.find("then") == null || ! "then".equals(a.find("then").getItem())){
				throw new Exception("Error with find method.  Expected 'then' received '"+a.find("then").getItem()+"'");
			}
			if(a.find("bugs,") == null || ! "bugs,".equals(a.find("bugs,").getItem())){
				throw new Exception("Error with find method.  Expected 'bugs,' received '"+a.find("bugs,").getItem()+"'");
			}
			if(a.find("software") == null || ! "software".equals(a.find("software").getItem())){
				throw new Exception("Error with find method.  Expected 'software' received '"+a.find("software").getItem()+"'");
			}
			if(a.find("removing") == null || ! "removing".equals(a.find("removing").getItem())){
				throw new Exception("Error with find method.  Expected 'removing' received '"+a.find("removing").getItem()+"'");
			}
			if(a.find("of") == null || ! "of".equals(a.find("of").getItem())){
				throw new Exception("Error with find method.  Expected 'of' received '"+a.find("of").getItem()+"'");
			}
			if(a.find("process") == null || ! "process".equals(a.find("process").getItem())){
				throw new Exception("Error with find method.  Expected 'process' received '"+a.find("process").getItem()+"'");
			}
			if(a.find("the") == null || ! "the".equals(a.find("the").getItem())){
				throw new Exception("Error with find method.  Expected 'the' received '"+a.find("the").getItem()+"'");
			}
			if(a.find("is") == null || ! "is".equals(a.find("is").getItem())){
				throw new Exception("Error with find method.  Expected 'is' received '"+a.find("is").getItem()+"'");
			}
			if(a.find("debugging") == null || ! "debugging".equals(a.find("debugging").getItem())){
				throw new Exception("Error with find method.  Expected 'debugging' received '"+a.find("debugging").getItem()+"'");
			}
			if(a.find("If") == null || ! "If".equals(a.find("If").getItem())){
				throw new Exception("Error with find method.  Expected 'If' received '"+a.find("If").getItem()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			if(a.find("Abbi Abuaita") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Abbi Abuaita").getItem()+"'");
			}
			if(a.find("Cal Denos") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Cal Denos").getItem()+"'");
			}
			if(a.find("Charo Dok") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Charo Dok").getItem()+"'");
			}
			if(a.find("Iolande Easley") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Iolande Easley").getItem()+"'");
			}
			if(a.find("Jeanie Foor") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Jeanie Foor").getItem()+"'");
			}
			if(a.find("Kathryne Macdonell") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Kathryne Macdonell").getItem()+"'");
			}
			if(a.find("Lyda Moralas") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Lyda Moralas").getItem()+"'");
			}
			if(a.find("Maria Nudelman") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Maria Nudelman").getItem()+"'");
			}
			if(a.find("Melli Racina") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Melli Racina").getItem()+"'");
			}
			if(a.find("Shelli Vautour") != null){
				throw new Exception("Error with find method.  Expected 'null' received '"+a.find("Shelli Vautour").getItem()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			a.remove("If");
			a.remove("Abbi Abuaita");
			if(! "debugging is the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'debugging is the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("debugging");
			a.remove("Abbi Abuaita");
			if(! "is the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'is the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("is");
			a.remove("Abbi Abuaita");
			if(! "the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'the process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("the");
			a.remove("Abbi Abuaita");
			if(! "process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'process of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("process");
			a.remove("Abbi Abuaita");
			if(! "of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'of removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("of");
			a.remove("Abbi Abuaita");
			if(! "removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'removing software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("removing");
			a.remove("Abbi Abuaita");
			if(! "software bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'software bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("software");
			a.remove("Abbi Abuaita");
			if(! "bugs, then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'bugs, then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("bugs,");
			a.remove("Abbi Abuaita");
			if(! "then programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'then programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			a.remove("then");
			a.remove("Abbi Abuaita");
			if(! "programming must be the process of putting them in. – Edsger Dijkstra".equals(a.toString())){
				throw new Exception("Error with remove method.  Expected 'programming must be the process of putting them in. – Edsger Dijkstra' received '"+a.toString()+"'");
			}
			b.remove("make");
			if(! "Computer science education cannot anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond".equals(b.toString())){
				throw new Exception("Error with remove method.  Expected 'Computer science education cannot anybody an expert programmer any more than studying brushes and pigment can make somebody an expert painter. – Eric S. Raymond' received '"+b.toString()+"'");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			LinkedList<Integer> temp;
			temp = new LinkedList<Integer>();
			if(!temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected true received false");
			}
			temp.insertFront(29);
			if(temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected false received true");
			}
			temp = new LinkedList<Integer>();
			if(!temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected true received false");
			}
			temp.insertFront(27);
			if(temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected false received true");
			}
			temp = new LinkedList<Integer>();
			if(!temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected true received false");
			}
			temp.insertFront(74);
			if(temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected false received true");
			}
			temp = new LinkedList<Integer>();
			if(!temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected true received false");
			}
			temp.insertFront(78);
			if(temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected false received true");
			}
			temp = new LinkedList<Integer>();
			if(!temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected true received false");
			}
			temp.insertFront(54);
			if(temp.isEmpty()){
				throw new Exception("Error with isEmpty method.  Expected false received true");
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished LinkedList testing");

	}
}
