/**
 * Checks whether array is sorted in ascending order 
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package arrays;

public class CheckifSorted {
    public static boolean isSorted(int[] array) {

        if (array == null || array.length < 2) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 10, 10, 15, 16, 17 };
        System.out.println(isSorted(array));
    }
}