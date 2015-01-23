// FizzBuzz.java
// The classic FizzBuzz coding test.

// Write a program that prints the numbers from 1 to 100. But for multiples of three print
// "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers
// which are mulitples of both three and five print "FizzBuzz".

class FizzBuzz {
   public static void main( String[] args ) {
   
//   Repeat starting at 1 to 100
     for ( int i = 1; i <= 100; i++ ) {

//      If the number is divisible by 3 and 5 print "FizzBuzz"
        if ( ( i % 3 == 0 ) && ( i % 5 == 0 ) )
           System.out.println( "FizzBuzz" );
       
//      Otherwise, if the number is divisible by 3 print "Fizz"
        else if ( i % 3 == 0 )
           System.out.println( "Fizz" );

//      Otherwise, if the number is divisible by 5 print "Buzz"
        else if ( i % 5 == 0 )
           System.out.println( "Buzz" );

//      Otherwise, print the number
        else System.out.println( i );

//      increment the count by 1
        // handled by the for loop
      }
   }
}
