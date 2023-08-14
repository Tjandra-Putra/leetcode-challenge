package arrays_and_hashing;

import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 6}));
    }


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            if (intSet.contains(num)) {
                return true;
            }

            intSet.add(num);
        }

        return false;
    }
}
