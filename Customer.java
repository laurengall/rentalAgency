import java.util.ArrayList;

class Customer {
    private String name;
    private int id;
    private ArrayList<Vehicle> rentals;

    public Customer() {
        this.name = name;
        this.id = id;
        this.rentals = rentals;
    }

    public Customer(String n, int i, ArrayList<Vehicle> r) {
        name = n;
        id = i;
        rentals = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Vehicle> getRentals() {
        return rentals;
    }

    public void setRentals(ArrayList<Vehicle> rentals) {
        this.rentals = rentals;
    }
}