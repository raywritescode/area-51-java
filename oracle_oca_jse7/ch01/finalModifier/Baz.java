// Baz.java
// Exploring effect of final modifier on a class

class Baz {
   final void go() { }
}

class Bat extends Baz {
   final void go() { }  // javac doesn't allow the final go() method to be overridden.
}

//   $ javac Baz.java 
//   Baz.java:10: error: go() in Bat cannot override go() in Baz
//      final void go() { }  // javac doesn't allow the final go() method to be overridden.
//                 ^
//     overridden method is final
//   1 error
