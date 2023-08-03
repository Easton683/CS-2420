
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
	public static int counter = 0;
public static void main(String[] args) {
	int[] hundred = new int[100];
	int[] thousand = new int[1000];
	int[] tenThousand = new int[10000];
	int[] hundredThousand = new int[100000];
	for (int i = 0; i < hundred.length; i++) {
		hundred[i] = (int)Math.random()*10;
	}
	for (int i = 0; i < thousand.length; i++) {
		thousand[i] = (int)Math.random()*10;
	}
	for (int i = 0; i < tenThousand.length; i++) {
		tenThousand[i] = (int)Math.random()*10;
	}
	for (int i = 0; i < hundredThousand.length; i++) {
		hundredThousand[i] = (int)Math.random()*10;
	}
	long begin;
	long end;
	System.gc();
	ArrayStack arrStack = new ArrayStack(100);
	begin = System.nanoTime();	
	for (int i = 0; i < hundred.length; i++) {
		arrStack.push(hundred[i]);
	}
	for (int i = 0; i < hundred.length; i++) {
		arrStack.pop();
	}
	end = System.nanoTime();
	System.out.println("arrStack");
	System.out.println("100 - " + (end-begin));

	System.gc();
	ArrayStack arrStack1 = new ArrayStack(1000);
	begin = System.nanoTime();
	for (int i = 0; i < thousand.length; i++) {
		arrStack1.push(thousand[i]);
	}
	for (int i = 0; i < thousand.length; i++) {
		arrStack1.pop();
	}
	end = System.nanoTime();
	System.out.println("1000 - " + (end-begin));

	System.gc();
	ArrayStack arrStack2 = new ArrayStack(1000);
	begin = System.nanoTime();
	for (int i = 0; i < tenThousand.length; i++) {
		arrStack2.push(tenThousand[i]);
	}
	for (int i = 0; i < tenThousand.length; i++) {
		arrStack2.pop();
	}
	end = System.nanoTime();
	System.out.println("10000 - " + (end-begin));

	System.gc();
	ArrayStack arrStack3 = new ArrayStack(1000);
	begin = System.nanoTime();
	for (int i = 0; i < hundredThousand.length; i++) {
		arrStack3.push(hundredThousand[i]);
	}
	for (int i = 0; i < hundredThousand.length; i++) {
		arrStack3.pop();
	}
	end = System.nanoTime();
	System.out.println("100000 - " + (end-begin));

	System.out.println("listStack:");
	System.gc();
	ListStack lStack = new ListStack<>();
	begin = System.nanoTime();
	for (int i = 0; i < hundred.length; i++) {
		lStack.push(hundred[i]);
	}
	for (int i = 0; i < hundred.length; i++) {
		lStack.pop();
	}
	end = System.nanoTime();
	System.out.println("100 - " + (end-begin));

	System.gc();
	ListStack lStack1 = new ListStack<>();
	begin = System.nanoTime();
	for (int i = 0; i < thousand.length; i++) {
		lStack1.push(thousand[i]);
	}
	for (int i = 0; i < thousand.length; i++) {
		lStack1.pop();
	}
	end = System.nanoTime();
	System.out.println("1000 - " + (end-begin));

	System.gc();
	ListStack lStack2 = new ListStack<>();
	begin = System.nanoTime();
	for (int i = 0; i < tenThousand.length; i++) {
		lStack2.push(tenThousand[i]);
	}
	for (int i = 0; i < tenThousand.length; i++) {
		lStack2.pop();
	}
	end = System.nanoTime();
	System.out.println("100 - " + (end-begin));

	System.gc();
	ListStack lStack3 = new ListStack<>();
	begin = System.nanoTime();
	for (int i = 0; i < hundredThousand.length; i++) {
		lStack3.push(hundredThousand[i]);
	}
	for (int i = 0; i < hundredThousand.length; i++) {
		lStack3.pop();
	}
	end = System.nanoTime();
	System.out.println("100000 - " + (end-begin));

}

	public static void closestNumber(int size) {
		int a[] = new int[size];
	}

	public static long fib( int n){
		counter++;
		if (n <= 1){
			 return n;
		} else {
			 return fib(n-1) + fib(n-2);
		}
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