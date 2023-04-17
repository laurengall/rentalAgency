import java.util.ArrayList;

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, int numWheels, String color, double ppd, int vin,
            ArrayList<Vehicle> list) {
        super(make, model, year, numWheels, color, ppd, vin, list);
        numWheels = 2;
    }
}