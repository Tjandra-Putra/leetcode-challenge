package arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5};
        System.out.println(containsDuplicate2(numbers));
    }

    // Set method
    public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    // Hash Method
    public static boolean containsDuplicate2(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int el : nums) {
            if (counter.containsKey(el)) {
                return true;
            }

            counter.put(el, 1);
        }
        return false;
    }

}
