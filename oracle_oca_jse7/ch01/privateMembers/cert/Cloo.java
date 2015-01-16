// Cloo.java
// A subclass can't inherit its superclass private members.

package cert;

class Cloo extends Roo {
  public void testCloo() {
     System.out.println(doRooThings()); // this causes a compiler error. Can't inherit doRoothings() from super.
  }

  public static void main(String[] args) {
    Cloo cloo = new Cloo();
    cloo.testCloo();
  }
}

// javac error generated...

//  $ javac cert/Cloo.java
//  cert/Cloo.java:8: error: cannot find symbol
//       System.out.println(doRooThings()); // this causes a compiler error. Can't inherit doRoothings() from super.
//                          ^
//    symbol:   method doRooThings()
//    location: class Cloo
//  1 error

