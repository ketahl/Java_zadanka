package com.zadanka;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Feedable;
import creatures.Pet;
import devices.Car;
import devices.Electric;
import devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception
	{
	Human h1 = new Human(null,3,10000.0,10000.0,null);
	Human h2 = new Human(null,3,20000.0,10000.0,null);
	Human h3 = new Human(null,3,30000.0,10000.0,null);
	Electric electric = new Electric("X5", "BWM", false, false, 1100.0, 2010);
	Electric electric1 = new Electric("X4", "BWM", false, false, 1100.0, 2005);
	Electric electric2 = new Electric("X6", "BWM", false, false, 1100.0, 2015);
	electric.owners.add(h1);
	electric1.owners.add(h1);
	h1.garage[0] = electric;
	h1.garage[1] = electric1;
	h1.garage[2] = electric2;
	//electric2.sell(h1, h2, 100.0);
	System.out.println(electric.transactionOccured(h1, h2));
		System.out.println(electric.getCurrentOwner());
		System.out.println(electric.getNumberOfTransactions());
		electric.sell(h1, h2, 100.0);
		System.out.println(electric.getNumberOfTransactions());
		System.out.println(electric.getCurrentOwner());
		System.out.println(electric.transactionOccured(h1, h2));
    }
}

