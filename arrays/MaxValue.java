package arrays;

public class MaxValue {
    public static int maxValue(int[] array) {
        int largestNum = 0; // initialize largest num placeholder

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNum) {
                largestNum = array[i]; // replace array value with largest num
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 10, 15, 8, 7, 20 };
        System.out.println(maxValue(array));
    }
}
