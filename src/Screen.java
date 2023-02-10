public class Screen {
    private int inch;
    private String manufacturer;
    private String typeOfMatrix;

    public Screen (){}

    public Screen(int inch, String manufacturer, String typeOfMatrix) {
        this.inch = inch;
        this.manufacturer = manufacturer;
        this.typeOfMatrix = typeOfMatrix;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }
}
