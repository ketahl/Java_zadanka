package devices;

public class Electric extends Car{
    public Electric(String model, String producer, boolean ABS, boolean LPGPowered, Double value) {
        super(model, producer, ABS, LPGPowered, value);
    }

    @Override
    public void refuel() {
        System.out.println("Załadowano akumulatory");
    }
}
