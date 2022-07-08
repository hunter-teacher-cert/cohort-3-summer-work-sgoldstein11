import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;
  Time other = new Time(8,45,45);

	//assign var the address of a newly-apportioned Time object
	t = new Time(12,30,30);
  System.out.println(t.toString());
  t.set(2,55,00);
  System.out.println(t.toString());
  t.add(other);
  System.out.println(t.toString());
  
  
    }//end main()

}//end class