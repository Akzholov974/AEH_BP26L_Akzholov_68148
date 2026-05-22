package pl.pp;

public class Warehouse {

    private String warehouseNumber;
    private int totalCapacity;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Warehouse() {
        this.warehouseNumber = "";
        this.totalCapacity = 5000;
        this.occupiedSpace = 0;
        this.ownerName = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public Warehouse(String warehouseNumber, int totalCapacity, String ownerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.totalCapacity = totalCapacity;
        this.occupiedSpace = 0;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public int getAvailableSpace() {
        return totalCapacity - occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addGoods(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount to add!");
        } else if (amount > getAvailableSpace()) {
            System.out.println("Cannot add " + amount + " units. Not enough available space!");
        } else {
            this.occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount to remove!");
        } else if (amount > this.occupiedSpace) {
            System.out.println("Cannot remove " + amount + " units. Not enough goods in the warehouse!");
        } else {
            this.occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + this.occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + getAvailableSpace() + " units.");
    }

    public void updateContact(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated. Email: " + this.email + ", Phone: " + this.phoneNumber);
    }
}
