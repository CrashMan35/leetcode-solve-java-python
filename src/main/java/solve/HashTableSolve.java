package solve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashTableSolve {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer addIndex = num2Index.get(target - nums[i]);
            if (addIndex != null) {
                return new int[]{addIndex,i};
            } else {
                num2Index.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
