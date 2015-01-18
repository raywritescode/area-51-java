// ProtectedAccessTest2.java
// javac will not compile this class because this class does NOT inherit
// the OtherClassProtected.testIt() method in the cert package via extends.
// Instantiating an object of OtherClassProtected cannot access the
// testIt() method because the method has protected access and the OtherClassProtected
// class is in a different package.

package notcert;

import cert.OtherClassProtected;

class ProtectedAccessExtendsTest {

  static public void main(String[] args) {
     ProtectedAccessExtendsTest o = new ProtectedAccessExtendsTest(); 
     o.testIt();
  }
}

// javac error displayed...

//   $ javac notcert/ProtectedAccessTest2.java
//   notcert/ProtectedAccessTest2.java:15: error: cannot find symbol
//        o.testIt();
//         ^
//     symbol:   method testIt()
//     location: variable o of type ProtectedAccessExtendsTest
//   1 error
