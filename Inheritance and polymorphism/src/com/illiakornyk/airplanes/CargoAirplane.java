package com.illiakornyk.airplanes;

/**
 * Represents a cargo airplane, a specialized type of airplane designed to carry cargo.
 * Inherits common attributes and behavior from the {@link Airplane} class and adds a specific field for cargo volume.
 *
 * <p>This class assumes all measurements follow standard units:
 * <ul>
 *   <li>Capacity: Passengers and/or cargo space (number or cubic meters).</li>
 *   <li>Carrying capacity: Maximum weight in kilograms or tonnes.</li>
 *   <li>Flight range: Distance in kilometers.</li>
 *   <li>Fuel consumption: Liters per kilometer.</li>
 *   <li>Cargo volume: Cubic meters.</li>
 * </ul>
 * </p>
 */
public class CargoAirplane extends Airplane {
    private double cargoVolume; // Cargo volume in cubic meters.

    /**
     * Constructs a {@code CargoAirplane} instance with the specified attributes.
     *
     * @param model the model of the airplane.
     * @param capacity the total capacity of the airplane (passengers and/or cargo).
     * @param carryingCapacity the maximum weight the airplane can safely carry (in kilograms or tonnes).
     * @param flightRange the maximum distance the airplane can fly without refueling (in kilometers).
     * @param fuelConsumption the fuel consumption of the airplane (in liters per kilometer).
     * @param cargoVolume the volume of cargo the airplane can carry (in cubic meters).
     */
    public CargoAirplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption, double cargoVolume) {
        super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
        this.cargoVolume = cargoVolume;
    }

    /**
     * Returns the cargo volume of the airplane.
     *
     * @return the cargo volume (in cubic meters).
     */
    public double getCargoVolume() {
        return cargoVolume;
    }

    /**
     * Returns a string representation of the cargo airplane, including cargo volume.
     *
     * @return a string containing the details of the cargo airplane.
     */
    @Override
    public String toString() {
        return super.toString() + ", Cargo Volume: " + cargoVolume + " cubic meters";
    }
}
