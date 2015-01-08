// TestStaticAfter.java
// Exploring static import statements. This class uses
// static imports. Compare this class to the TestStaticBefore
// class, which does not use static imports.
// 
// Both Before and After classes produce the same output.
//
// January 7, 2015
// Ray Santos

import static java.lang.System.out;
import static java.lang.Integer.*;

public class TestStaticAfter {
   public static void main( String[] args ) {
      out.println( MAX_VALUE );
      out.println( toHexString( 1967 ));
   }
}

// Output:
//
// 2147483647
// 7af

