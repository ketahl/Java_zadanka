package devices;

public class LPG extends Car{
    public LPG(String model, String producer, boolean ABS, boolean LPGPowered, Double value) {
        super(model, producer, ABS, LPGPowered, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano gaz");
    }
}
