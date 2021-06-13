package com.zadanka;

public class Car {
    private final String model;
    private final String producer;
    private boolean ABS;
    private boolean LPGPowered;

    public Car(String model, String producer, boolean ABS, boolean LPGPowered) {
        this.model = model;
        this.producer = producer;
        this.ABS = ABS;
        this.LPGPowered = LPGPowered;
    }
}
