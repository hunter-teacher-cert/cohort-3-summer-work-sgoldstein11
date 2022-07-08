/**
 * Rational class by Team BangPi
 
 *collaborators: Jerusha Theobald, Stacy Goldstein,Aasine Cassara
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    /* YOUR ELEGANT CODE HERE */
    this._numerator = 0;
    this._denominator = 1;

    
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    /* YOUR ELEGANT CODE HERE */
    _numerator = n;
    _denominator = d;
    if(_denominator ==0) {
      System.out.println ("invalid");
        _denominator = 1;
        _numerator = 0;
    }
    // If denominator is 0, will printout "invalid" and it will be reset to a valid integer.
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */
    return this._numerator + "/" + this._denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
  //   /* YOUR ELEGANT CODE HERE */
    return (double) this._numerator/this._denominator;
  }


  // // multiply
  // // takes a Rational parameter and multiplies it by this Rational
  // // does not return a value
  // // modifies this object
  // // does not modify input
  // // need not reduce
  public void multiply( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */
   _numerator *= r._numerator;
   _denominator *= r._denominator;
    
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */
    if (r._numerator !=0){
      _numerator *= r._denominator;
    _denominator *= r._numerator;
    } else {
      System.out.println("Invalid");
    }
  
  
  }

}//end class