package creatures;

import creatures.Animal;

public class FarmAnimal extends Animal implements Edbile, Feedable
{

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Zwierzątko zostało zjedzone");
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
