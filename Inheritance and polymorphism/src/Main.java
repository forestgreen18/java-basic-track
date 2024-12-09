import com.illiakornyk.airplanes.*;

public class Main {
    public static void main(String[] args) {
        AirlineCompany airline = new AirlineCompany();

        // Add Passenger Airplanes
        airline.addAirplane(new PassengerAirplane("Boeing 737", 200, 80, 5000, 3.5, 180));
        airline.addAirplane(new PassengerAirplane("Airbus A320", 220, 85, 6000, 4.0, 200));

        // Add Cargo Airplanes
        airline.addAirplane(new CargoAirplane("Boeing 747", 0, 120, 10000, 8.0, 900));
        airline.addAirplane(new CargoAirplane("Antonov An-178", 0, 18000, 3680, 14.65, 122));

        // Add Military Airplanes
        airline.addAirplane(new MilitaryAirplane("F-16 Falcon", 2, 15, 2200, 0.8, WeaponType.MISSILES, 600));
        airline.addAirplane(new MilitaryAirplane("B-2 Spirit", 0, 30, 11000, 12.0, WeaponType.BOMBS, 4000));

        // Perform operations
        System.out.println("Initial Fleet:\n" + airline);

        // Calculate total capacities
        System.out.println("Total Passenger/Cargo Capacity: " + airline.calculateTotalCapacity());
        System.out.println("Total Carrying Capacity: " + airline.calculateTotalCarryingCapacity());

        // Sort airplanes by flight range
        airline.sortByFlightRange();
        System.out.println("\nFleet Sorted by Flight Range:\n" + airline);

        // Find airplane by fuel consumption range
        double minFuel = 2.0, maxFuel = 5.0;
        Airplane matchedAirplane = airline.findByFuelConsumptionRange(minFuel, maxFuel);
        if (matchedAirplane != null) {
            System.out.println("\nAirplane matching fuel consumption range (" + minFuel + " - " + maxFuel + "):");
            System.out.println(matchedAirplane);
        } else {
            System.out.println("\nNo airplane found matching fuel consumption range (" + minFuel + " - " + maxFuel + ").");
        }
    }
}
