package solve;

import java.util.*;
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

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            } else {
                map.put(nums[i],1);
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == pre) {
                return true;
            } else {
                pre = nums[i];
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int longest = 0;
        for (Integer key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                longest = Math.max(longest, map.get(key) + map.get(key + 1));
            }
        }
        return longest;
    }
}
