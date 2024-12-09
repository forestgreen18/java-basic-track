package com.illiakornyk.airplanes;

public class PassengerAirplane extends Airplane {
    private int passengerCapacity;

    public PassengerAirplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption, int passengerCapacity) {
        super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Passenger Capacity: " + passengerCapacity +
                " seats (Total Capacity: " + getTotalCapacity() +
                ", Carrying Capacity: " + getCarryingCapacity() + " tonnes)";
    }
}
