package com.zadanka;

public class Main {

    public static void main(String[] args) {
		Human c1 = new Human();
		c1.setSalary(1300.0);
		Car hondaSzybszaNizWyglada = new Car("Civic", "Honda",true, true, 1200.0);
		c1.setCar(hondaSzybszaNizWyglada);
		c1.setSalary(100.1);
		c1.setCar(hondaSzybszaNizWyglada);
		c1.setSalary(90.0);
		c1.setCar(hondaSzybszaNizWyglada);
	}
}
