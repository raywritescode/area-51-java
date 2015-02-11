// Announce.java

class Announce {
   public static void main( String[] args ) {
      for ( int __x = 0; __x < 3; __x++ ) ;
      int #lb = 7;          // javac error because variable name starts with #
      long [] x [5];        // javac error because x[] tries to initialize array with 5
      Boolean []ba[];
   }
}

// expected javac errors

//   $ javac Announce.java 
//   Announce.java:6: error: illegal character: \35
//         int #lb = 7;          // javac error because variable name starts with #
//             ^
//   Announce.java:6: error: not a statement
//         int #lb = 7;          // javac error because variable name starts with #
//         ^
//   Announce.java:7: error: ']' expected
//         long [] x [5];        // javac error because x[] tries to initialize array with 5
//                    ^
//   Announce.java:7: error: illegal start of expression
//         long [] x [5];        // javac error because x[] tries to initialize array with 5
//                     ^
//   4 errors
