
public class Assignment_04_Review_Tester {

	public static void main(String[] args) {
		System.out.println("Testing 4.30 - Implement Comparable<Circle> in the Circle class");
		try {
			for(int i = 0; i < 10; i++) {
				int small = (int)(Math.random()*10);
				int medium = (int)(Math.random()*100)+100;
				int large = (int)(Math.random()*1000)+1000;
				Circle s1 = new Circle(small);
				Circle med = new Circle(medium);
				Circle lar = new Circle(large);
				Circle s2 = new Circle(small);

				if(s1.compareTo(med) >= 0 || s1.compareTo(lar) >= 0){
					throw new Exception("Error with Comparable<Circle> expecting a circle with radius " + small + " to be smaller than circles with the following: "+ medium + " " + large);
				}
				else if (s1.compareTo(s2) != 0){
					throw new Exception("Error with Comparable<Circle> expecting a circle with the same radius to return a 0 for an answer");
				}
				else if (lar.compareTo(s1) <= 0 || lar.compareTo(med) <= 0) {
					throw new Exception("error with Comparable<Circle> expecting a circle with radius " + large + " to be larger than circles with the following: " + small + " " + medium);
				}
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finished testing 4.30");

		System.out.println("Testing 4.33 - Implement Comparable<Square> in the Square class");
		try {
			for(int i = 0; i < 10; i++) {
				int small = (int)(Math.random()*10);
				int medium = (int)(Math.random()*100)+100;
				int large = (int)(Math.random()*1000)+1000;
				Square s1 = new Square(small);
				Square med = new Square(medium);
				Square lar = new Square(large);
				Square s2 = new Square(small);

				if(s1.compareTo(med) >= 0 || s1.compareTo(lar) >= 0){
					throw new Exception("Error with Comparable<Square> expecting a square with side " + small + " to be smaller than squares with the following: "+ medium + " " + large);
				}
				else if (s1.compareTo(s2) != 0){
					throw new Exception("Error with Comparable<Square> expecting a Square with the same radius to return a 0 for an answer");
				}
				else if (lar.compareTo(s1) <= 0 || lar.compareTo(med) <= 0) {
					throw new Exception("error with Comparable<Square> expecting a square with side " + large + " to be larger than squares with the following: " + small + " " + medium);
				}
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			int a = (int)(Math.random()*100);
			int b = a*a;
			Square s1 = new Square(a);
			if (s1.area() != b) {
				throw new Exception("Error with the area method:  Expecting a square with a side length of " + a + " to have an area of " + b + " not " + s1.area());
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			int a = (int)(Math.random()*100);
			int b = a+a+a+a;
			Square s1 = new Square(a);
			if (s1.perimeter() != b) {
				throw new Exception("Error with the perimeter method:  Expecting a square with a side length of " + a + " to have an peremeter of " + b + " not " + s1.perimeter());
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Finished testing 4.33");

		System.out.println("Testing 4.27 - modify the constructors to throw an IllegalArgumentException when the parameters are negative ");
		try {
			for(int i = 0; i < 10; i++) {
				try {
					Circle s1 = new Circle((int)(Math.random()*1000)*-1);
					throw new Exception("error with Circle constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			for(int i = 0; i < 10; i++) {
				try {
					Square s1 = new Square((int)(Math.random()*1000)*-1);
					throw new Exception("error with Square constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}

			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			for(int i = 0; i < 10; i++) {
				try {
					Circle s1 = new Circle((int)(Math.random()*1000)*-1);
					throw new Exception("error with Circle constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}

			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			for(int i = 0; i < 10; i++) {
				try {
					Rectangle s1 = new Rectangle((int)(Math.random()*1000)*-1-1, (int)(Math.random()*1000)*-1-1);
					throw new Exception("error with Rectangle constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}

				try {
					Rectangle s2 = new Rectangle((int)(Math.random()*1000)*-1-1, (int)(Math.random()*1000));
					throw new Exception("error with Rectangle constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}
				try {
					Rectangle s3 = new Rectangle((int)(Math.random()*1000), (int)(Math.random()*1000)*-1-1);
					throw new Exception("error with Rectangle constructor.  It should throw an IllegalArgumentException when the parameter(s) are negative");
				} catch (IllegalArgumentException e) {

				}

			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Finished testing 4.27");

		System.out.println("Starting tests for 4.47 (Adding Shape.distance to the shape heirachy)");
		Shape sh1 = null;
		Shape sh2 = null;
		double result = 0.0;
		try {
			sh1 = new Square(23.426141458765017);
			sh2 = new Square(50.54631668629147);
			sh1.putShapeHere(52.21536498648533, 32.487569927002056);
			sh2.putShapeHere(51.04204852531784, 5.555738201955074);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 26.957378054705057) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 26.96 got " + result);
			}
			sh1 = new Circle(62.81517095573602);
			sh2 = new Circle(7.193830019409219);
			sh1.putShapeHere(26.04498503092816, 13.554754731484797);
			sh2.putShapeHere(3.89509838990606, 44.92056269674487);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 38.398325321863986) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 38.4 got " + result);
			}
			sh1 = new Circle(29.948726196570718);
			sh2 = new Square(87.0007216075743);
			sh1.putShapeHere(54.61777483002109, 96.26398312434947);
			sh2.putShapeHere(20.35104061748002, 31.760085286246497);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 73.04082358449526) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 73.04 got " + result);
			}
			sh1 = new Square(54.12667106741019);
			sh2 = new Rectangle(41.57068174828961, 55.880186328009806);
			sh1.putShapeHere(75.3007484660512, 36.65230454769626);
			sh2.putShapeHere(49.061502574221386, 65.12856144188783);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 38.7220251494663) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 38.72 got " + result);
			}
			sh1 = new Circle(31.724469885296035);
			sh2 = new Circle(6.3822930553707575);
			sh1.putShapeHere(54.553330091297056, 63.35251685153359);
			sh2.putShapeHere(8.96098943985535, 45.200885357318164);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 49.072836192530154) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 49.07 got " + result);
			}
			sh1 = new Square(26.348125820406977);
			sh2 = new Rectangle(48.002229241913376, 28.268369431624375);
			sh1.putShapeHere(87.93101620667751, 98.55334600960218);
			sh2.putShapeHere(7.943689405405752, 4.68254387734246);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 123.32761224384143) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 123.33 got " + result);
			}
			sh1 = new Circle(9.625356595839063);
			sh2 = new Circle(53.55236135720433);
			sh1.putShapeHere(79.74873845530924, 57.33603965632018);
			sh2.putShapeHere(23.102902139263836, 13.370623390912172);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 71.70570827580474) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 71.71 got " + result);
			}
			sh1 = new Circle(4.974314618413156);
			sh2 = new Square(4.817759505965036);
			sh1.putShapeHere(48.57473582048978, 37.272743441648615);
			sh2.putShapeHere(2.881552401866405, 79.02447398275375);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 61.895670398704056) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 61.9 got " + result);
			}
			sh1 = new Square(52.175080988045075);
			sh2 = new Rectangle(74.67084305754071, 25.966045543591132);
			sh1.putShapeHere(8.663992206974235, 8.748636456660797);
			sh2.putShapeHere(12.952190444227007, 15.07693578268442);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 7.644345392623805) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 7.64 got " + result);
			}
			sh1 = new Square(62.00422408434403);
			sh2 = new Square(76.22289663464889);
			sh1.putShapeHere(93.65320166664611, 55.96986331411473);
			sh2.putShapeHere(37.950534138982626, 6.7955759741339055);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 74.30274359061323) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 74.3 got " + result);
			}
			sh1 = new Circle(19.73470391661185);
			sh2 = new Circle(77.87561822154277);
			sh1.putShapeHere(8.83823948363509, 60.55953699878145);
			sh2.putShapeHere(22.334285691525125, 29.160863168039374);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 34.176307313324976) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 34.18 got " + result);
			}
			sh1 = new Square(62.04762096484971);
			sh2 = new Rectangle(47.651575471780205, 17.677540130459455);
			sh1.putShapeHere(70.9182068967416, 68.83525067877407);
			sh2.putShapeHere(42.05024926120464, 25.96936869261304);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 51.68019752766664) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 51.68 got " + result);
			}
			sh1 = new Circle(25.330401571956607);
			sh2 = new Circle(68.63894957167015);
			sh1.putShapeHere(24.684428226135292, 52.160010471284465);
			sh2.putShapeHere(91.74766994177594, 39.68508681814335);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 68.21365046354097) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 68.21 got " + result);
			}
			sh1 = new Circle(27.550849363332674);
			sh2 = new Circle(98.5253869002883);
			sh1.putShapeHere(4.135078096827883, 99.41300382193471);
			sh2.putShapeHere(92.78957917585909, 15.687600318853622);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 121.94082070137829) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 121.94 got " + result);
			}
			sh1 = new Circle(48.803319451944425);
			sh2 = new Square(74.78911429160958);
			sh1.putShapeHere(42.40218955233844, 45.059571042634175);
			sh2.putShapeHere(15.013279064311991, 3.573254399136705);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 49.71183849311611) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 49.71 got " + result);
			}
			sh1 = new Square(64.84656136857008);
			sh2 = new Square(11.200853526775523);
			sh1.putShapeHere(58.92685461432469, 19.648687101754682);
			sh2.putShapeHere(72.52913234155073, 45.73160263493652);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 29.41666945933357) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 29.42 got " + result);
			}
			sh1 = new Circle(73.34279741847479);
			sh2 = new Square(79.70173740091835);
			sh1.putShapeHere(25.076999572342153, 30.93261085038558);
			sh2.putShapeHere(12.00336709350035, 68.83693367917931);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 40.09560518686856) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 40.1 got " + result);
			}
			sh1 = new Circle(67.32292135380986);
			sh2 = new Circle(3.6289798189960587);
			sh1.putShapeHere(54.74119956577756, 4.641795447047848);
			sh2.putShapeHere(85.49544041780426, 71.71646049507724);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 73.78911858593925) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 73.79 got " + result);
			}
			sh1 = new Circle(35.971241558408664);
			sh2 = new Circle(57.264339574543285);
			sh1.putShapeHere(29.444682834731683, 21.95300268268018);
			sh2.putShapeHere(67.87168667961573, 87.73741465511677);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 76.18545453729335) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 76.19 got " + result);
			}
			sh1 = new Square(92.46946992177698);
			sh2 = new Rectangle(97.14550966150429, 10.400702635715975);
			sh1.putShapeHere(72.65352917571846, 45.23437244430555);
			sh2.putShapeHere(86.78699195667876, 32.49957160364239);
			result = Shape.distance(sh1, sh2);
			if (Math.abs(result- 19.02445590896479) >= 0.000001){
				throw new Exception("Error with distance method: Expecting something close to 19.02 got " + result);
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending tests for 4.47");


	}

}
