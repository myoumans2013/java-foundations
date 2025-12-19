package arrays;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] array) {
        boolean isDuplicate = false;

        // loop through array twice to compare values
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        int[] array = { 10, 11, 12, 12 };
        System.out.println(containsDuplicates(array));
    }
}
