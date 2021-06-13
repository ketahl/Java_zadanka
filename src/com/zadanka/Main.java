package com.zadanka;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
    	Car car = new Car("X5", "BWM", true, true, 192000.0);
    	Phone phone = new Phone();
    	Animal animal = new Animal("Cat");
    	Human c1 = new Human();
    	c1.cash = 0.0;
		Human c2 = new Human();
		c2.cash = 0.0;
    	car.sell(c1, c2, 100.0);
    	c1.car = car;
    	c1.phone = phone;
    	c1.pet = animal;
    	c2.cash = 100000.0;
    	car.sell(c1, c2, 100.0);
    	phone.sell(c1, c2, 100.0);
    	animal.sell(c1, c2, 100.0);
    	System.out.println("cash1 " + c1.cash);
    	System.out.println("cash2 " + c2.cash);
    	System.out.println(c2.car);
	}
}

