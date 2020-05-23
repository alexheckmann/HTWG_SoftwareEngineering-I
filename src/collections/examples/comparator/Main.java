package collections.examples.comparator;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    /**
     * Class method to fill a collection with values
     *
     * @param collection a collection to fill
     * @param passengers an array of objects
     * @throws IllegalArgumentException if the array is null or of length 0
     */
    private static void fillCollection(Collection<Passenger> collection, Passenger[] passengers) {

        if (passengers == null || passengers.length == 0) {
            throw new IllegalArgumentException();
        } else {
            collection.addAll(Arrays.asList(passengers));
        }

    }

    /**
     * @param sortingOption A String read in
     * @return TreeSet using the chosen order
     */
    private static TreeSet<Passenger> getSortingOption(SortingOption sortingOption) {
        if (sortingOption.equals(SortingOption.AGE)) {
            System.out.println("Sorting by " + sortingOption.getName());
            return new TreeSet<>(new AgeComparator());
        } else {
            System.out.println("Sorting by " + sortingOption.getName());
            return new TreeSet<>(sortingOption.getComparator());
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
        collection1.forEach(System.out::println);
        System.out.println();

        // exercise 7
        SortedSet<Passenger> collection2 = new TreeSet<>();
        fillCollection(collection2, passengers);

        System.out.println("In alphabetical order: ");
        collection2.forEach(System.out::println);
        System.out.println();

        // exercise 8
        SortingOption currentSorting = SortingOption.AGE;
        SortedSet<Passenger> collection3 = new TreeSet<>(currentSorting.getComparator());
        fillCollection(collection3, passengers);

        System.out.println("In said order: ");
        collection3.forEach(System.out::println);
        System.out.println();

        // exercise 9
        Map<String, Boolean> table = new HashMap<>();
        table.put("Kevin", false);
        table.put("Moritz", true);
        table.put("Mickey", true);
        Set<Entry<String, Boolean>> collection4 = table.entrySet();

        collection4.forEach((Entry<String, Boolean> e) -> System.out.println(e.getKey() + ": " + e.getValue()));

    }

}
