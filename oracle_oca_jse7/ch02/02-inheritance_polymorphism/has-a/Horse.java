// Horse.java
// Horse IS-A Animal and HAS-A Haltar

public class Horse extends Animal {
   private Halter myHalter = new Halter();    // HAS-A relationship
   public void tie() {
      myHalter.tie();    // Delegate tie behavior to the Halter object.
   }
}
