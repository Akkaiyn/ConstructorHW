public class SSD {
    private int capacity;
    private int divided;

    public SSD(){}

    public SSD(int capacity, int divided) {
        this.capacity = capacity;
        this.divided = divided;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDivided() {
        return divided;
    }

    public void setDivided(int divided) {
        this.divided = divided;
    }
}
