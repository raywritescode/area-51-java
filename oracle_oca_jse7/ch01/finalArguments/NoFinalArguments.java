// NoFinalArgument.java

public class NoFinalArguments {

   private void printTwoIntegers( int x, int y ) {
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
      x++;
      y++;
      System.out.println( "First integer entered is " + x );     
      System.out.println( "Second integer entered is " + y );
   }

   public static void main( String[] args ) {
      NoFinalArguments foo = new NoFinalArguments();
      foo.printTwoIntegers( 10, 20 );
   }
}
