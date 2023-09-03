import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Experimental {
    // This file for me to practice random leetcode questions again.

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int el : nums){
            if (seen.contains(el)){
                return true;
            }
            seen.add(el);
        }
        return  false;
    }

}
