// Child.java
// This class will compile because testIt() attempts to use
// the value of certification.Parent.x which has default access
// and which is also in package certification. 

package certification;

class Child extends Parent {
   public void testIt() {
      System.out.println("Parent.x value should be 9. ==> " + this.x);
   }

   public static void main(String[] args) {
      Child child = new Child();
      child.testIt();
   }
}
