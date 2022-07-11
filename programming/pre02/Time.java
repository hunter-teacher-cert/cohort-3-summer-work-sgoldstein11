 import java.io.*;
 import java.util.*;

public class Time {
  
  public static void main(String[]args) {
    
   
    double hour = 20;
    double minute = 14;
    double seconds = 35; 
    double secondSinceMid = (hour * 3600) + (minute * 60) + seconds;
    double percent = (secondSinceMid/86400)*100;

    System.out.println("Number of Seconds since midnight: " + secondSinceMid);
    System.out.println("Number of Second remaining in the day: " + (86400 - secondSinceMid));

    //(int) allows it to be typecast 
    System.out.println("Percentage of day elapsed: " + (int)percent+ " %");

    double hour1 = 21;
    double minute1 = 16;
    double seconds1 = 42;
    double timeNow = (hour1*3600) + (minute1*60)+ seconds1;

    System.out.println("I have been working on this assignment for "+ (timeNow - secondSinceMid) + " seconds");
 
  
  }
}