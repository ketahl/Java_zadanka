package creatures;

import com.zadanka.Human;
import com.zadanka.salleable;

public abstract class Animal implements salleable, Feedable {
    final String species;
    protected Double weight;


    public Animal(String species) {
        this.species = species;
        switch (species)
        {
            case "Dog":
                this.weight = 12.0;
                break;
            case "Cat":
                this.weight = 4.0;
                break;
            case "Cow":
                this.weight = 55.0;
                break;
            default:
                this.weight = 15.0;
                break;
        }
    }

    public void feed()
    {
        if (weight <= 0)
        {
            System.out.println("Zwierzątko nie je, bo nie żyje");
        }
        else
        {
            System.out.println("Wyprowadzono zwierzątko na spacer");
            this.weight += 2;
        }

    }

    public void takeForAWalk()
    {
        if (weight <= 0)
        {
            System.out.println("Oprócz wychodzenia na spacer zwierzę musi też jeść. A na spacer nie pójdzie, bo nie żyje");
        }
        else
        {
            System.out.println("Wyprowadzono zwierzątko na spacer");
            this.weight -= 2;
        }
    }
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet != this || buyer.cash < price){
            System.out.println("Transakcja nie może zostać przeprowadzona");
        }
        else
        {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja przeprowadzona pomyślnie");
        }

    }
}
