package com.illiakornyk.airplanes;

public class MilitaryAirplane extends Airplane {
    private WeaponType weaponType; // Use the enum for weapon type
    private double combatRadius;   // Combat range in kilometers

    public MilitaryAirplane(String model, double capacity, double carryingCapacity, double flightRange, double fuelConsumption, WeaponType weaponType, double combatRadius) {
        super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
        this.weaponType = weaponType;
        this.combatRadius = combatRadius;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public double getCombatRadius() {
        return combatRadius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weapon Type: " + weaponType + ", Combat Radius: " + combatRadius + " km";
    }
}
