// Tablet.java

interface Gadget {
   void doStuff();     // by default the method is public
}

abstract class Electronic {
   void getPower() {
      System.out.print( "plug in ");
   }
}

public class Tablet extends Electronic implements Gadget {
   void doStuff() {                      // javac error here. This method needs to be explicitly public because
      System.out.print( "show book " );  // the interface Gadget.doStuff() is by default public.
   }

   public static void main( String[] args ) {
      new Tablet().getPower();
      new Tablet().doStuff();
   }
}

// javac error...

//   $ javac Tablet.java 
//   Tablet.java:14: error: doStuff() in Tablet cannot implement doStuff() in Gadget
//      void doStuff() {                      // this method needs to be explicitly public because
//           ^
//     attempting to assign weaker access privileges; was public
//   1 error
