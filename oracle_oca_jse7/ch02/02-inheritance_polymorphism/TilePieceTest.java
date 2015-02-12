// TilePieceTest.java

public class TilePieceTest {
   public static void main( String[] args ) {
      PlayerPiece player = new PlayerPiece();
      TilePiece tile = new TilePiece();

      doShapes( player );
      doShapes( tile );
   }

   public static void doShapes( GameShape shape ) {
      shape.displayShape();
   }
}

// example run...

//   $ java TilePieceTest 
//   displaying shape
//   displaying shape
