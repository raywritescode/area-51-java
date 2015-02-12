// BadEncapsulation.java

class Foo {
   public int highNumber;                // bad encapsulation
   private int lowNumber;                // good encapsulation

   public void setHighNumber( int hNumber ) {
      highNumber = hNumber;
   }

   public void setLowNumber( int lNumber ) {
      lowNumber = lNumber;
   }
   
   public int getLowNumber() {
      return lowNumber;
   }
}

public class BadEncapsulation {
   public static void main( String[] args ) {

      Foo foo = new Foo();
      
      System.out.println( foo.getLowNumber() );
      foo.setLowNumber( -5 );
      System.out.println( foo.getLowNumber() );

      System.out.println( foo.highNumber );   // BAD: direct access to Foo.highNumber
      foo.highNumber = 999;                   // BAD: directly updating Foo.highNumber
      System.out.println( foo.highNumber );
   }
}

// example run...

//   $ java BadEncapsulation 
//   0
//   -5
//   0
//   999
