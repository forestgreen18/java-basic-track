import com.illiakornyk.airplanes.*;

public class Main {
  public static void main(String[] args) {
    AirlineCompany airline = new AirlineCompany();

    // Add Passenger Airplanes (Fuel consumption directly in liters/km)
    airline.addAirplane(new PassengerAirplane("Boeing 737", 200, 80, 5000, 2.5, 180));
    airline.addAirplane(new PassengerAirplane("Airbus A320", 220, 85, 6000, 3.0, 200));

    // Add Cargo Airplanes (Convert fuel consumption from liters/hour to liters/km)
    double boeing747FuelConsumptionPerHour = 8000; // in liters/hour
    double boeing747AverageSpeed = 900; // in km/hour
    double boeing747FuelConsumptionPerKm = boeing747FuelConsumptionPerHour / boeing747AverageSpeed;

    airline.addAirplane(
        new CargoAirplane("Boeing 747", 0, 120000, 10000, boeing747FuelConsumptionPerKm, 900));

    double antonovAn178FuelConsumptionPerHour = 5200; // in liters/hour
    double antonovAn178AverageSpeed = 825; // in km/hour
    double antonovAn178FuelConsumptionPerKm =
        antonovAn178FuelConsumptionPerHour / antonovAn178AverageSpeed;

    airline.addAirplane(
        new CargoAirplane("Antonov An-178", 0, 18000, 3680, antonovAn178FuelConsumptionPerKm, 122));

    // Add Military Airplanes (Assuming direct liters/km for simplicity)
    airline.addAirplane(
        new MilitaryAirplane("F-16 Falcon", 2, 15, 2200, 0.8, WeaponType.MISSILES, 600));
    airline.addAirplane(
        new MilitaryAirplane("B-2 Spirit", 0, 30, 11000, 2.5, WeaponType.BOMBS, 4000));

    // Perform operations
    System.out.println("Initial Fleet:\n" + airline);

    // Calculate total capacities
    System.out.println("Total Passenger/Cargo Capacity: " + airline.calculateTotalCapacity());
    System.out.println("Total Carrying Capacity: " + airline.calculateTotalCarryingCapacity());

    // Sort airplanes by flight range
    airline.sortByFlightRange();
    System.out.println("\nFleet Sorted by Flight Range:\n" + airline);

    double minFuel = 0.5, maxFuel = 3.0;
    Airplane matchedAirplane = airline.findByFuelConsumptionRange(minFuel, maxFuel);
    if (matchedAirplane != null) {
      System.out.println(
          "\nAirplane matching fuel consumption range (" + minFuel + " - " + maxFuel + "):");
      System.out.println(matchedAirplane);
    } else {
      System.out.println(
          "\nNo airplane found matching fuel consumption range ("
              + minFuel
              + " - "
              + maxFuel
              + ").");
    }
  }
}
