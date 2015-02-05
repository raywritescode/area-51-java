// Foo.java
// Exploring behavior of the final modifer on a class

final class Foo {
   // code goes here  
}

class Bar extends Foo {
   // javac won't allow Bar to extend final class Foo
}

//   $ javac Foo.java 
//   Foo.java:9: error: cannot inherit from final Foo
//   class Bar extends Foo {
//                     ^
//   1 error
