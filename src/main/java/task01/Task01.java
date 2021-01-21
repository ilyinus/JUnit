package task01;

import java.util.LinkedList;
import java.util.List;

public class Task01 {

    public static Integer[] processArray(int[] array) {
        List<Integer> list = new LinkedList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4)
                break;
            else
                list.add(0, array[i]);
        }

        if (list.size() == array.length)
            throw new RuntimeException();

        return list.toArray(new Integer[list.size()]);

    }

    public static void main(String[] args) {

    }
}
