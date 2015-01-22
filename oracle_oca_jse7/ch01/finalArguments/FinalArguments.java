// FinalArgument.java

public class FinalArguments {

   private void printTwoIntegers( int x, final int y ) {
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
      x++;
      y++; // javac will fail here. Not allowed to modify argument value marked final
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
   }

   public static void main( String[] args ) {
      FinalArguments foo = new FinalArguments();
      foo.printTwoIntegers( 10, 20 );
   }
}

// javac error...

//   $javac FinalArguments.java 
//   FinalArguments.java:9: error: final parameter y may not be assigned
//         y++;
//         ^
//   1 error
