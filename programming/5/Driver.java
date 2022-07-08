/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {
    //cut/paste this leading comment bar down, one line at a time, as you test...
    double temp = (double)4/3;
    // /~~~~~v~~~~~~~~~~down~goer~3~~~~~~~~~~~~~v~~~~~
      Rational r = new Rational( 3, 8);
    System.out.println(r.toString());
      Rational s = new Rational();
    System.out.println(s);
      Rational t = new Rational( 8, 5 );
    System.out.println(t);
      Rational u = new Rational( 1, 2 );
    System.out.println(u);
      Rational v = new Rational( 2, 3 );
    System.out.println(r);
      Rational w = new Rational( 8, 12 );
      System.out.println(w);
      Rational x = new Rational( 8, 12 );
      System.out.println(x);
      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );
      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue());
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );
      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);
      
  }

}//end class

