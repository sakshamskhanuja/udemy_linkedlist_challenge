import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Stores places.
        LinkedList<Place> places = new LinkedList<>();

        // Adding new places to list.
        addPlaces(places);

        // Stores the iterator.
        ListIterator<Place> iterator = places.listIterator();

        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit""");

            // Scans the user input.
            String input = scanner.nextLine();

            // Perform actions based on user input.
            if (input.equalsIgnoreCase("Q")) {
                break;
            } else if (input.equalsIgnoreCase("L")) {
                for (Place place : places) {
                    System.out.println(place);
                }
            } else if (input.equalsIgnoreCase("F")) {
                if (iterator.hasNext()) {
                    Place place = iterator.next();
                    System.out.println(place);
                } else {
                    System.out.println("Iterator is at the end of the list.");
                }
            } else if (input.equalsIgnoreCase("B")) {
                if (iterator.hasPrevious()) {
                    Place place = iterator.previous();
                    System.out.println(place);
                } else {
                    System.out.println("Iterator is at the beginning of the list.");
                }
            } else if (!input.equalsIgnoreCase("M")) {
                System.out.println("Enter only the available actions.");
            }

            // Divider
            System.out.println();
        } while (true);

        // Closes the scanner.
        scanner.close();
    }

    /**
     * Adds {@link Place} to the list.
     */
    public static void addPlaces(LinkedList<Place> places) {
        addPlace(new Place("Adelaide", 1374), places);
        addPlace(new Place("Alice Springs", 2771), places);
        addPlace(new Place("ALicE SpriNgs", 2771), places);
        addPlace(new Place("Brisbane", 917), places);
        addPlace(new Place("Sydney", 0), places);
        addPlace(new Place("Darwin", 3972), places);
        addPlace(new Place("Melbourne", 877), places);
        addPlace(new Place("Perth", 3923), places);
        addPlace(new Place("sydney", 0), places);
    }

    /**
     * Adds a {@link Place} to the list of places. Method checks for duplicates and sorts the places based on their
     * distance from "Sydney".
     */
    public static void addPlace(Place place, LinkedList<Place> places) {
        // Stores whether Place has been added based on distance.
        boolean placeAdded = false;

        // Stores whether Place is already present in the list.
        boolean placeAlreadyPresent = false;
        for (int i = 0; i < places.size(); i++) {
            // Checks if duplicate place is entered.
            for (Place p : places) {
                if (p.getTown().equalsIgnoreCase(place.getTown())) {
                    placeAlreadyPresent = true;
                    placeAdded = true;
                    break;
                }
            }

            // Checks if duplicate place is entered.
            if (placeAlreadyPresent) {
                break;
            }

            // Adds the place according to distance.
            if (places.get(i).getDistance() > place.getDistance()) {
                placeAdded = true;
                places.add(i, place);
                break;
            }
        }

        // Checks if Place has not been added to list.
        if (!placeAdded) {
            places.add(place);
        }
    }
}