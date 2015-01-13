// TeaFinal.java
// This class fails to subclass itself from class cert.BeverageFinal
// because cert.BeverageFinal has the class access modifier of final.

package exam.stuff;

import cert.BeverageFinal;

class TeaFinal extends BeverageFinal { }

// javac outputs the following.

//    $ javac exam/stuff/TeaFinal.java
//    exam/stuff/TeaFinal.java:9: error: cannot inherit from final BeverageFinal
//    class TeaFinal extends BeverageFinal { }
//                           ^
//    1 error
