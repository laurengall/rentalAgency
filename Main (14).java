import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    // Car v001 = new Car("Ford", "Explorer", 2020, 4, "Black", 50.0, 001);
    ArrayList<Vehicle> list = new ArrayList<Vehicle>();
    Scanner input = new Scanner(System.in);
    System.out.println("Bob's Rental Agency Admin Console. Type a number from the menu to get started.");
    System.out.println("1. Find Vehicle");
    System.out.println("2. Calculate Rental Fees");
    System.out.println("3. Edit Vehicle Info");
    System.out.println("4. Add Customer");
    System.out.println("5. View Customer Info");
    System.out.println("6. Edit Customer Info");
    System.out.println("7. Add Vehicle");
    int cmd = input.nextInt();
    switch (cmd) {
      case 1:
        findVehicle(input, list);
        break;
      case 2:
        calcFees();
        break;
      case 3:
        editVehicle();
        break;
      case 4:
        addCust();
        break;
      case 5:
        viewCust();
        break;
      case 6:
        editCust();
        break;
      case 7:
        addVehicle(input, list);
        break;
      default:
        break;
    }
  }

  public static void findVehicle(Scanner input, ArrayList<Vehicle> list) {
    System.out.println("Type in Vin # for the Vehicle: ");
    int tempVin = input.nextInt();
    for (Vehicle v : list) {
      if (tempVin == v.getVin()) {
        System.out.println("Vehicle found.");
      } else {
        System.out.println("Sorry, no vehicle with that Vin # was found.");
      }
    }
  }

  public static void calcFees() {

  }

  public static void editVehicle() {

  }

  public static void addCust() {

  }

  public static void viewCust() {

  }

  public static void editCust() {

  }

  public static void addVehicle(Scanner input, ArrayList<Vehicle> list) {
    System.out.println("What type of vehicle will you be adding?");
    System.out.println("1. Car\n2. Truck\n3. Motorcycle");
    int num = input.nextInt();
    if (num == 1) {
      Car c = new Car();
      getInfo(input, c, list);
      list.add(c);
    } else if (num == 2) {
      Truck t = new Truck();
      getInfo(input, t, list);
      list.add(t);
    } else if (num == 3) {
      Motorcycle m = new Motorcycle();
      getInfo(input, m, list);
      list.add(m);
    } else {
      System.out.println("What type of vehicle will you be adding?");
      System.out.println("1. Car\n2. Truck\n3. Motorcycle");
      num = input.nextInt();
    }
  }

  public static void getInfo(Scanner input, Vehicle v, ArrayList<Vehicle> list) {
    System.out.println("Enter model name: ");
    String mod = input.nextLine();
    v.setModel(mod);
    System.out.println("Enter year of manufacture: ");
    int yea = input.nextInt();
    v.setYear(yea);
    System.out.println("Enter year of number of wheels: ");
    int nW = input.nextInt();
    v.setNumWheels(nW);
    System.out.println("Enter color name: ");
    String col = input.nextLine();
    v.setColor(col);
    System.out.println("Enter price per day: ");
    double price = input.nextDouble();
    v.setPpd(price);
    System.out.println("Enter vin number: ");
    int vinNum = input.nextInt();
    v.setVin(vinNum);
    list.add(v);
  }
}