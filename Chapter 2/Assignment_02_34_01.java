import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_02_34_01 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>(); 
		ArrayList<String> ageString = new ArrayList<String>();
        ArrayList<Integer> ageInt = new ArrayList<Integer>();
		try{
		Scanner s = new Scanner(new File("Assignment_02_34_large.txt"));
		while (s.hasNext()){
			name.add(s.next() +" " + s.next());
            ageString.add(s.next());
		}

	}catch(Exception e){
		System.out.println(e);
	}

    //adding string age to int arraylist
    for (int i = 0; i < ageString.size(); i++) {
        ageInt.add(Integer.parseInt(ageString.get(i)));
    }

    int maxAge = 0;
    int maxAgeIndex = 0;
    for (int i = 0; i < ageInt.size(); i++) {
        if(maxAge<ageInt.get(i)){
            maxAge=ageInt.get(i);
            maxAgeIndex = i;
        }
    }
    System.out.println("The oldest person is: "+name.get(maxAgeIndex) + " " + ageInt.get(maxAgeIndex));

    }
}
