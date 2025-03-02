import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // If less than 3 elements, return the max
        if (nums.length < 3) {
            return Arrays.stream(nums).max().getAsInt();
        }

        // Use three variables to store the largest, second-largest, and third-largest
        Integer f = null, s = null, t = null;

        for (int num : nums) {
            // Skip duplicates
            if (Objects.equals(num, f) || Objects.equals(num, s) || Objects.equals(num, t)) {
                continue;
            }

            // Update first, second, and third max
            if (f == null || num > f) {
                t = s; // Third becomes second
                s = f; // Second becomes first
                f = num; // Update first max
            } else if (s == null || num > s) {
                t = s; // Third becomes second
                s = num; // Update second max
            } else if (t == null || num > t) {
                t = num; // Update third max
            }
        }

        // If third maximum does not exist, return the first maximum
        return (t == null) ? f : t;
    }
}
