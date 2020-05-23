package collections.examples.comparator;

import java.util.Comparator;

public enum SortingOption {
    AGE("Age") {
        @Override
        Comparator<Passenger> getComparator() {
            return new AgeComparator();
        }
    },
    NAME("Name") {
        @Override
        Comparator<Passenger> getComparator() {
            return new NameComparator();
        }
    };

        String name;

        private SortingOption(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        abstract Comparator<Passenger> getComparator();
    }
