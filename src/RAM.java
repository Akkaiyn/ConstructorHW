public class RAM {
    private int capacity;
    private String manufacturer;

    public RAM(){}

    public RAM(int capacity, String manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
