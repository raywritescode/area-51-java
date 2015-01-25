// Vehicle.java

public abstract class Vehicle {
   private String type;
   public abstract void goUpHill(); // abstract method
   public String getType() {        // non-abstarct method
      return type;
   }
}
