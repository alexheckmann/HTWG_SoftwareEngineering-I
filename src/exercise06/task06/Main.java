package exercise06.task06;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    /**
     * Class method to fill a collection with values
     *
     * @param collection a collection to fill
     * @param passengers an array of objects
     * @throws NullPointerException     if an object contained in the array is null
     * @throws IllegalArgumentException if the array is null or of length 0
     */
    private static void fillCollection(Collection<Passenger> collection, Passenger[] passengers) {
        if (passengers == null || passengers.length == 0) {
            throw new IllegalArgumentException();
        } else {
            for (Passenger passenger : passengers) {
                if (passenger != null) {
                    collection.add(passenger);
                }
            }
        }
    }

    /**
     * @param sortingOption A String read in
     * @return TreeSet using the chosen order
     */
    private static TreeSet<Passenger> getSortingOption(String sortingOption) {
        if ("AGE".equals(sortingOption)) {
            System.out.println("Sorting by " + sortingOption);
            return new TreeSet<>(new AgeComparator());
        } else {
            System.out.println("Sorting by " + sortingOption);
            return new TreeSet<>(new NameComparator());
        }
    }

    public static void main(String[] args) {
        Passenger p1 = new Passenger("Max", 23);
        Passenger p2 = new Passenger("Moritz", 24);
        Passenger p3 = new Passenger("Mickey", 21);
        Passenger[] passengers = {p1, p2, p3};

        System.out.println();

        // exercise 6
        List<Passenger> collection1 = new ArrayList<>();
        fillCollection(collection1, passengers);

        System.out.println("In the order passengers enter the plane: ");
        for (Passenger passenger : collection1) {
            System.out.println(passenger);
        }
        System.out.println();

        // exercise 7
        SortedSet<Passenger> collection2 = new TreeSet<>();
        fillCollection(collection2, passengers);

        System.out.println("In alphabetical order: ");
        for (Passenger passenger : collection2) {
            System.out.println(passenger);
        }
        System.out.println();

        // exercise 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter whether to sort by age or name: ");
        String sortBy = scanner.nextLine().toUpperCase();
        scanner.close();


        SortedSet<Passenger> collection3 = getSortingOption(sortBy);
        fillCollection(collection3, passengers);

        System.out.println("In said order: ");
        for (Passenger passenger : collection3) {
            System.out.println(passenger);
        }
        System.out.println();

        // exercise 9
        Map<String, Boolean> table = new HashMap<>();
        table.put("Kevin", false);
        table.put("Moritz", true);
        table.put("Mickey", true);
        Set<Entry<String, Boolean>> collection4 = table.entrySet();

        for (Entry<String, Boolean> e : collection4) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

}
