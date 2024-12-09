package com.illiakornyk.airplanes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirlineCompany {
    private List<Airplane> airplanes;

    public AirlineCompany() {
        this.airplanes = new ArrayList<>();
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public double calculateTotalCapacity() {
        return airplanes.stream().mapToDouble(Airplane::getCapacity).sum();
    }

    public double calculateTotalCarryingCapacity() {
        return airplanes.stream().mapToDouble(Airplane::getCarryingCapacity).sum();
    }

    public void sortByFlightRange() {
        airplanes.sort(Comparator.comparingDouble(Airplane::getFlightRange));
    }

    public Airplane findByFuelConsumptionRange(double min, double max) {
        return airplanes.stream()
                .filter(airplane -> airplane.getFuelConsumption() >= min && airplane.getFuelConsumption() <= max)
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Airplane airplane : airplanes) {
            sb.append(airplane.toString()).append("\n");
        }
        return sb.toString();
    }
}
