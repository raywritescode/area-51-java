// Moo_2.java
//
// This class uses 'this' to invoke the inherited
// Zoo.coolMethod() method.

class Moo_2 extends Zoo {
   public void displayCoolMethod() { 
      System.out.println(this.coolMethod());
   }

   public static void main(String[] args) {
      Moo_2 x = new Moo_2();
      x.displayCoolMethod();
   }
}
