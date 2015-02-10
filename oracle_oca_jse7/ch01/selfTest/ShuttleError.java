// ShuttleError.java

class Rocket {
   private void blastOff() {
      System.out.print(" bang ");
   } 
}

public class ShuttleError extends Rocket {
   public static void main( String[] args ) {
      new ShuttleError().go();
      System.out.println();
   }

   void go() {
      blastOff();
      Rocket.blastOff();    // causes javac compiler error
   }

   private void blastOff() {
      System.out.print( "sh-bang ");
   }
}

//   $ javac ShuttleError.java 
//   ShuttleError.java:17: error: blastOff() has private access in Rocket
//         Rocket.blastOff();    // causes javac compiler error
//               ^
//   1 error
