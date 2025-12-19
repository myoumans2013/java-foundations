// reverse array without creating a second array

package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        int start = 0; // beginning array index position
        int end = array.length - 1; // last array index position

        while (start < end) { // create condition so while loop closes when middle two array numbers meet
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++; // increment beginning of array position + 1
            end--; // decrement end of array position - 1
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 7, 9, 12, 15 };
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }
}
