//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller

import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	SortSearch ssd = new SortSearch();//test defualt constructor
	System.out.println(ssd);//test defualt constructor
	SortSearch ss = new SortSearch(20);//test overloaded constructor
	System.out.println(ss);//test overloaded constructor
	
		
	// Uncomment these to test part 2

	 int i;
	 i = ss.findSmallestIndex(0);
	 System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	 i = ss.findSmallestIndex(9);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);
  
  System.out.println("Linear search result index " + ss.linearSearch(3));

  System.out.println("Binary search result index " + ss.binarySearch(7));

      //timing
  int size = 10000; //integer declaration
  long start,elapsed; //declaring 2 long type variables
  ss = new SortSearch(size); //creating a sortsearch object of an array named ss
	start = System.currentTimeMillis();//this is where timing starts - it will calc time of sorting not creating the array (time of start elapsed is called )
      //currentTimeMillis is a built in function to java 
  ss.sort();
	// System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);
	    
    }
}