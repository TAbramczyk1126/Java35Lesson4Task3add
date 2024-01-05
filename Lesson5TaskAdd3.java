public class Lesson5TaskAdd3 {

    public static void main(String[] args) {

        System.out.println(getLargest(new int[]{88, 72, 22, 33}));
        System.out.println(getLargest2(new int[]{33, 22, 11, 44}));
    }

    public static int getLargest(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }

    public static int getLargest2(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }
}




