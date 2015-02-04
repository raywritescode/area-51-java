// TestServerShadowing.java
// Simple example of variable shadowing. Which is declaring a
// local variable with the same name as an instance variable.

class TestServerShadowing {
   int count = 9;        // instance variable

   public void logIn() {
      int count = 10;    // local variable (shadows the instance variable)
      System.out.println( "local variable count is " + count );
   }

   public void count() {
      System.out.println( "instance variable count is " + count );
   }

   public static void main( String[] args ) {
      new TestServerShadowing().logIn();
      new TestServerShadowing().count();
   }
}

//   $ java TestServerShadowing 
//   local variable count is 10
//   instance variable count is 9

