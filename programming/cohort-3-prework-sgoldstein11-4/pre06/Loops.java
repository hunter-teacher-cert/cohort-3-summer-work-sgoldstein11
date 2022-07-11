import java.io.*;
import java.util.*;
// import java.util.Scanner;


public class Loops {

 
    public static void main(String args[])
    {
      double answer = squareRoot();
      //squareRoot1();
      System.out.println(answer);
      int answer2 = power();
      System.out.println(answer2);
      int answer3 = factorial();
      System.out.println(answer3);
    }

  public static double squareRoot() {
          // initialization expression
        double x0 = 6;
        double x1=0;
        // test expression
        while ((x0-3)>0.0001) {

          x1= (x0 + 9/x0)/2;
          System.out.println(x1);
          x0=x1;
          
        
        }
    return x1; 
  }
  
  public static int power() {
    int x = 2;
    int n = 4; 
    int c=1; 
    
    //test expression
    for(n=1;n<=4;n++) {
      
      c = c * x;
      
    }
    
  return c;
    
}

public static int factorial() {
  //int number = 1;
  int computation = 10;
  int x = 1;
  
  
  for(x=1;x<10;x++) {
    
    computation = computation * (x);
    
  
  }
  
  return computation;

}
}

  