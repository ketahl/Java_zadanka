package com.zadanka;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Human {
    public Animal pet;
    public Car[] garage;
    private Double salary;
    public Double cash;
    public Phone phone;

    public Human(Animal pet, int garageSize, Double salary, Double cash, Phone phone) {
        this.pet = pet;
        this.garage = new Car[garageSize];
        this.salary = salary;
        this.cash = cash;
        this.phone = phone;
    }

    public Double getSalary() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println();
        System.out.println("Pobrano dane o wypłacie dnia: " + formatter.format(date) + " a wartość wypłaty to: " + salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("To za pracę mam dopłacać?");
        }
        else
        {
            System.out.println("Informacje zostały wysłane do systemu księgowego");
            System.out.println("Konieczne jest wybranie aneksu od Pani Hani z kadr");
            System.out.println("ZUS, US i Twój agent FBI zostali poinformowani. Nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }
    public Car getCar(int placeNumber)
    {
        Car car = garage[placeNumber];
        if (car == null)
        {
        System.out.println("Miejsce jest puste");
        }
        return car;
    }

    public void setCar(Car car, int placeNumber)
    {
        if (garage[placeNumber] == null)
        {
            garage[placeNumber] = car;
            System.out.println("Umieszczono samochód na miejscu " + placeNumber);
        }
    }
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", garage=" + garage +
                ", salary=" + salary +
                '}';
    }
    public Double getGarageValue()
    {
        Double value = 0.0;
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] != null)
            {
                value += garage[i].value;
            }
        }
        return value;
    }
    public void sortGarage()
    {
        Arrays.sort(garage);
    }

}
