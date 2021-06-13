package devices;

import com.zadanka.Human;
import com.zadanka.salleable;

public class Car extends Device implements salleable {
    private final String model;
    private final String producer;
    private boolean ABS;
    private boolean LPGPowered;
    public Double value;

    public Car(String model, String producer, boolean ABS, boolean LPGPowered, Double value) {
        this.model = model;
        this.producer = producer;
        this.ABS = ABS;
        this.LPGPowered = LPGPowered;
        this.value = value;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", ABS=" + ABS +
                ", LPGPowered=" + LPGPowered +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód robi brrrum");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != this || buyer.cash < price) {
            System.out.println("Transakcja nie może zostać przeprowadzona");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.car = seller.car;
            seller.car = null;
            System.out.println("Transakcja przeprowadzona pomyślnie");
        }

    }
}
