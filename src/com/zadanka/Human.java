package com.zadanka;

import devices.Car;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Human {
    Animal pet;
    private Car car;
    private Double salary;

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
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.value)
        {
            this.car = car;
            System.out.println("Samochód pomyślnie kupiony za gotówkę");
        }
        else if( salary < car.value && salary > (car.value/12))
        {
            this.car = car;
            System.out.println("Kupiono samochód na kredyt");
        }
        else
        {
            System.out.println("Nie stać cię. Trzeba było zainwestować w bitcoina kilka lat temu");
        }
    }
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
