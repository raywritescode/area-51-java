// PlayerPiece.java

class PlayerPiece extends GameShape implements Animatable {
   public void movePiece() {
      System.out.println( "moving game piece" );
   }

   public void animate() {
      System.out.println( "animating..." );
   }
}
