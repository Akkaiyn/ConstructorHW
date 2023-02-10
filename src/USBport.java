public class USBport {
    private String typeOfPort;
    private String idOfPort;
    private String[] manyOfPort;

    public USBport(){}

    public USBport(String typeOfPort, String idOfPort, String[] manyOfPort) {
        this.typeOfPort = typeOfPort;
        this.idOfPort = idOfPort;
        this.manyOfPort = manyOfPort;
    }

    public String getTypeOfPort() {

        return typeOfPort;
    }

    public void setTypeOfPort(String typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public String getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(String idOfPort) {
        this.idOfPort = idOfPort;
    }

    public String[] getManyOfPort() {
        return manyOfPort;
    }

    public void setManyOfPort(String[] manyOfPort) {
        this.manyOfPort = manyOfPort;
    }
}
