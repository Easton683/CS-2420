
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
public static void main(String[] args) {
	Long startTime = System.nanoTime();
	Long endTime = System.nanoTime();
	Long totalTime = endTime - startTime;
	System.out.println(totalTime);
}

	public static void closestNumber(int size) {
		int a[] = new int[size];
	}

	public static int foo(){
		try{
			return 0;
		}finally{
			return 1;
		}
	}

	public static boolean isAPrefix(String prefix, String s) {
		//It is really tempting to use the existing isAPrefix method of the class string....
		//Hopefully it is not too much trouble for you to use a loop instead?
		String tempString = s.substring(0, prefix.length());
		System.out.println(tempString);
		if (tempString.equals(prefix)){
			return true;
		}else {
			return false;
		}
	}
}