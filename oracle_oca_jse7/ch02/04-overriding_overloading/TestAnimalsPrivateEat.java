// TestAnimalsPrivateEat.java

public class TestAnimalsPrivateEat {
   public static void main( String[] args ) {
      Animal a = new Animal();
      Animal b = new HorsePrivateEat();  // Animal reference but HorsePrivateEat object.
      a.eat();  // Runs Animal.eat()
      b.eat();  // javac error. HorsePrivateEat.eat() is private
   }
}

// javac error...

//   $ javac TestAnimalsPrivateEat.java 
//   ./HorsePrivateEat.java:4: error: eat() in HorsePrivateEat cannot override eat() in Animal
//      private void eat() {
//                   ^
//     attempting to assign weaker access privileges; was public
//   1 error
