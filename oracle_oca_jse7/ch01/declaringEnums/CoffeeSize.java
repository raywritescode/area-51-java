// CoffeeSize.java
// Conceptual example of how to think about enums

class CoffeeSize {
   public static final CoffeeSize BIG = new CoffeeSize( "BIG", 0 );
   public static final CoffeeSize HUGE = new CoffeeSize( "HUGE", 1 );
   public static final CoffeeSize OVERWHELMING = new CoffeeSize( "OVERWHELMING", 2 );
   
   CoffeeSize( String enumName, int index ) {
      // code goes here
   }

   public static void main( String[] args ) {
      System.out.println( CoffeeSize.BIG );
   }
}
