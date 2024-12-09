package com.illiakornyk.airplanes;

public abstract class Airplane {
    private String model;
    private double totalCapacity;
    private double carryingCapacity;
    private double flightRange;
    private double fuelConsumption;

    public Airplane(String model, double totalCapacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        this.model = model;
        this.totalCapacity = totalCapacity;
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
        return "Model: " + model + ", Capacity: " + totalCapacity + ", Carrying Capacity: " + carryingCapacity +
                ", Flight Range: " + flightRange + ", Fuel Consumption: " + fuelConsumption;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }
}
