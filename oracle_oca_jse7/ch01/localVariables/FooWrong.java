// FooWrong.java
// Example of wrong code trying to set an instance variable's
// value using a parameter.

class FooWrong {
   int size = 27;
  
   public void setSize( int size ) {
      size = size;   // which size equals which size?
   }

   public int getSize() {
      return size;
   }

   public static void main( String[] args ) {
      FooWrong foo = new FooWrong();
      System.out.println( "Original size is " + foo.getSize() );
      foo.setSize( 107 );
      System.out.println( "Update size is " + foo.getSize() ); // displays the original size value of 27, not 107.
   }
}

//   $ java FooWrong 
//   Original size is 27
//   Update size is 27
