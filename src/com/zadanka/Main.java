package com.zadanka;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
    	Car car = new Car("X5", "BWM", true, true, 192000.0);
    	car.turnOn();
    	Phone phone = new Phone();
    	phone.turnOn();
	}
}

