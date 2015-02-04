// TestServerNoCompile.java
// Simple example of illegal code that attempts to access a local variable
// using a different method.

class TestServerNoCompile {
   public void logIn() {
      int count = 10;    // local variable 
   }

   public void doSomething( int i ) {
      count = i;  // compile error. Can't access logIn() method's local variable.
   }
}

//   $ javac TestServerNoCompile.java 
//   TestServerNoCompile.java:11: error: cannot find symbol
//         count = i;  // compile error. Can't access logIn() method's local variable.
//         ^
//     symbol:   variable count
//     location: class TestServerNoCompile
//   1 error
