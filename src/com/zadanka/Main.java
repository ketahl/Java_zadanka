package com.zadanka;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Feedable;
import creatures.Pet;
import devices.Application;
import devices.Car;
import devices.Electric;
import devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		Phone phone = new Phone("11","Apple",2021);
		Human h1 = new Human(null, 3, 10000.0, 10000.0, phone);
		phone.owner = h1;
		Application app1 = new Application("Angry Birds", "1.0", 1000.0);
		Application app2 = new Application("Subway Surfers", "1.0", 0.0);
		Application app3 = new Application("Netflix", "1.0", 0.0);
		Application app4 = new Application("PDF Reader", "1.0", 10.0);
		Application app5 = new Application("Jak dojade", "1.0", 15.0);
		//Application app5 = new Application("Jak dojade", "1.0", 10000.0);
		h1.cash = 999.0;
		phone.installAnApp(app1);
		h1.cash = 2000.0;
		phone.installAnApp(app1);
		System.out.println(h1.cash);
		System.out.println(phone.isAppInstalled(app1));
		System.out.println(phone.isAppInstalled("Angry Birds"));
		System.out.println(phone.isAppInstalled("Subway Surfers"));
		System.out.println(phone.isAppInstalled(app2));
		phone.installAnApp(app2);
		System.out.println(phone.isAppInstalled("Subway Surfers"));
		System.out.println(phone.isAppInstalled(app2));
		phone.installAnApp(app3);
		phone.installAnApp(app4);
		phone.installAnApp(app5);
		phone.printAllFreeApps();
		System.out.println(phone.appsCombinedValue());
		phone.printAppsAlphabeticaly();
		phone.printAppsBasedOnValue();
	}
}

