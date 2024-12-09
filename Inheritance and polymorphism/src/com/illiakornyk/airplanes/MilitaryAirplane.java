package com.illiakornyk.airplanes;

/**
 * Represents a military airplane, a specialized type of airplane designed for combat or defense
 * purposes. Inherits common attributes and behavior from the {@link Airplane} class and adds
 * specific fields for weapon type and combat radius.
 *
 * <p>This class assumes all measurements follow standard units:
 *
 * <ul>
 *   <li>Capacity: Passengers or additional equipment (number).
 *   <li>Carrying capacity: Maximum weight in kilograms or tonnes.
 *   <li>Flight range: Distance in kilometers.
 *   <li>Fuel consumption: Liters per kilometer.
 *   <li>Combat radius: Maximum range in kilometers for combat missions.
 * </ul>
 */
public class MilitaryAirplane extends Airplane {
  private final WeaponType weaponType;
  private final double combatRadius;

  /**
   * Constructs a {@code MilitaryAirplane} instance with the specified attributes.
   *
   * @param model the model of the airplane.
   * @param capacity the total capacity of the airplane (passengers or equipment).
   * @param carryingCapacity the maximum weight the airplane can safely carry (in kilograms or
   *     tonnes).
   * @param flightRange the maximum distance the airplane can fly without refueling (in kilometers).
   * @param fuelConsumption the fuel consumption of the airplane (in liters per kilometer).
   * @param weaponType the type of weapons equipped (from the {@link WeaponType} enum).
   * @param combatRadius the maximum range the airplane can cover in a combat mission (in
   *     kilometers).
   */
  public MilitaryAirplane(
      String model,
      double capacity,
      double carryingCapacity,
      double flightRange,
      double fuelConsumption,
      WeaponType weaponType,
      double combatRadius) {
    super(model, capacity, carryingCapacity, flightRange, fuelConsumption);
    this.weaponType = weaponType;
    this.combatRadius = combatRadius;
  }

  /**
   * Returns the type of weapons equipped on the military airplane.
   *
   * @return the weapon type (from the {@link WeaponType} enum).
   */
  public WeaponType getWeaponType() {
    return weaponType;
  }

  /**
   * Returns the combat radius of the military airplane.
   *
   * @return the combat radius (in kilometers).
   */
  public double getCombatRadius() {
    return combatRadius;
  }

  /**
   * Returns a string representation of the military airplane, including weapon type and combat
   * radius.
   *
   * @return a string containing the details of the military airplane.
   */
  @Override
  public String toString() {
    return super.toString()
        + ", Weapon Type: "
        + weaponType
        + ", Combat Radius: "
        + combatRadius
        + " km";
  }
}
