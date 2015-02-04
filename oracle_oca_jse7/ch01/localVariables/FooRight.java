// FooRight.java
// Example of correct code trying to set an instance variable's
// value using a parameter.

class FooRight {
   int size = 27;
  
   public void setSize( int size ) {
      this.size = size;   // this.size removes ambiguity of which size variable gets the assignment.
   }

   public int getSize() {
      return size;
   }

   public static void main( String[] args ) {
      FooRight foo = new FooRight();
      System.out.println( "Original size is " + foo.getSize() );
      foo.setSize( 107 );
      System.out.println( "Update size is " + foo.getSize() ); // displays the new size value of 107.
   }
}

//   $ java FooRight 
//   Original size is 27
//   Update size is 107
