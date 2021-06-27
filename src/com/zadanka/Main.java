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

    public static void main(String[] args) throws MalformedURLException {
	Phone phone= new Phone();
	URL url= new URL(Phone.serverprotocol, Phone.serveradress, Phone.serverversion );
	phone.installAnnApp(url);
	phone.installAnnApp("Angry Birds");
	phone.installAnnApp("Angry Birds", "1.0");
	phone.installAnnApp("Angry Birds", "1.0", Phone.serveradress);
		ArrayList<String> list=new ArrayList<>();
		list.add("Angry Birds");
		list.add("Angry Birds 2");
		phone.installAnnApp(list);
		Electric car= new Electric("X5", "BMW", true, false, 220000.0);
		car.refuel();

	}
}

