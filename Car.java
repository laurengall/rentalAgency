import java.util.ArrayList;

class Car extends Vehicle {
    public Car() {

    }

    public Car(String make, String model, int year, int numWheels, String color, double ppd, int vin, boolean free) {
        super(make, model, year, numWheels, color, ppd, vin, free);
        numWheels = 4;
    }

}