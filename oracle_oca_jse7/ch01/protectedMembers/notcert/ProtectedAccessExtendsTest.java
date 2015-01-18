// ProtectedAccessExtendsTest.java
// javac will compile this class because this class inherits the
// OtherClassProtected.testIt() method in the cert package.
// The OtherClassProtected.testIt() method has protected access and this class
// extends from OtherClassProtected, therefore inherits the protected testIt() method.

package notcert;

import cert.OtherClassProtected;

class ProtectedAccessExtendsTest extends OtherClassProtected {

  static public void main(String[] args) {
     ProtectedAccessExtendsTest o = new ProtectedAccessExtendsTest(); 
     o.testIt();
  }
}

// java output
