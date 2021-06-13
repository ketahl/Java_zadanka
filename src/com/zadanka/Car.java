package com.zadanka;

public class Car {
    private final String model;
    private final String producer;
    private boolean ABS;
    private boolean LPGPowered;
    public Double value;

    public Car(String model, String producer, boolean ABS, boolean LPGPowered, Double value)
    {
        this.model = model;
        this.producer = producer;
        this.ABS = ABS;
        this.LPGPowered = LPGPowered;
        this.value = value;
    }
}
