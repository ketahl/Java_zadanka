package com.zadanka;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Human {
    Animal pet;
    public Car car;
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
}
