package com.illiakornyk.airplanes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirlineCompany {
    private List<Airplane> airplanes;

    public AirlineCompany() {
        this.airplanes = new ArrayList<>();
    }

    /**
     * Add an airplane to the airline company.
     * @param airplane the airplane to add.
     */
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    /**
     * Calculate the total passenger/cargo capacity of all airplanes.
     * @return the total capacity.
     */
    public double calculateTotalCapacity() {
        return airplanes.stream().mapToDouble(Airplane::getTotalCapacity).sum();
    }

    /**
     * Calculate the total carrying capacity of all airplanes.
     * @return the total carrying capacity.
     */
    public double calculateTotalCarryingCapacity() {
        return airplanes.stream().mapToDouble(Airplane::getCarryingCapacity).sum();
    }

    /**
     * Sort the airplanes by flight range in ascending order.
     */
    public void sortByFlightRange() {
        airplanes.sort(Comparator.comparingDouble(Airplane::getFlightRange));
    }

    /**
     * Find an airplane within the specified range of fuel consumption.
     * @param minFuel the minimum fuel consumption.
     * @param maxFuel the maximum fuel consumption.
     * @return the first airplane found or null if none match.
     */
    public Airplane findByFuelConsumptionRange(double minFuel, double maxFuel) {
        return airplanes.stream()
                .filter(airplane -> airplane.getFuelConsumption() >= minFuel && airplane.getFuelConsumption() <= maxFuel)
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Airline Company Fleet:\n");
        for (Airplane airplane : airplanes) {
            sb.append(airplane).append("\n");
        }
        return sb.toString();
    }
}
