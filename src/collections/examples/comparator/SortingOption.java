package collections.examples.comparator;

import java.util.Comparator;

public enum SortingOption {
    Age("Age") {
        @Override
        Comparator getComparator() {
            return new AgeComparator();
        }
    },
    Name("Name") {
        @Override
        Comparator getComparator() {
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

        abstract Comparator getComparator();
    }
