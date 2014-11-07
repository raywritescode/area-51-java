// GenerateInts.java
// Generates from 1 to 1,000 unique random integers that range
// from 0 to 10,000. User inputs how many integers to generate.
//
// Ray Santos
// November 6, 2014

import java.util.Random;

public class GenerateInts
{
   public static void main( String[] args )
   {
      // Initialize a random number generator
      Random randomNumbers = new Random();

      // Initialize an integer variable to the value
      // of the integer argument
      int number = Integer.parseInt( args[ 0 ] );

      // Repeat until the number of integers to generate is reached
      for ( int i = 1; i <= number; i++ )
      {
         // Generate a random integer
         int randomNumber = 
            randomNumbers.nextInt( Integer.MAX_VALUE );

         // Print the random integer to the console on a new line
         System.out.println( randomNumber );
      }
   }
}
