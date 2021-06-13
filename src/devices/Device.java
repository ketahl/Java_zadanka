package devices;

import com.zadanka.salleable;

public abstract class Device implements salleable {
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
