// FinalArgument.java

public class FinalArguments {

   private void printTwoIntegers( int x, int y ) {
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
      x++;
      y++;
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
   }

   public static void main( String[] args ) {
      FinalArguments foo = new FinalArguments();
      foo.printTwoIntegers( 10, 20 );
   }
}
