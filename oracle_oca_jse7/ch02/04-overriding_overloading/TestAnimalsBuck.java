// TestAnimalsBuck.java

public class TestAnimalsBuck {
   public static void main( String[] args ) {
      Animal a = new Animal();
      Animal b = new Horse();  // Animal reference but Horse object.
      a.eat();  // Runs Animal.eat()
      b.eat();  // Runs Horse.eat()
      b.buck(); // causes javac error. Animal class doesn't have the buck() method.
   }
}

// test run...

//   $ javac TestAnimals.java
//   TestAnimalsBuck.java:9: error: cannot find symbol
//         b.buck(); // causes javac error. Animal class doesn't have the buck() method.
//          ^
//     symbol:   method buck()
//     location: variable b of type Animal
//   1 error
