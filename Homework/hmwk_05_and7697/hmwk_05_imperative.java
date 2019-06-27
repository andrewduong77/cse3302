// Duong, Andrew
// and7697
// 2019-06-26

public class hmwk_05_imperative {
  //----------------------------------------------------------
  // Sum of cubes
  static long sumOfCubes( long n ) {
    if ( n == 0 )
      return 0;
    else
      return n*n*n + sumOfCubes( n - 1 );
  }

  // Pseudo-Pell numbers
  static long pseudoPell( long n ) {
    if ( n == 0 )
      return 0;
    else if ( n == 1 )
      return 1;
    else
      return 3 * pseudoPell( n - 1 ) + 2 * pseudoPell( n - 2 );
  }

  // GCD
  static long GCD( long m, long n ) {

    if ( m > n )
    {
      if ( m % n == 0 )
        return n;
      else
        return GCD( n, m % n );
    }
    else
    {
      if ( n % m == 0 )
        return m;
      else
        return GCD( m, n % m );
    }
  }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    for ( long i = 0; i <= 15; i++ )
      System.out.println( "sumOfCubes(" + i + ") is " + sumOfCubes( i ) );

    for ( long i = 0; i <= 15; i++ )
      System.out.println( "pseudoPell(" + i + ") is " + pseudoPell( i ) );

    for ( long i = 1; i <= 10; i++ )
      for ( long j = 1; j <= 10; j++ )
        System.out.println( "GCD(" + i + ", " + j + ") is " + GCD( i, j ) );
  }
}
