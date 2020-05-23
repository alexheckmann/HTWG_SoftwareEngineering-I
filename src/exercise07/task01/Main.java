package exercise07.task01;

import java.util.Arrays;

public class Main {

    public static <T> void swap (T[] array, int a, int b){
        T tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        swap(strings,1,2);
        System.out.println(Arrays.toString(strings));

    }
}
