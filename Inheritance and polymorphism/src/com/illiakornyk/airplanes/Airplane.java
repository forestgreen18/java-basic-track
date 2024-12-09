package com.illiakornyk.airplanes;

public abstract class Airplane {
    private String model;
    private double capacity;
    private double carryingCapacity;
    private double flightRange;
    private double fuelConsumption;

    public Airplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        this.model = model;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Capacity: " + capacity + ", Carrying Capacity: " + carryingCapacity +
                ", Flight Range: " + flightRange + ", Fuel Consumption: " + fuelConsumption;
    }
}
