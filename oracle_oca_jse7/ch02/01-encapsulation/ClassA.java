// ClassA.java
// Encapsulation example

class ClassA {

   public static void main( String[] args ) { 
   
      ClassB b = new ClassB();

      System.out.println( b.getSize() );
      b.setSize( 34 );
      System.out.println( b.getSize() );
   
      System.out.println( b.getName() );
      b.setName( "Wheezy" );
      System.out.println( b.getName() );

      System.out.println( b.getColor() );
      b.setColor( "Navy Blue" );
      System.out.println( b.getColor() );
  }
}

// sample run...

//   $ java ClassA
//   0
//   34
//   null
//   Wheezy
//   null
//   Navy Blue
