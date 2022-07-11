import java.io.*;
import java.util.*;

public class Seive {

    public static void main(String args[]) {
        
        int [] a = {1,2,3,4,5,6,7};

        // calling a function with the input data...
        boolean[] output = Seive1(a);

       
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " is " + output[i]);
        }
    }

    public static boolean[] Seive1(int [] a) {
        boolean[] output = new boolean[a.length];
        //iterating from first to last number of given array
        for ( int i = 0; i < a.length; i++) { 
          output[i] = true; 
          for(int j =2; j <= a[i]-1;j++) { 
            if(a[i]%j != 0)
              continue;
            else {
              output[i] = false;
              break;
            }
          }
        }
        return output;
    }
}
