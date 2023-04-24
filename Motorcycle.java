import java.util.ArrayList;

class Motorcycle extends Vehicle {
    public Motorcycle() {

    }

    public Motorcycle(String make, String model, int year, int numWheels, String color, double ppd, int vin) {
        super(make, model, year, numWheels, color, ppd, vin);
        numWheels = 2;
    }
}