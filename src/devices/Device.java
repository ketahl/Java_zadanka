package devices;

public abstract class Device {
    protected final String model = "";
    protected final String producer = "";
    protected final String yearOfProduction = "";

    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }

    public abstract void turnOn();

}
