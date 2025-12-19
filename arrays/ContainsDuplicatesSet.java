package arrays;

// same concept as ContainsDuplicates, but utilizing a hashset instead
import java.util.HashSet;

public class ContainsDuplicatesSet {
    public static boolean containsDuplicatesSet(int[] array) {
        HashSet<Integer> nums = new HashSet<>();

        for (int num : array) {
            if (nums.contains(num)) {
                return true;
            } else {
                nums.add(num);
            }
        }
        return false;
    }
}
