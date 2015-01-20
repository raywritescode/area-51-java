// SubClass.java
// This class is a subclass of class SuperClass. This class
// attempts to override the inherited showSample() method
// but javac correctly does not allow it.

class SubClass extends SuperClass {
   public void showSample() {
      System.out.println("showSample() from SubClass class"); // javac fails here because
                                                              // showSample() cannot be overridden
   }
}

// javac error...

//   $ javac SubClass.java 
//   SubClass.java:7: error: showSample() in SubClass cannot override showSample() in SuperClass
//      public void showSample() {
//                  ^
//   overridden method is final
//   1 error
