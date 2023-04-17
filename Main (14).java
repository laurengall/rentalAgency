import java.util.Scanner;
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    // Car v001 = new Car("Ford", "Explorer", 2020, 4, "Black", 50.0, 001);
    Scanner input = new Scanner(System.in);
    System.out.println("Bob's Rental Agency Admin Console. Type a number from the menu to get started.");
    System.out.println("1. Find Vehicle");
    System.out.println("2. Calculate Rental Fees");
    System.out.println("3. Edit Vehicle Info");
    System.out.println("4. Add Customer");
    System.out.println("5. View Customer Info");
    System.out.println("6. Edit Customer Info");
  }

  public static void findVehicle(Scanner input, ArrayList<Vehicle> list) {
    System.out.println("Type in Vin # for the Vehicle: ");
    int tempVin = input.nextInt();
    for (Vehicle v : list) {
      if (tempVin == v.getVin()) {
        System.out.println("Vehicle found.");
        // print vehicle info
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
}