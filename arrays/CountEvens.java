package arrays;

public class CountEvens {
    public static int countEvens(int[] array) {
        int counter = 0; // initialize counter variable

        for (int nums : array) {
            if (nums % 2 == 0) {
                counter++; // increment counter by 1 if any numbers are even
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 11, 14, 20 };
        System.out.println(countEvens(array));
    }
}
