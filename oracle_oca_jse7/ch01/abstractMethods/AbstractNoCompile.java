// AbstractNoCompile.java

public abstract class AbstractNoCompile {
   abstract void foo();
}

class B extends AbstractNoCompile {
   void foo( int I ) {}  // javac errors here. Doesn't implement the inherited abstract method.
}

// javac error...

//   $ javac AbstractNoCompile.java 
//   AbstractNoCompile.java:7: error: B is not abstract and does not override abstract method foo() in AbstractNoCompile
//   class B extends AbstractNoCompile {
//   ^
//   1 error
