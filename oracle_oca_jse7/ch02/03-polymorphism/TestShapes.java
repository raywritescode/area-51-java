// TestShapes.java

public class TestShapes {
   public static void main( String[] args ) {
      PlayerPiece shape = new PlayerPiece();
      shape.displayShape();  // method inherited from class GameShape
      shape.movePiece();     // method from class PlayerPiece 
      shape.animate();       // method implemented from interface Animatable
   }
}

// example run...

//   $ java TestShapes 
//   displaying shape
//   moving game piece
//   animating...
