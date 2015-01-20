// Child.java
// This class will fail to compile because testIt() attempts to use
// the value of certification.Parent.x which has default access
// and which is not inherited by a subclass located in a different
// package, in this case package other.


package other;

import certification.Parent;

class Child extends Parent {
   public void testIt() {
      System.out.println("Parent.x value should be 9. ==> " + this.x);
   }

   public static void main(String[] args) {
      Child child = new Child();
      child.testIt();
   }
}

// javac error displayed...

//   $ javac other/Child.java 
//   other/Child.java:9: error: x is not public in Parent; cannot be accessed from outside package
//         System.out.println("Parent.x value should be 9. ==> " + this.x);
//                                                                     ^
//   1 error
