// ProtectedAccessTest.java
// javac will NOT compile this class because this class doesn't have access
// to the OtherClassProtected.testIt() method in the cert package.
// The OtherClassProtected.testIt() method has protected access and this class
// does NOT extend from OtherClassProtected, therefore doesn't inherit the
// protected testIt() method.

package notcert;

import cert.OtherClassProtected;

class ProtectedAccessTest {
  static public void main(String[] args) {
    OtherClassProtected o = new OtherClassProtected();
    o.testIt();
  }
}

// javac output...

//   $ javac notcert/ProtectedAccessTest.java 
//   notcert/ProtectedAccessTest.java:15: error: testIt() has protected access in OtherClassProtected
//       o.testIt();
//        ^
//   1 error
