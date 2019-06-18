// Duong, Andrew
// and7697
// 2019-06-17

using System;
using System.IO;
using System.Text.RegularExpressions;

public class hmwk_03
{
  static public void processToken( string token ) {
    // Replace the following line with your code to classify
    // the string in 'token' according to your three Regular
    // Expressions and print the appropriate message.

    if( Regex.IsMatch( token , "[aeiouAEIOU]+\\{\\)[0-9a-fA-F]+" ) )
      Console.WriteLine( ">" + token + "< matches EffPea." );
    else if( Regex.IsMatch( token , "\\}[a-z0-9]*\\(" ))
      Console.WriteLine( ">" + token + "< matches Stir." );
    else if( Regex.IsMatch( token , "\\@[0-9R-W]+\\#" ))
      Console.WriteLine( ">" + token + "< matches Ent." );
    else
      Console.WriteLine( ">" + token + "< does not match." );
  }

  static public void Main( string[] args )
  {
    Console.WriteLine( "processing tokens from " + args[ 0 ] + " ..." );

    foreach ( string line in File.ReadAllLines( args[ 0 ] ) ) {
      foreach ( string token in line.Split( (char []) null, StringSplitOptions.RemoveEmptyEntries ) ) {
        processToken( token );
      }
    }
  }
}
