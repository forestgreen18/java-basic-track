package com.illiakornyk.airplanes;

public class CargoAirplane extends Airplane {
    private double cargoVolume; // Volume of cargo it can carry in cubic meters.

    public CargoAirplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption, double cargoVolume) {
        super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
        this.cargoVolume = cargoVolume;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Volume: " + cargoVolume + " cubic meters";
    }
}
