// Frodo.java

public class Frodo extends Hobbit {
   public static void main( String[] args ) {
      int mygold = 7;
      System.out.println( countGold( myGold, 6 ) );  // javac error. static methods do not have access to non-static methods. 
   }                                                 // Therefore, main() does not have access to myGold().
}

class Hobbit {
   int countGold( int x, int y ) {
      return x + y;
   }
}

// javac error...

//   $ javac Frodo.java 
//   Frodo.java:6: error: cannot find symbol
//         System.out.println( countGold( myGold, 6 ) );
//                                        ^
//     symbol:   variable myGold
//     location: class Frodo
//   1 error
