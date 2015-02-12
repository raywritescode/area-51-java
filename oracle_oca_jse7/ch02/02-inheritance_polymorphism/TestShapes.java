// TestShapes.java

public class TestShapes {
   public static void main( String[] args ) {
      PlayerPiece shape = new PlayerPiece();
      shape.displayShape();  // method inherited from class GameShape
      shape.movePiece();     // method from class PlayerPiece 
   }
}

// example run...

//   $ java TestShapes 
//   displaying shape
//   moving game piece
