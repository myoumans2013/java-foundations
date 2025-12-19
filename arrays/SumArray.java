package arrays;

public class SumArray {
    public static int computeSumArray(int[] array) {
        int sum = 0; // initialize sum variable

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // add index value to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] sampleArray = { 5, 10, 15, 20, 25 };
        System.out.println(computeSumArray(sampleArray));
    }
}
