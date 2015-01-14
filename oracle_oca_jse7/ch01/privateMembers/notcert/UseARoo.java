// UseARoo.java

package notcert;

import cert.Roo;

class UseARoo {
  public void testIt() {
    Roo r = new Roo();
    System.out.println(r.dooRooThings()); // compiler error
  }
}

// javac will return the following error

//   $ javac notcert/UseARoo.java 
//   notcert/UseARoo.java:10: error: dooRooThings() has private access in Roo
//       System.out.println(r.dooRooThings()); // compiler error
//                          ^
//   1 error

