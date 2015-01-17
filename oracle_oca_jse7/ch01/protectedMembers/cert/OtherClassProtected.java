// OtherClassProtected.java

package cert;

public class OtherClassProtected {
  protected void testIt() {   // protected modifier means method method can be used in an
                              // instantiated class located in a different package
     System.out.println("OtherClassProtected.testIt()");
  }
}
