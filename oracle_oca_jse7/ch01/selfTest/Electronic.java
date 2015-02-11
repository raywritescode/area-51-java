// Electronic.java
// class file compiles without error

public class Electronic implements Device {
   public void doIt() {
      // code goes here
   }
}

abstract class Phone1 extends Electronic {
   // abstract code goes here
}

abstract class Phone2 extends Electronic {
   public void doIt( int x ) {
      // code goes here
   }
}

interface Device {
   public void doIt();
}
