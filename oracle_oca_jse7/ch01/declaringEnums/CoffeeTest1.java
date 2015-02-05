// CoffeeTest1.java
// Simple example of using enums

// enums are declared outside a class
enum CoffeeSize { BIG, HUGE, OVERWHELMING } // cannot be private or protected

class Coffee {
   CoffeeSize size;
}

public class CoffeeTest1 {
   public static void main( String[] args ) {
      Coffee drink = new Coffee();
      drink.size = CoffeeSize.BIG;
   }
}

// Key point of this example: an enum that is not enclosed in a class
// can be declared only with the public or default modifier, just like
// a non-inner class.
