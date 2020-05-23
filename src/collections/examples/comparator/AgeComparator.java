package collections.examples.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger p1, Passenger p2) {
        return p1.getAge().compareTo(p2.getAge());
    }
}
