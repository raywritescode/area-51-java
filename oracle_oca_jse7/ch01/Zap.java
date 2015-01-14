// Zap.java
// Implements the FooInterface class and attempts
// to modify the value of BAR inherited from
// FooInterface, which javac will not allow.

class Zap implements FooInterface {
   public void go() {
      BAR = 27;
   }
}

// javac error that is displayed
//
//   Zap.java:8: error: cannot assign a value to final variable BAR
//         BAR = 27;
//         ^
//   1 error

