// Abstract class
abstract class Building {
    protected String owner;
    protected int rooms;
    protected int floors;
    protected String address;

    // Constructor
    public Building(String owner, int rooms, int floors, String address) {
        this.owner = owner;
        this.rooms = rooms;
        this.floors = floors;
        this.address = address;
    }

    // Abstract method
    abstract void build();
}

// House class
class House extends Building {
    private static String country = "India";  // shared by all houses

    // Constructor overloading
    public House(String owner, int rooms, int floors, String address) {
        super(owner, rooms, floors, address);
    }

    public House(String owner, int rooms, int floors, String address, String country) {
        super(owner, rooms, floors, address);
        House.country = country; // update static variable
    }

    // Getter and Setter (Encapsulation)
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public int getRooms() { return rooms; }
    public void setRooms(int rooms) { this.rooms = rooms; }

    public int getFloors() { return floors; }
    public void setFloors(int floors) { this.floors = floors; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public static String getCountry() { return country; }

    // Method overloading (renovation)
    public void renovate(String feature) {
        System.out.println("Renovating house with: " + feature);
    }

    public void renovate(String feature, int cost) {
        System.out.println("Renovating house with: " + feature + " costing ₹" + cost);
    }

    // Override build()
    @Override
    void build() {
        System.out.println("Building a beautiful house with " + rooms + " rooms in " + address);
    }

    // Show details
    public void showDetails() {
        System.out.println("House owned by: " + owner);
        System.out.println("Rooms: " + rooms);
        System.out.println("Floors: " + floors);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);
    }
}

// Villa class (inherits House)
class Villa extends House {
    private boolean swimmingPool;

    // Constructor
    public Villa(String owner, int rooms, int floors, String address, boolean swimmingPool) {
        super(owner, rooms, floors, address);
        this.swimmingPool = swimmingPool;
    }

    // Override build()
    @Override
    void build() {
        System.out.println("Building a luxurious villa with " + getRooms() + " rooms in " + getAddress());
    }

    // Override showDetails()
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Swimming Pool: " + (swimmingPool ? "Yes" : "No"));
    }
}

// Main class
public class Houseexample {
    public static void main(String[] args) {
        // House 1
        House h1 = new House("Praveen kumar s", 3, 2, "Chennai");
        h1.build();
        h1.showDetails();
        h1.renovate("Garden");
        h1.renovate("Balcony", 50000);

        System.out.println();

        // House 2
        House h2 = new House("Sabi Raj Selvam", 2, 1, "Coimbatore");
        h2.build();
        h2.showDetails();

        System.out.println();

        // Villa
        Villa v1 = new Villa("Akneeswaran M", 5, 3, "ECR, Chennai", true);
        v1.build();
        v1.showDetails();
    }
}
