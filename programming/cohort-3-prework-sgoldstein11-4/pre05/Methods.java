import java.io.*;
import java.util.*;

public class Methods {

  
    public static int ack(int m, int n) {
      if(m==0){
        return n+1;
      } else if (m>0 && n==0){
        return ack(m-1,1);
      }else 
        return ack(m-1, ack(m, n-1));
      
      
      }

    public static boolean isTriangle(int n, int m, int       o){
        if((n+m>o) && (n +o>m) && (m+o <n)) {
          return true;
          } else {
          return false;
          }
    
    }
  
    public static boolean isDivisible(int n, int m){
        if (n%m ==0) {
          return true;
        } else  {
          return false;
        }
      }
    public static void main(String[] args){
       int n = 3;
       int m = 1;
       int o = 2;
       boolean result = isDivisible(n,m);
       boolean result1 = isTriangle(n,m,o);
       int result2 = ack(m,n);
    }

}