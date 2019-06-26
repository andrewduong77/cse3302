// Duong, Andrew
// and7697
// 2019-06-26

public class hmwk_05_imperative {
  //----------------------------------------------------------
  // Sum of cubes
  static Long sumOfCubes( Long n ) {
    // Put something here
    if ( n == 0)
      return 0;
    else
      sumOfCubes( n - 1 );
  }

  // Pseudo-Pell numbers
  static Long pseudoPell( Long n ) {
    // Put something here
  }

  // GCD
  static Long GCD( Long m, Long n ) {
    // Put something here
  }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that calls sumOfCubes().
    for ( long i = 0; 15; i++ )
    {
      sumOfCubes( i );
    }

    // Put for loop here that calls pseudoPell().

    // Put nested for loops here that call GCD().
  }
}
