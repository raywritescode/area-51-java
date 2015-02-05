// CoffeeTestPrivate.java
// Example of enums not allowed to be private.

// enums are declared outside a class
private enum CoffeeSize { BIG, HUGE, OVERWHELMING } // cannot be private or protected

class Coffee {
   CoffeeSize size;
}

public class CoffeeTestPrivate {
   public static void main( String[] args ) {
      Coffee drink = new Coffee();
      drink.size = CoffeeSize.BIG;
   }
}

//   $ javac CoffeeTestPrivate.java 
//   CoffeeTestPrivate.java:5: error: modifier private not allowed here
//   private enum CoffeeSize { BIG, HUGE, OVERWHELMING } // cannot be private or protected
//           ^
//   1 error
