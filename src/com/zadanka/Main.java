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
	Human h1 = new Human(null,3,20000.0,1000.0,null);
	Human h2 = new Human(null,3,20000.0,1000.0,null);
	Electric electric = new Electric("X5", "BWM", false, false, 1100.0, 2010);
	Electric electric1 = new Electric("X4", "BWM", false, false, 1100.0, 2005);
	Electric electric2 = new Electric("X6", "BWM", false, false, 1100.0, 2015);
	h1.garage[0] = electric;
	h1.garage[1] = electric2;
	h1.garage[2] = electric1;
	System.out.println(h1.garage[0]);
	System.out.println(h1.garage[1]);
	System.out.println(h1.garage[2]);
	h1.sortGarage();
		System.out.println(h1.garage[0]);
		System.out.println(h1.garage[1]);
		System.out.println(h1.garage[2]);
	Electric electric3 = new Electric("X7", "BWM", false, false, 1100.0, 2020);
	//electric3.sell(h1, h2, 2000.0);
	h2.garage[0] = electric3;
	//electric3.sell(h2, h1, 2000.0);
	h1.garage[0] = null;
	//electric3.sell(h2, h1, 2000.0);
	h1.cash = 3000.0;
	electric3.sell(h2, h1, 2000.0);
	System.out.println(h1.garage[0]);
    }
}

