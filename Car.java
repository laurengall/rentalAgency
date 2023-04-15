class Car extends Vehicle {
    public Car(String make, String model, int year, int numWheels, String color) {
        super(make, model, year, numWheels, color);
        numWheels = 4;
    }

}