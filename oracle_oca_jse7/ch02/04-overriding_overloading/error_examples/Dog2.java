// Dog2.java

class Dog2 extends Animal {
   public void eat() { /* no Exceptions */ }
   public static void main( String[] args ) {
      Animal a = new Dog2();
      Dog2 d = new Dog2();
      d.eat();              // ok
      a.eat();              // compiler error - unreported exception.
   }
}

/* 
This code will not compile because of the Exception declared on the Animal eat() method.
This happens even though, at runtime, the eat() method would be the Dog version,
which does not delcare the exception.
*/

// Example run.

// $ javac Dog2.java 
// Dog2.java:9: error: unreported exception Exception; must be caught or declared to be thrown
//       a.eat();              // compiler error - unreported exception.
//            ^
// 1 error
