package enums.examples.example01;

public enum Month {
    JANUARY("January", Season.WINTER) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    FEBRUARY("February", Season.WINTER) {
        @Override
        int getAmountOfDays() {
            return 28;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    MARCH("March", Season.SPRING) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    APRIL("April", Season.SPRING) {
        @Override
        int getAmountOfDays() {
            return 30;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    MAY("May", Season.SPRING) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    JUNE("June", Season.SUMMER) {
        @Override
        int getAmountOfDays() {
            return 30;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    JULY("July", Season.SUMMER) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    AUGUST("August", Season.SUMMER) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    SEPTEMBER("September", Season.AUTUMN) {
        @Override
        int getAmountOfDays() {
            return 30;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    OCTOBER("October", Season.AUTUMN) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    NOVEMBER("November", Season.AUTUMN) {
        @Override
        int getAmountOfDays() {
            return 30;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    },
    DECEMBER("December", Season.WINTER) {
        @Override
        int getAmountOfDays() {
            return 31;
        }

        @Override
        boolean in(Season season) {
            return this.season.equals(season);
        }
    };

    private String month;
    protected Season season;

    Month(String name, Season season) {
        this.month = name;
        this.season = season;
    }

    abstract int getAmountOfDays();

    abstract boolean in(Season season);

}
