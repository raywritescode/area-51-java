// AnotherCarClass.java
// This class attempts to instantiate an object from 
// from abstract class AbstractCar, which javac will
// not allow during compilation.

class AnotherCarClass {
   AbstractCar car = new AbstractCar();
}

// javac displays the following expected error message

//     $ javac AnotherCarClass.java 
//     AnotherCarClass.java:6: error: AbstractCar is abstract; cannot be instantiated
//        AbstractCar car = new AbstractCar();
//        ^
//     1 error
