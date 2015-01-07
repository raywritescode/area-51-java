// MyClass.java
// Simple program to experiment launching a Java application
// by sending it two String arguments.
//
// January 6, 2015
// Ray Santos

public class MyClass {
   public static void main( String[] args ) {
      System.out.println( args[0] + " " + args[1] );
   }
}

// After compiling this program, launch the application
// with the command: java MyClass ray santos
//
// Expected output is: ray santos
//
// Run again with command: java MyClass abc 123
// Expected output is: abc 123
