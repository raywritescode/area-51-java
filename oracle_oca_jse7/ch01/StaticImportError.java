// StaticImportError.java
// Exploring static import statements. This class intentionally uses the
// "import static" as "static import" to observe the compiler
// error produced by javac.
// 
// January 7, 2015
// Ray Santos

static import java.lang.System.out;  // javac will error on this line
import static java.lang.Integer.*;

public class TestStaticAfter {
   public static void main( String[] args ) {
      out.println( MAX_VALUE );
      out.println( toHexString( 1967 ));
   }
}

//  $ javac StaticImportError.java 
//  StaticImportError.java:9: error: class, interface, or enum expected
//  static import java.lang.System.out;  // javac will error on this line
//         ^
//  1 error

