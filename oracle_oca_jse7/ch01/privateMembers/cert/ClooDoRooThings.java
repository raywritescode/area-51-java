// ClooDoRooThings.java
// This subclass of Roo can't use the private Roo.doRooThings() method
// so it uses it's own dooRooThings() method, which is NOT an overriding
// of Roo.doRooThings()

package cert;

class ClooDoRooThings extends Roo {
  private String doRooThings() {
    return "This message is from ClooDoRooThings.doRooThings()"; 
  }

  public static void main(String[] args) {
    ClooDoRooThings cloo = new ClooDoRooThings();
    System.out.println(cloo.doRooThings());
  }
}

// application's output

//  $ java cert.ClooDoRooThings 
//  This message is from ClooDoRooThings.doRooThings()

