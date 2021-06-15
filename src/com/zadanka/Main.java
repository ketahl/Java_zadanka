package com.zadanka;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Feedable;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
		Pet pet = new Pet("Cat");
		FarmAnimal farmAnimal = new FarmAnimal("Cow");
		pet.feed();
		pet.feed(5.0);
		farmAnimal.feed(3.0);
		farmAnimal.feed();
		farmAnimal.beEaten();
	}
}

