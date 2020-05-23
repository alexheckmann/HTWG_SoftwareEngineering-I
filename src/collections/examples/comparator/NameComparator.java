package collections.examples.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger p1, Passenger p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
