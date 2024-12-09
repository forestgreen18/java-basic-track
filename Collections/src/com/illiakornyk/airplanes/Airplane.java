package com.illiakornyk.airplanes;

/**
 * Represents a generic airplane with common attributes such as model, capacity, flight range, and
 * fuel consumption. Fuel consumption is measured in liters per kilometer.
 */
public abstract class Airplane {
    private final String model;
    private final double totalCapacity;
    private final double carryingCapacity;
    private final double flightRange;
    private final double fuelConsumption;

    /**
     * Constructs an airplane with the specified attributes.
     *
     * @param model            the model of the airplane.
     * @param totalCapacity    the total operational capacity of the airplane (passengers and/or cargo).
     * @param carryingCapacity the maximum weight the airplane can safely carry (in kilograms or
     *                         tonnes).
     * @param flightRange      the maximum distance the airplane can fly without refueling (in kilometers).
     * @param fuelConsumption  the fuel consumption of the airplane (liters per kilometer).
     */
    public Airplane(
            String model,
            double totalCapacity,
            double carryingCapacity,
            double flightRange,
            double fuelConsumption) {
        this.model = model;
        this.totalCapacity = totalCapacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption; // Assume consistent units.
    }

    /**
     * Returns the flight range of the airplane.
     *
     * @return the flight range (in kilometers).
     */
    public double getFlightRange() {
        return flightRange;
    }

    /**
     * Returns the fuel consumption of the airplane.
     *
     * @return the fuel consumption (liters per kilometer).
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Returns a string representation of the airplane, including its model, capacities, flight range,
     * and fuel consumption.
     *
     * @return a string representation of the airplane.
     */
    @Override
    public String toString() {
        return "Model: "
                + model
                + ", Capacity: "
                + totalCapacity
                + ", Carrying Capacity: "
                + carryingCapacity
                + ", Flight Range: "
                + flightRange
                + ", Fuel Consumption: "
                + fuelConsumption
                + " liters/km";
    }

    /**
     * Returns the carrying capacity of the airplane.
     *
     * @return the carrying capacity (in kilograms or tonnes).
     */
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    /**
     * Returns the total operational capacity of the airplane.
     *
     * @return the total capacity (passengers and/or cargo).
     */
    public double getTotalCapacity() {
        return totalCapacity;
    }
}
