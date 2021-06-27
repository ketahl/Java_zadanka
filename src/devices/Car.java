package devices;

import com.zadanka.Human;
import com.zadanka.salleable;

public abstract class Car extends Device implements salleable, Comparable<Car>
{
    private boolean ABS;
    private boolean LPGPowered;
    public Double value;

    public Car (String model, String producer, boolean ABS, boolean LPGPowered, Double value, int yearofproduction)
    {
        super(model, producer, yearofproduction);
        this.ABS = ABS;
        this.LPGPowered = LPGPowered;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ABS=" + ABS +
                ", LPGPowered=" + LPGPowered +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód robi brrrum");

    }

    private boolean isInGarage (Car[] garage, Car carForSale)
{
    boolean isInGarage = false;
    for (int i = 0; i < garage.length ; i++)
    {
        if (garage[i] == carForSale) isInGarage = true;
    }
    return isInGarage;
}
    private boolean hasEmptySpace (Car[] garage)
    {
        boolean hasSpace = false;
        for (int i = 0; i < garage.length ; i++)
        {
            if (garage[i] == null) hasSpace = true;
        }
        return hasSpace;
    }

    private void addBoughtCarToGarage(Car car, Car[] buyerGarage)
    {
        for (int i = 0; i < buyerGarage.length ; i++)
        {
            if (buyerGarage[i] == null) buyerGarage[i] = car;
            return;
        }
    }

    private void removeCarFromGarage(Car car, Car[] sellersGarage)
    {
        for (int i = 0; i < sellersGarage.length ; i++)
        {
            if (sellersGarage[i] == car) sellersGarage[i] = null;
            return;
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!isInGarage(seller.garage, this))
        {
            throw new Exception("Samochodu nie ma w garażu sprzedawcy");
        }
        else if (!hasEmptySpace(buyer.garage))
        {
            throw new Exception("Kupujący nie ma miejsca w swoim garażu");
        }
        else if (buyer.cash < price)
        {
            throw new Exception("Kupujący nie ma gotówki");
        }
        else
        {
            removeCarFromGarage(this, seller.garage);
            addBoughtCarToGarage(this, buyer.garage);
            System.out.println("Transakcja przebiegła pomyślnie");
        }

    }
    public abstract void refuel();

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.yearOfProduction, o.yearOfProduction);
    }
}
