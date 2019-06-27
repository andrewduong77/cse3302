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
      return sumOfCubes( n - 1 );
  }

  // // Pseudo-Pell numbers
  // static int pseudoPell( int n ) {
  //   // Put something here
  // }

  // // GCD
  // static int GCD( int m, int n ) {
  //   // Put something here
  // }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    // Put for loop here that calls sumOfCubes().
    for ( int i = 0; i <= 15; i++ )
    {
      System.out.println( "sumOfCubes(" + i + ") is " + sumOfCubes( i ) );
    }

    // Put for loop here that calls pseudoPell().

    // Put nested for loops here that call GCD().
  }
}
