// ChildNoAccess.java
// This class is a subclass of certification.Parent class.
// The class's inheritance has access to the Parent.x protected instance variable
// that has the int value of 9.
// However, the Parent class reference does NOT have access the Parent class's x.

package other;

import certification.Parent;

class Child extends Parent {
   public void testIt() {
      System.out.println("Value after '=' sign should be 9 = " + this.x);

      Parent parent = new Parent();
      System.out.println("Parent x value is " + parent.x); // triggers javac error
   }

   public static void main(String[] args) {
      Child child = new Child();
      child.testIt();
   }
}

// javac error displayed...

//   $ javac other/ChildNoAccess.java 
//   other/ChildNoAccess.java:16: error: x has protected access in Parent
//         System.out.println("Parent x value is " + parent.x); // triggers javac error
//                                                         ^
//   1 error
