package creatures;

import creatures.Animal;

public class Pet extends Animal implements Feedable
{
    public Pet(String species) {
        super(species);
    }
    @Override
    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("Nakarmiono zwierzątko, jest grubsze o " + foodWeight + "kg");
    }
    @Override
    public void feed()
    {
        this.weight += 2;
        System.out.println("Nakarmiono zwierzątko, jest grubsze o 2 kg");
    }
}
