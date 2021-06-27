package devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, boolean ABS, boolean LPGPowered, Double value) {
        super(model, producer, ABS, LPGPowered, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano olej napędowy");    }
}
