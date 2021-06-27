package devices;

public class LPG extends Car{
    public LPG(String model, String producer, boolean ABS, boolean LPGPowered, Double value, int yearofproduction)
    {
        super(model, producer, ABS, LPGPowered, value, yearofproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano gaz");
    }
}
