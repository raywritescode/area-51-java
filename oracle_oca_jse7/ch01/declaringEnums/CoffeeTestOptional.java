// CoffeeTestOptional.java
// Simple example declaring enum with ending semicolon

// enums are declared outside a class
enum CoffeeSize { BIG, HUGE, OVERWHELMING };   // ending semicolon is optional for enums

class Coffee {
   CoffeeSize size;
}

public class CoffeeTestOptional {
   public static void main( String[] args ) {
      Coffee drink = new Coffee();
      drink.size = CoffeeSize.BIG;
   }
}
