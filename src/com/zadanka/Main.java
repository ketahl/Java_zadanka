package com.zadanka;

public class Main {

    public static void main(String[] args) {
		Human seba = new Human();
		Car hondaSzybszaNizWyglada = new Car("Civic", "Honda", true, true);
		seba.car = hondaSzybszaNizWyglada;
		System.out.println(seba.car);
    }
}
