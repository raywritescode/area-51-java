// Illegal02.java

import java.io.*;

class Animal {
   public void eat() {
      // code goes here
   }
}

class Illegal02 extends Animal {
   public void eat() throws IOException { }  // Illegal Override. Declares checked exception not defined in superclass version.
   public static void main( String[] args ) {
      // code goes here
   }
}

// javac compiler error..

//   $ javac Illegal02.java 
//   Illegal02.java:12: error: eat() in Illegal02 cannot override eat() in Animal
//      public void eat() throws IOException { }  // Illegal Override. Declares checked exception not defined in superclass version.
//                  ^
//     overridden method does not throw IOException
//   1 error
