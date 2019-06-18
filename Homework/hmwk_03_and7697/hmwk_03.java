// Duong, Andrew
// and7697
// 2019-06-17

import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.regex.*;

public class hmwk_03 {
  public static void processToken( String token )
  {
    // Replace the following line with your code to classify
    // the string in 'token' according to your three Regular
    // Expressions and print the appropriate message.

    if( Pattern.matches( "[aeiouAEIOU]+\\{\\)[0-9a-fA-F]+" , token ) )
      System.out.println( ">" + token + "< matches EffPea." );
    else if( Pattern.matches( "\\}[a-z0-9]*\\(" , token ))
      System.out.println( ">" + token + "< matches Stir." );
    else if( Pattern.matches( "\\@[0-9R-W]+\\#" , token ))
      System.out.println( ">" + token + "< matches Ent." );
    else
      System.out.println( ">" + token + "< does not match." );
  }

  public static void main( String[] args )
  {
    System.out.println( "processing tokens from " + args[ 0 ] + " ..." );

    try {
      Files.lines( Paths.get( args[ 0 ] ) ).filter(line -> line.length() > 0).forEachOrdered(
        line -> Arrays.stream( line.split( "\\s+" )  )
            .forEachOrdered( token -> processToken( token ) ) );
    } catch ( java.io.IOException e ) {
      e.printStackTrace();
    }
  }
}
