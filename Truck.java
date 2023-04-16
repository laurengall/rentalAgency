class Truck extends Vehicle {
    public Truck(String make, String model, int year, int numWheels, String color, double ppd, int vin) {
        super(make, model, year, numWheels, color, ppd, vin);
        numWheels = 4;
    }
}