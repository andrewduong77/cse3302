// Duong, Andrew
// and7697
// 2019-06-26

public class hmwk_05_imperative {
  //----------------------------------------------------------
  // Sum of cubes
  static int sumOfCubes( int n ) {
    // Put something here
    if ( n == 0 )
      return 0;
    else
      return n*n*n + sumOfCubes( n - 1 );
  }

  // Pseudo-Pell numbers
  static int pseudoPell( int n ) {
    // Put something here
    if ( n == 0 )
      return 0;
    else if ( n == 1 )
      return 1;
    else
      return 3 * pseudoPell( n - 1 ) + 2 * pseudoPell( n - 2 );
  }

  // GCD
  static int GCD( int m, int n ) {
    // Put something here
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
  }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that calls sumOfCubes().
    for ( int i = 0; i <= 15; i++ )
      System.out.println( "sumOfCubes(" + i + ") is " + sumOfCubes( i ) );

    // Put for loop here that calls pseudoPell().
    for ( int i = 0; i <= 15; i++ )
      System.out.println( "pseudoPell(" + i + ") is " + pseudoPell( i ) );

    // Put nested for loops here that call GCD().
    for ( int i = 1; i <= 10; i++ )
      for ( int j = 1; j <= 10; j++ )
        System.out.println( "GCD(" + i + ", " + j + ") is " + GCD( i, j ) );
  }
}
