package devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, boolean ABS, boolean LPGPowered, Double value, int yearofproduction)
    {
        super(model, producer, ABS, LPGPowered, value, yearofproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano olej napędowy");    }
}
