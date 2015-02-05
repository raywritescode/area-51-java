// CoffeeTestProtected.java
// Example of enums not allowed to be protected.

// enums are declared outside a class
protected enum CoffeeSize { BIG, HUGE, OVERWHELMING } // cannot be private or protected

class Coffee {
   CoffeeSize size;
}

public class CoffeeTestProtected {
   public static void main( String[] args ) {
      Coffee drink = new Coffee();
      drink.size = CoffeeSize.BIG;
   }
}

//   $ javac CoffeeTestProtected.java 
//   CoffeeTestProtected.java:5: error: modifier protected not allowed here
//   protected enum CoffeeSize { BIG, HUGE, OVERWHELMING } // cannot be private or protected
//             ^
//   1 error
