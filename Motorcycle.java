class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, int numWheels, String color, double ppd) {
        super(make, model, year, numWheels, color, ppd);
        numWheels = 2;
    }
}