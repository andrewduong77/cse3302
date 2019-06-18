# Duong, Andrew
# and7697
# 2019-06-18
#--------------------------------------------------
import re
import sys

#--------------------------------------------------
def processToken( token ) :
  # Replace the following line with your code to classify
  # the string in 'token' according to your three Regular
  # Expressions and print the appropriate message.

  if re.search( "^[aeiouAEIOU]+\\{\\)[0-9a-fA-F]+$" , token ) :
    print( ">" + token + "< matches EffPea." )
  elif re.search( "^\\}[a-z0-9]*\\($" , token ) :
    print( ">" + token + "< matches Stir." )
  elif re.search( "^\\@[0-9R-W]+\\#$" , token ) :
    print( ">" + token + "< matches Ent." )
  else :
    print( ">" + token + "< does not match." )

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
