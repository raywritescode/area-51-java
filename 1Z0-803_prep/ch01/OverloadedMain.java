public class OverloadedMain
{
   public static void main( String args )
   {
      System.out.println(
       "public static void main( String args ) NO start" );
   }
  
   public static void main( String[] args )
   {
      System.out.println(
       "public static void main( String[] args ) STARTS" );
   }

   public static void main( String a1, String a2 )
   {
      System.out.println( 
       "public static void main( String a1, String a2 ) NO start");
   }
}
