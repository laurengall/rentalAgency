class Truck extends Vehicle {
    public Truck(String make, String model, int year, int numWheels, String color, double ppd) {
        super(make, model, year, numWheels, color, ppd);
        numWheels = 4;
    }
}