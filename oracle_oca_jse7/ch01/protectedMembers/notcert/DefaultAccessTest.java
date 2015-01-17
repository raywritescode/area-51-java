// DefaultAccessTest.java
// javac will fail compiling this class because this class does not have access
// to the OtherClass.testIt() method in the cert package, because the testIt()
// method has default access.

package notcert;

import cert.OtherClass;

class DefaultAccessTest {
  static public void main(String[] args) {
    OtherClass o = new OtherClass();
    o.testIt();
  }
}

// javac compiler error output...

//   notcert/DefaultAccessTest.java:10: error: testIt() is not public in OtherClass; cannot be accessed from outside package
//       o.testIt();
//        ^
//   1 error

