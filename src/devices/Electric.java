package devices;

public class Electric extends Car{
    public Electric(String model, String producer, boolean ABS, boolean LPGPowered, Double value, int yearofproduction)
    {
        super(model, producer, ABS, LPGPowered, value, yearofproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Załadowano akumulatory");
    }
}
