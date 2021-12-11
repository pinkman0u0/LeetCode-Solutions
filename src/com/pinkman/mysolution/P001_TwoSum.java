package com.pinkman.mysolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P001_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                return new int[]{map.get(difference),i};
            }

            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums_1 = {0,4,3,0};
        int target_1 = 0;

        int[] nums_2 = {-3,4,3,90};
        int target_2 = 0;

        int[] result = twoSum(nums_2,target_2);
        System.out.println(Arrays.toString(result));
    }
}
