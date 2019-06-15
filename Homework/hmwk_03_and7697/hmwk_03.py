# Duong, Andrew
# and7697
# 2019-06-14
#--------------------------------------------------
import re
import sys

#--------------------------------------------------
def processToken( token ) :
  # Replace the following line with your code to classify
  # the string in 'token' according to your three Regular
  # Expressions and print the appropriate message.

  print( '>%s< is the proposed token.' % ( token ) )

#--------------------------------------------------
def main() :
  fName = sys.argv[ 1 ]
  print( 'processing tokens from ' + fName + ' ...' )

  with open( fName, 'r' ) as fp :
    lines = fp.read().replace( '\r', '' ).split( '\n' )

  for line in lines :
    for token in line.split() :
      processToken( token )

#--------------------------------------------------
if ( __name__ == '__main__' ) :
  main()

#--------------------------------------------------
