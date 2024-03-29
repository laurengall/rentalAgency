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
      System.out.println("1. Vehicle Console");
      System.out.println("2. Customer Console");
      System.out.println("0. Exit");
      int cmd = input.nextInt();
      switch (cmd) {
        case 1:
          System.out.println("1. Add Vehicle");
          System.out.println("2. Edit Vehicle Info");
          System.out.println("3. Find Vehicle");
          int cmd2 = input.nextInt();
          switch (cmd2) {
            case 1:
              addVehicle(input, list);
              break;
            case 2:
              editVehicle(input, list);
              break;
            case 3:
              findVehicle(input, list);
              break;
          }
          break;
        case 2:
          System.out.println("1. Add Customer");
          System.out.println("2. Edit Customer Info");
          System.out.println("3. Find Customer");
          cmd2 = input.nextInt();
          switch (cmd2) {
            case 1:
              addCust(input, custs);
              break;
            case 2:
              editCust(input, custs);
              break;
            case 3:
              findCust(input, custs);
              break;
          }
          break;
      }
    }
  }

  // adds a vehicle to the ArrayList list based on type of vehicle
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

  // adds a customer to the ArrayList custs
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

  // edits customer information
  public static void editCust(Scanner input, ArrayList<Customer> custs) {
    Customer c = findCust2(input, custs);
    boolean running = true;
    while (running) {
      System.out.println("What would you like to change?");
      System.out.println("1. Name\n2. ID\n3. Current Rentals");
      input.nextLine();
      String cmd = input.nextLine();
      switch (cmd) {
        case "1":
          System.out.println("Input updated customer name: ");
          cmd = input.nextLine();
          c.setName(cmd);
          break;
        case "2":
          System.out.println("Input updated customer ID: ");
          int a = input.nextInt();
          c.setId(a);
          break;
        case "3":
          System.out.println("Update list of rental cars: ");
          int count = 1;
          if (c.getRentals() != null) {
            for (Vehicle v : c.getRentals()) {
              System.out.println("Rental #" + count + ":");
              printInfo(v);
            }
            System.out.println("Which car would you like to edit? Type the number from the list.");
            int chng = input.nextInt();
            Vehicle ve = c.getRentals().get(chng);
            printInfo(ve);
            System.out.println("Is this the vehicle you would like to edit? Type 1 for yes and 2 for no.");
            int go = input.nextInt();
            if (go == 2) {
              System.out.println("Which car would you like to edit? Type the number from the list.");
              chng = input.nextInt();
              ve = c.getRentals().get(chng);
              printInfo(ve);
            }
            editCustVehicle(input, ve);
          }
          break;
        default:
          break;
      }
      System.out.println("Would you like to change anything else?");
      System.out.println("Type 1 for yes and 2 for no.");
      int a = input.nextInt();
      if (a == 2) {
        running = false;
      }
    }
  }

  // finds a customer based on id number
  public static void findCust(Scanner input, ArrayList<Customer> custs) {
    System.out.println("Type in Customer ID: ");
    int tempID = input.nextInt();
    for (Customer c : custs) {
      if (tempID == c.getId()) {
        System.out.println("Customer found.");
        printCustInfo(c);
      } else {
        System.out.println("Sorry, no customer with that ID was found.");
      }
    }
  }

  // finds a customer based on id for other methods to use
  public static Customer findCust2(Scanner input, ArrayList<Customer> custs) {
    Customer a = new Customer();
    System.out.println("Type in Customer ID: ");
    int tempID = input.nextInt();
    for (Customer c : custs) {
      if (tempID == c.getId()) {
        System.out.println("Customer found.");
        printCustInfo(c);
        return c;
      } else {
        System.out.println("Sorry, no customer with that ID was found.");
      }
    }
    return a;
  }

  // edits a vehicle being rented by a customer
  public static void editCustVehicle(Scanner input, Vehicle v) {
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

  // prints customer information
  public static void printCustInfo(Customer c) {
    System.out.println("Customer Name: " + c.getName());
    System.out.println("Customer ID : " + c.getId());
    int count = 1;
    if (c.getRentals() != null) {
      for (Vehicle v : c.getRentals()) {
        System.out.println("Rental #" + count + ":");
        printInfo(v);
      }
    }
  }

}
