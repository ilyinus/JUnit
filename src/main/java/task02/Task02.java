package task02;

public class Task02 {

    public static boolean checkArray(int[] array) {
        boolean one = false;
        boolean four = false;

        for (int value : array) {
            if (value != 1 && value != 4)
                return false;
            if (value == 1 && !one)
                one = true;
            if (value == 4 && !four)
                four = true;
        }

        return one && four;

    }

    public static void main(String[] args) {
        System.out.println(checkArray(new int[] {1, 1, 1, 4, 4, 1, 4, 4}));
        System.out.println(checkArray(new int[] {1, 1, 1, 1, 1, 1}));
        System.out.println(checkArray(new int[] {4, 4, 4, 4}));
        System.out.println(checkArray(new int[] {1, 4, 4, 1, 1, 4, 3}));
    }

}
