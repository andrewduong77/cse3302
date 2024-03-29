// Duong, Andrew
// and7697
// 2019-06-21

#include <ctype.h>
#include <regex.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *getToken( FILE *fp );

// (Hint: Put your regex_t declarations here.)

void processToken( char *token )
{
  // Replace the following line with your code to classify
  // the string in 'token' according to your three Regular
  // Expressions and print the appropriate message.
  // (Hint: use regexec to do the regular expression matching.)

  regex_t re;
  
  regcomp ( &re, "^[gG]([gG][gG])*(\\!+PEA|\\?+pea|(\\!|\\?)+)$", REG_EXTENDED );
  int GeePea_status = ! regexec ( &re , token , 0 , NULL , 0 );
  regfree ( &re );
  regcomp ( &re, "^(\\&([a-z][a-z])*(\\+|\\/))|(\\+([a-z][a-z])*(\\&|\\/))|(\\/([a-z][a-z])*(\\+|\\&))$", REG_EXTENDED );
  int Shake_status = ! regexec ( &re , token , 0 , NULL , 0 );
  regfree ( &re );
  regcomp ( &re, "^(\\#[r-w]+\\&)|(\\#[R-W]+\\*)|(\\#\\@)$", REG_EXTENDED );
  int Orc_status = ! regexec ( &re , token , 0 , NULL , 0 );
  regfree ( &re );
  if ( GeePea_status )
    printf ( ">%s< matches GeePea.\n" , token );
  else if ( Shake_status )
    printf ( ">%s< matches Shake.\n" , token );
  else if ( Orc_status )
    printf ( ">%s< matches Orc.\n" , token );
  else
    printf ( ">%s< does not match.\n" , token );
}

int main( int argc, char *argv[] )
{
  // (Hint: Put the initialization of your regular expressions here.
  //        This would be the calls to regcomp.)

  // DO NOT CHANGE anything below this line!
  if ( argc > 1 ) {
    printf( "processing tokens from %s ...\n", argv[1] );

    FILE *fp = fopen( argv[1], "r" );
    char *token = NULL;

    if ( fp != NULL ) {
      while ( token = getToken( fp ) ) {
        processToken( token );
        free( token );
      }

      fclose( fp );
    } else {
      printf( "unable to open %s?\n", argv[1] );
    }
  } else {
    printf( "No input file specified.\n" );
  }
}

#define MAX_TOKEN_SIZE (1024)

char *getToken( FILE *fp )
{
  char token[ MAX_TOKEN_SIZE+1 ];
  int  i  = 0;

  while ( i < MAX_TOKEN_SIZE ) {
    int ch = fgetc( fp );

    if ( ch == EOF ) { break; }

    if ( isspace( ch ) ) {
      if ( i == 0 ) { continue; }
      break;
    }

    token[ i++ ] = ch;
  }

  if ( i == 0 ) { return NULL; }

  token[ i ] = '\0';

  return strdup( token );
}
