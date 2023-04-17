import java.util.ArrayList;

class Car extends Vehicle {
    public Car(String make, String model, int year, int numWheels, String color, double ppd, int vin,
            ArrayList<Vehicle> list) {
        super(make, model, year, numWheels, color, ppd, vin, list);
        numWheels = 4;
    }

}