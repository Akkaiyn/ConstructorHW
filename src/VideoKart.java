public class VideoKart {
    private String model;
    private int capacity;
    private String manufacturer;

    public VideoKart(){}

    public VideoKart(String model, int capacity, String manufacturer) {
        this.model = model;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
