// TestHorseSuper.java

class TestHorseSuper {
   public static void main( String[] args ) {
      HorseSuper h = new HorseSuper();
      h.printYourself();  // invokes AnimalSuper.printYourself()
   }
}

// test run...

//   $ java TestHorseSuper
//   From AnimalSuper.printYourself()
