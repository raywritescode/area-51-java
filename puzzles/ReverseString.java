// ReverseString.java

public class ReverseString {
   public static void main( String[] args ) {
      String string = "hello world!";
      String reversed = new StringBuilder( string ).reverse().toString();
      System.out.println( reversed );
   }
}

// During an interview I was asked to write code using Java that
// printed a given String in reverse. My on-the-spot solution
// was complicated but it worked. This version, which I came up with
// at home, is simpler. The StringBuilder class makes this an
// easy exercise.
