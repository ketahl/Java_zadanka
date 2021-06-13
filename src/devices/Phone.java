package devices;

import com.zadanka.Human;
import com.zadanka.salleable;

public class Phone extends Device implements salleable {

    @Override
    public String toString() {
        return "Phone{} model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon robi brrr");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this || buyer.cash < price) {
            System.out.println("Transakcja nie może zostać przeprowadzona");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja przeprowadzona pomyślnie");
        }
    }
}