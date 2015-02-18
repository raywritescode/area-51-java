// TestAnimalsNoEat.java

public class TestAnimalsNoEat {
   public static void main( String[] args ) {
      HorseNoEat h = new HorseNoEat();
      h.eat();  // javac error. HorseNoEat didn't inherit eat()
   }
}

// javac error...

//   $ javac TestAnimalsNoEat.java 
//   TestAnimalsNoEat.java:6: error: cannot find symbol
//         h.eat();  // javac error. Horse didn't inherit eat()
//          ^
//     symbol:   method eat()
//     location: variable h of type HorseNoEat
//   1 error
