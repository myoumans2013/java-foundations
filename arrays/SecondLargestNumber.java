package arrays;

public class SecondLargestNumber {
    public static int secondLargestNum(int[] nums) {
        int largest_num = Integer.MIN_VALUE;
        int second_largest_num = Integer.MIN_VALUE;

        if (nums.length < 2) {
            throw new IllegalArgumentException("Arrays must have 2 elements.");
        }
        // get largest value
        for (int num : nums) {
            if (num > largest_num) {
                largest_num = num;
            }
        }

        // get second largest value
        for (int num : nums) {
            if (num > second_largest_num && num < largest_num) {
                second_largest_num = num;
            }
        }

        return second_largest_num;
    }

    public static void main(String[] args) {
        int[] array = { 21, 21, 18, 19, 17, 20, 14, 16, 7, 19, 10 };
        System.out.println(secondLargestNum(array));
    }
}
