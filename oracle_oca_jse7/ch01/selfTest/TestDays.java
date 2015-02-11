// TestDays.java

public class TestDays {
   public enum Days { MON, TUE, WED };
   public static void main( String[] args ) {
      for ( Days d : Days.values() )           
         ;                                 // for loop does nothing.
      Days [] d2 = Days.values();          // d2 is an array that contains [MON, TUE, WED]
      System.out.println( d2[2] );         // value at d2[2] is WED
   }
}

// Example run

//   $ java TestDays 
//   WED
