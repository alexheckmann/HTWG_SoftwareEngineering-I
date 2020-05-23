package exercise07.task05;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> T getLast(List<T> list) {

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        Integer last = getLast(ints);
        System.out.println(last);
    }

}
