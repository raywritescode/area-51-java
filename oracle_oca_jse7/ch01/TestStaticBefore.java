// TestStaticBefore.java
// Exploring static import statements. This class does not use
// static imports. Compare this class to the TestStaticAfter
// class, which uses static imports.
// 
// Both Before and After classes produces the same output.
//
// January 7, 2015
// Ray Santos

public class TestStaticBefore {
   public static void main( String[] args ) {
      System.out.println( Integer.MAX_VALUE );
      System.out.println( Integer.toHexString( 1967 ));
   }
}

// Output:
//
// 2147483647
// 7af

