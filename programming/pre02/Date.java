 import java.io.*;
 import java.util.*;

public class Date {
  
  public static void main(String[]args) {
    
    String day;
    day= "Monday"; 
    String month; 
    month = "February";
    int year = 2022;
    int date = 14; 

    System.out.println("American Format: ");
    System.out.println(day + "," + month + " " + date + "," + year);
    
    System.out.println("European Format: ");
    System.out.println(date + " " + month + " " + year);
  }
}