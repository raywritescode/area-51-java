// IllegaClass.java
// javac will not compile this class because the class is not a non-abstract class
// that contains an abstract method.

public class IllegalClass {
   public abstract void fooBar();
}

// javac error...

//   $ javac IllegalClass.java 
//   IllegalClass.java:5: error: IllegalClass is not abstract and does not override abstract method fooBar() in IllegalClass
//   public class IllegalClass {
//          ^
//   1 error
