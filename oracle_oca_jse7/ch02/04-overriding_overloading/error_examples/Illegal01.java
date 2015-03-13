// Animal.java

class Animal {
   public void eat() {
      // code goes here
   }
}

class Illegal01 extends Animal {
   private void eat() { }  // Illegal Override. Access modifier is more restrictive
   public static void main( String[] args ) {
      // code goes here
   }
}

// javac compiler error..

//   $ javac Illegal01.java 
//   Illegal01.java:10: error: eat() in Illegal01 cannot override eat() in Animal
//      private void eat() { }  // Illegal Override. Access modifier is more restrictive
//                   ^
//     attempting to assign weaker access privileges; was public
//   1 error
