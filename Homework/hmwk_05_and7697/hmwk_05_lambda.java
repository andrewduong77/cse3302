// Duong, Andrew
// and7697
// 2019-06-26

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class hmwk_05_lambda {
  //----------------------------------------------------------
  // sumOfCubes lambda goes here.
  static UnaryOperator<Integer>
    sumOfCubes = ( Integer n ) -> ( n == 0 ) ? 0 : n*n*n + sumOfCubes.apply( n - 1 );

  // pseudoPell lambda goes here.
  static UnaryOperator<Integer>
    pseudoPell = ( Integer n ) ->
    {
    if ( n == 0 )
      return 0;
    else if ( n == 1 )
      return 1;
    else
      return 3 * pseudoPell.apply( n - 1 ) + 2 * pseudoPell.apply( n - 2 );
    };

  // GCD lambda goes here.
  static UnaryOperator<Integer>
    GCD = ( Integer m, Integer n ) ->
    {
      int remainder, numerator, denominator;

      if( m > n )
      {
        numerator = m;
        denominator = n;
      }
      else
      {
        numerator = n;
        denominator = m;
      }
      remainder = numerator % denominator;
      while( remainder != 0 )
      {
        numerator = denominator;
        denominator = remainder;
        remainder = numerator % denominator;
      }
      return denominator;
    };

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that applies the sumOfCubes lambda.
    for ( int i = 0; i <= 15; i++ )
      System.out.println( "sumOfCubes(" + i + ") is " + sumOfCubes.apply( i ) );

    // Put for loop here that applies the pseudoPell lambda.
    for ( int i = 0; i <= 15; i++ )
      System.out.println( "pseudoPell(" + i + ") is " + pseudoPell.apply( i ) );

    // Put for loop here that applies the GCD lambda.
    for ( int i = 1; i <= 10; i++ )
      for ( int j = 1; j <= 10; j++ )
        System.out.println( "GCD(" + i + ", " + j + ") is " + GCD.apply( i, j ) );
  }
}
