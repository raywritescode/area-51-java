// Foo.java
// Examining javac behavior when an access modifier is incorrectly
// applied to a local variable.

class Foo {
   void doStuff() {
      private int x = 7; // this will cause javac to fail. private access modifier not applicable.
      System.out.println("int x = 7");
   }
}

// javac error...

//   $ javac Foo.java 
//   Foo.java:7: error: illegal start of expression
//         private int x = 7; // this will cause javac to fail. private access modifier not applicable.
//         ^
//   1 error
