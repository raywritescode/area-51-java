// IllegalArray.java
// It is never legal to include the size of the array
// in the array declaration.

class IllegalArray {
   int[5] fiveArrayItems;  // java doesn't allow any value inside the [ ] when
                             // declaring an array.
}

//   $ javac IllegalArray.java 
//   IllegalArray.java:6: error: ']' expected
//      int[5] fiveArrayItems;  // java doesn't allow any value inside the [ ] when
//          ^
//   IllegalArray.java:6: error: ';' expected
//      int[5] fiveArrayItems;  // java doesn't allow any value inside the [ ] when
//           ^
//   IllegalArray.java:6: error: <identifier> expected
//      int[5] fiveArrayItems;  // java doesn't allow any value inside the [ ] when
//                           ^
//   3 errors
