// Test.java

class Test {
   public static void main( String[] args ) {
      Test t1 = new Test();
      Test t2 = new Test();

      if ( !t1.equals( t2 ) )       // equals() method inherited from the Object class
         System.out.println( "they're not equal" );

      if ( t1 instanceof Object )   // instanceof() method inherited from the Object class 
         System.out.println( "t1's an object" );
   }
}

// example run...

//   $ java Test 
//   they're not equal
//   t1's an object
