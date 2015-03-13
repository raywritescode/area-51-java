// Illegal03.java

class Animal {
   public void eat() {
      // code goes here
   }
}

class Illegal03 extends Animal {
   public void eat( String food ) { }  // Legal overload, not an override, because the argument list has changed.
   public static void main( String[] args ) {
      // code goes here
   }
}

// This code compiles without error because Illega03's eat() method is an overload and not an override.
