// Child.java
// This class is a subclass of certification.Parent class.
// It has access to the Parent.x protected instance variable
// that has the int value of 9.

package other;

import certification.Parent;

class Child extends Parent {
   public void testIt() {
      System.out.println("Value after '=' sign should be 9 = " + this.x);
   }

   public static void main(String[] args) {
      Child child = new Child();
      child.testIt();
   }
}
