import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Vehicle> list = new ArrayList<Vehicle>();
    ArrayList<Customer> custs = new ArrayList<Customer>();
    Scanner input = new Scanner(System.in);
    boolean running = true;
    System.out.println("Bob's Rental Agency Admin Console. Type a number from the menu to get started.");
    while (running) {
      System.out.println("1. Find Vehicle");
      System.out.println("2. Calculate Daily Revenue");
      System.out.println("3. Edit Vehicle Info");
      System.out.println("4. Add Customer");
      System.out.println("5. View Customer Info");
      System.out.println("6. Edit Customer Info");
      System.out.println("7. Add Vehicle");
      System.out.println("8. Exit");
      int cmd = input.nextInt();
      switch (cmd) {
        case 1:
          findVehicle(input, list);
          break;
        case 2:
          calcRev(list);
          break;
        case 3:
          editVehicle(input, list);
          break;
        case 4:
          addCust(input, custs);
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
        case 8:
          running = false;
          break;
        default:
          break;
      }
    }
  }

  // finds vehicle based on vin number
  public static void findVehicle(Scanner input, ArrayList<Vehicle> list) {
    System.out.println("Type in Vin # for the Vehicle: ");
    int tempVin = input.nextInt();
    for (Vehicle v : list) {
      if (tempVin == v.getVin()) {
        System.out.println("Vehicle found.");
        printInfo(v);
      } else {
        System.out.println("Sorry, no vehicle with that Vin # was found.");
      }
    }
  }

  // return vehicle based on vin number for other methods to use
  public static Vehicle findVehicle2(Scanner input, ArrayList<Vehicle> list) {
    Vehicle a = new Vehicle();
    System.out.println("Type in Vin # for the Vehicle: ");
    int tempVin = input.nextInt();
    for (Vehicle v : list) {
      if (tempVin == v.getVin()) {
        System.out.println("Vehicle found.");
        printInfo(v);
        return v;
      } else {
        System.out.println("Sorry, no vehicle with that Vin # was found.");
      }
    }
    return a;
  }

  // calculates daily revenue from all vehicles that can be rented out
  public static void calcRev(ArrayList<Vehicle> list) {
    double fees = 0.0;
    for (Vehicle v : list) {
      fees += v.getPpd();
    }
    System.out.println("The total daily revenue is: $" + fees);
  }

  // edits vehicle information
  public static void editVehicle(Scanner input, ArrayList<Vehicle> list) {
    Vehicle v = findVehicle2(input, list);
    boolean running = true;
    while (running) {
      System.out.println("What would you like to change?");
      System.out.println("1. Make\n2. Model\n3. Year\n4. Color\n5. Price\n6. Vin Number");
      input.nextLine();
      String cmd = input.nextLine();
      switch (cmd) {
        case "1":
          System.out.println("Type the new make: ");
          cmd = input.nextLine();
          v.setMake(cmd);
          break;
        case "2":
          System.out.println("Type the new model: ");
          cmd = input.nextLine();
          v.setModel(cmd);
          break;
        case "3":
          System.out.println("Type the new year: ");
          int c = input.nextInt();
          v.setYear(c);
          break;
        case "4":
          System.out.println("Type the new color: ");
          cmd = input.nextLine();
          v.setColor(cmd);
          break;
        case "5":
          System.out.println("Type the new Price: ");
          c = input.nextInt();
          v.setPpd(c);
          break;
        case "6":
          System.out.println("Type the new Vin Number: ");
          c = input.nextInt();
          v.setVin(c);
          break;
        default:
          break;
      }
      System.out.println("Would you like to change anything else?");
      System.out.println("Type 1 for yes and 2 for no.");
      int c = input.nextInt();
      if (c == 2) {
        running = false;
      }
    }
  }

  public static void addCust(Scanner input, ArrayList<Customer> custs) {
    Customer c = new Customer();
    input.nextLine();
    System.out.println("Input customer name: ");
    String nam = input.nextLine();
    c.setName(nam);
    System.out.println("Input customer id: ");
    int iD = input.nextInt();
    c.setId(iD);
    custs.add(c);
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
      getInfo(c, list);
    } else if (num == 2) {
      Truck t = new Truck();
      getInfo(t, list);
    } else if (num == 3) {
      Motorcycle m = new Motorcycle();
      getInfo(m, list);
    } else {
      System.out.println("What type of vehicle will you be adding?");
      System.out.println("1. Car\n2. Truck\n3. Motorcycle");
      num = input.nextInt();
    }
  }

  // gets vehicle information and adds it to the list of Vehicles
  public static void getInfo(Vehicle v, ArrayList<Vehicle> list) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter make: ");
    String mak = input.nextLine();
    v.setMake(mak);
    System.out.println("Enter model: ");
    String mod = input.nextLine();
    v.setModel(mod);
    System.out.println("Enter year of manufacture: ");
    int yea = input.nextInt();
    v.setYear(yea);
    System.out.println("Enter color: ");
    input.nextLine();
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

  // prints vehicle information
  public static void printInfo(Vehicle v) {
    System.out.println("Make: " + v.getMake());
    System.out.println("Model: " + v.getModel());
    System.out.println("Year: " + v.getYear());
    System.out.println("Color: " + v.getColor());
    System.out.println("Price/day: " + v.getPpd());
    System.out.println("Vin Number: " + v.getVin());
  }
}