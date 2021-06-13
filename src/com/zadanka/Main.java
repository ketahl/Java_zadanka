package com.zadanka;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
		Car h1 = new Car("Civic", "Honda",true, true, 1200.0);
		Car h2 = new Car("Civic", "Honda",true, true, 1200.0);
		System.out.println(h1.equals(h2));
		Car h3 = h1;
		System.out.println(h1.equals(h3));
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		Human c1 = new Human();
		System.out.println(c1.toString());
		Animal a1 = new Animal("Cat");
		System.out.println(a1.toString());
		Phone p1 = new Phone();
		System.out.println(p1.toString());
	}
}

