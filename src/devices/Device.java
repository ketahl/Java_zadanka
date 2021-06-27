package devices;

import com.zadanka.salleable;

public abstract class Device implements salleable {
    protected final String model;
    protected final String producer;
    public final int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction)
    {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }

    public abstract void turnOn();

}
