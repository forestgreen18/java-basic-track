package com.illiakornyk.airplanes;

/**
 * Represents a passenger airplane, a specialized type of airplane designed to carry passengers.
 * Inherits common attributes and behavior from the {@link Airplane} class and adds a specific field
 * for passenger capacity.
 *
 * <p>This class assumes all measurements follow standard units:
 * <ul>
 *   <li>Capacity: Passengers and/or additional equipment (number).</li>
 *   <li>Carrying capacity: Maximum weight in kilograms or tonnes.</li>
 *   <li>Flight range: Distance in kilometers.</li>
 *   <li>Fuel consumption: Liters per kilometer.</li>
 * </ul>
 * </p>
 */
public class PassengerAirplane extends Airplane {
    private int passengerCapacity; // Number of passenger seats.

    /**
     * Constructs a {@code PassengerAirplane} instance with the specified attributes.
     *
     * @param model the model of the airplane.
     * @param capacity the total capacity of the airplane (passengers and/or cargo).
     * @param carryingCapacity the maximum weight the airplane can safely carry (in kilograms or tonnes).
     * @param flightRange the maximum distance the airplane can fly without refueling (in kilometers).
     * @param fuelConsumption the fuel consumption of the airplane (in liters per kilometer).
     * @param passengerCapacity the maximum number of passengers the airplane can carry.
     */
    public PassengerAirplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption, int passengerCapacity) {
        super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * Returns a string representation of the passenger airplane, including passenger capacity.
     *
     * @return a string containing the details of the passenger airplane.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Passenger Capacity: " + passengerCapacity +
                " seats (Total Capacity: " + getTotalCapacity() +
                ", Carrying Capacity: " + getCarryingCapacity() + " tonnes)";
    }
}
