// Duong, Andrew
// and7697
// 2019-06-26

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

public class hmwk_05_lambda {
  //----------------------------------------------------------
  static UnaryOperator<Integer>
    sumOfCubes = ( Integer n ) -> ( n == 0 ) ? 0 : n*n*n + hmwk_05_lambda.sumOfCubes.apply( n - 1 );

  static UnaryOperator<Integer>
    pseudoPell = ( Integer n ) -> ( n == 0 ) ? 0 : ( n == 1 ) ? 1 : 3 * hmwk_05_lambda.pseudoPell.apply( n - 1 ) + 2 * hmwk_05_lambda.pseudoPell.apply( n - 2 );

  static BinaryOperator<Integer>
    GCD = ( Integer m, Integer n ) -> ( m > n ) ? ( m % n == 0 ? n : hmwk_05_lambda.GCD.apply( n, m % n ) ) : ( n % m == 0 ? m : hmwk_05_lambda.GCD.apply( m, n % m ) );

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    for ( int i = 0; i <= 15; i++ )
      System.out.println( "sumOfCubes(" + i + ") is " + sumOfCubes.apply( i ) );

    for ( int i = 0; i <= 15; i++ )
      System.out.println( "pseudoPell(" + i + ") is " + pseudoPell.apply( i ) );

    for ( int i = 1; i <= 10; i++ )
      for ( int j = 1; j <= 10; j++ )
        System.out.println( "GCD(" + i + ", " + j + ") is " + GCD.apply( i, j ) );
  }
}
