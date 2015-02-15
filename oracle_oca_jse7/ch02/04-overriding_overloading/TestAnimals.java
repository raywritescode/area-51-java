// TestAnimals.java

public class TestAnimals {
   public static void main( String[] args ) {
      Animal a = new Animal();
      Animal b = new Horse();  // Animal reference but Horse object.
      a.eat();  // Runs Animal.eat()
      b.eat();  // Runs Horse.eat()
   }
}

// test run...

//   $ java TestAnimals 
//   Generic Animal eating generically
//   Horse eating hay, oats, and horse treats
