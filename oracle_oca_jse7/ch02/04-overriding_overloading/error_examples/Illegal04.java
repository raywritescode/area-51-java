// Illegal04.java

class Animal {
   public void eat() {
      // code goes here
   }
}

class Illegal04 extends Animal {
   public String eat()  { }  // Not an override because of the return type. Not an overload either, no change in argument list.
   public static void main( String[] args ) {
      // code goes here
   }
}

// javac error...

//   $ javac Illegal04.java 
//   Illegal04.java:10: error: eat() in Illegal04 cannot override eat() in Animal
//      public String eat()  { }  // Not an override because of the return type. Not an overload either, no change in argument list.
//                    ^
//     return type String is not compatible with void
//   1 error
