// GenerateInts.java
// Generates a number of random integers based on an integer argument. 
// Generated random numbers range from 0 to (Integer.MAX_VALUE - 1)
//
// Ray Santos
// November 6, 2014

import java.util.Random;

public class GenerateInts
{
   public static void main( String[] args )
   {
      Random randomNumbers = new Random();
      int number = Integer.parseInt( args[ 0 ] );

      for ( int i = 1; i <= number; i++ )
      {
         int randomNumber = 
            randomNumbers.nextInt( Integer.MAX_VALUE );
         
         System.out.println( randomNumber );
      }
   }
}
