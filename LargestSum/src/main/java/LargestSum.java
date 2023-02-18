
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (secondMax == Integer.MIN_VALUE || max == Integer.MIN_VALUE) {
                return max;
            }
            else if (num > max) {
                secondMax = max;
                max = num;
            }
                 else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        
        
        return max + secondMax;
    }
}