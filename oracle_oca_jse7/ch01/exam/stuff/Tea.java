// Tea.java
// javac cannot compile this class because the class modifier for
// cert.Beverage is default access.

package exam.stuff;

import cert.Beverage;

class Tea extends Beverage {}

// javac compile error produced
//
//   $ javac exam/stuff/Tea.java
//   exam/stuff/Tea.java:5: error: Beverage is not public in cert; cannot be accessed from outside package
//   import cert.Beverage;
//             ^
//   exam/stuff/Tea.java:7: error: cannot find symbol
//   class Tea extends Beverage {}
//                  ^
//   symbol: class Beverage
//   2 errors

