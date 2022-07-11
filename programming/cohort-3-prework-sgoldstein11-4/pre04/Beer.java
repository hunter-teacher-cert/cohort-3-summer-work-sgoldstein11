 import java.io.*;
 import java.util.*;

public class Beer {
  
  public static void main(String[]args) {
    
int beer = 99; 
while(beer >=1){
   if (beer > 0) {
    System.out.println(beer + " bottles of beer on the wall,");
     System.out.println(beer + " bottles of beer,");
     System.out.println("ya’ take one down, ya’ pass it around,");
     System.out.println( beer -1 + " bottles of beer on the wall");
   beer -= 1;
       
     }
  }
 
System.out.println("No bottles of beer on the wall,");
System.out.println("no bottles of beer,");     
System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
System.out.println ("’cause there are no more bottles of beer on the wall!");

  }
}
     
 



   
  



