import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * collaborators: Stacy Goldstein (stacyG)
Yeidy Levels (YLevels) 
Usman Ahmed (usman0527)
David Moste (dmoste)
 */

/**
   INSTRUCTIONS:

   This file contains the starter code for our Time class.

   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.

   Place this file in a folder named programming/5/Time.java

   Basic level (complete all):
   + public Time(int hrs, int mins, int secs) - constructor (line 41)
   + public void toString() (line 80)
   + public void set(int hrs, int mins, int secs) (line 93)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    private int hours;
    private int minutes;
    private int seconds;

    // Constructors - build objects with default values 
  public Time(){
	this.hours = 0;
	this.minutes = 0;
	this.seconds = 0;
	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as

       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){

	// your code here
      hours = hrs;
      minutes = mins;
      seconds = secs;
	
    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
	return("The current time is " + hours + ":" + minutes + ":" + seconds);
    }




    

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time

       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
	// add the code to add the time represented by other
	// to this instance.
      hours = hrs;
      minutes = mins;
      seconds = secs;
    }

    

    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	// add the code to add the time represented by other
	// to this instance.
      this.hours = this.hours + other.hours;      
      this.minutes = this.minutes + other.minutes;
      this.seconds = this.seconds + other.seconds;
      
      if(this.seconds >= 60) {
        this.seconds = this.seconds - 60; 
        this.minutes ++; 
      }
      if(this.minutes >= 60) {
        this.minutes = this.minutes - 60; 
        this.hours ++; 
      }
      if(this.hours >=24){
        this.hours=this.hours - 24;
      }
    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    //public boolean equals(Time other){
	// your code here)
 //      if(this.time - other.time > 0){
 //        return true;
 //      }
         
	// return false; // change this
 //    }

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
	// your code here)

	return 0; // change this
    }
    

    
}//end class