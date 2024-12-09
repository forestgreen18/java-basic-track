import com.illiakornyk.airplanes.Airplane;
import com.illiakornyk.airplanes.PassengerAirplane;
import com.illiakornyk.collections.DoubleLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test empty constructor
        DoubleLinkedList<Airplane> airplanes = new DoubleLinkedList<>();
        airplanes.add(new PassengerAirplane("Boeing 737", 200, 80, 5000, 2.5, 180));
        System.out.println("Empty Constructor: " + airplanes);

        // Test constructor with one object
        DoubleLinkedList<Airplane> singleAirplane = new DoubleLinkedList<>(
                new PassengerAirplane("Airbus A320", 220, 85, 6000, 3.0, 200)
        );
        System.out.println("Single Object Constructor: " + singleAirplane);

        // Test constructor with a collection
        DoubleLinkedList<Airplane> collectionAirplanes = new DoubleLinkedList<>(
                Arrays.asList(
                        new PassengerAirplane("Boeing 737", 200, 80, 5000, 2.5, 180),
                        new PassengerAirplane("Airbus A320", 220, 85, 6000, 3.0, 200)
                )
        );
        System.out.println("Collection Constructor: " + collectionAirplanes);

    }
}
