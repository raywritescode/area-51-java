// Baz.java

package pkgB;

import pkgA.*;

public class Baz {
   public static void main( String[] args ) {
      Foo f = new Foo();
      System.out.print( " " + f.a );
      System.out.print( " " + f.b );
      System.out.print( " " + f.c );
   }
}

// expected java compiler errors

//   $ javac pkgB/Baz.java 
//   pkgB/Baz.java:10: error: a is not public in Foo; cannot be accessed from outside package
//         System.out.print( " " + f.a );
//                                  ^
//   pkgB/Baz.java:11: error: b has protected access in Foo
//         System.out.print( " " + f.b );
//                                  ^
//   2 errors
