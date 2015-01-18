// OtherClassProtected.java

package cert;

public class OtherClassProtected {
  protected void testIt() {   // protected method can be used by class object in different package 
     System.out.println("from OtherClassProtected.testIt() method");
  }

  public static void main(String[] args) {
    OtherClassProtected ocp = new OtherClassProtected();
    ocp.testIt();
  }
}
