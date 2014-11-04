// ImportTest3java
import com.raywritescode.util.Hello;

public class ImportTest3
{
   public static void main( String[] args )
   {
      Hello myHello =  new Hello();
      myHello.printHello();

      com.raywritescode.util.Hello yourHello =
         new com.raywritescode.util.Hello();
      yourHello.printHello();
   }
} 
