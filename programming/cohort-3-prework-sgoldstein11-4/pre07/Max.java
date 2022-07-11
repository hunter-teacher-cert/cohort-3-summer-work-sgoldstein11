import java.io.*;
import java.util.*;

public class Max {

	public static void main(String args[]) {

int[] a = {1, 200, 3, 4};


    for (int i = 1; i < a.length; i++) {
      if(a[0] < a[i]) {
        a[0] = a[i];
      }
      
    }
    System.out.println("The greatest value is: " + a[0]);
}
}