public class Lesson5TaskAdd3 {

    public static void main(String[] args) {

        int[] numbers = {18, 2, 30, 35, 99};
        System.out.println(getLargest(numbers));
        System.out.println(getLargest(new int[]{15, 12, 22, 33}));
    }

    public static int getLargest(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }
}

