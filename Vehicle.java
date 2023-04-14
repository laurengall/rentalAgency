public class Vehicle {
  private String make;
  private String model;
  private int year;
  private int numWheels;
  private String color;

  public Vehicle() {
    this.make = make;
    this.model = model;
    this.year = year;
    this.numWheels = numWheels;
    this.color = color;
  }

  public Vehicle(String ma, String mo, int y, int nW, String c) {
    make = ma;
    model = mo;
    year = y;
    numWheels = nW;
    color = c;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getNumWheels() {
    return numWheels;
  }

  public void setNumWheels(int numWheels) {
    this.numWheels = numWheels;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}