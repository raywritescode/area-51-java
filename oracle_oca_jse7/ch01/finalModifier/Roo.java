// Roo.java
// A final variable cannot be assigned a new value once the
// initial method is made.

class Roo {
   final int size = 42;
   
   void changeSize() {
      size = 16;       // javac won't allow this reassignment.
   }
}

//   $ javac Roo.java
//   Roo.java:9: error: cannot assign a value to final variable size
//         size = 16;       // javac won't allow this reassignment.
//         ^
//   1 error
