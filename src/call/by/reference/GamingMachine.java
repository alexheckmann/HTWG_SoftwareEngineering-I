package call.by.reference;

import java.util.Random;

public class GamingMachine {

    static class IntWrapper {
        private int value;

        public IntWrapper() {
        }

        public IntWrapper(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void increment(IntWrapper a) {
        a.setValue(a.getValue() + 10);
    }

    public static void decrement(IntWrapper a) {
        a.setValue(a.getValue() - 10);
    }

    public static boolean play(IntWrapper bet) {
        Random random = new Random();
        if (random.nextBoolean()) {
            increment(bet);
            return true;
        } else {
            decrement(bet);
            return false;
        }
    }

    public static void main(String[] args) {
        int stake = 50;
        IntWrapper money = new IntWrapper(stake);
        for (int i = 0; i < 10; i++) {
            boolean win = play(money);
            if (win) {
                System.out.println("won");
            } else {
                System.out.println("lost");
            }
        }

        System.out.println("The player has " + money.getValue());
    }
}
