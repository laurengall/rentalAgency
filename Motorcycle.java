class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, int numWheels, String color) {
        super(make, model, year, numWheels, color);
        numWheels = 2;
    }
}