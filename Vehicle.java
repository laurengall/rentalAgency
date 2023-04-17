import java.util.ArrayList;

class Vehicle {
  private String make;
  private String model;
  private int year;
  private int numWheels;
  private String color;
  private double ppd;
  private int vin;

  public Vehicle() {
    make = "";
    model = "";
    year = 0;
    numWheels = 0;
    color = "";
    ppd = 0.0;
    vin = 0;
  }

  public Vehicle(String ma, String mo, int y, int nW, String c, double p, int v) {
    make = ma;
    model = mo;
    year = y;
    numWheels = nW;
    color = c;
    ppd = p;
    vin = v;
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

  public double getPpd() {
    return ppd;
  }

  public void setPpd(double ppd) {
    this.ppd = ppd;
  }

  public int getVin() {
    return vin;
  }

  public void setVin(int vin) {
    this.vin = vin;
  }

  public static void printVehicleInfo(String color, int year, String make, String model) {
    System.out.println(color + " " + year + " " + make + " " + model);
  }
}