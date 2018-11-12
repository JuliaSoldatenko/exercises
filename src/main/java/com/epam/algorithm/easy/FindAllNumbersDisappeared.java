package com.epam.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {

    public static void main(String... args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllNumbersDisappeared(nums));
    }

    public static List<Integer> findAllNumbersDisappeared(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        for (int no : nums) {
            int index = Math.abs(no)-1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }

        return result;
    }
}
