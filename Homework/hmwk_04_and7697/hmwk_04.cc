// Duong, Andrew
// and7697
// 2019-06-21

#include <fstream>
#include <iostream>
#include <regex>

using namespace std;

void processToken( string token )
{
  // Replace the following line with your code to classify
  // the string in 'token' according to your three Regular
  // Expressions and print the appropriate message.

  if ( regex_match ( token.begin(), token.end(), regex ( "^[gG]([gG][gG])*(\\!+PEA|\\?+pea|(\\!|\\?)+)$" ) ) )
    cout << ">" << token << "< matches GeePea.\n";
  else if ( regex_match ( token.begin(), token.end(), regex ( "^(\\&([a-z][a-z])*(\\+|\\/))|(\\+([a-z][a-z])*(\\&|\\/))|(\\/([a-z][a-z])*(\\+|\\&))$" ) ) )
    cout << ">" << token << "< matches Shake.\n";
  else if ( regex_match ( token.begin(), token.end(), regex ( "^(\\#[r-w]+\\&)|(\\#[R-W]+\\*)|(\\#\\@)$" ) ) )
    cout << ">" << token << "< matches Orc.\n";
  else
    cout << ">" << token << "< does not match.\n";
}

int main( int argc, char *argv[] )
{
  if ( argc > 1 ) {
    cout << "processing tokens from " << argv[ 1 ] << " ...\n";

    ifstream inputFile;
    string   token;

    inputFile.open( argv[ 1 ] );

    if ( inputFile.is_open() ) {
      while ( inputFile >> token ) {
        processToken( token );
      }
      inputFile.close();
    } else {
      cout << "unable to open " << argv[ 1 ] << "?\n";
    }
  } else {
    cout << "No input file specified.\n";
  }
}
