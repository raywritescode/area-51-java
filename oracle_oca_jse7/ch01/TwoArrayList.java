// TwoArrayList.java
// Experimenting using two different classes with duplicate
// names in a single class file.
//
// January 7, 2015
// Ray Santos

public class TwoArrayList {
   public static void main( String[] args ) {
      ArrayList fakeArrayList = new ArrayList();
      java.util.ArrayList javaArrayList = new java.util.ArrayList();
 
      System.out.println( fakeArrayList );
      System.out.println( javaArrayList );
   }
}

// output is:
// 
// ArrayList@1c37b8f
// []
